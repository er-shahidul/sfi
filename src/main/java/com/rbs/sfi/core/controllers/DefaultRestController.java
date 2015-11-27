package com.rbs.sfi.core.controllers;

import com.rbs.sfi.admin.services.CompanyService;
import com.rbs.sfi.admin.services.UserService;
import com.rbs.sfi.core.models.entities.Cs1;
import com.rbs.sfi.core.models.entities.Cs2;
import com.rbs.sfi.core.models.viewmodels.Cs1ViewModel;
import com.rbs.sfi.core.models.viewmodels.Cs2ViewModel;
import com.rbs.sfi.core.repositories.Cs1Repository;
import com.rbs.sfi.core.repositories.Cs2Repository;
import com.rbs.sfi.core.repositories.SfiPpFormRepository;
import com.rbs.sfi.core.services.Cs1Service;
import com.rbs.sfi.core.services.Cs2Service;
import com.rbs.sfi.core.services.SfiPpFormAllCountryService;
import com.rbs.sfi.core.services.SfiPpFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@org.springframework.web.bind.annotation.RestController
public class DefaultRestController {

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
    Cs1Service cs1Service;

    @Autowired
    Cs2Service cs2Service;

    @Autowired
    Cs2Repository cs2Repository;

    @RequestMapping(value = {"/form/cs1" }, method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public void formCs1(@RequestBody Cs1ViewModel model, BindingResult result ) {
        cs1Service.setEntity(model);
    }

    @RequestMapping(value = {"/form/cs2" }, method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public void formCs2(@RequestBody Cs2ViewModel model, BindingResult result ) {
        cs2Service.setEntity(model);
    }
}