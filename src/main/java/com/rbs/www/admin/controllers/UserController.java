package com.rbs.www.admin.controllers;

import com.rbs.www.admin.models.entities.Group;
import com.rbs.www.admin.models.entities.User;
import com.rbs.www.admin.models.viewmodels.CompanyViewModel;
import com.rbs.www.admin.models.viewmodels.UserViewModel;
import com.rbs.www.common.listeners.AuditListener;
import com.rbs.www.admin.services.CompanyService;
import com.rbs.www.admin.services.GroupService;
import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.util.MailHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import static com.rbs.www.common.util.Util.getCurrentUsername;

@Controller
public class UserController {

    @Value("#{messages[domain]}")
    private String domain;

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

    @RequestMapping(value = {"/admin/dashboard"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        model.addAttribute("title", "home");
        model.addAttribute("user", userService.findByUsername(getCurrentUsername()));
        return "admin/user/dashboard";
    }

    @RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        model.addAttribute("user", getPrincipal());
        model.addAttribute("title", "user");

        return "common/access_denied";
    }

    private void sendEmail(String recipient, String subject, String message, User user, String mailType, String path) {
        ApplicationContext context = new ClassPathXmlApplicationContext("email-context.xml");
        MailHelper mailHelper = (MailHelper) context.getBean("mailMail");

        String domain = this.domain;
        mailHelper.sendMail(recipient, subject, message, user, mailType, path);
    }

    private String getHost(HttpServletRequest request) throws MalformedURLException {
        URL url = new URL(request.getRequestURL().toString());
        return url.getHost();
    }

    @RequestMapping("/admin/user/list")
    public ModelAndView list(ModelMap model, HttpServletRequest request) {
        List users = userService.list();
        model.addAttribute("title", "user");
        model.addAttribute("hostUrl", request.getLocalName());

        return new ModelAndView("admin/user/list", "users", users);
    }

    @RequestMapping("/admin/user/delete")
    public ModelAndView delete(@RequestParam Integer id) {
        userService.delete(id);
        return new ModelAndView("redirect:/admin/user/list");
    }

    @RequestMapping(value = {"/admin/user/delete/{id}"}, method = RequestMethod.GET)
    public String softDelete(@PathVariable Integer id, ModelMap model) {
        model.addAttribute("title", "user");
        UserViewModel user = userService.getViewModelById(id);
        userService.deleteUserEntity(user);

        return ("redirect:/admin/user/list");
    }

    @RequestMapping(value = {"/admin/user/active/{id}"})
    public String active(@PathVariable Integer id, ModelMap model) {
        User user = userService.findByID(id);
        model.addAttribute("user", user);
        userService.userActive(user);
        model.addAttribute("title", "user");

        return ("redirect:/admin/user/list");
    }

    @RequestMapping(value = {"/admin/user/details/{id}"})
    public ModelAndView details(@PathVariable Integer id, ModelMap model) {
        UserViewModel user = userService.getViewModelById(id);
        model.addAttribute("user", user);
        model.addAttribute("title", "profile");

        return new ModelAndView("admin/user/details", "user", user);
    }

    @RequestMapping(value = {"/admin/user/profile"})
    public ModelAndView profile(SecurityContextHolderAwareRequestWrapper request, ModelMap model) {
        if (request.isUserInRole("GENERAL")) return new ModelAndView("redirect:/user/profile");
        User user = userService.findByUsername(getCurrentUsername());
        model.addAttribute("user", user);
        model.addAttribute("title", "profile");
        model.addAttribute("company", user.getCompany());

        return new ModelAndView("admin/user/profile", "user", user);
    }

    @RequestMapping(value = {"/admin/user/inactive/{id}"})
    public String inactive(@PathVariable Integer id, ModelMap model) {
        User user = userService.findByID(id);
        model.addAttribute("user", user);
        userService.userActive(user);

        return ("redirect:/admin/user/list");
    }

    @RequestMapping(value = {"/admin/user/edit/password/{id}"}, method = RequestMethod.GET)
    public String editPassword(@PathVariable Integer id, ModelMap model) {
        UserViewModel user = userService.getViewModelById(id);
        model.addAttribute("user", user);
        model.addAttribute("title", "user");
        model.addAttribute("edit", true);
        return "admin/user/editPass";
    }

    @RequestMapping(value = {"/admin/user/edit/password/{id}"}, method = RequestMethod.POST)
    public String updatePassword(@Valid User user, BindingResult result, ModelMap model, @PathVariable Integer id) {
        boolean isInvalidPassword = !userService.isValidPassword(user.getPassword());
        if (result.hasErrors() || isInvalidPassword) {
            model.addAttribute("errorPassword", isInvalidPassword ? messageSource.getMessage("NotEmpty.password", new String[]{user.getPassword()}, Locale.getDefault()) : "");
            return "redirect:/admin/user/edit/password/" + user.getId() ;
        }
        userService.updatePassword(user);

        return ("redirect:/admin/user/list");
    }

    @RequestMapping(value = {"/admin/user/{id}"}, method = RequestMethod.GET)
    public String userAction(@PathVariable Integer id, ModelMap model) {
        UserViewModel user = userService.getViewModelById(id);
        model.addAttribute("user", user);
        model.addAttribute("title", "user");
        return "admin/user/action";
    }

    @RequestMapping(value = {"/admin/user/edit/{id}"}, method = RequestMethod.GET)
    public String edit(@PathVariable Integer id, ModelMap model) {
        User user = userService.findByID(id);
        model.addAttribute("user", user);
        model.addAttribute("userGroupId", userService.getGroupId(user));
        if ((user.getCompany() == null)) {
            model.addAttribute("userCompanyId", null);
        } else {
            model.addAttribute("userCompanyId", user.getCompany().getId());
        }

        model.addAttribute("title", "user");
        model.addAttribute("edit", true);

        List<CompanyViewModel> companies = companyService.list();
        model.addAttribute("companies", companies);

        List<Group> groups = groupService.list();
        model.addAttribute("groups", groups);

        return "admin/user/edit";
    }

    @RequestMapping(value = {"/admin/user/edit/{id}"}, method = RequestMethod.POST)
    public String update(@Valid User user, BindingResult result, ModelMap model, @PathVariable Integer id, RedirectAttributes redirect) {
        boolean isInvalidFirstName = !userService.isValidFirstName(user.getFirstName());
        boolean isInvalidEmail = !userService.isValidEmailUpdate(user.getEmail());
        boolean isInvalidPassword =false;
        if (user.getPassword() == null) {
        } else {
            isInvalidPassword = !userService.isValidPassword(user.getPassword());
        }


        if (result.hasErrors() || isInvalidFirstName || isInvalidEmail) {
            redirect.addFlashAttribute("errorFirstName", isInvalidFirstName ? messageSource.getMessage("firstName", new String[]{user.getFirstName()}, Locale.getDefault()) : "");
            redirect.addFlashAttribute("errorEmail", isInvalidEmail ? messageSource.getMessage("non.unique.email", new String[]{user.getEmail()}, Locale.getDefault()) : "");
            if(user.getPassword() != null){
                redirect.addFlashAttribute("errorPassword", isInvalidPassword ? messageSource.getMessage("NotEmpty.password", new String[]{user.getPassword()}, Locale.getDefault()) : "");
            }
            return "redirect:/admin/user/edit/" + user.getId();
        }

        if(isInvalidPassword){
            userService.updateUser(user);
        }else {
            userService.updateUserWithPassword(user, user.getPassword());
        }

        model.addAttribute("success", "User " + "" + " updated successfully");
        return ("redirect:/admin/user/list");
    }

    @RequestMapping(value = {"/admin/user/name/edit/{id}"}, method = RequestMethod.POST)
    public String updateName(@Valid User user, BindingResult result, ModelMap model, @PathVariable Integer id) {

        if (result.hasErrors()) {
            return "redirect:/admin/user/profile";
        }
        userService.updateName(user);

        model.addAttribute("success", "User " + "" + " updated successfully");
        return ("redirect:/admin/user/profile");
    }

    @RequestMapping(value = {"/admin/user/email/edit/{id}"}, method = RequestMethod.POST)
    public String updateEmail(@Valid User user, BindingResult result, ModelMap model, @PathVariable Integer id, HttpServletRequest request) {
        boolean isInvalidEmail = !userService.isValidEmail(user.getEmail());

        if (result.hasErrors() || isInvalidEmail) {
            model.addAttribute("errorEmail", isInvalidEmail ? messageSource.getMessage("non.unique.email", new String[]{user.getEmail()}, Locale.getDefault()) : "");
            return "redirect:/admin/user/profile";
        }
        userService.updateEmail(user);

        model.addAttribute("success", "User " + "" + " updated successfully");
        return ("redirect:/logout");
    }

    @RequestMapping(value = {"/admin/user/password/edit/{id}"}, method = RequestMethod.POST)
    public String updateMyPassword(@Valid User user, BindingResult result, ModelMap model, @PathVariable Integer id,
                                   @RequestParam("old_password") String old_password) {

        User currentUser = userService.findByUsername(getCurrentUsername());

        if (!passwordEncoder.matches(old_password, currentUser.getPassword())) {
            model.addAttribute("error: Your password not match");
            return "redirect:/admin/user/profile";
        }

        boolean isInvalidPassword = !userService.isValidPassword(user.getPassword());
        if (result.hasErrors() || isInvalidPassword) {
            model.addAttribute("errorPassword", isInvalidPassword
                    ? messageSource.getMessage("NotEmpty.password", new String[] { user.getPassword() }, Locale.getDefault())
                    : "");
            return "redirect:/admin/user/profile";
        }
        userService.updatePassword(user);

        model.addAttribute("success", "User " + "" + " updated successfully");
        return ("redirect:/admin/user/profile");
    }

    @RequestMapping(value = "/admin/user/new", method = RequestMethod.GET)
    public String create(ModelMap model) {
        contentForNewUser(model);

        return "admin/user/new";
    }

    private void contentForNewUser(ModelMap model) {
        UserViewModel user = new UserViewModel();
        model.addAttribute("user", user);
        model.addAttribute("title", "user");
        List<CompanyViewModel> companies = companyService.list();
        model.addAttribute("companies", companies);

        List<Group> groups = groupService.list();
        model.addAttribute("groups", groups);
    }

    @RequestMapping(value = "/user/verification/{token}", method = RequestMethod.GET)
    public String verificationToken(@PathVariable String token) {
        User user = userService.findUserIdByToken(token);

        return userCheck(user);
    }

    @RequestMapping(value = "/user/password/{token}", method = RequestMethod.GET)
    public String passwordToken(@PathVariable String token) {
        User user = userService.findUserIdByToken(token);

        if (user == null) {
            return "common/access_denied";
        } else {
            return ("redirect:/user/password/reset/" + user.getId());
        }
    }

    @RequestMapping(value = "/user/forgot/password")
    public String forgotPassword() {

        return "common/forgot_password";
    }

    @RequestMapping(value = "/user/forgot/password", method = RequestMethod.POST)
    public String forgotPassword(@RequestParam("email") String email, HttpServletRequest request, ModelMap model) throws MalformedURLException {
        User user = userService.findByUsername(email);
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        if (user != null) {
            user.setUserToken(randomUUIDString);
            userService.passwordResetTokenUpdate(user);

            URL requestURL = new URL(request.getRequestURL().toString());
            String port = requestURL.getPort() == -1 ? "" : ":" + requestURL.getPort();
            String urlString =  requestURL.getProtocol() + "://" + requestURL.getHost() + port;

            String subject = "SFI Annual Reporting & Survey Tool Password Reset";
            String message = "/user/password/" + randomUUIDString;
            String mailType = "reset";
            sendEmail(email, subject, message, user, mailType, urlString);
        }

        return "redirect:/login?msg";
    }

    private String userCheck(User user) {
        if (user == null) {
            return "redirect:/Access_Denied";
        } else if (user.getToken()) {
            return "redirect:/Access_Denied";
        } else {
            return ("redirect:/user/password/set/" + user.getId());
        }
    }

    @RequestMapping(value = "/user/password/reset/{id}", method = RequestMethod.GET)
    public String passwordReset(@PathVariable Integer id, ModelMap model) {
        UserViewModel user = userService.getViewModelById(id);
        model.addAttribute("user", user);
        model.addAttribute("title", "user");
        model.addAttribute("company", user.getCompany());

        return "common/password";
    }

    @RequestMapping(value = {"/user/password/reset/{id}"}, method = RequestMethod.POST)
    public String passwordReset(@Valid User user, BindingResult result, ModelMap model, @RequestParam("password") String password, @RequestParam("userName") String userName) {
        boolean isInvalidPassword = !userService.isValidPassword(user.getPassword());
        if (result.hasErrors() || isInvalidPassword) {
            model.addAttribute("errorPassword", isInvalidPassword ? messageSource.getMessage("NotEmpty.password", new String[]{user.getPassword()}, Locale.getDefault()) : "");
            return "redirect:/user/password/reset/" + user.getId();
        }
        model.addAttribute("password", password);
        model.addAttribute("userName", userName);
        model.addAttribute("user", user);
        model.addAttribute("company", user.getCompany());
        userService.updatePassword(user);

        return "redirect:/login";
    }

    @RequestMapping(value = "/user/password/set/{id}", method = RequestMethod.GET)
    public String passwordSet(@PathVariable Integer id, ModelMap model) {
        model.addAttribute("title", "user");
        User user = userService.findByID(id);
        model.addAttribute("user", user);
        model.addAttribute("company", user.getCompany());

        return "common/password";
    }

    @RequestMapping(value = {"/user/password/set/{id}"}, method = RequestMethod.POST)
    public String passwordSet(@Valid User user, BindingResult result, ModelMap model, @RequestParam("password") String password, @RequestParam("userName") String userName) {
        boolean isInvalidPassword = !userService.isValidPassword(user.getPassword());
        if (result.hasErrors()) {
            model.addAttribute("errorPassword", isInvalidPassword ? messageSource.getMessage("NotEmpty.password", new String[]{user.getPassword()}, Locale.getDefault()) : "");
            return "redirect:/user/password/set/" + user.getId();
        }
        model.addAttribute("user", userService.findByID(user.getId()));
        model.addAttribute("password", password);
        model.addAttribute("userName", userName);
        model.addAttribute("company", user.getCompany());
        userService.updatePassword(user);
        userService.verificationToken(user);

        return "common/after_password";
    }

    @RequestMapping(value = "/admin/user/new", method = RequestMethod.POST)
    public String save(@Valid User user, BindingResult result, ModelMap model, HttpServletRequest request) throws MalformedURLException {

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        user.setUserToken(randomUUIDString);
        user.setPassword(randomUUIDString);
        user.setUsername(user.getEmail());

        AuditListener auditListener = new AuditListener();  // audit log
        auditListener.prePersist(user);                     // audit log

        boolean isInvalidFirstName = !userService.isValidFirstName(user.getFirstName());
        boolean isInvalidEmail = !userService.isValidEmail(user.getEmail());

        if (result.hasErrors() || isInvalidFirstName || isInvalidEmail) {
            model.addAttribute("errorFirstName", isInvalidFirstName ? messageSource.getMessage("firstName", new String[]{user.getFirstName()}, Locale.getDefault()) : "");
            model.addAttribute("errorEmail", isInvalidEmail ? messageSource.getMessage("non.unique.email", new String[]{user.getEmail()}, Locale.getDefault()) : "");
            contentForNewUser(model);
            return "admin/user/new";
        }

        if (!userService.isUserUsernameUnique(user.getId(), user.getUsername())) {
            FieldError ssoError = new FieldError("user", "username", messageSource.getMessage("non.unique.username", new String[]{user.getUsername()}, Locale.getDefault()));
            result.addError(ssoError);
            contentForNewUser(model);
            return "admin/user/new";
        }

        if (!userService.isUserEmailUnique(user.getId(), user.getEmail())) {
            FieldError ssoError = new FieldError("user", "email", messageSource.getMessage("non.unique.email", new String[]{user.getEmail()}, Locale.getDefault()));
            result.addError(ssoError);
            contentForNewUser(model);
            return "admin/user/new";
        }

        userService.save(user);

        String recipient = user.getEmail();
        String subject = "Welcome to SFI Annual Reporting & Survey Tool";
        String message = "/user/verification/" + randomUUIDString;
        String mailType = "confirm";

        if (user.getSendInvitation()) {
            URL requestURL = new URL(request.getRequestURL().toString());
            String port = requestURL.getPort() == -1 ? "" : ":" + requestURL.getPort();
            String urlString =  requestURL.getProtocol() + "://" + requestURL.getHost() + port;

            sendEmail(recipient, subject, message, user, mailType, urlString);
        }

        model.addAttribute("success", "User " + "" + " has been registered successfully");
        return "redirect:/admin/user/list";
    }

    private String getPrincipal() {
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }

    private String getUserInfo() {
        User user = userService.findByUsername(getCurrentUsername());
        String fullname = user.getFullname();
        return fullname;
    }

    @ModelAttribute("roles")
    public List<Group> initializeProfiles() {
        return groupService.findAll();
    }

}