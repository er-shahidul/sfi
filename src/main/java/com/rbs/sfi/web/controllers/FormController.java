package com.rbs.sfi.web.controllers;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.entities.User;
import com.rbs.sfi.admin.services.CompanyService;
import com.rbs.sfi.admin.services.UserService;
import com.rbs.sfi.web.models.entities.SfiPpForm;
import com.rbs.sfi.web.models.entities.SfiPpFormStatus;
import com.rbs.sfi.web.models.viewmodels.Cs5ViewModel;
import com.rbs.sfi.web.repositories.SfiPpFormRepository;
import com.rbs.sfi.web.repositories.SfiPpFormStatusRepository;
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
    SfiPpFormStatusService sfiPpFormStatusService;

    @Autowired
    SfiPpFormAllCountryService sfiPpFormAllCountryService;

    @Autowired
    SfiPpFormRegionService sfiPpFormRegionService;

    @Autowired
    CompanyService companyService;

    @Autowired
    SfiPpFormCs5Service sfiPpFormCs5Service;

    @Autowired
    SfiPpFormRepository sfiPpFormRepository;

    @Autowired
    FormService formService;

    @RequestMapping(value = {"/form"}, method = RequestMethod.GET)
    public String home(ModelMap model, SecurityContextHolderAwareRequestWrapper request) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth instanceof AnonymousAuthenticationToken)
            return "redirect:/login";

        if (request.isUserInRole("ADMIN")) return "redirect:/admin/form";
        if (request.isUserInRole("USER")) return "redirect:/sfiPpForm";

        return "redirect:/dashboard";
    }

    @RequestMapping(value = {"/sfiPpForm"}, method = RequestMethod.GET)
    public String form(ModelMap model) {
        User user = userService.findByUsername(getCurrentUsername());
        Company company = user.getCompany();
        SfiPpForm sfiPpForm = sfiPpFormService.findByCompany(company);
        SfiPpFormStatus sfiPpFormStatus = sfiPpFormStatusService.findById(1);

        if (sfiPpForm == null) {
            sfiPpForm = new SfiPpForm();
            sfiPpForm.setCompany(company);
            sfiPpForm.setCreatedBy(user);
            sfiPpForm.setStatus(sfiPpFormStatus);
            sfiPpFormService.save(sfiPpForm);
        }

        String companyLogo = DatatypeConverter.printBase64Binary(company.getLogo());
        List countries = sfiPpFormAllCountryService.getAll();
        List regions = sfiPpFormRegionService.list();

        model.addAttribute("form", sfiPpForm);
        model.addAttribute("cs1", formService.getCs1ViewModel(sfiPpForm.getId()));
        model.addAttribute("cs2", formService.getCs2ViewModel(sfiPpForm.getId()));
        model.addAttribute("cs3", formService.getCs3ViewModel(sfiPpForm.getId()));
        model.addAttribute("cs4", formService.getCs4ViewModel(sfiPpForm.getId()));

        Cs5ViewModel cs5ViewModel = formService.getCs5ViewModel(sfiPpForm.getId());
        cs5ViewModel.setItems(formService.getSfiPpFormCs5ViewModels(sfiPpForm.getId()));
        model.addAttribute("cs5", cs5ViewModel);

        model.addAttribute("cs6", formService.getCs6ViewModel(sfiPpForm.getId()));
        model.addAttribute("cs7", formService.getCs7ViewModel(sfiPpForm.getId()));
        model.addAttribute("cs8", formService.getCs8ViewModel(sfiPpForm.getId()));
        model.addAttribute("cs9", formService.getCs9ViewModel(sfiPpForm.getId()));
        model.addAttribute("cs10", formService.getCs10ViewModel(sfiPpForm.getId()));

        model.addAttribute("company", company);
        model.addAttribute("companyLogo", "data:image/jpeg;base64," + companyLogo);
        model.addAttribute("user", user);
        model.addAttribute("countries", countries);
        model.addAttribute("regions", regions);

        model.addAttribute("mode", "edit");

        return "/core/form/index";
    }

    @RequestMapping(value = {"/admin/form"}, method = RequestMethod.GET)
    public String adminForm(ModelMap model) {
        model.addAttribute("title", "form");
        List sfiPpForms = sfiPpFormService.list();
        model.addAttribute("sfiPpForms", sfiPpForms);

        return "/core/form/admin_form";
    }
}