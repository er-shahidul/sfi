package com.rbs.sfi.admin.controllers;

import com.rbs.sfi.admin.entities.AreaUnit;
import com.rbs.sfi.admin.services.AreaUnitService;
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
public class AreaUnitController {

    @Autowired
    AreaUnitService areaUnitService;

    @RequestMapping("/admin/area/unit/list")
    public ModelAndView areaList(ModelMap model) {
        model.addAttribute("title", "area_unit");
        List<AreaUnit> areaUnities = areaUnitService.list();
        return new ModelAndView("core/areaUnit/list", "areaUnities", areaUnities);
    }

    @RequestMapping(value = "/admin/area/unit/new", method = RequestMethod.GET)
    public String form(ModelMap model) {
        model.addAttribute("title", "area_unit");
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

    @RequestMapping(value = {"/admin/area/unit/edit/{id}"}, method = RequestMethod.GET)
    public String updateForm(@PathVariable Integer id, ModelMap model) {
        model.addAttribute("title", "area_unit");
        AreaUnit areaUnit = areaUnitService.findById(id);
        model.addAttribute("areaUnit", areaUnit);
        model.addAttribute("edit", true);

        return "core/areaUnit/edit";
    }

    @RequestMapping(value = {"/admin/area/unit/edit/{id}"}, method = RequestMethod.POST)
    public String update(@Valid AreaUnit areaUnit, BindingResult result, @PathVariable Integer id, ModelMap model) {
        model.addAttribute("id", id);

        if (result.hasErrors()) {
            return "core/areaUnit/edit";
        }
        areaUnitService.update(areaUnit);

        return ("redirect:/admin/area/unit/list");
    }

    @RequestMapping(value = {"/admin/area/unit/delete/{id}"}, method = RequestMethod.GET)
    public String softDelete(@PathVariable Integer id, ModelMap model) {
        model.addAttribute("title", "area_unit");
        AreaUnit areaUnit = areaUnitService.findById(id);
        areaUnitService.softDelete(areaUnit);

        return ("redirect:/admin/area/unit/list");
    }
}