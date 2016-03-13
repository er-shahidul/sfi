package com.rbs.www.web.sfi.controllers;

import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.common.services.SfiPpFormAllCountryService;
import com.rbs.www.web.common.services.SfiPpFormRegionService;
import com.rbs.www.web.sfi.models.entities.SfiPpFormData;
import com.rbs.www.web.sfi.models.viewmodels.*;
import com.rbs.www.web.sfi.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.StringTokenizer;

@Controller
public class PpFormController{

    @Value("#{messages[endDate]}")
    private String endDate;

    @Autowired
    UserService userService;

    @Autowired
    SfiPpFormDataService sfiPpFormDataService;

    @Autowired
    SfiPpForm2014Service sfiPpForm2014Service;

    @Autowired
    SfiPpFormAllCountryService sfiPpFormAllCountryService;

    @Autowired
    SfiPpFormRegionService sfiPpFormRegionService;

    @Autowired
    FormService formService;

    @Autowired
    SfiPpFormCs3ProjectStandardObjectiveService sfiPpFormCs3ProjectStandardObjectiveService;

    @Autowired
    SfiPpFormCs3ProjectStandardObjective2015Service sfiPpFormCs3ProjectStandardObjective2015Service;

    private void populateFormContent(ModelMap model, SfiPpFormData sfiPpFormData) {
        Integer id = sfiPpFormData.getId();

        String companyLogo = TypeConversionUtils.toBase64Binary(sfiPpFormData.getCompany().getLogo());
        if (companyLogo != null) companyLogo = "data:image/jpeg;base64," + companyLogo;
        model.addAttribute("companyLogo", companyLogo);

        model.addAttribute("form", sfiPpFormData);
        model.addAttribute("cs1", formService.getCs1ViewModel(id));
        model.addAttribute("cs2", formService.getCs2ViewModel(id));
        model.addAttribute("cs4", formService.getCs4ViewModel(id));
        model.addAttribute("cs5", formService.getCs5ViewModel(id));
        model.addAttribute("cs6", formService.getCs6ViewModel(id));
        model.addAttribute("cs7", formService.getCs7ViewModel(id));
        model.addAttribute("cs8", formService.getCs8ViewModel(id));
        model.addAttribute("cs9", formService.getCs9ViewModel(id));
        model.addAttribute("cs10", formService.getCs10ViewModel(id));

        model.addAttribute("createdAt", "[ "+ Util.getDateFormat(sfiPpFormData.getCreatedAt()) + " ]");
        model.addAttribute("updateAt", "[ "+ Util.getDateFormat(sfiPpFormData.getUpdatedAt()) + " ]");
        model.addAttribute("company", sfiPpFormData.getCompany());
        model.addAttribute("countries", sfiPpFormAllCountryService.getAll());

        model.addAttribute("regions", sfiPpFormRegionService.getAll());
        model.addAttribute("status", sfiPpFormData.getStatus());
        model.addAttribute("standardObjects", sfiPpFormCs3ProjectStandardObjectiveService.getAll());
        model.addAttribute("standardObjects2015", sfiPpFormCs3ProjectStandardObjective2015Service.getAll());
    }

    @RequestMapping(value = "/sfiPpForm", method = RequestMethod.GET)
    public String form(ModelMap model, SecurityContextHolderAwareRequestWrapper request) throws ParseException {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        String x = authCheck(request, auth);
        if (x != null) return x;

        populateFormContent(model, sfiPpFormDataService.createOrGetByCurrentUsersCompany());

        model.addAttribute("days_until", Util.getDiffDays(endDate));
        model.addAttribute("mode", "edit");
        model.addAttribute("isAdmin", false);
        model.addAttribute("user", userService.findByUsername(Util.getCurrentUsername()));

        if(Objects.equals(sfiPpFormDataService.createOrGetByCurrentUsersCompany().getStatus().getStatus(), "submitted")){
            return "redirect:/sfiPpForm/view";
        }

        return "/core/form/index";
    }

    private String authCheck(SecurityContextHolderAwareRequestWrapper request, Authentication auth) {
        if (auth instanceof AnonymousAuthenticationToken) return "redirect:/login";
        if (request.isUserInRole("ADMIN")) return "redirect:/admin/dashboard";
        if (request.isUserInRole("GENERAL")) return "redirect:/user/profile";
        return null;
    }

    @RequestMapping(value = "/sfiPpForm/view")
    public String viewForm(ModelMap model, SecurityContextHolderAwareRequestWrapper request, HttpServletRequest url) throws ParseException {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        String x = authCheck(request, auth);
        if (x != null) return x;

        String print = url.getQueryString();
        if(Objects.equals(print, "print")){
            model.addAttribute("print", true);
        }

        SfiPpFormData sfiPpFormData = sfiPpFormDataService.createOrGetByCurrentUsersCompany();
        populateFormContent(model, sfiPpFormData);

        model.addAttribute("days_until", Util.getDiffDays(endDate));
        model.addAttribute("mode", "view");
        model.addAttribute("isAdmin", false);

        model.addAttribute("user", userService.findByUsername(Util.getCurrentUsername()));
        return "/core/form/index";
    }

    @RequestMapping(value = "/admin/company/pp/form/{id}", method = RequestMethod.GET)
    public String adminSfiFormEdit(@PathVariable Integer id, ModelMap model) throws ParseException {
        SfiPpFormData sfiPpFormData = sfiPpFormDataService.get(id);
        populateFormContent(model, sfiPpFormData);
        model.addAttribute("days_until", Util.getDiffDays(endDate));
        model.addAttribute("mode", "edit");
        model.addAttribute("isAdmin", true);

        return "/core/form/index";
    }

    @RequestMapping(value = "/admin/company/pp/form/view/{id}", method = RequestMethod.GET)
    public String adminSfiFormView(@PathVariable Integer id, ModelMap model, HttpServletRequest url) throws ParseException {
        SfiPpFormData sfiPpFormData = sfiPpFormDataService.get(id);
        populateFormContent(model, sfiPpFormData);
        model.addAttribute("days_until", Util.getDiffDays(endDate));
        model.addAttribute("mode", "view");
        model.addAttribute("isAdmin", true);

        String print = url.getQueryString();
        if(Objects.equals(print, "print")){
            model.addAttribute("print", true);
        }

        return "/core/form/index";
    }

    @RequestMapping(value = "/admin/form/pp", method = RequestMethod.GET)
    public String adminSfiForm(ModelMap model) {
        model.addAttribute("title", "sfi");
        model.addAttribute("sfiPpForms", sfiPpFormDataService.getAllActiveForms());
        model.addAttribute("sfiPpFormsOld", sfiPpForm2014Service.getAll());

        return "admin/form/admin_form_sfi";
    }

    @RequestMapping(value = "/user/form/pp", method = RequestMethod.GET)
    public String userSfiForm(ModelMap model) {
        model.addAttribute("title", "sfi");
        model.addAttribute("sfiPpForms", sfiPpFormDataService.createOrGetByCurrentUsersCompany());
        model.addAttribute("sfiPpFormsOld", sfiPpForm2014Service.createOrGetByCurrentUsersCompany());
        SfiPpFormData sfiPpFormData = sfiPpFormDataService.createOrGetByCurrentUsersCompany();
        model.addAttribute("company", sfiPpFormData.getCompany());

        return "admin/form/admin_form_sfi";
    }

    @RequestMapping(value = "/sfiPpForm/pdf/{fileName}", method = RequestMethod.GET, produces = "application/pdf")
    public ResponseEntity<byte[]> viewPdf(@PathVariable String fileName, HttpServletRequest request) {
        String originalPath = request.getSession().getServletContext().getRealPath("/")+"uploads/pdf/";

        Path path = Paths.get(originalPath+fileName+".pdf");
        byte[] pdfContents = null;
        try {
            pdfContents = Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpHeaders headers = new HttpHeaders();
        headers.add("content-disposition", "inline;filename=" + path);
        ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(
                pdfContents, headers, HttpStatus.OK);
        return response;
    }

    private static String getFileExtension(String fileName) {
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        return "";
    }

    @RequestMapping(value = "/sfiPpForm/sfi/{uniqueName}/{fileName:.+}", method = RequestMethod.GET)
    public void getFile(@PathVariable String fileName, @PathVariable String uniqueName, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String originalPath = request.getSession().getServletContext().getRealPath("/")+"uploads/sfi/"+uniqueName+"."+getFileExtension(fileName);
        // create full filename and get input stream
        File file = new File (originalPath);
        InputStream is = new FileInputStream(file);

        // set file as attached data and copy file data to response output stream
        response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
        FileCopyUtils.copy(is, response.getOutputStream());

        // delete file on server file system
//        licenseFile.delete();

        // close stream and return to view
        response.flushBuffer();
    }

    @RequestMapping(value = {"/sfiPpForm/clear/cs10/{id}"}, method = RequestMethod.GET)
    public String formCs10Clear(@PathVariable Integer id, SecurityContextHolderAwareRequestWrapper request) {
        Cs10ViewModel model = formService.getCs10ViewModel(id);
        cs10FieldClear(model);
        formService.setCs10Entity(model);

        if (request.isUserInRole("ADMIN")) return "redirect:/admin/company/pp/form/"+id+"#/fiber-sourcing-standard";
        return "redirect:/sfiPpForm#/fiber-sourcing-standard";
    }

    private void cs10FieldClear(Cs10ViewModel model) {
        model.setAcknowledge(null);
        model.setLegalComplianceOutside(null);
        model.setLegalComplianceUsCanada(null);
        model.setBiodiversityFiberSourcing(null);
        model.setBiodiversityManagement(null);
        model.setBiodiversityTraining(null);
        model.setLegalComplianceOutsideOtherExplain(null);
        model.setTrainedWoodProducersChanged(null);
        model.setBiodiversityManagementMechanismDescribe(null);
        model.setBiodiversityTrainingMechanismDescribe(null);
        model.setBiodiversityTrainingNoDescribe(null);
        model.setBiodiversityManagementNoDescribe(null);
        model.setBiodiversityMechanismDescribe(null);
        model.setBiodiversityNoDescribe(null);
        model.setLegalComplianceUsCanadaDescribe(null);
        model.setCreatedAt(null);
        model.setSubmittedAt(null);
        model.setUpdatedAt(null);

        model.setStories(new LinkedHashSet<SfiPpFormStoryCs10ViewModel>());
        model.setBiodiversityItems1(new LinkedHashSet<Integer>());
        model.setBiodiversityItems2(new LinkedHashSet<Integer>());
        model.setBiodiversityManagementItems1(new LinkedHashSet<Integer>());
        model.setBiodiversityManagementItems2(new LinkedHashSet<Integer>());
        model.setBiodiversityNatureItems(new LinkedHashSet<Integer>());
        model.setBiodiversityStateForestItems1(new LinkedHashSet<Integer>());
        model.setBiodiversityStateForestItems2(new LinkedHashSet<Integer>());
        model.setBiodiversityTrainingItems1(new LinkedHashSet<Integer>());
        model.setBiodiversityTrainingItems2(new LinkedHashSet<Integer>());
        model.setLegalComplianceOutsideItems(new LinkedHashSet<Integer>());
    }

    @RequestMapping(value = {"/sfiPpForm/clear/cs9/{id}"}, method = RequestMethod.GET)
    public String formCs9Clear(@PathVariable Integer id, SecurityContextHolderAwareRequestWrapper request) {
        Cs9ViewModel model = formService.getCs9ViewModel(id);
        cs9FieldClear(model);
        formService.setCs9Entity(model);

        if (request.isUserInRole("ADMIN")) return "redirect:/admin/company/pp/form/"+id+"#/forest-management-standard";
        return "redirect:/sfiPpForm#/forest-management-standard";
    }

    private void cs9FieldClear(Cs9ViewModel model) {
        model.setAcknowledge(null);
        model.setConvertForestCover(null);
        model.setConvertForestLand(null);
        model.setEcologicalImpactsLandscape(null);
        model.setEcologicalImpactsSite(null);
        model.setEconomicOther(null);
        model.setEconomicProductivity(null);
        model.setEconomicReasons(null);
        model.setEconomicStandQuality(null);
        model.setEnvironmentalHarmOther(null);
        model.setMitigatingEnvironmentalHarm(null);
        model.setRespondingDiseaseIssues(null);
        model.setRespondingForestHealth(null);
        model.setRespondingInsect(null);
        model.setRespondingInvasiveSpecies(null);
        model.setRespondingOther(null);
        model.setRestorationForestCover(null);
        model.setRestorationNativeForest(null);
        model.setRestorationOther(null);
        model.setRestorationRiparianProtection(null);
        model.setStopWho1A1B(null);
        model.setUseWho1A1B(null);
        model.setConservationBiodiversity413(null);
        model.setConservationBiodiversity414(null);
        model.setConservationBiodiversity415(null);
        model.setConvertForestLandExplain(null);
        model.setEcologicalImpactsLandscapeArea(null);
        model.setEcologicalImpactsSiteArea(null);
        model.setEconomicOtherArea(null);
        model.setEconomicOtherExplain(null);
        model.setEconomicProductivityArea(null);
        model.setEconomicStandArea(null);
        model.setEnvironmentalHarmOtherArea(null);
        model.setEnvironmentalHarmOtherExplain(null);
        model.setIndigenousPeoplesForest(null);
        model.setIndigenousPeoplesPrivate(null);
        model.setIndigenousPeoplesPublic(null);
        model.setProtectionMaintenanceWaterRes(null);
        model.setRespondingDiseaseArea(null);
        model.setRespondingInsectArea(null);
        model.setRespondingInvasiveArea(null);
        model.setRespondingOtherArea(null);
        model.setRespondingOtherExplain(null);
        model.setRestorationNativeArea(null);
        model.setRestorationOtherArea(null);
        model.setRestorationOtherExplain(null);
        model.setRestorationRiparianArea(null);
        model.setStopWho1A1BNote(null);
        model.setTrainedWoodProducersChanged(null);
        model.setTrainingEducation(null);
        model.setUseWho1A1BNote(null);
        model.setConservation413DataSource1_2(null);
        model.setConservation413DataSource1_4(null);
        model.setConservation413DataSource2_2(null);
        model.setConservation413DataSource2_4(null);
        model.setConservation414Explain1_1(null);
        model.setConservation414Explain1_2(null);
        model.setConservation414Explain1_5(null);
        model.setConservation414Explain1_6(null);
        model.setConservation414Explain2_1(null);
        model.setConservation414Explain2_2(null);
        model.setConservation414Explain2_5(null);
        model.setConservation414Explain2_6(null);
        model.setConservation415Explain1_1(null);
        model.setConservation415Explain1_2(null);
        model.setProtectionMaintenanceRationale(null);
        model.setConservation413Rationale(null);
        model.setConservation414Rationale(null);
        model.setConservation415Rationale(null);
        model.setIndigenousPublicRationale(null);
        model.setIndigenousPrivateRationale(null);
        model.setIndigenousForestPractice(null);
        model.setTrainingEduRationale(null);
        model.setConservationBiodiversity415Exp(null);

//      start set type
        model.setConservationBiodiversity413Items(new LinkedHashSet<Integer>());
        model.setConservationBiodiversity414Items(new LinkedHashSet<Integer>());
        model.setIndigenousPeoplesForestItems(new LinkedHashSet<Integer>());
        model.setIndigenousPeoplesPrivateItems(new LinkedHashSet<Integer>());
        model.setIndigenousPeoplesPublicItems(new LinkedHashSet<Integer>());
        model.setTrainingEducationItems(new LinkedHashSet<Integer>());
        model.setForestlandAreas(new LinkedHashSet<SfiPpFormForestlandAreaViewModel>());
        model.setStories(new LinkedHashSet<SfiPpFormStoryViewModel>());
        model.setProtectionMaintenanceWaterResItems1(new LinkedHashSet<Integer>());
        model.setProtectionMaintenanceWaterResItems2(new LinkedHashSet<Integer>());
        model.setConservationBiodiversity413Items1(new LinkedHashSet<Integer>());
        model.setConservationBiodiversity414Items1(new LinkedHashSet<Integer>());
        model.setIndigenousPeoplesPublicItems1(new LinkedHashSet<Integer>());
        model.setIndigenousPeoplesPrivateItems1(new LinkedHashSet<Integer>());
        model.setIndigenousPeoplesPrivateItems2(new LinkedHashSet<Integer>());
        model.setIndigenousPeoplesForestItems1(new LinkedHashSet<Integer>());
        model.setTrainingEducationItems1(new LinkedHashSet<Integer>());

        model.setConservationBiodiversity413Items2(new LinkedHashSet<Integer>());
        model.setConservationBiodiversity414Items2(new LinkedHashSet<Integer>());
//      end set types
    }
}