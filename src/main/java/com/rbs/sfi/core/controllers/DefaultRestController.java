package com.rbs.sfi.core.controllers;

import com.rbs.sfi.core.models.viewmodels.Cs1ViewModel;
import com.rbs.sfi.core.models.viewmodels.Cs2ViewModel;
import com.rbs.sfi.core.models.viewmodels.Cs3ViewModel;
import com.rbs.sfi.core.models.viewmodels.Cs4ViewModel;
import com.rbs.sfi.core.services.*;
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
    private FormService formService;

    @RequestMapping(value = {"/form/cs1" }, method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public void formCs1(@RequestBody Cs1ViewModel model, BindingResult result ) {
        formService.setCs1Entity(model);
    }

    @RequestMapping(value = {"/form/cs2" }, method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public void formCs2(@RequestBody Cs2ViewModel model, BindingResult result ) {
        formService.setCs2Entity(model);
    }

    @RequestMapping(value = {"/form/cs3" }, method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public void formCs3(@RequestBody Cs3ViewModel model, BindingResult result ) {
        formService.setCs3Entity(model);
    }

    @RequestMapping(value = {"/form/cs4" }, method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public void formCs4(@RequestBody Cs4ViewModel model, BindingResult result ) {
        formService.setCs4Entity(model);
    }
}