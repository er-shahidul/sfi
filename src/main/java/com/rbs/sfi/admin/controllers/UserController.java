package com.rbs.sfi.admin.controllers;

import com.rbs.sfi.admin.entities.*;
import com.rbs.sfi.admin.listeners.AuditListener;
import com.rbs.sfi.admin.services.*;
import com.rbs.sfi.admin.util.MailHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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

    @Autowired
    private VerificationTokenService verificationTokenService;

    @Autowired
    private PasswordResetTokenService passwordResetTokenService;

    @RequestMapping(value = {"/admin/dashboard" }, method = RequestMethod.GET)
    public String homePage(ModelMap model) {

        model.addAttribute("user", userService.findByUsername(getCurrentUsername()));

        return "admin";
    }

    @RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        return "accessDenied";
    }

    public void sendEmail(String recipient, String subject, String message) {
//        String sender = "shanto.646596@gmail.com";
        ApplicationContext context = new ClassPathXmlApplicationContext("email-context.xml");
        MailHelper mailHelper = (MailHelper) context.getBean("mailMail");
        mailHelper.sendMail(recipient, subject, message);
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

        List<Group> groups = groupService.list();
        model.addAttribute("groups", groups);

        return "admin/user/new";
    }

    @RequestMapping(value = "/user/verification/{token}", method = RequestMethod.GET)
    public String verificationToken(@PathVariable String token) {
        int userId = verificationTokenService.findUserIdByToken(token);
        User user = userService.findByID(userId);

        return userCheck(user);
    }

    @RequestMapping(value = "/user/password/{token}", method = RequestMethod.GET)
    public String passwordToken(@PathVariable String token) {
        int userId = passwordResetTokenService.findUserIdByToken(token);
        User user = userService.findByID(userId);

        if(user == null){
            return "accessDenied";
        }else {
            return ("redirect:/user/password/reset/" + user.getId());
        }
    }

    @RequestMapping(value = "/user/forgot/password")
    public String forgotPassword() {

        return "forgot_password";
    }

    @RequestMapping(value = "/user/forgot/password", method = RequestMethod.POST)
    public String forgotPassword(@RequestParam("email") String email, HttpServletRequest request) {
        User user = userService.findByUsername(email);
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        if(user.isPasswordToken() == false){
            PasswordResetToken passwordResetToken = new PasswordResetToken();

            passwordResetToken.setToken(randomUUIDString);
            passwordResetToken.setUser(user);

            passwordResetTokenService.save(passwordResetToken);
            userService.passwordTokenUpdate(user);
        } else {
            PasswordResetToken passwordResetToken = passwordResetTokenService.findPasswordResetToken(user);

            passwordResetToken.setToken(randomUUIDString);
            passwordResetTokenService.passwordResetTokenUpdate(passwordResetToken);
        }

        String subject = "Password Reset";
        String message = request.getLocalName() + "/user/password/" + randomUUIDString;
        sendEmail(email, subject, message);

        return "login";
    }

    private String userCheck(User user) {
        if(user == null){
            return "accessDenied";
        }else if(user.isToken() == true ){
            return "index";
        }else {
            return ("redirect:/user/password/set/" + user.getId());
        }
    }


    @RequestMapping(value = "/user/password/reset/{id}",method = RequestMethod.GET)
    public String passwordReset(@PathVariable int id, ModelMap model) {
        User user = userService.findByID(id);
        model.addAttribute("user", user);

        return "password";
    }

    @RequestMapping(value = { "/user/password/reset/{id}" }, method = RequestMethod.POST)
    public String passwordReset(@Valid User user, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "password";
        }
        userService.updatePassword(user);

        return ("redirect:/login");
    }

    @RequestMapping(value = "/user/password/set/{id}",method = RequestMethod.GET)
    public String passwordSet(@PathVariable int id, ModelMap model) {
        User user = userService.findByID(id);
        model.addAttribute("user", user);

        return "password";
    }

    @RequestMapping(value = { "/user/password/set/{id}" }, method = RequestMethod.POST)
    public String passwordSet(@Valid User user, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "password";
        }
        userService.updatePassword(user);
        userService.verificationToken(user);

        return ("redirect:/login");
    }

    @RequestMapping(value = "/admin/user/new", method = RequestMethod.POST)
    public String save(@Valid User user, BindingResult result, ModelMap model, HttpServletRequest request) {

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        VerificationToken verificationToken = new VerificationToken();

        verificationToken.setToken(randomUUIDString);
        verificationToken.setUser(user);

        user.setPassword(randomUUIDString);
        user.setUsername(user.getEmail());

        AuditListener auditListener = new AuditListener();  // audit log
        auditListener.prePersist(user);                     // audit log

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
        verificationTokenService.save(verificationToken);

        String recipient = user.getEmail();
        String subject = "Email Verification";
        String message = request.getLocalName() + "/user/verification/" + randomUUIDString;
        sendEmail(recipient, subject, message);

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