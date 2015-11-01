package com.rbs.sfi.admin.controllers;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.entities.Group;
import com.rbs.sfi.admin.entities.User;
import com.rbs.sfi.admin.services.CompanyService;
import com.rbs.sfi.admin.services.GroupService;
import com.rbs.sfi.admin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

import static com.rbs.sfi.admin.util.Util.getCurrentUsername;

@Controller
public class UserController {

    @Autowired
    GroupService groupService;

    @Autowired
    UserService userService;

    @Autowired
    CompanyService companyService;

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = {"/admin/dashboard" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {

        model.addAttribute("user", userService.findByUsername(getCurrentUsername()));

        return "/admin/user/dashboard";
    }

    @RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "accessDenied";
    }

    @RequestMapping("/admin/user/list")
    public ModelAndView list() {
        List user = userService.list();
        return new ModelAndView("admin/user/list","user",user);
    }

    @RequestMapping("/admin/user/delete")
    public ModelAndView delete(@RequestParam int id) {
        userService.delete(id);
        return new ModelAndView("redirect:/admin/user/list");
    }

    @RequestMapping(value = { "/admin/user/active/{id}" })
    public String active(@PathVariable int id, ModelMap model) {
        User user = userService.findByID(id);
        model.addAttribute("user", user);
        userService.userActive(user);

        return ("redirect:/admin/user/list");
    }

    @RequestMapping(value = { "/admin/user/details/{id}" })
    public ModelAndView details(@PathVariable int id, ModelMap model) {
        User user = userService.findByID(id);
        model.addAttribute("user", user);

        return new ModelAndView("admin/user/details","user", user);
    }

    @RequestMapping(value = { "/admin/user/profile/{username}" })
    public ModelAndView profile(@PathVariable String username, ModelMap model) {
        User user  = userService.findByUsername(username);
        model.addAttribute("user", user);

        return new ModelAndView("admin/user/profile","user", user);
    }

    @RequestMapping(value = { "/admin/user/inactive/{id}" })
    public String inactive(@PathVariable int id, ModelMap model) {
        User user = userService.findByID(id);
        model.addAttribute("user", user);
        userService.userActive(user);

        return ("redirect:/admin/user/list");
    }

    @RequestMapping(value = { "/admin/user/edit/password/{id}" }, method = RequestMethod.GET)
    public String editPassword(@PathVariable int id, ModelMap model) {
        User user = userService.findByID(id);
        model.addAttribute("user", user);
        model.addAttribute("edit", true);
        return "admin/user/editPass";
    }

    @RequestMapping(value = { "/admin/user/edit/password/{id}" }, method = RequestMethod.POST)
    public String updatePassword(@Valid User user, BindingResult result, ModelMap model, @PathVariable int id) {


        if (result.hasErrors()) {
            return "admin/user/editPass";
        }
        userService.updatePassword(user);

        return ("redirect:/admin/user/list");
    }

    @RequestMapping(value = { "/admin/user/edit/{id}" }, method = RequestMethod.GET)
    public String edit(@PathVariable int id, ModelMap model) {
        User user = userService.findByID(id);
        model.addAttribute("user", user);
        model.addAttribute("edit", true);

        List<Company> companies = companyService.list();
        model.addAttribute("companies", companies);

        return "admin/user/edit";
    }

    @RequestMapping(value = { "/admin/user/edit/{id}" }, method = RequestMethod.POST)
    public String update(@Valid User user, BindingResult result, ModelMap model, @PathVariable int id) {

        if (result.hasErrors()) {
            return "admin/user/edit";
        }
        userService.updateUser(user);

        model.addAttribute("success", "User " + "" + " updated successfully");
        return ("redirect:/admin/user/list");
    }

    @RequestMapping(value = "/admin/user/new", method = RequestMethod.GET)
    public String create(ModelMap model) {
        User user = new User();
        model.addAttribute("user", user);

        List<Company> companies = companyService.list();
        model.addAttribute("companies", companies);

        return "admin/user/new";
    }

    @RequestMapping(value = "/admin/user/new", method = RequestMethod.POST)
    public String save(@Valid User user, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            System.out.println("There are errors");
            return "admin/user/new";
        }

        if(!userService.isUserUsernameUnique(user.getId(), user.getUsername())){
            FieldError ssoError =new FieldError("user","username",messageSource.getMessage("non.unique.username", new String[]{user.getUsername()}, Locale.getDefault()));
            result.addError(ssoError);
            return "admin/user/new";
        }

        if(!userService.isUserEmailUnique(user.getId(), user.getEmail())){
            FieldError ssoError =new FieldError("user","email",messageSource.getMessage("non.unique.email", new String[]{user.getEmail()}, Locale.getDefault()));
            result.addError(ssoError);
            return "admin/user/new";
        }

        userService.save(user);

        model.addAttribute("success", "User " + "" + " has been registered successfully");
        return ("redirect:/admin/user/list");
    }

    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }

    @ModelAttribute("roles")
    public List<Group> initializeProfiles() {
        return groupService.findAll();
    }

}