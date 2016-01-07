package com.rbs.www.web.sic.controllers;

import com.rbs.www.common.util.Util;
import com.rbs.www.web.sic.models.entities.SicFormData;
import com.rbs.www.web.sic.models.viewmodels.*;
import com.rbs.www.web.sic.services.SicFormDataService;
import com.rbs.www.web.sic.services.SicFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class SicResponseController {

    @Autowired
    private SicFormService sicFormService;

    @Autowired
    SicFormDataService sicFormDataService;

    private String submitted = "submitted";

    @RequestMapping(value = "/sic/form/submit/{id}", method = RequestMethod.GET)
    public ResponseEntity<String> formSubmit( @PathVariable Integer id, ModelMap model) throws ParseException {
        SicFormData sicFormData = sicFormDataService.getSicForm(id);

        model.addAttribute("form", sicFormData);
        model.addAttribute("cs1", sicFormService.getSicCs1ViewModel(sicFormData.getId()));
        model.addAttribute("cs2", sicFormService.getSicCs2ViewModel(sicFormData.getId()));
        model.addAttribute("cs3", sicFormService.getSicCs3ViewModel(sicFormData.getId()));
        model.addAttribute("cs4", sicFormService.getSicCs4ViewModel(sicFormData.getId()));
        model.addAttribute("cs5", sicFormService.getSicCs5ViewModel(sicFormData.getId()));
        model.addAttribute("cs6", sicFormService.getSicCs6ViewModel(sicFormData.getId()));
        model.addAttribute("cs7", sicFormService.getSicCs7ViewModel(sicFormData.getId()));
        model.addAttribute("cs8", sicFormService.getSicCs8ViewModel(sicFormData.getId()));
        model.addAttribute("cs9", sicFormService.getSicCs9ViewModel(sicFormData.getId()));
        model.addAttribute("cs10", sicFormService.getSicCs10ViewModel(sicFormData.getId()));

        sicFormDataService.setAuditInfo(sicFormData.getId(), submitted);

        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

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