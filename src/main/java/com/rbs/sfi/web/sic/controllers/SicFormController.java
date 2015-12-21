package com.rbs.sfi.web.sic.controllers;

import com.rbs.sfi.admin.services.UserService;
//import com.rbs.sfi.web.sic.services.*;
import com.rbs.sfi.web.sic.models.entities.SicFormData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.rbs.sfi.admin.util.Util.getCurrentUsername;

@Controller
public class SicFormController {
    @Autowired
    UserService userService;

//    @Autowired
//    FormService formService;
//
//    @Autowired
//    SfiPpFormCs3ProjectStandardObjectiveService sfiPpFormCs3ProjectStandardObjectiveService;
//
//    private void populateFormContent(ModelMap model, SicFormData sicFormData) {
//        Integer id = sicFormData.getId();
////        String companyLogo = DatatypeConverter
////                .printBase64Binary(TypeConversionUtils.toPrimitiveType(sicFormData.getCompany().getLogo()));
//
//        model.addAttribute("form", sicFormData);
//        model.addAttribute("cs1", formService.getCs1ViewModel(id));
//        model.addAttribute("cs2", formService.getCs2ViewModel(id));
//        model.addAttribute("cs3", formService.getCs3ViewModel(id));
//        model.addAttribute("cs4", formService.getCs4ViewModel(id));
//        model.addAttribute("cs5", formService.getCs5ViewModel(id));
//        model.addAttribute("cs6", formService.getCs6ViewModel(id));
//        model.addAttribute("cs7", formService.getCs7ViewModel(id));
//        model.addAttribute("cs8", formService.getCs8ViewModel(id));
//        model.addAttribute("cs9", formService.getCs9ViewModel(id));
//        model.addAttribute("cs10", formService.getCs10ViewModel(id));
//
////        model.addAttribute("company", sicFormData.getCompany());
////        model.addAttribute("companyLogo", "data:image/jpeg;base64," + companyLogo);
//
//        model.addAttribute("mode", "edit");
//    }

    @RequestMapping(value = "/sicForm", method = RequestMethod.GET)
    public String form(ModelMap model) {
//        SicFormData sicFormData = sicFormDataService.createOrGetByCurrentUsersCompany();
//        populateFormContent(model, sicFormData);

        model.addAttribute("user", userService.findByUsername(getCurrentUsername()));
        return "/core/form/index";
    }
}