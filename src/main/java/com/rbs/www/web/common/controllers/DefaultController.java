package com.rbs.www.web.common.controllers;

import com.rbs.www.admin.models.entities.User;
import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.sfi.models.entities.SfiPpFormCs3ProjectStandardObjective;
import com.rbs.www.web.common.services.SfiPpFormAllCountryService;
import com.rbs.www.web.sfi.services.SfiPpFormCs3ProjectStandardObjectiveService;
import com.rbs.www.web.common.services.SfiPpFormRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DefaultController {

    @Autowired
    SfiPpFormAllCountryService sfiPpFormAllCountryService;

    @Autowired
    SfiPpFormCs3ProjectStandardObjectiveService sfiPpFormCs3ProjectStandardObjectiveService;

    @Autowired
    SfiPpFormRegionService sfiPpFormRegionService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(SecurityContextHolderAwareRequestWrapper request, ModelMap model, HttpSession session) {
        model.addAttribute("title", "home");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth instanceof AnonymousAuthenticationToken) return "/dashboard";

        if (request.isUserInRole("ADMIN")) return "redirect:/admin/dashboard";
        if (request.isUserInRole("GENERAL")) return "redirect:/user/profile";
        if (request.isUserInRole("USER")) return "redirect:/sfiPpForm";

        return "redirect:/sfiPpForm";
    }

    @RequestMapping(value = "/privacy", method = RequestMethod.GET)
    public String privacy(ModelMap model) {
        model.addAttribute("title", "privacy");
        return "privacy";
    }

    @RequestMapping(value = "/country/list", method = RequestMethod.GET)
    public ResponseEntity<String> countryList() {
        List country = sfiPpFormAllCountryService.getAll();
        return new ResponseEntity<String>(Util.getAsString(country), HttpStatus.OK);
    }

    @RequestMapping(value = "/region/list", method = RequestMethod.GET)
    public ResponseEntity<String> regionList() {
        List region = sfiPpFormRegionService.getAll();
        return new ResponseEntity<String>(Util.getAsString(region), HttpStatus.OK);
    }

    @RequestMapping(value = "/project/standard/objective/list", method = RequestMethod.GET)
    public ResponseEntity<String> projectStandardObjectiveList() {
        List<SfiPpFormCs3ProjectStandardObjective> projectStandardObjectives = sfiPpFormCs3ProjectStandardObjectiveService.getAll();
        return new ResponseEntity<String>(Util.getAsString(projectStandardObjectives), HttpStatus.OK);
    }
}