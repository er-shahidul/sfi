package com.rbs.sfi.web.controllers;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.entities.User;
import com.rbs.sfi.admin.services.CompanyService;
import com.rbs.sfi.admin.services.UserService;
import com.rbs.sfi.web.models.entities.SfiPpForm;
import com.rbs.sfi.web.repositories.SfiPpFormRepository;
import com.rbs.sfi.web.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.bind.DatatypeConverter;
import java.util.List;

import static com.rbs.sfi.admin.util.Util.getCurrentUsername;

@Controller
public class FormController {

    @Autowired
    UserService userService;

    @Autowired
    SfiPpFormService sfiPpFormService;

    @Autowired
    SfiPpFormAllCountryService sfiPpFormAllCountryService;

    @Autowired
    CompanyService companyService;

    @Autowired
    SfiPpFormRepository sfiPpFormRepository;

    @Autowired
    FormService formService;

    @RequestMapping(value = {"/form" }, method = RequestMethod.GET)
    public String homePage(ModelMap model, SecurityContextHolderAwareRequestWrapper request) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {

            if (request.isUserInRole("ADMIN") == true) {
                return ("redirect:/admin/form");
            } else if (request.isUserInRole("USER") == true) {
                return ("redirect:/sfiPpForm");
            } else {
                return ("redirect:/dashboard");
            }
        }

        return "redirect:/login";
    }

    @RequestMapping(value = {"/sfiPpForm" }, method = RequestMethod.GET)
    public String form(ModelMap model) {

        User user = userService.findByUsername(getCurrentUsername());
        Company company = user.getCompany();
        SfiPpForm sfiPpForm = sfiPpFormService.findByCompany(company);

        if(sfiPpForm == null){
            sfiPpForm = new SfiPpForm();
            sfiPpForm.setCompany(company);
            sfiPpForm.setCreatedBy(user);
            sfiPpFormService.save(sfiPpForm);
        }

        String companyLogo = DatatypeConverter.printBase64Binary(company.getLogo());
        List countries = sfiPpFormAllCountryService.list();

        model.addAttribute("form", sfiPpForm);
        model.addAttribute("cs1", formService.getCs1ViewModel(sfiPpForm.getId()));
        model.addAttribute("cs2", formService.getCs2ViewModel(sfiPpForm.getId()));
        model.addAttribute("cs3", formService.getCs3ViewModel(sfiPpForm.getId()));
        model.addAttribute("cs4", formService.getCs4ViewModel(sfiPpForm.getId()));
        model.addAttribute("cs5", formService.getCs5ViewModel(sfiPpForm.getId()));
        model.addAttribute("cs6", formService.getCs6ViewModel(sfiPpForm.getId()));

        model.addAttribute("company", company);
        model.addAttribute("companyLogo", "data:image/jpeg;base64," + companyLogo);
        model.addAttribute("user", user);
        model.addAttribute("countries", countries);
        model.addAttribute("mode", "edit");

        return "/core/form/index";
    }

    @RequestMapping(value = {"/admin/form" }, method = RequestMethod.GET)
    public String adminForm(ModelMap model) {
        model.addAttribute("title", "form");
        List sfiPpForms = sfiPpFormService.list();
        model.addAttribute("sfiPpForms", sfiPpForms);

        return "/core/form/admin_form";
    }
}