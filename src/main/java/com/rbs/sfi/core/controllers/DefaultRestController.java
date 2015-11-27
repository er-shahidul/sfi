package com.rbs.sfi.core.controllers;

import com.rbs.sfi.core.models.viewmodels.Cs1ViewModel;
import com.rbs.sfi.core.models.viewmodels.Cs2ViewModel;
import com.rbs.sfi.core.services.Cs1Service;
import com.rbs.sfi.core.services.Cs2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class DefaultRestController {

    @Autowired
    Cs1Service cs1Service;

    @Autowired
    Cs2Service cs2Service;

    @RequestMapping(value = {"/form/cs1" }, method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public void formCs1(@RequestBody Cs1ViewModel model, BindingResult result ) {
        cs1Service.setEntity(model);
    }

    @RequestMapping(value = {"/form/cs2" }, method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public void formCs2(@RequestBody Cs2ViewModel model, BindingResult result ) {
        cs2Service.setEntity(model);
    }
}