package com.rbs.www.admin.controllers;

import com.rbs.www.admin.models.viewmodels.AreaUnitViewModel;
import com.rbs.www.admin.services.AreaUnitService;
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
        List<AreaUnitViewModel> areaUnities = areaUnitService.list();
        return new ModelAndView("admin/area/list", "areaUnities", areaUnities);
    }

    @RequestMapping(value = "/admin/area/unit/new", method = RequestMethod.GET)
    public String form(ModelMap model) {
        model.addAttribute("title", "area_unit");
        AreaUnitViewModel areaUnit = new AreaUnitViewModel();
        model.addAttribute("areaUnit", areaUnit);

        return "admin/area/new";
    }

    @RequestMapping(value = "/admin/area/unit/new", method = RequestMethod.POST)
    public String save(@Valid AreaUnitViewModel areaUnit, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "admin/area/new";
        }

        areaUnitService.setAreaUnitEntity(areaUnit);

        model.addAttribute("success", "Area Unit " + "" + " has been registered successfully");
        return ("redirect:/admin/area/unit/list");
    }

    @RequestMapping(value = {"/admin/area/unit/edit/{id}"}, method = RequestMethod.GET)
    public String updateForm(@PathVariable Integer id, ModelMap model) {
        model.addAttribute("title", "area_unit");
        AreaUnitViewModel areaUnit = areaUnitService.getViewModelById(id);
        model.addAttribute("areaUnit", areaUnit);
        model.addAttribute("edit", true);

        return "admin/area/edit";
    }

    @RequestMapping(value = {"/admin/area/unit/edit/{id}"}, method = RequestMethod.POST)
    public String update(@Valid AreaUnitViewModel areaUnit, BindingResult result, @PathVariable Integer id, ModelMap model) {
        model.addAttribute("id", id);

        if (result.hasErrors()) {
            return "admin/area/edit";
        }
        areaUnitService.setAreaUnitEntity(areaUnit);

        return ("redirect:/admin/area/unit/list");
    }

    @RequestMapping(value = {"/admin/area/unit/delete/{id}"}, method = RequestMethod.GET)
    public String softDelete(@PathVariable Integer id, ModelMap model) {
        model.addAttribute("title", "area_unit");
        AreaUnitViewModel areaUnit = areaUnitService.getViewModelById(id);
        areaUnitService.deleteAreaUnitEntity(areaUnit);

        return ("redirect:/admin/area/unit/list");
    }
}