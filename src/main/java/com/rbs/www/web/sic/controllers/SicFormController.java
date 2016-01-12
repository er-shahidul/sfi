package com.rbs.www.web.sic.controllers;

import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.common.services.SfiPpFormAllCountryService;
import com.rbs.www.web.common.services.SfiPpFormRegionService;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.ParseException;
import java.util.Objects;

import static com.rbs.www.common.util.Util.getCurrentUsername;

@Controller
public class SicFormController {

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

        model.addAttribute("company", sicFormData.getCompany());
        model.addAttribute("createdAt", sicFormData.getCreatedAt());
        model.addAttribute("createdBy", sicFormData.getCreatedBy());
        model.addAttribute("updateAt", sicFormData.getUpdatedAt());
        model.addAttribute("updateBy", sicFormData.getUpdatedBy());
        model.addAttribute("status", sicFormData.getStatus());

        model.addAttribute("regions", sfiPpFormRegionService.getAll());
        model.addAttribute("countries", sfiPpFormAllCountryService.getAll());
        model.addAttribute("standardObjects", sfiPpFormCs3ProjectStandardObjectiveService.getAll());
    }

    @RequestMapping(value = "/sicForm", method = RequestMethod.GET)
    public String form(ModelMap model, SecurityContextHolderAwareRequestWrapper request) throws ParseException {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth instanceof AnonymousAuthenticationToken) return "redirect:/login";
        if (request.isUserInRole("ADMIN")) return "redirect:/admin/dashboard";
        if (request.isUserInRole("GENERAL")) return "redirect:/user/profile";

        SicFormData sicFormData = sicFormDataService.createOrGetByCurrentUsersCompany();
        if (request.isUserInRole("USER")
                && Objects.equals(sicFormData.getStatus().getStatus(), "submitted")) {
            return "redirect:/sicForm/view";
        }

        populateFormContent(model, sicFormData);
        model.addAttribute("days_until", Util.getDiffDays(endDate));
        model.addAttribute("mode", "edit");

        model.addAttribute("user", userService.findByUsername(getCurrentUsername()));
        return "/web/sic/index";
    }

    @RequestMapping(value = "/sicForm/view", method = RequestMethod.GET)
    public String viewForm(ModelMap model, SecurityContextHolderAwareRequestWrapper request) throws ParseException {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth instanceof AnonymousAuthenticationToken) return "redirect:/login";
        if (request.isUserInRole("ADMIN")) return "redirect:/admin/dashboard";
        if (request.isUserInRole("GENERAL")) return "redirect:/user/profile";

        SicFormData sicFormData = sicFormDataService.createOrGetByCurrentUsersCompany();
        populateFormContent(model, sicFormData);
        model.addAttribute("days_until", Util.getDiffDays(endDate));
        model.addAttribute("mode", "view");

        model.addAttribute("user", userService.findByUsername(getCurrentUsername()));
        return "/web/sic/index";
    }
}