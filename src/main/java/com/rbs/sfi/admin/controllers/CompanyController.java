package com.rbs.sfi.admin.controllers;

import com.rbs.sfi.admin.entities.AreaUnit;
import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.entities.Logo;
import com.rbs.sfi.admin.services.AreaUnitService;
import com.rbs.sfi.admin.services.CompanyService;
import com.rbs.sfi.admin.validator.FileValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Principal;
import java.util.List;
import java.util.UUID;

@Controller
public class CompanyController {
    @Autowired
    AreaUnitService areaUnitService;

    @Autowired
    CompanyService companyService;

    @Autowired
    FileValidator fileValidator;

    private static String getFileExtension(String fileName) {
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        return "";
    }

    @RequestMapping("/admin/company/list")
    public ModelAndView companyList(ModelMap model) {
        model.addAttribute("title", "company");
        List companies = companyService.list();
        return new ModelAndView("admin/company/list", "companies", companies);
    }

    @RequestMapping(value = {"/admin/company/edit/{id}"}, method = RequestMethod.GET)
    public String edit(@PathVariable Integer id, ModelMap model) {
        Company company = companyService.findById(id);
        model.addAttribute("title", "company_setting");
        model.addAttribute("company", company);

        List<AreaUnit> areaUnities = areaUnitService.list();
        model.addAttribute("areaUnities", areaUnities);

        model.addAttribute("edit", true);
        return "admin/company/edit";
    }

    @RequestMapping(value = {"/admin/company/edit/{id}"}, method = RequestMethod.POST)
    public String update(@Valid Logo logo, @ModelAttribute("company") Company company, BindingResult result, ModelMap model, @PathVariable Integer id, Principal principal) {
        model.addAttribute("id", id);
        String fullName = principal.getName();

        InputStream inputStream = null;
        OutputStream outputStream = null;

        MultipartFile file = logo.getFile();
        fileValidator.validate(logo, result);

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        String fileName = file.getOriginalFilename();
        String name = randomUUIDString + "." + getFileExtension(fileName);

        if (result.hasErrors()) {
            return "admin/company/edit";
        }

        byte[] fileN = new byte[0];
        try {
            fileN = file.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (file.isEmpty()) {
            fileN = null;
        }

        companyService.update(company, fileN, name);

        model.addAttribute("success", "Company " + "" + " updated successfully");
        return ("redirect:/admin/company/list");
    }

    @RequestMapping(value = "/admin/company/new", method = RequestMethod.GET)
    public String form(ModelMap model) {
        Company company = new Company();
        model.addAttribute("title", "company_setting");
        model.addAttribute("company", company);

        List<AreaUnit> areaUnities = areaUnitService.list();
        model.addAttribute("areaUnities", areaUnities);

        return "admin/company/new";
    }

    @RequestMapping(value = "/admin/company/new", method = RequestMethod.POST)
    public ModelAndView save(@Valid Logo logo, @ModelAttribute("company") Company company, BindingResult result, Errors errors) {
        MultipartFile file = logo.getFile();
        fileValidator.validate(logo, result);

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        String fileName = file.getOriginalFilename();
        String name = randomUUIDString + "." + getFileExtension(fileName);

        if (result.hasErrors()) {
            return new ModelAndView("admin/company/new");
        }

        try {
            companyService.save(company, file.getBytes(), name);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return new ModelAndView("redirect:/admin/company/list");
    }

    @RequestMapping(value = {"/admin/company/delete/{id}"}, method = RequestMethod.GET)
    public String softDelete(@PathVariable Integer id, ModelMap model) {
        model.addAttribute("title", "company_setting");
        Company company = companyService.findById(id);
        companyService.softDelete(company);

        return ("redirect:/admin/company/list");
    }
}