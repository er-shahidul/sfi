package com.rbs.sfi.core.controllers;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.entities.User;
import com.rbs.sfi.admin.services.CompanyService;
import com.rbs.sfi.admin.services.UserService;
import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.core.entities.SfiPpForm;
import com.rbs.sfi.core.repositories.SfiPpFormRepository;
import com.rbs.sfi.core.services.SfiPpFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

import static com.rbs.sfi.admin.util.Util.getCurrentUsername;

@Controller
public class FormController {

    @Autowired
    UserService userService;

    @Autowired
    SfiPpFormService sfiPpFormService;

    @Autowired
    CompanyService companyService;

    @Autowired
    SfiPpFormRepository sfiPpFormRepository;

    @RequestMapping(value = {"/" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {

//            int id = 1;
//            model.addAttribute("user", userService.findByUsername(getCurrentUsername()));
//            SfiPpForm sfiPpForm = sfiPpFormService.findById(id);

            User user = userService.findByUsername(getCurrentUsername());
            SfiPpForm sfiPpForm = sfiPpFormService.findByCompany(user.getCompany());
            if(sfiPpForm == null){
                SfiPpForm form = new SfiPpForm();
                form.setCompany(user.getCompany());
                sfiPpFormService.save(form);

            }
            model.addAttribute("sfiPpForm", Util.getAsString(sfiPpForm));
            model.addAttribute("user", user);

            return "/admin/user/dashboard";
        }

        return "dashboard";
    }

    @RequestMapping(value = "/admin/form/new", method = RequestMethod.GET)
    public String form(ModelMap model) {
        SfiPpForm sfiPpForm = new SfiPpForm();

        List<Company> companies = companyService.list();
        model.addAttribute("companies", companies);

        model.addAttribute("sfiPpForm", sfiPpForm);

        return "/core/sfiPpForm/new";
    }

    @RequestMapping(value = "/admin/form/new", method = RequestMethod.POST)
    public String save(@Valid SfiPpForm sfiPpForm, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return ("redirect:/admin/form/new");
        }

        sfiPpFormService.save(sfiPpForm);

        model.addAttribute("success", "sfiPpForm " + "" + " has been registered successfully");
        return ("redirect:/");
    }
}