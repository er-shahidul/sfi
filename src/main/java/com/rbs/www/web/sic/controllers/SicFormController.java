package com.rbs.www.web.sic.controllers;

import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.common.services.SfiPpFormAllCountryService;
import com.rbs.www.web.common.services.SfiPpFormRegionService;
import com.rbs.www.web.sfi.services.SfiPpFormCs3ProjectStandardObjective2015Service;
import com.rbs.www.web.sfi.services.SfiPpFormCs3ProjectStandardObjectiveService;
import com.rbs.www.web.sic.services.*;
import com.rbs.www.web.sic.models.entities.SicFormData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static com.rbs.www.common.util.Util.getCurrentUsername;

@Controller
public class SicFormController{

    @Value("#{messages[endDate]}")
    private String endDate;

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
        model.addAttribute("mode", "edit");
        model.addAttribute("isAdmin", false);

        model.addAttribute("user", userService.findByUsername(getCurrentUsername()));
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
        model.addAttribute("mode", "edit");
        model.addAttribute("isAdmin", true);

        return "web/sic/index";
    }

    @RequestMapping(value = "/admin/company/sic/form/view/{id}", method = RequestMethod.GET)
    public String adminSicFormView(@PathVariable Integer id, ModelMap model, HttpServletRequest url) throws ParseException {
        SicFormData sicFormData = sicFormDataService.get(id);
        populateFormContent(model, sicFormData);
        model.addAttribute("days_until", Util.getDiffDays(endDate));
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

        return "admin/form/admin_form_sic";
    }

    @RequestMapping(value = "/user/form/sic", method = RequestMethod.GET)
    public String userSicForm(ModelMap model) {
        model.addAttribute("title", "sic");
        model.addAttribute("sicPpForms", sicFormDataService.createOrGetByCurrentUsersCompany());
        SicFormData sicFormData = sicFormDataService.createOrGetByCurrentUsersCompany();
        model.addAttribute("company", sicFormData.getCompany());

        return "admin/form/admin_form_sic";
    }
}