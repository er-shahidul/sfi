package com.rbs.www.web.sic.controllers;

import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.web.sic.services.*;
import com.rbs.www.web.sic.models.entities.SicFormData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.bind.DatatypeConverter;

import static com.rbs.www.common.util.Util.getCurrentUsername;

@Controller
public class SicFormController {
    @Autowired
    UserService userService;

    @Autowired
    SicFormService formService;

    @Autowired
    SicFormDataService sicFormDataService;

    private void populateFormContent(ModelMap model, SicFormData sicFormData) {
        Integer id = sicFormData.getId();
        String companyLogo = DatatypeConverter
                .printBase64Binary(TypeConversionUtils.toPrimitiveType(sicFormData.getCompany().getLogo()));

        model.addAttribute("form", sicFormData);
        model.addAttribute("cs1", formService.getSicCs1ViewModel(id));
        model.addAttribute("cs2", formService.getSicCs2ViewModel(id));
        model.addAttribute("cs3", formService.getSicCs3ViewModel(id));
        model.addAttribute("cs4", formService.getSicCs4ViewModel(id));

        model.addAttribute("company", sicFormData.getCompany());
        model.addAttribute("companyLogo", "data:image/jpeg;base64," + companyLogo);

        model.addAttribute("mode", "edit");
    }

    @RequestMapping(value = "/sicForm", method = RequestMethod.GET)
    public String form(ModelMap model) {
        SicFormData sicFormData = sicFormDataService.createOrGetByCurrentUsersCompany();
        populateFormContent(model, sicFormData);

        model.addAttribute("user", userService.findByUsername(getCurrentUsername()));
        return "/core/form/index";
    }
}