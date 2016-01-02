package com.rbs.www.web.sfi.controllers;

import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.web.common.services.SfiPpFormAllCountryService;
import com.rbs.www.web.common.services.SfiPpFormRegionService;
import com.rbs.www.web.sfi.models.entities.SfiPpFormData;
import com.rbs.www.web.sfi.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.bind.DatatypeConverter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static com.rbs.www.common.util.Util.getCurrentUsername;

@Controller
public class PpFormController {
    @Autowired
    UserService userService;

    @Autowired
    SfiPpFormDataService sfiPpFormDataService;

    @Autowired
    SfiPpFormAllCountryService sfiPpFormAllCountryService;

    @Autowired
    SfiPpFormRegionService sfiPpFormRegionService;

    @Autowired
    FormService formService;

    @Autowired
    SfiPpFormCs3ProjectStandardObjectiveService sfiPpFormCs3ProjectStandardObjectiveService;

    @Autowired
    private MessageSource messageSource;

    private void populateFormContent(ModelMap model, SfiPpFormData sfiPpFormData) {
        Integer id = sfiPpFormData.getId();
        String companyLogo = DatatypeConverter
                .printBase64Binary(TypeConversionUtils.toPrimitiveType(sfiPpFormData.getCompany().getLogo()));

        model.addAttribute("form", sfiPpFormData);
        model.addAttribute("cs1", formService.getCs1ViewModel(id));
        model.addAttribute("cs2", formService.getCs2ViewModel(id));
        model.addAttribute("cs3", formService.getCs3ViewModel(id));
        model.addAttribute("cs4", formService.getCs4ViewModel(id));
        model.addAttribute("cs5", formService.getCs5ViewModel(id));
        model.addAttribute("cs6", formService.getCs6ViewModel(id));
        model.addAttribute("cs7", formService.getCs7ViewModel(id));
        model.addAttribute("cs8", formService.getCs8ViewModel(id));
        model.addAttribute("cs9", formService.getCs9ViewModel(id));
        model.addAttribute("cs10", formService.getCs10ViewModel(id));

        model.addAttribute("company", sfiPpFormData.getCompany());
        model.addAttribute("companyLogo", "data:image/jpeg;base64," + companyLogo);
        model.addAttribute("countries", sfiPpFormAllCountryService.getAll());
        model.addAttribute("regions", sfiPpFormRegionService.getAll());
        model.addAttribute("standardObjects", sfiPpFormCs3ProjectStandardObjectiveService.getAll());

        model.addAttribute("mode", "edit");
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String home(ModelMap model, SecurityContextHolderAwareRequestWrapper request) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth instanceof AnonymousAuthenticationToken)
            return "redirect:/login";

        if (request.isUserInRole("ADMIN")) return "redirect:/admin/form";
        if (request.isUserInRole("USER")) return "redirect:/sfiPpForm";

        return "redirect:/dashboard";
    }

    @RequestMapping(value = "/sfiPpForm", method = RequestMethod.GET)
    public String form(ModelMap model) throws ParseException {
        SfiPpFormData sfiPpFormData = sfiPpFormDataService.createOrGetByCurrentUsersCompany();
        populateFormContent(model, sfiPpFormData);

        model.addAttribute("days_until", getDiffDays());
        model.addAttribute("createdAt", sfiPpFormData.getCreatedAt());
        model.addAttribute("createdBy", sfiPpFormData.getCreatedBy());
        model.addAttribute("updateAt", sfiPpFormData.getUpdatedAt());
        model.addAttribute("updateBy", sfiPpFormData.getUpdatedBy());
        model.addAttribute("status", sfiPpFormData.getStatus());

        model.addAttribute("user", userService.findByUsername(getCurrentUsername()));
        return "/core/form/index";
    }

    private long getDiffDays() throws ParseException {
        String dateStart = messageSource.getMessage("startDate", new String[]{}, Locale.getDefault());
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date dateE = new Date();
        String dateStop = format.format(dateE);

        Date d1 = format.parse(dateStop);
        Date d2 = format.parse(dateStart);
        long diff = d2.getTime() - d1.getTime();
        return diff / (24 * 60 * 60 * 1000);
    }

    @RequestMapping(value = "/admin/company/sfi/form/{id}", method = RequestMethod.GET)
    public String editPassword(@PathVariable Integer id, ModelMap model) {
        SfiPpFormData sfiPpFormData = sfiPpFormDataService.get(id);
        populateFormContent(model, sfiPpFormData);

        return "/core/form/index";
    }

    @RequestMapping(value = "/admin/form", method = RequestMethod.GET)
    public String adminForm(ModelMap model) {
        model.addAttribute("title", "form");
        model.addAttribute("sfiPpForms", sfiPpFormDataService.getAll());

        return "/core/form/admin_form";
    }

    @RequestMapping(value = "/admin/form/sfi", method = RequestMethod.GET)
    public String adminSfiForm(ModelMap model) {
        model.addAttribute("title", "sfi");
        model.addAttribute("sfiPpForms", sfiPpFormDataService.getAll());

        return "/core/form/admin_form_sfi";
    }

    @RequestMapping(value = "/admin/form/sic", method = RequestMethod.GET)
    public String adminSicForm(ModelMap model) {
        model.addAttribute("title", "sic");
        model.addAttribute("sfiPpForms", sfiPpFormDataService.getAll());

        return "/core/form/admin_form_sic";
    }
}