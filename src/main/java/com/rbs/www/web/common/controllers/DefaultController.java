package com.rbs.www.web.common.controllers;

import com.rbs.www.admin.models.entities.User;
import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.sfi.models.entities.SfiPpFormCs3ProjectStandardObjective;
import com.rbs.www.web.common.services.SfiPpFormAllCountryService;
import com.rbs.www.web.sfi.models.entities.SfiPpFormCs3ProjectStandardObjective2015;
import com.rbs.www.web.sfi.services.FormService;
import com.rbs.www.web.sfi.services.SfiPpFormCs3ProjectStandardObjective2015Service;
import com.rbs.www.web.sfi.services.SfiPpFormCs3ProjectStandardObjectiveService;
import com.rbs.www.web.common.services.SfiPpFormRegionService;
import com.rbs.www.web.sic.services.SicFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

import static com.rbs.www.common.util.Util.getCurrentUsername;

@Controller
public class DefaultController {

    @Autowired
    private SfiPpFormAllCountryService sfiPpFormAllCountryService;

    @Autowired
    private SfiPpFormCs3ProjectStandardObjectiveService sfiPpFormCs3ProjectStandardObjectiveService;

    @Autowired
    private SfiPpFormCs3ProjectStandardObjective2015Service sfiPpFormCs3ProjectStandardObjective2015Service;

    @Autowired
    private SfiPpFormRegionService sfiPpFormRegionService;

    @Autowired
    private UserService userService;

    @Autowired
    private FormService formService;

    @Autowired
    private SicFormService sicFormService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(SecurityContextHolderAwareRequestWrapper request, ModelMap model, HttpSession session) throws ParseException {
        if (request.isUserInRole("USER")){
            User user = userService.findByUsername(getCurrentUsername());
            model.addAttribute("company", user.getCompany());
        }
        model.addAttribute("title", "home");

        return "dashboard";
    }

    @RequestMapping(value = "/updateDate/{id}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<String> getUpdateDate(@PathVariable Integer id) {
        HttpStatus responseStatus;
        String response;

        try {
            response = Util.getAsString(formService.getUpdateDate(id));
            responseStatus = HttpStatus.OK;
        } catch (Exception ex) {
            response = "Invalid Id";
            responseStatus = HttpStatus.BAD_REQUEST;
        }

        return new ResponseEntity<String>(response, responseStatus);
    }

    @RequestMapping(value = "/sic/updateDate/{id}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<String> getSicUpdateDate(@PathVariable Integer id) {
        HttpStatus responseStatus;
        String response;

        try {
            response = Util.getAsString(sicFormService.getUpdateDate(id));
            responseStatus = HttpStatus.OK;
        } catch (Exception ex) {
            response = "Invalid Id";
            responseStatus = HttpStatus.BAD_REQUEST;
        }

        return new ResponseEntity<String>(response, responseStatus);
    }

    @RequestMapping(value = "/privacy", method = RequestMethod.GET)
    public String privacy(ModelMap model, SecurityContextHolderAwareRequestWrapper request) {
        User user = userService.findByUsername(getCurrentUsername());
        model.addAttribute("title", "privacy");
        if (request.isUserInRole("USER"))  model.addAttribute("company", user.getCompany());
        return "common/privacy";
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

    @RequestMapping(value = "/project/standard/objective/2015/list", method = RequestMethod.GET)
    public ResponseEntity<String> projectStandardObjective2015List() {
        List<SfiPpFormCs3ProjectStandardObjective2015> projectStandardObjectives = sfiPpFormCs3ProjectStandardObjective2015Service.getAll();
        return new ResponseEntity<String>(Util.getAsString(projectStandardObjectives), HttpStatus.OK);
    }
}