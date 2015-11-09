package com.rbs.sfi.core.controllers;

import com.rbs.sfi.admin.entities.User;
import com.rbs.sfi.admin.services.UserService;
import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.core.services.SfiPpFormAllCountryService;
import com.rbs.sfi.core.services.SfiPpFormRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import static com.rbs.sfi.admin.util.Util.getCurrentUsername;

@Controller
public class DefaultController {

    @Autowired
    SfiPpFormAllCountryService sfiPpFormAllCountryService;

    @Autowired
    SfiPpFormRegionService sfiPpFormRegionService;

    @Autowired
    UserService userService;

    @RequestMapping(value = {"/" }, method = RequestMethod.GET)
    public String home() {

        User user = userService.findByUsername(getCurrentUsername());
        if(user != null){
            return ("redirect:/admin/dashboard");
        } else {
            return ("redirect:/dashboard");
        }
    }

    @RequestMapping(value = {"/dashboard" }, method = RequestMethod.GET)
    public String withOutLogIn() {

        return "dashboard";
    }

    @RequestMapping(value = {"/country/list" }, method = RequestMethod.GET)
    public ResponseEntity countryList() {

        List country = sfiPpFormAllCountryService.list();

        return new ResponseEntity(Util.getAsString(country), HttpStatus.OK);
    }

    @RequestMapping(value = {"/region/list" }, method = RequestMethod.GET)
    public ResponseEntity regionList() {

        List region = sfiPpFormRegionService.list();

    return new ResponseEntity(Util.getAsString(region), HttpStatus.OK);
    }

}