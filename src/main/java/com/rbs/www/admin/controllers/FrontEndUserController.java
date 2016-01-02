package com.rbs.www.admin.controllers;

import com.rbs.www.admin.models.entities.Group;
import com.rbs.www.admin.models.entities.User;
import com.rbs.www.admin.models.viewmodels.CompanyViewModel;
import com.rbs.www.admin.models.viewmodels.UserViewModel;
import com.rbs.www.admin.services.CompanyService;
import com.rbs.www.admin.services.GroupService;
import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.listeners.AuditListener;
import com.rbs.www.common.util.MailHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import static com.rbs.www.common.util.Util.getCurrentUsername;

@Controller
public class FrontEndUserController {

    @Autowired
    GroupService groupService;

    @Autowired
    UserService userService;

    @Autowired
    CompanyService companyService;

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value = {"/user/profile"})
    public ModelAndView profile(ModelMap model, SecurityContextHolderAwareRequestWrapper request) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth instanceof AnonymousAuthenticationToken) return new ModelAndView("redirect:/login");
        if (request.isUserInRole("ADMIN")) return new ModelAndView("redirect:/admin/user/profile");

        User user = userService.findByUsername(getCurrentUsername());
        model.addAttribute("user", user);
        model.addAttribute("title", "profile");

        return new ModelAndView("admin/frontend/profile", "user", user);
    }

    @RequestMapping(value = {"/frontend/user/name/edit/{id}"}, method = RequestMethod.POST)
    public String updateName(@Valid User user, BindingResult result, ModelMap model, @PathVariable Integer id) {

        if (result.hasErrors()) {
            return "redirect:/user/profile";
        }
        userService.updateName(user);

        model.addAttribute("success", "User " + "" + " updated successfully");

        return ("redirect:/user/profile");
    }

    @RequestMapping(value = {"/frontend/user/password/edit/{id}"}, method = RequestMethod.POST)
    public String updateMyPassword(@Valid User user, BindingResult result, ModelMap model, @PathVariable Integer id,
                                   @RequestParam("old_password") String old_password) {

        User currentUser = userService.findByUsername(getCurrentUsername());

        if (!passwordEncoder.matches(old_password, currentUser.getPassword())) {
            model.addAttribute("error: Your password not match");
            return "redirect:/user/profile";
        }

        boolean isInvalidPassword = !userService.isValidPassword(user.getPassword());
        if (result.hasErrors() || isInvalidPassword) {
            model.addAttribute("errorPassword", isInvalidPassword ? messageSource.getMessage("NotEmpty.password", new String[]{user.getPassword()}, Locale.getDefault()) : "");
            return "redirect:/user/profile";
        }
        userService.updatePassword(user);

        model.addAttribute("success", "User " + "" + " updated successfully");
        return ("redirect:/user/profile");
    }

}