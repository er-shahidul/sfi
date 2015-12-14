package com.rbs.sfi.web.controllers;

import com.rbs.sfi.admin.services.CompanyService;
import com.rbs.sfi.admin.services.UserService;
import com.rbs.sfi.common.services.TypeConversionUtils;
import com.rbs.sfi.web.models.entities.SfiPpFormData;
import com.rbs.sfi.web.repositories.SfiPpFormDataRepository;
import com.rbs.sfi.web.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.util.ArrayUtils;

import javax.xml.bind.DatatypeConverter;

import static com.rbs.sfi.admin.util.Util.getCurrentUsername;

@Controller
public class FormController {
    @Autowired
    UserService userService;

    @Autowired
    SfiPpFormDataService sfiPpFormDataService;

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
    SfiPpFormDataRepository sfiPpFormDataRepository;

    @Autowired
    FormService formService;

    @Autowired
    SfiPpFormCs3ProjectStandardObjectiveService sfiPpFormCs3ProjectStandardObjectiveService;

    private void populateFormContent(ModelMap model, SfiPpFormData sfiPpFormData) {
        Integer id = sfiPpFormData.getId();
        String companyLogo = DatatypeConverter
                .printBase64Binary(TypeConversionUtils.toPrimitiveType(sfiPpFormData.getCompany().getLogo()));

        model.addAttribute("form", sfiPpFormData);
        model.addAttribute("cs1", formService.getCs1ViewModel(id));
        model.addAttribute("cs2", formService.getCs2ViewModel(id));
        model.addAttribute("cs3", formService.getCs3ViewModel(id));
        model.addAttribute("cs4", formService.getCs4ViewModel(id));
        model.addAttribute("cs5", formService.getCs5ViewModel(id));
        model.addAttribute("cs6", formService.getCs6ViewModel(id));
        model.addAttribute("cs7", formService.getCs7ViewModel(id));
        model.addAttribute("cs8", formService.getCs8ViewModel(id));
        model.addAttribute("cs9", formService.getCs9ViewModel(id));
        model.addAttribute("cs10", formService.getCs10ViewModel(id));

        model.addAttribute("company", sfiPpFormData.getCompany());
        model.addAttribute("companyLogo", "data:image/jpeg;base64," + companyLogo);
        model.addAttribute("countries", sfiPpFormAllCountryService.getAll());
        model.addAttribute("regions", sfiPpFormRegionService.getAll());
        model.addAttribute("standardObjects", sfiPpFormCs3ProjectStandardObjectiveService.list());

        model.addAttribute("mode", "edit");
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String home(ModelMap model, SecurityContextHolderAwareRequestWrapper request) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth instanceof AnonymousAuthenticationToken)
            return "redirect:/login";

        if (request.isUserInRole("ADMIN")) return "redirect:/admin/form";
        if (request.isUserInRole("USER")) return "redirect:/sfiPpForm";

        return "redirect:/dashboard";
    }

    @RequestMapping(value = "/sfiPpForm", method = RequestMethod.GET)
    public String form(ModelMap model) {
        SfiPpFormData sfiPpFormData = sfiPpFormDataService.createOrGetByCurrentUsersCompany();
        populateFormContent(model, sfiPpFormData);

        model.addAttribute("user", userService.findByUsername(getCurrentUsername()));
        return "/core/form/index";
    }

    @RequestMapping(value = "/admin/company/sfi/form/{id}", method = RequestMethod.GET)
    public String editPassword(@PathVariable Integer id, ModelMap model) {
        SfiPpFormData sfiPpFormData = sfiPpFormDataService.get(id);
        populateFormContent(model, sfiPpFormData);

        return "/core/form/index";
    }

    @RequestMapping(value = "/admin/form", method = RequestMethod.GET)
    public String adminForm(ModelMap model) {
        model.addAttribute("title", "form");
        model.addAttribute("sfiPpForms", sfiPpFormDataService.getAll());

        return "/core/form/admin_form";
    }

    @RequestMapping(value = "/admin/form/sfi", method = RequestMethod.GET)
    public String adminSfiForm(ModelMap model) {
        model.addAttribute("title", "sfi");
        model.addAttribute("sfiPpForms", sfiPpFormDataService.getAll());

        return "/core/form/admin_form_sfi";
    }

    @RequestMapping(value = "/admin/form/sic", method = RequestMethod.GET)
    public String adminSicForm(ModelMap model) {
        model.addAttribute("title", "sic");
        model.addAttribute("sfiPpForms", sfiPpFormDataService.getAll());

        return "/core/form/admin_form_sic";
    }
}