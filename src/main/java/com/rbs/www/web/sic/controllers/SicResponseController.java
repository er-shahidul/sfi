package com.rbs.www.web.sic.controllers;

import com.rbs.www.common.util.Util;
import com.rbs.www.web.sic.models.viewmodels.*;
import com.rbs.www.web.sic.services.SicFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class SicResponseController {

    @Autowired
    private SicFormService sicFormService;

    @RequestMapping(value = "/sicForm/cs1", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs1(@RequestBody SicCs1ViewModel model, BindingResult result) {
        sicFormService.setSicCs1Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/sicForm/cs2", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs2(@RequestBody SicCs2ViewModel model, BindingResult result) {
        sicFormService.setSicCs2Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/sicForm/cs3", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs3(@RequestBody SicCs3ViewModel model, BindingResult result) {
        sicFormService.setSicCs3Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/sicForm/cs4", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs4(@RequestBody SicCs4ViewModel model, BindingResult result) {
        sicFormService.setSicCs4Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/sicForm/cs5", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs5(@RequestBody SicCs5ViewModel model, BindingResult result) {
        sicFormService.setSicCs5Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/sicForm/cs6", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs6(@RequestBody SicCs6ViewModel model, BindingResult result) {
        sicFormService.setSicCs6Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/sicForm/cs7", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs7(@RequestBody SicCs7ViewModel model, BindingResult result) {
        sicFormService.setSicCs7Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/sicForm/cs8", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs8(@RequestBody SicCs8ViewModel model, BindingResult result) {
        sicFormService.setSicCs8Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/sicForm/cs9", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs9(@RequestBody SicCs9ViewModel model, BindingResult result) {
        sicFormService.setSicCs9Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/sicForm/cs10", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs10(@RequestBody SicCs10ViewModel model, BindingResult result) {
        sicFormService.setSicCs10Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }
}