package com.rbs.www.web.sfi.controllers;

import com.rbs.www.admin.models.entities.User;
import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.common.util.MailHelper;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.common.services.SfiPpFormAllCountryService;
import com.rbs.www.web.common.services.SfiPpFormRegionService;
import com.rbs.www.web.sfi.models.entities.SfiPpForm2014;
import com.rbs.www.web.sfi.models.entities.SfiPpFormData;
import com.rbs.www.web.sfi.models.viewmodels.*;
import com.rbs.www.web.sfi.repositories.SfiPpFormDataRepository;
import com.rbs.www.web.sfi.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.LinkedHashSet;
import java.util.Objects;

@Controller
public class PpFormController{

    @Value("#{messages[endDate]}")
    private String endDate;

    @Value("#{messages[end_date]}")
    private String end_date;
    
    @Value("#{messages[domain]}")
    private String domain;

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


    @Autowired
    private SfiPpFormDataRepository repository;

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
        model.addAttribute("endDate", endDate);
        model.addAttribute("end_date", end_date);
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
        model.addAttribute("endDate", endDate);
        model.addAttribute("end_date", end_date);
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
        model.addAttribute("endDate", endDate);
        model.addAttribute("end_date", end_date);
        model.addAttribute("mode", "edit");
        model.addAttribute("isAdmin", true);

        return "/core/form/index";
    }

    @RequestMapping(value = "/admin/company/pp/form/view/{id}", method = RequestMethod.GET)
    public String adminSfiFormView(@PathVariable Integer id, ModelMap model, HttpServletRequest url) throws ParseException {
        SfiPpFormData sfiPpFormData = sfiPpFormDataService.get(id);
        populateFormContent(model, sfiPpFormData);
        model.addAttribute("days_until", Util.getDiffDays(endDate));
        model.addAttribute("endDate", endDate);
        model.addAttribute("end_date", end_date);
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

    @RequestMapping(value = "/sfiPpForm/pdf/{year}/{fileName}", method = RequestMethod.GET, produces = "application/pdf")
    public ResponseEntity<byte[]> viewPdf(@PathVariable String year, @PathVariable String fileName, HttpServletRequest request) {
        String originalPath = request.getSession().getServletContext().getRealPath("/")+"uploads/pdf/"+year+"/";

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
        model.setBiodiversityTrainingNoDescribe(null);
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
        model.setConservation415Explain1_2(null);
        model.setConservation415Rationale(null);
        model.setIndigenousPrivateRationale(null);

//      start set type
        model.setConservationBiodiversity413Items(new LinkedHashSet<Integer>());
        model.setConservationBiodiversity414Items(new LinkedHashSet<Integer>());
        model.setIndigenousPeoplesForestItems(new LinkedHashSet<Integer>());
        model.setIndigenousPeoplesPrivateItems(new LinkedHashSet<Integer>());
        model.setIndigenousPeoplesPublicItems(new LinkedHashSet<Integer>());
        model.setTrainingEducationItems(new LinkedHashSet<Integer>());
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

    private void sendEmail(String recipient, String subject, String message, User user, String mailType, String path) {
        ApplicationContext context = new ClassPathXmlApplicationContext("email-context.xml");
        MailHelper mailHelper = (MailHelper) context.getBean("mailMail");

        mailHelper.sendMail(recipient, subject, message, user, mailType, path);
    }

    @RequestMapping(value = "/admin/company/pp/form/approve/{id}", method = RequestMethod.GET)
    public ResponseEntity<String> adminSfiFormEdit(@PathVariable Integer id, HttpServletRequest request) throws MalformedURLException {
        SfiPpFormData model = sfiPpFormDataService.get(id);
        if(model != null){
            model.setApprove(!model.getApprove());
            sfiPpFormDataService.update(model);

            User user = userService.findByCompany(model.getCompany());
            String subject = "Successfully Submission of your SFI Annual Survey!";
            String message = "-";
            String mailType = "approved";

            String domain = this.domain;

            URL requestURL = new URL(request.getRequestURL().toString());
            String port = requestURL.getPort() == -1 ? "" : ":" + requestURL.getPort();
            String urlString =  requestURL.getProtocol() + "://" + requestURL.getHost() + port;

            sendEmail(user.getEmail(), subject, message, user, mailType, urlString);

            return new ResponseEntity<String>("Successfully Approved", HttpStatus.OK);
        }else {
            return new ResponseEntity<String>("Invalid Form", HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/admin/company/pp/form/2014/approve/{id}", method = RequestMethod.GET)
    public ResponseEntity<String> adminSfiForm2014Edit(@PathVariable Integer id, HttpServletRequest request) throws MalformedURLException {
        SfiPpForm2014 model = sfiPpForm2014Service.get(id);
        if(model != null){
            model.setApproved(!model.getApproved());
            sfiPpForm2014Service.update(model);

            User user = userService.findByCompany(model.getCompany());
            String subject = "Successfully Submission of your SFI Annual Survey!";
            String message = "-";
            String mailType = "approved";

            String domain = this.domain;

            URL requestURL = new URL(request.getRequestURL().toString());
            String port = requestURL.getPort() == -1 ? "" : ":" + requestURL.getPort();
            String urlString =  requestURL.getProtocol() + "://" + requestURL.getHost() + port;

            sendEmail(user.getEmail(), subject, message, user, mailType, urlString);

            return new ResponseEntity<String>("Successfully Approved", HttpStatus.OK);
        }else {
            return new ResponseEntity<String>("Invalid Form", HttpStatus.OK);
        }
    }
}