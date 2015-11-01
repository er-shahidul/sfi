package com.rbs.sfi.core.controllers;

import com.rbs.sfi.admin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.rbs.sfi.admin.util.Util.getCurrentUsername;

@Controller
public class FrontController {

    @Autowired
    UserService userService;

    @RequestMapping(value = {"/form" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {

        model.addAttribute("user", userService.findByUsername(getCurrentUsername()));

        return "dashboard";
    }
}