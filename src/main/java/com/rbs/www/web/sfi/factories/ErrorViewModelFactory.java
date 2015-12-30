package com.rbs.www.web.sfi.factories;

import com.rbs.www.web.sfi.models.viewmodels.ErrorViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class ErrorViewModelFactory {

    @Autowired
    private HashMap<String, String> cs1Errors;

    @Autowired
    private HashMap<String, String> cs2Errors;

    @Autowired
    private HashMap<String, String> cs3Errors;

    @Autowired
    private HashMap<String, String> cs4Errors;

    @Autowired
    private HashMap<String, String> cs5Errors;

    @Autowired
    private HashMap<String, String> cs6Errors;

    @Autowired
    private HashMap<String, String> cs7Errors;

    @Autowired
    private HashMap<String, String> cs8Errors;

    @Autowired
    private HashMap<String, String> cs9Errors;

    @Autowired
    private HashMap<String, String> cs10Errors;

    public ErrorViewModel getErrorViewModel() {
        ErrorViewModel model = new ErrorViewModel();

        model.setCs1Errors(cs1Errors);
        model.setCs2Errors(cs2Errors);
        model.setCs3Errors(cs3Errors);
        model.setCs4Errors(cs4Errors);
        model.setCs5Errors(cs5Errors);
        model.setCs6Errors(cs6Errors);
        model.setCs7Errors(cs7Errors);
        model.setCs8Errors(cs8Errors);
        model.setCs9Errors(cs9Errors);
        model.setCs10Errors(cs10Errors);

        return model;
    }
}
