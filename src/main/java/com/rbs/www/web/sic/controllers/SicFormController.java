package com.rbs.www.web.sic.controllers;

import com.rbs.www.admin.models.entities.User;
import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.common.util.MailHelper;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.common.services.SfiPpFormAllCountryService;
import com.rbs.www.web.common.services.SfiPpFormRegionService;
import com.rbs.www.web.sfi.services.SfiPpFormCs3ProjectStandardObjective2015Service;
import com.rbs.www.web.sfi.services.SfiPpFormCs3ProjectStandardObjectiveService;
import com.rbs.www.web.sic.models.entities.SicFormOld;
import com.rbs.www.web.sic.models.viewmodels.SicCs10ViewModel;
import com.rbs.www.web.sic.models.viewmodels.SicFormOldViewModel;
import com.rbs.www.web.sic.services.*;
import com.rbs.www.web.sic.models.entities.SicFormData;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Objects;

import static com.rbs.www.common.util.Util.getCurrentUsername;

@Controller
public class SicFormController{

    @Value("#{messages[endDate]}")
    private String endDate;

    @Value("#{messages[end_date]}")
    private String end_date;

    @Value("#{messages[domain]}")
    private String domain;

    @Autowired
    private SicFormService sicFormService;

    @Autowired
    SicFormOldService sicFormOldService;

    @Autowired
    UserService userService;

    @Autowired
    SicFormService formService;

    @Autowired
    SicFormDataService sicFormDataService;

    @Autowired
    SfiPpFormCs3ProjectStandardObjectiveService sfiPpFormCs3ProjectStandardObjectiveService;

    @Autowired
    SfiPpFormCs3ProjectStandardObjective2015Service sfiPpFormCs3ProjectStandardObjective2015Service;

    @Autowired
    SfiPpFormAllCountryService sfiPpFormAllCountryService;

    @Autowired
    SfiPpFormRegionService sfiPpFormRegionService;

    private void populateFormContent(ModelMap model, SicFormData sicFormData) {
        Integer id = sicFormData.getId();

        String companyLogo = TypeConversionUtils.toBase64Binary(sicFormData.getCompany().getLogo());
        if (companyLogo != null) companyLogo = "data:image/jpeg;base64," + companyLogo;
        model.addAttribute("companyLogo", companyLogo);

        model.addAttribute("form", sicFormData);
        model.addAttribute("cs1", formService.getSicCs1ViewModel(id));
        model.addAttribute("cs2", formService.getSicCs2ViewModel(id));
        model.addAttribute("cs3", formService.getSicCs3ViewModel(id));
        model.addAttribute("cs4", formService.getSicCs4ViewModel(id));
        model.addAttribute("cs5", formService.getSicCs5ViewModel(id));
        model.addAttribute("cs6", formService.getSicCs6ViewModel(id));
        model.addAttribute("cs7", formService.getSicCs7ViewModel(id));
        model.addAttribute("cs8", formService.getSicCs8ViewModel(id));
        model.addAttribute("cs9", formService.getSicCs9ViewModel(id));
        model.addAttribute("cs10", formService.getSicCs10ViewModel(id));

        model.addAttribute("createdAt", "[ "+ Util.getDateFormat(sicFormData.getCreatedAt()) + " ]");
        model.addAttribute("updateAt", "[ "+ Util.getDateFormat(sicFormData.getUpdatedAt()) + " ]");
        model.addAttribute("company", sicFormData.getCompany());
        model.addAttribute("status", sicFormData.getStatus());

        model.addAttribute("regions", sfiPpFormRegionService.getAll());
        model.addAttribute("countries", sfiPpFormAllCountryService.getAll());
        model.addAttribute("standardObjects", sfiPpFormCs3ProjectStandardObjectiveService.getAll());
        model.addAttribute("standardObjects2015", sfiPpFormCs3ProjectStandardObjective2015Service.getAll());
    }

    @RequestMapping(value = "/sicForm", method = RequestMethod.GET)
    public String form(ModelMap model, SecurityContextHolderAwareRequestWrapper request) throws ParseException {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        String x = authCheck(request, auth);
        if (x != null) return x;

        SicFormData sicFormData = sicFormDataService.createOrGetByCurrentUsersCompany();
        if (request.isUserInRole("USER")
                && "submitted".equals(sicFormData.getStatus().getStatus())) {
            return "redirect:/sicForm/view";
        }

        populateFormContent(model, sicFormData);
        model.addAttribute("days_until", Util.getDiffDays(endDate));
        model.addAttribute("endDate", endDate);
        model.addAttribute("end_date", end_date);
        model.addAttribute("mode", "edit");
        model.addAttribute("isAdmin", false);
        model.addAttribute("user", userService.findByUsername(getCurrentUsername()));

        if(Objects.equals(sicFormDataService.createOrGetByCurrentUsersCompany().getStatus().getStatus(), "submitted")){
            return "redirect:/sicForm/view";
        }

        return "/web/sic/index";
    }

    @RequestMapping(value = "/sicForm/view", method = RequestMethod.GET)
    public String viewForm(ModelMap model, SecurityContextHolderAwareRequestWrapper request, HttpServletRequest url) throws ParseException {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        String x = authCheck(request, auth);
        if (x != null) return x;

        String print = url.getQueryString();
        if(Objects.equals(print, "print")){
            model.addAttribute("print", true);
        }

        SicFormData sicFormData = sicFormDataService.createOrGetByCurrentUsersCompany();
        populateFormContent(model, sicFormData);
        model.addAttribute("days_until", Util.getDiffDays(endDate));
        model.addAttribute("endDate", endDate);
        model.addAttribute("end_date", end_date);
        model.addAttribute("mode", "view");
        model.addAttribute("isAdmin", false);

        model.addAttribute("user", userService.findByUsername(getCurrentUsername()));
        return "/web/sic/index";
    }

    private String authCheck(SecurityContextHolderAwareRequestWrapper request, Authentication auth) {
        if (auth instanceof AnonymousAuthenticationToken) return "redirect:/login";
        if (request.isUserInRole("ADMIN")) return "redirect:/admin/dashboard";
        if (request.isUserInRole("GENERAL")) return "redirect:/user/profile";
        return null;
    }

    @RequestMapping(value = "/admin/company/sic/form/{id}", method = RequestMethod.GET)
    public String adminSicFormEdit(@PathVariable Integer id, ModelMap model) throws ParseException {
        SicFormData sicFormData = sicFormDataService.get(id);
        populateFormContent(model, sicFormData);
        model.addAttribute("days_until", Util.getDiffDays(endDate));
        model.addAttribute("endDate", endDate);
        model.addAttribute("end_date", end_date);
        model.addAttribute("mode", "edit");
        model.addAttribute("isAdmin", true);

        return "web/sic/index";
    }

    @RequestMapping(value = "/admin/company/sic/form/view/{id}", method = RequestMethod.GET)
    public String adminSicFormView(@PathVariable Integer id, ModelMap model, HttpServletRequest url) throws ParseException {
        SicFormData sicFormData = sicFormDataService.get(id);
        populateFormContent(model, sicFormData);
        model.addAttribute("days_until", Util.getDiffDays(endDate));
        model.addAttribute("endDate", endDate);
        model.addAttribute("end_date", end_date);
        model.addAttribute("mode", "view");
        model.addAttribute("isAdmin", true);

        String print = url.getQueryString();
        if(Objects.equals(print, "print")){
            model.addAttribute("print", true);
        }

        return "web/sic/index";
    }

    @RequestMapping(value = "/admin/form/sic", method = RequestMethod.GET)
    public String adminSicForm(ModelMap model) {
        model.addAttribute("title", "sic");
        model.addAttribute("sicPpForms", sicFormDataService.getAll());
        model.addAttribute("sicFormsOld", sicFormOldService.getAll());

        return "admin/form/admin_form_sic";
    }

    @RequestMapping(value = "/user/form/sic", method = RequestMethod.GET)
    public String userSicForm(ModelMap model) {
        model.addAttribute("title", "sic");
        model.addAttribute("sicPpForms", sicFormDataService.createOrGetByCurrentUsersCompany());
        model.addAttribute("sicFormsOld", sicFormOldService.createOrGetByCurrentUsersCompany());
        SicFormData sicFormData = sicFormDataService.createOrGetByCurrentUsersCompany();
        model.addAttribute("company", sicFormData.getCompany());

        return "admin/form/admin_form_sic";
    }

    @RequestMapping(value = "/sicForm/pdf/{year}/{fileName}", method = RequestMethod.GET, produces = "application/pdf")
    public ResponseEntity<byte[]> viewPdf(@PathVariable String year, @PathVariable String fileName, HttpServletRequest request) {
        String originalPath = request.getSession().getServletContext().getRealPath("/")+"uploads/pdf/sic/"+year+"/";

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

    @RequestMapping(value = "/sicForm/sic/{uniqueName}/{fileName:.+}", method = RequestMethod.GET)
    public void getFile(@PathVariable String fileName, @PathVariable String uniqueName, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String originalPath = request.getSession().getServletContext().getRealPath("/")+"uploads/sic/"+uniqueName+"."+getFileExtension(fileName);
        // create full filename and get input stream
        File file = new File (originalPath);
        InputStream is = new FileInputStream(file);

        // set file as attached data and copy file data to response output stream
        response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
        FileCopyUtils.copy(is, response.getOutputStream());

        response.flushBuffer();
    }

    private void sendEmail(String recipient, String subject, String message, User user, String mailType, String path) {
        ApplicationContext context = new ClassPathXmlApplicationContext("email-context.xml");
        MailHelper mailHelper = (MailHelper) context.getBean("mailMail");

        mailHelper.sendMail(recipient, subject, message, user, mailType, path);
    }

    @RequestMapping(value = "/admin/company/sic/form/approve/{id}", method = RequestMethod.GET)
    public ResponseEntity<String> adminSfiFormEdit(@PathVariable Integer id, HttpServletRequest request) throws MalformedURLException {
        SicFormData model = sicFormDataService.get(id);
        if(model != null){
            model.setApproved(!model.getApproved());
            sicFormDataService.update(model);

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

    @RequestMapping(value = "/admin/company/sic/form/old/approve/{id}", method = RequestMethod.GET)
    public ResponseEntity<String> adminSfiForm2014Edit(@PathVariable Integer id, HttpServletRequest request) throws MalformedURLException {
        SicFormOld model = sicFormOldService.get(id);
        if(model != null){
            model.setApproved(!model.getApproved());
            sicFormOldService.update(model);

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