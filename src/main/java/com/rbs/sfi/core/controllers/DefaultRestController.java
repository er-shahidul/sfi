package com.rbs.sfi.core.controllers;

import com.rbs.sfi.admin.services.CompanyService;
import com.rbs.sfi.admin.services.UserService;
import com.rbs.sfi.core.entities.SfiPpForm;
import com.rbs.sfi.core.repositories.SfiPpFormRepository;
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
    CompanyService companyService;

    @Autowired
    SfiPpFormRepository sfiPpFormRepository;

    @RequestMapping(value = {"/form/cs1" }, method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public SfiPpForm formCs1(@RequestBody SfiPpForm sfiPpForm, BindingResult result ) {

        return sfiPpFormService.saveCS1(sfiPpForm);

    }
}