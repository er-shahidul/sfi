package com.rbs.sfi.web.services;

import com.rbs.sfi.common.services.ReflectionHelperService;
import com.rbs.sfi.web.mapper.EntityModelMapperService;
import com.rbs.sfi.web.mapper.ViewModelMapperService;
import com.rbs.sfi.web.models.entities.*;
import com.rbs.sfi.web.models.viewmodels.*;
import com.rbs.sfi.web.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class FormService {
    @Autowired
    private Cs1Repository cs1Repository;

    @Autowired
    private Cs2Repository cs2Repository;

    @Autowired
    private Cs3Repository cs3Repository;

    @Autowired
    private Cs4Repository cs4Repository;

    @Autowired
    private Cs5Repository cs5Repository;

    @Autowired
    private Cs6Repository cs6Repository;

    @Autowired
    private Cs7Repository cs7Repository;

    @Autowired
    private Cs8Repository cs8Repository;

    @Autowired
    private Cs9Repository cs9Repository;

    @Autowired
    private Cs10Repository cs10Repository;

    @Autowired
    private ReflectionHelperService reflectionHelperService;

    @Autowired
    private ViewModelMapperService viewModelMapperService;

    @Autowired
    private EntityModelMapperService entityModelMapperService;

    @Autowired
    private Cs2Service cs2Service;

    @Autowired
    private Cs6Service cs6Service;

    /***********************
     * Cs1 : Begin
     ***********************/
    public Cs1ViewModel getCs1ViewModel(Integer id) {
        Cs1 entity = cs1Repository.get(id);
        return viewModelMapperService.convert(entity, Cs1ViewModel.class);
    }

    public void setCs1Entity(Cs1ViewModel model) {
        Cs1 entity = entityModelMapperService.convert(model, Cs1.class);
    }
    /*********************** Cs1 : End   ***********************/

    /***********************
     * Cs2 : Begin
     ***********************/
    public Cs2ViewModel getCs2ViewModel(Integer id) {
        Cs2 entity = cs2Repository.get(id);
        return viewModelMapperService.convert(entity, Cs2ViewModel.class);
    }

    public void setCs2Entity(Cs2ViewModel model) {
        cs2Service.manualPopulation(model);
        Cs2 entity = entityModelMapperService.convert(model, Cs2.class);
    }
    /*********************** Cs2 : End   ***********************/

    /***********************
     * Cs3 : Begin
     ***********************/
    public Cs3ViewModel getCs3ViewModel(Integer id) {
        Cs3 entity = cs3Repository.get(id);
        return viewModelMapperService.convert(entity, Cs3ViewModel.class);
    }

    public void setCs3Entity(Cs3ViewModel model) {
        Cs3 entity = entityModelMapperService.convert(model, Cs3.class);
    }
    /*********************** Cs3 : End   ***********************/

    /***********************
     * Cs4 : Begin
     ***********************/
    public Cs4ViewModel getCs4ViewModel(Integer id) {
        Cs4 entity = cs4Repository.get(id);
        return viewModelMapperService.convert(entity, Cs4ViewModel.class);
    }

    public void setCs4Entity(Cs4ViewModel model) {
        Cs4 entity = entityModelMapperService.convert(model, Cs4.class);
    }
    /*********************** Cs4 : End   ***********************/

    /***********************
     * Cs5 : Begin
     ***********************/
    public Cs5ViewModel getCs5ViewModel(Integer id) {
        Cs5 entity = cs5Repository.get(id);
        return viewModelMapperService.convert(entity, Cs5ViewModel.class);
    }

    public void setCs5Entity(Cs5ViewModel model) {
        Cs5 entity = entityModelMapperService.convert(model, Cs5.class);
    }
    /*********************** Cs5 : End   ***********************/

    /***********************
     * Cs6 : Begin
     ***********************/
    public Cs6ViewModel getCs6ViewModel(Integer id) {
        Cs6 entity = cs6Repository.get(id);
        return viewModelMapperService.convert(entity, Cs6ViewModel.class);
    }

    public void setCs6Entity(Cs6ViewModel model) {
        cs6Service.manualPopulation(model);
        Cs6 entity = entityModelMapperService.convert(model, Cs6.class);
    }
    /*********************** Cs6 : End   ***********************/
}