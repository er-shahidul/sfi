package com.rbs.sfi.core.controllers;

import com.rbs.sfi.core.entities.AreaUnit;
import com.rbs.sfi.core.services.AreaUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class FrontController {

    @Autowired
    AreaUnitService areaUnitService;

    @RequestMapping("/admin/area/unit/list")
    public ModelAndView areaList() {
        List areaUnities = areaUnitService.list();
        return new ModelAndView("core/areaUnit/list", "areaUnities", areaUnities);
    }

    @RequestMapping(value = "/admin/area/unit/new", method = RequestMethod.GET)
    public String form(ModelMap model) {
        AreaUnit areaUnit = new AreaUnit();
        model.addAttribute("areaUnit", areaUnit);

        return "core/areaUnit/new";
    }

    @RequestMapping(value = "/admin/area/unit/new", method = RequestMethod.POST)
    public String save(@Valid AreaUnit areaUnit, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "core/areaUnit/new";
        }

        areaUnitService.save(areaUnit);

        model.addAttribute("success", "Area Unit " + "" + " has been registered successfully");
        return ("redirect:/admin/area/unit/list");
    }

    @RequestMapping(value = { "/admin/area/unit/edit/{id}" }, method = RequestMethod.GET)
    public String updateForm(@PathVariable int id, ModelMap model) {
        AreaUnit areaUnit = areaUnitService.findById(id);
        model.addAttribute("areaUnit", areaUnit);
        model.addAttribute("edit", true);

        return "core/areaUnit/edit";
    }

    @RequestMapping(value = { "/admin/area/unit/edit/{id}" }, method = RequestMethod.POST)
    public String update(@Valid AreaUnit areaUnit, BindingResult result, @PathVariable int id, ModelMap model) {
        model.addAttribute("id", id);

        if (result.hasErrors()) {
            return "core/areaUnit/edit";
        }
        areaUnitService.update(areaUnit);

        return ("redirect:/admin/area/unit/list");
    }
}