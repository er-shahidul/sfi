package com.rbs.sfi.core.controllers;

import com.rbs.sfi.admin.services.CompanyService;
import com.rbs.sfi.admin.services.UserService;
import com.rbs.sfi.core.entities.Cs1;
import com.rbs.sfi.core.entities.SfiPpForm;
import com.rbs.sfi.core.repositories.Cs1Repository;
import com.rbs.sfi.core.repositories.SfiPpFormRepository;
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
    Cs1Repository cs1Repository;

    @RequestMapping(value = {"/form/cs1" }, method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public Cs1 formCs1(@RequestBody Cs1 cs1, BindingResult result ) {

        cs1Repository.save(cs1);

        return cs1;
    }
}