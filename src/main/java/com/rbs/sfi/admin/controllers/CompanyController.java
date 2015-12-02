package com.rbs.sfi.admin.controllers;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.entities.Logo;
import com.rbs.sfi.admin.entities.User;
import com.rbs.sfi.admin.listeners.AuditListener;
import com.rbs.sfi.admin.services.CompanyService;
import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.admin.validator.FileValidator;
import com.rbs.sfi.admin.entities.AreaUnit;
import com.rbs.sfi.admin.repositories.AreaUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.context.SecurityContextHolder;
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
import java.io.*;
import java.security.Principal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class CompanyController
{
    @Autowired
    AreaUnitRepository areaUnitRepository;

    @Autowired
    CompanyService companyService;

    @Autowired
    FileValidator fileValidator;

    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/admin/company/list")
    public ModelAndView companyList(ModelMap model) {
        model.addAttribute("title", "company");
        List companies = companyService.list();
        return new ModelAndView("admin/company/list", "companies", companies);
    }

    @RequestMapping(value = { "/admin/company/edit/{id}" }, method = RequestMethod.GET)
    public String edit(@PathVariable int id, ModelMap model) {
        Company company = companyService.findById(id);
        model.addAttribute("title", "company_setting");
        model.addAttribute("company", company);

        List<AreaUnit> areaUnities = areaUnitRepository.list();
        model.addAttribute("areaUnities", areaUnities);

        model.addAttribute("edit", true);
        return "admin/company/edit";
    }

    @RequestMapping(value = { "/admin/company/edit/{id}" }, method = RequestMethod.POST)
    public String update(@Valid Logo logo, @ModelAttribute("company") Company company, BindingResult result, ModelMap model, @PathVariable int id, Principal principal) {
        model.addAttribute("id", id);
        String fullName = principal.getName();

        InputStream inputStream = null;
        OutputStream outputStream = null;

        MultipartFile file = logo.getFile();
        fileValidator.validate(logo, result);

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        String fileName = file.getOriginalFilename();
        String name = randomUUIDString+"."+getFileExtension(fileName);

        if (result.hasErrors()) {
            return "admin/company/edit";
        }

        try {
            inputStream = file.getInputStream();

            File newFile = new File("src/main/webapp/uploads/user/" + name);
            if (!newFile.exists()) {
                newFile.createNewFile();

//                company.setLogoName(name);
//                company.setLogo(file.getBytes());
                byte[] fileN = file.getBytes();

                companyService.update(company, fileN, name);
            }

            outputStream = new FileOutputStream(newFile);
            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        model.addAttribute("success", "Company " + "" + " updated successfully");
        return ("redirect:/admin/company/list");
    }

    @RequestMapping(value = "/admin/company/new", method = RequestMethod.GET)
    public String form(ModelMap model) {
        Company company = new Company();
        model.addAttribute("title", "company_setting");
        model.addAttribute("company", company);

        List<AreaUnit> areaUnities = areaUnitRepository.list();
        model.addAttribute("areaUnities", areaUnities);

        return "admin/company/new";
    }

    @RequestMapping(value = "/admin/company/new", method = RequestMethod.POST)
    public ModelAndView save(@Valid Logo logo, @ModelAttribute("company") Company company, BindingResult result, Errors errors) {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        MultipartFile file = logo.getFile();
        fileValidator.validate(logo, result);

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        String fileName = file.getOriginalFilename();
        String name = randomUUIDString+"."+getFileExtension(fileName);

        if (result.hasErrors()) {
            return new ModelAndView("admin/company/new");
        }

        try {
            inputStream = file.getInputStream();

            File newFile = new File("src/main/webapp/uploads/user/" + name);
            if (!newFile.exists()) {
                newFile.createNewFile();

                AuditListener auditListener = new AuditListener();
                company.setLogoName(name);
                company.setLogo(file.getBytes());
                company.setIsActive(true);
                auditListener.prePersist(company);

                companyService.save(company);
            }

            outputStream = new FileOutputStream(newFile);
            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return new ModelAndView("redirect:/admin/company/list");
    }

    @RequestMapping(value = { "/admin/company/delete/{id}" }, method = RequestMethod.GET)
    public String softDelete(@PathVariable int id, ModelMap model) {
        model.addAttribute("title", "company_setting");
        Company company = companyService.findById(id);
        companyService.softDelete(company);

        return ("redirect:/admin/company/list");
    }

    private static String getFileExtension(String fileName) {
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }

}