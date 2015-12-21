package com.rbs.sfi.web.sic.controllers;

import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.web.sic.models.viewmodels.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class SicResponseController {

//    @Autowired
//    private SicFormService sicFormService;
//
//    @RequestMapping(value = "/form/sic/cs1", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
//    public ResponseEntity<String> formCs1(@RequestBody Cs1ViewModel model, BindingResult result) {
//        sicFormService.setCs1Entity(model);
//        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/form/sic/cs2", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
//    public ResponseEntity<String> formCs2(@RequestBody Cs2ViewModel model, BindingResult result) {
//        sicFormService.setCs2Entity(model);
//        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/form/sic/cs3", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
//    public ResponseEntity<String> formCs3(@RequestBody Cs3ViewModel model, BindingResult result) {
//        sicFormService.setCs3Entity(model);
//        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/form/sic/cs4", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
//    public ResponseEntity<String> formCs4(@RequestBody Cs4ViewModel model, BindingResult result) {
//        sicFormService.setCs4Entity(model);
//        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
//    }
}