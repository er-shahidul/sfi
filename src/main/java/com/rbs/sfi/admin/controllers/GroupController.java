package com.rbs.sfi.admin.controllers;

import com.rbs.sfi.admin.entities.Group;
import com.rbs.sfi.admin.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

@Controller
public class GroupController {

    @Autowired
    GroupService groupService;

    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/admin/group/list")
    public ModelAndView list(ModelMap model) {
        model.addAttribute("title", "group");
        List groups = groupService.list();
        return new ModelAndView("admin/group/list", "groups", groups);
    }

    @RequestMapping("/admin/group/delete")
    public ModelAndView delete(@RequestParam Integer id) {
        groupService.delete(id);
        return new ModelAndView("redirect:/admin/group/list");
    }

    @RequestMapping(value = "/admin/group/create", method = RequestMethod.GET)
    public String create(ModelMap model) {
        model.addAttribute("title", "group");
        Group group = new Group();
        model.addAttribute("group", group);
        return "admin/group/new";
    }

    @RequestMapping(value = "/admin/group/create", method = RequestMethod.POST)
    public String save(@Valid Group group, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            System.out.println("There are errors");
            return "admin/group/new";
        }

        if (!groupService.isRoleUnique(group.getId(), group.getRole())) {
            FieldError ssoError = new FieldError("group", "role", messageSource.getMessage("non.unique.role", new String[]{group.getRole()}, Locale.getDefault()));
            result.addError(ssoError);
            return "admin/group/new";
        }

        groupService.save(group);

        model.addAttribute("success", "Group " + group.getRole() + " has been registered successfully");
        return ("redirect:/admin/group/list");
    }
}