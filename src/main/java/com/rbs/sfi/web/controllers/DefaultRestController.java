package com.rbs.sfi.web.controllers;

import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.web.models.viewmodels.*;
import com.rbs.sfi.web.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @RequestMapping(value = "/form/cs1", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs1(@RequestBody Cs1ViewModel model, BindingResult result) {
        formService.setCs1Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/form/cs2", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs2(@RequestBody Cs2ViewModel model, BindingResult result) {
        formService.setCs2Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/form/cs3", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs3(@RequestBody Cs3ViewModel model, BindingResult result) {
        formService.setCs3Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/form/cs4", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs4(@RequestBody Cs4ViewModel model, BindingResult result) {
        formService.setCs4Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/form/cs5", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs5(@RequestBody Cs5ViewModel model, BindingResult result) {
        formService.setSfiPpFormCs5Entities(model.getItems());
        formService.setCs5Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/form/cs6", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs6(@RequestBody Cs6ViewModel model, BindingResult result) {
        formService.setCs6Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/form/cs7", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs7(@RequestBody Cs7ViewModel model, BindingResult result) {
        formService.setCs7Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/form/cs8", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs8(@RequestBody Cs8ViewModel model, BindingResult result) {
        formService.setCs8Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }
}