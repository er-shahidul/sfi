package com.rbs.www.web.sfi.controllers;

import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.enums.FormStatus;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.common.services.SfiPpFormAllCountryService;
import com.rbs.www.web.common.services.SfiPpFormRegionService;
import com.rbs.www.web.sfi.models.entities.SfiPpFormData;
import com.rbs.www.web.sfi.services.*;
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
import java.text.ParseException;
import java.util.Objects;

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
}