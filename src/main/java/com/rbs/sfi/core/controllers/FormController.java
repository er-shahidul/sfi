package com.rbs.sfi.core.controllers;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.entities.User;
import com.rbs.sfi.admin.services.CompanyService;
import com.rbs.sfi.admin.services.UserService;
import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.core.entities.SfiPpForm;
import com.rbs.sfi.core.repositories.SfiPpFormRepository;
import com.rbs.sfi.core.services.SfiPpFormAllCountryService;
import com.rbs.sfi.core.services.SfiPpFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rbs.sfi.core.services.SfiPpFormAllCountryService;
import com.rbs.sfi.core.services.SfiPpFormRegionService;

import javax.validation.Valid;
import javax.xml.bind.DatatypeConverter;
import java.util.ArrayList;
import java.util.List;

import static com.rbs.sfi.admin.util.Util.getAsString;
import static com.rbs.sfi.admin.util.Util.getCurrentUsername;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

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

    @RequestMapping(value = {"/form" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {

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
            model.addAttribute("company", company);
            model.addAttribute("companyLogo", "data:image/jpeg;base64," + companyLogo);
            model.addAttribute("user", user);
            model.addAttribute("countries", countries);
            model.addAttribute("mode", "edit");

            return "/core/form/index";
        }

        return "redirect:/login";
    }
//
//    @RequestMapping(value = {"/form/cs1" }, method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
//    public SfiPpForm formCs1(@RequestBody SfiPpForm sfiPpForm, BindingResult result ) {
//
//        return sfiPpFormService.saveCS1(sfiPpForm);
//
//    }
}