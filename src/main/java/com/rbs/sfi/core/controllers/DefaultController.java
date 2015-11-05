package com.rbs.sfi.core.controllers;

import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.core.services.SfiPpFormAllCountryService;
import com.rbs.sfi.core.services.SfiPpFormRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class DefaultController {

    @Autowired
    SfiPpFormAllCountryService sfiPpFormAllCountryService;

    @Autowired
    SfiPpFormRegionService sfiPpFormRegionService;

    @RequestMapping(value = {"/country/list" }, method = RequestMethod.GET)
    public ResponseEntity countryList() {

        List country = sfiPpFormAllCountryService.list();

        return new ResponseEntity(Util.getAsString(country), HttpStatus.OK);
    }

    @RequestMapping(value = {"/region/list" }, method = RequestMethod.GET)
    public ResponseEntity regionList() {

        List region = sfiPpFormRegionService.list();

    return new ResponseEntity(Util.getAsString(region), HttpStatus.OK);
    }

}