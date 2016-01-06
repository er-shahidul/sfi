package com.rbs.www.web.sfi.controllers;

import com.rbs.www.common.util.Util;
import com.rbs.www.common.services.FIleIOHelperService;
import com.rbs.www.web.sfi.models.entities.SfiPpFormData;
import com.rbs.www.web.sfi.models.viewmodels.*;
import com.rbs.www.web.sfi.services.FormService;
import com.rbs.www.web.sfi.services.SfiPpFormDataService;
//import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class PpResponseController {

    @Autowired
    private FormService formService;

    @Autowired
    private FIleIOHelperService fIleIOHelperService;

    @Autowired
    SfiPpFormDataService sfiPpFormDataService;

    private String submitted = "submitted";

    @RequestMapping(value = "/form/submit/{id}", method = RequestMethod.GET)
    public ResponseEntity<String> formSubmit( @PathVariable Integer id, ModelMap model) throws ParseException {
        SfiPpFormData sfiPpFormData = sfiPpFormDataService.getPpForm(id);

        model.addAttribute("form", sfiPpFormData);
        model.addAttribute("cs1", formService.getCs1ViewModel(sfiPpFormData.getId()));
        model.addAttribute("cs2", formService.getCs2ViewModel(sfiPpFormData.getId()));
        model.addAttribute("cs3", formService.getCs3ViewModel(sfiPpFormData.getId()));
        model.addAttribute("cs4", formService.getCs4ViewModel(sfiPpFormData.getId()));
        model.addAttribute("cs5", formService.getCs5ViewModel(sfiPpFormData.getId()));
        model.addAttribute("cs6", formService.getCs6ViewModel(sfiPpFormData.getId()));
        model.addAttribute("cs7", formService.getCs7ViewModel(sfiPpFormData.getId()));
        model.addAttribute("cs8", formService.getCs8ViewModel(sfiPpFormData.getId()));
        model.addAttribute("cs9", formService.getCs9ViewModel(sfiPpFormData.getId()));
        model.addAttribute("cs10", formService.getCs10ViewModel(sfiPpFormData.getId()));

        sfiPpFormDataService.setAuditInfo(sfiPpFormData.getId(), submitted);

        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

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

    @RequestMapping(value = "/form/cs9", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs9(@RequestBody Cs9ViewModel model, BindingResult result) {
        formService.setCs9Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/form/cs10", method = RequestMethod.PUT, consumes = {APPLICATION_JSON_VALUE})
    public ResponseEntity<String> formCs10(@RequestBody Cs10ViewModel model, BindingResult result) {
        formService.setCs10Entity(model);
        return new ResponseEntity<String>(Util.getAsString(model), HttpStatus.OK);
    }

    @RequestMapping(value = "/files/upload", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<String> fileUpload(@RequestParam("file") MultipartFile file,
                                                           HttpServletRequest request, HttpServletResponse response) {
        FileNames fileNames = fIleIOHelperService.saveFile(file, request.getSession().getServletContext().getRealPath("."));
        HttpStatus responseStatus = fileNames == null ? HttpStatus.BAD_REQUEST : HttpStatus.OK;

        return new ResponseEntity<String>(Util.getAsString(fileNames), responseStatus);
    }
}