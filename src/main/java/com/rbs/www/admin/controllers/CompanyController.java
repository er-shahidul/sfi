package com.rbs.www.admin.controllers;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.admin.models.datamodels.Logo;
import com.rbs.www.admin.models.entities.User;
import com.rbs.www.admin.models.viewmodels.AreaUnitViewModel;
import com.rbs.www.admin.models.viewmodels.CompanyViewModel;
import com.rbs.www.admin.services.AreaUnitService;
import com.rbs.www.admin.services.CompanyService;
//import com.rbs.www.common.validator.FileValidator;
import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.services.TypeConversionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Principal;
import java.util.List;
import java.util.UUID;

import static com.rbs.www.common.util.Util.getCurrentUsername;

@Controller
public class CompanyController {
    @Autowired
    AreaUnitService areaUnitService;

    @Autowired
    CompanyService companyService;

    @Autowired
    UserService userService;

//    @Autowired
//    FileValidator fileValidator;

    private static String getFileExtension(String fileName) {
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        return "";
    }

    @RequestMapping("/admin/company/list")
    public ModelAndView companyList(ModelMap model) {
        model.addAttribute("title", "company");
        List<CompanyViewModel> companies = companyService.list();
        return new ModelAndView("admin/company/list", "companies", companies);
    }

    @RequestMapping(value = {"/admin/company/edit/{id}"}, method = RequestMethod.GET)
    public String edit(@PathVariable Integer id, ModelMap model) {
        CompanyViewModel company = companyService.getViewModelById(id);
        model.addAttribute("title", "company");
        model.addAttribute("company", company);

        List<AreaUnitViewModel> areaUnities = areaUnitService.list();
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
//        fileValidator.validate(logo, result);

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        String fileName = file.getOriginalFilename();
        String name = randomUUIDString + "." + getFileExtension(fileName);

        if (result.hasErrors()) {
            return "redirect:/admin/company/edit" + company.getId();
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

    @RequestMapping(value = {"/frontend/user/company/logo/edit/{id}"}, method = RequestMethod.POST)
    public String logoUpdate(@Valid Logo logo, @ModelAttribute("company") Company company, BindingResult result, ModelMap model, @PathVariable Integer id, Principal principal) {
        model.addAttribute("id", id);
        String fullName = principal.getName();

        InputStream inputStream = null;
        OutputStream outputStream = null;

        MultipartFile file = logo.getFile();

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        String fileName = file.getOriginalFilename();
        String name = randomUUIDString + "." + getFileExtension(fileName);

        if (result.hasErrors()) {
            return ("redirect:/user/company/setting");
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

        companyService.logoUpdate(company, fileN, name);

        model.addAttribute("success", "Company " + "" + " updated successfully");
        return ("redirect:/user/company/setting");
    }

    @RequestMapping(value = {"/user/company/setting"}, method = RequestMethod.GET)
    public ModelAndView profile(ModelMap model, SecurityContextHolderAwareRequestWrapper request) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth instanceof AnonymousAuthenticationToken) return new ModelAndView("redirect:/login");

        User user = userService.findByUsername(getCurrentUsername());
        CompanyViewModel company = companyService.getViewModelById(user.getCompany().getId());

        if(user.getCompany().getLogo() != null){
            String companyLogo = DatatypeConverter
                    .printBase64Binary(TypeConversionUtils.toPrimitiveType(user.getCompany().getLogo()));
            model.addAttribute("companyLogo", "data:image/jpeg;base64," + companyLogo);
        }else {
            String companyLogo = null;
            model.addAttribute("companyLogo", companyLogo);
        }

        List<AreaUnitViewModel> areaUnities = areaUnitService.list();
        model.addAttribute("areaUnities", areaUnities);
        model.addAttribute("title", "company_setting");
        model.addAttribute("company", company);
        model.addAttribute("edit", true);

        return new ModelAndView("admin/frontend/company_edit");
    }

    @RequestMapping(value = {"/frontend/user/company/unit/edit/{id}"}, method = RequestMethod.POST)
    public String unitUpdate(@Valid Company company, BindingResult result, ModelMap model, @PathVariable Integer id) {

        if (result.hasErrors()) {
            return ("redirect:/user/company/setting");
        }

        companyService.unitUpdate(company);

        model.addAttribute("success", "Company " + "" + " updated successfully");
        return ("redirect:/user/company/setting");
    }

    @RequestMapping(value = "/admin/company/new", method = RequestMethod.GET)
    public String form(ModelMap model) {
        CompanyViewModel company = new CompanyViewModel();
        model.addAttribute("title", "company");
        model.addAttribute("company", company);

        List<AreaUnitViewModel> areaUnities = areaUnitService.list();
        model.addAttribute("areaUnities", areaUnities);

        return "admin/company/new";
    }

    @RequestMapping(value = "/admin/company/new", method = RequestMethod.POST)
    public ModelAndView save(@Valid Logo logo, @ModelAttribute("company") Company company, BindingResult result, Errors errors, @RequestParam String action) {
        MultipartFile file = logo.getFile();
//        fileValidator.validate(logo, result);

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        String fileName = file.getOriginalFilename();
        String name = randomUUIDString + "." + getFileExtension(fileName);

        if (result.hasErrors()) {
            return new ModelAndView("redirect:/admin/company/new");
        }

        try {
            companyService.save(company, file.getBytes(), name);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(action.equals("btn_create_and_edit")) return new ModelAndView("redirect:/admin/company/edit/" + company.getId());
        else if(action.equals("btn_create_and_create")) return new ModelAndView("redirect:/admin/company/new");
        else return new ModelAndView("redirect:/admin/company/list");
    }

    @RequestMapping(value = {"/admin/company/delete/{id}"}, method = RequestMethod.GET)
    public String softDelete(@PathVariable Integer id, ModelMap model) {
        model.addAttribute("title", "company_setting");
        CompanyViewModel company = companyService.getViewModelById(id);
        companyService.deleteCompanyEntity(company);

        return ("redirect:/admin/company/list");
    }
}