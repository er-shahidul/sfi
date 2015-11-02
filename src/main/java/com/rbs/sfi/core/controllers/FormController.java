package com.rbs.sfi.core.controllers;

import com.rbs.sfi.admin.entities.User;
import com.rbs.sfi.admin.services.UserService;
import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.core.entities.SfiPpForm;
import com.rbs.sfi.core.services.SfiPpFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

import static com.rbs.sfi.admin.util.Util.getCurrentUsername;

@Controller
public class FormController {

    @Autowired
    UserService userService;

    @Autowired
    SfiPpFormService sfiPpFormService;

    @RequestMapping(value = {"/" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {

//            int id = 1;
//            model.addAttribute("user", userService.findByUsername(getCurrentUsername()));
//            SfiPpForm sfiPpForm = sfiPpFormService.findById(id);

            User user = userService.findByUsername(getCurrentUsername());
            SfiPpForm sfiPpForm = sfiPpFormService.findByCompany(user.getCompany());
            model.addAttribute("sfiPpForm", Util.getAsString(sfiPpForm));
            model.addAttribute("user", user);

            return "/admin/user/dashboard";
        }

        return "dashboard";
    }
}