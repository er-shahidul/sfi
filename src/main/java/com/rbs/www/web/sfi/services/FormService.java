package com.rbs.www.web.sfi.services;

import com.rbs.www.common.mapper.EntityModelMapperService;
import com.rbs.www.common.mapper.ViewModelMapperService;
import com.rbs.www.web.common.services.ModelValidationService;
import com.rbs.www.web.sfi.models.entities.*;
import com.rbs.www.web.sfi.models.viewmodels.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class FormService {
    @Autowired
    private SfiPpFormDataService sfiPpFormDataService;

    @Autowired
    private Cs1Service cs1Service;

    @Autowired
    private Cs2Service cs2Service;

    @Autowired
    private Cs3Service cs3Service;

    @Autowired
    private Cs4Service cs4Service;

    @Autowired
    private Cs5Service cs5Service;

    @Autowired
    private Cs6Service cs6Service;

    @Autowired
    private Cs7Service cs7Service;

    @Autowired
    private Cs8PartialAService cs8PartialAService;

    @Autowired
    private Cs8PartialBService cs8PartialBService;

    @Autowired
    private Cs8PartialCService cs8PartialCService;

    @Autowired
    private Cs9Service cs9Service;

    @Autowired
    private Cs10Service cs10Service;

    @Autowired
    private SfiPpFormCs5Service sfiPpFormCs5Service;

    @Autowired
    private SfiPpFormResearchTypeService sfiPpFormResearchTypeService;

    @Autowired
    private SfiPpFormCs3ProjectSupportDocsService sfiPpFormCs3ProjectSupportDocsService;

    @Autowired
    private ViewModelMapperService viewModelMapperService;

    @Autowired
    private EntityModelMapperService entityModelMapperService;

    @Autowired
    private ModelValidationService modelValidationService;

    private String pending = "pending";

//    public PpFormViewModel formSubmit(Integer id) {
//        SfiPpFormData sfiPpFormData = sfiPpFormDataService.createOrGetByCurrentUsersCompany();
//
//        Cs1ViewModel   cs1ViewModel = getCs1ViewModel(sfiPpFormData.getId());
//
//        SfiPpFormDataViewModel   sfiPpFormDataViewModel = getSfiPpFormDataViewModel(sfiPpFormData.getId());
//        Cs2ViewModel   cs2ViewModel = getCs2ViewModel(sfiPpFormData.getId());
//        Cs3ViewModel   cs3ViewModel = getCs3ViewModel(sfiPpFormData.getId());
//        Cs4ViewModel   cs4ViewModel = getCs4ViewModel(sfiPpFormData.getId());
//        Cs5ViewModel   cs5ViewModel = getCs5ViewModel(sfiPpFormData.getId());
//        Cs6ViewModel   cs6ViewModel = getCs6ViewModel(sfiPpFormData.getId());
//        Cs7ViewModel   cs7ViewModel = getCs7ViewModel(sfiPpFormData.getId());
//        Cs8ViewModel   cs8ViewModel = getCs8ViewModel(sfiPpFormData.getId());
//        Cs9ViewModel   cs9ViewModel = getCs9ViewModel(sfiPpFormData.getId());
//        Cs10ViewModel cs10ViewModel = getCs10ViewModel(sfiPpFormData.getId());
//
//        PpFormViewModel model = new PpFormViewModel();
//
//        model.getSfiPpFormDataViewModel(sfiPpFormDataViewModel);
//        model.getCs1ViewModel(cs1ViewModel);
//        model.getCs2ViewModel(cs2ViewModel);
//        model.getCs3ViewModel(cs3ViewModel);
//        model.getCs4ViewModel(cs4ViewModel);
//        model.getCs5ViewModel(cs5ViewModel);
//        model.getCs6ViewModel(cs6ViewModel);
//        model.getCs7ViewModel(cs7ViewModel);
//        model.getCs8ViewModel(cs8ViewModel);
//        model.getCs9ViewModel(cs9ViewModel);
//        model.getCs10ViewModel(cs10ViewModel);
//
//        return model;
//    }

    /************************* SfiPpFormData : Begin ***********************/
    public SfiPpFormDataViewModel getSfiPpFormDataViewModel(Integer id) {
        SfiPpFormData entity = sfiPpFormDataService.get(id);
        return viewModelMapperService.convert(entity, SfiPpFormDataViewModel.class);
    }
    /************************ SfiPpFormData : End ***********************/

    /************************* Cs1 : Begin ***********************/
    public Cs1ViewModel getCs1ViewModel(Integer id) {
        Cs1 entity = cs1Service.get(id);
        return viewModelMapperService.convert(entity, Cs1ViewModel.class);
    }

    public void setCs1Entity(Cs1ViewModel model) {
        Cs1 entity = entityModelMapperService.convert(model, Cs1.class);
        sfiPpFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************ Cs1 : End ***********************/

    /************************* Cs2 : Begin ***********************/
    public Cs2ViewModel getCs2ViewModel(Integer id) {
        Cs2 entity = cs2Service.get(id);
        return viewModelMapperService.convert(entity, Cs2ViewModel.class);
    }

    public void setCs2Entity(Cs2ViewModel model) {
        cs2Service.manualPopulation(model);
        Cs2 entity = entityModelMapperService.convert(model, Cs2.class);
        sfiPpFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************ Cs2 : End ***********************/

    /************************* Cs3 : Begin ***********************/
    public Cs3ViewModel getCs3ViewModel(Integer id) {
        Cs3 entity = cs3Service.get(id);
        return viewModelMapperService.convert(entity, Cs3ViewModel.class);
    }

    public void setCs3Entity(Cs3ViewModel model) {
        Cs3 entity = entityModelMapperService.convert(model, Cs3.class);
        sfiPpFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************ Cs3 : End ***********************/

    /************************* Cs4 : Begin ***********************/
    public Cs4ViewModel getCs4ViewModel(Integer id) {
        Cs4 entity = cs4Service.get(id);
        return viewModelMapperService.convert(entity, Cs4ViewModel.class);
    }

    public void setCs4Entity(Cs4ViewModel model) {
        Cs4 entity = entityModelMapperService.convert(model, Cs4.class);
        sfiPpFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************ Cs4 : End ***********************/

    /************************* Cs5 : Begin ***********************/
    public Cs5ViewModel getCs5ViewModel(Integer id) {
        Cs5 entity = cs5Service.get(id);
        Cs5ViewModel model = viewModelMapperService.convert(entity, Cs5ViewModel.class);
        model.setItems(this.getSfiPpFormCs5ViewModels(id));

        return model;
    }

    public void setCs5Entity(Cs5ViewModel model) {
        cs5Service.manualPopulation(model);
        Cs5 entity = entityModelMapperService.convert(model, Cs5.class);
        sfiPpFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************ Cs5 : End ***********************/

    /************************* Cs6 : Begin ***********************/
    public Cs6ViewModel getCs6ViewModel(Integer id) {
        Cs6 entity = cs6Service.get(id);
        return viewModelMapperService.convert(entity, Cs6ViewModel.class);
    }

    public void setCs6Entity(Cs6ViewModel model) {
        cs6Service.manualPopulation(model);
        Cs6 entity = entityModelMapperService.convert(model, Cs6.class);
        sfiPpFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************ Cs6 : End ***********************/

    /************************* Cs7 : Begin ***********************/
    public Cs7ViewModel getCs7ViewModel(Integer id) {
        Cs7 entity = cs7Service.get(id);
        return viewModelMapperService.convert(entity, Cs7ViewModel.class);
    }

    public void setCs7Entity(Cs7ViewModel model) {
        Cs7 entity = entityModelMapperService.convert(model, Cs7.class);
        sfiPpFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************ Cs7 : End ***********************/

    /************************* Cs8 : Begin ***********************/
    public Cs8ViewModel getCs8ViewModel(Integer id) {
        Cs8PartialA partialEntityA = cs8PartialAService.get(id);
        Cs8PartialB partialEntityB = cs8PartialBService.get(id);
        Cs8PartialC partialEntityC = cs8PartialCService.get(id);

        Cs8PartialAViewModel partialAViewModel = viewModelMapperService.convert(partialEntityA, Cs8PartialAViewModel.class);
        Cs8PartialBViewModel partialBViewModel = viewModelMapperService.convert(partialEntityB, Cs8PartialBViewModel.class);
        Cs8PartialCViewModel partialCViewModel = viewModelMapperService.convert(partialEntityC, Cs8PartialCViewModel.class);

        Cs8ViewModel model = new Cs8ViewModel();
        model.setCs8PartialAViewModel(partialAViewModel);
        model.setCs8PartialBViewModel(partialBViewModel);
        model.setCs8PartialCViewModel(partialCViewModel);

        return model;
    }

    public void setCs8Entity(Cs8ViewModel model) {
        Cs8PartialAViewModel partialAViewModel = model.getCs8PartialAViewModel();
        cs8PartialAService.manualPopulation(partialAViewModel);
        Cs8PartialA partialEntityA = entityModelMapperService.convert(partialAViewModel, Cs8PartialA.class);

        Cs8PartialBViewModel partialBViewModel = model.getCs8PartialBViewModel();
        Cs8PartialB partialEntityB = entityModelMapperService.convert(partialBViewModel, Cs8PartialB.class);

        Cs8PartialCViewModel partialCViewModel = model.getCs8PartialCViewModel();
        Cs8PartialC partialEntityC = entityModelMapperService.convert(partialCViewModel, Cs8PartialC.class);
        sfiPpFormDataService.setAuditInfo(partialAViewModel.getId(), pending);
    }
    /************************ Cs8 : End ***********************/

    /************************* Cs9 : Begin ***********************/
    public Cs9ViewModel getCs9ViewModel(Integer id) {
        Cs9 entity = cs9Service.get(id);
        return viewModelMapperService.convert(entity, Cs9ViewModel.class);
    }

    public void setCs9Entity(Cs9ViewModel model) {
        cs9Service.manualPopulation(model);
        Cs9 entity = entityModelMapperService.convert(model, Cs9.class);
        sfiPpFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************ Cs9 : End ***********************/

    /************************* Cs10 : Begin ***********************/
    public Cs10ViewModel getCs10ViewModel(Integer id) {
        Cs10 entity = cs10Service.get(id);
        return viewModelMapperService.convert(entity, Cs10ViewModel.class);
    }

    public void setCs10Entity(Cs10ViewModel model) {
        cs10Service.manualPopulation(model);
        Cs10 entity = entityModelMapperService.convert(model, Cs10.class);
        sfiPpFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************ Cs10 : End ***********************/

    /************************* SfiPpFormCs5 : Begin ***********************/
    public List<SfiPpFormCs5ViewModel> getSfiPpFormCs5ViewModels(Integer formId) {
        List<SfiPpFormResearchType> researchTypes = sfiPpFormResearchTypeService.getAll();
        List<SfiPpFormCs5ViewModel> models = new ArrayList<SfiPpFormCs5ViewModel>();

        for (SfiPpFormResearchType researchType : researchTypes) {
            SfiPpFormCs5 entity = sfiPpFormCs5Service.getByFormAndResearchType(formId, researchType.getId());
            if (entity == null) entity = sfiPpFormCs5Service.createByFormAndResearchType(formId, researchType);

            SfiPpFormCs5ViewModel model = viewModelMapperService.convert(entity, SfiPpFormCs5ViewModel.class);
            model.setDescription(researchType.getDescription());
            models.add(model);
        }

        return models;
    }

    public void setSfiPpFormCs5Entities(List<SfiPpFormCs5ViewModel> models) {
        for (SfiPpFormCs5ViewModel model : models) {
            SfiPpFormCs5 entity = entityModelMapperService.convert(model, SfiPpFormCs5.class);
        }
    }
    /************************ SfiPpFormCs5 : End ***********************/

    /************************* ErrorViewModel : Begin ***********************/
    public ErrorViewModel getErrorViewModel(Integer id) {
        ErrorViewModel model = new ErrorViewModel();

        model.setCs1Errors(modelValidationService.validate(this.getCs1ViewModel(id)));
        model.setCs2Errors(modelValidationService.validate(this.getCs2ViewModel(id)));
        model.setCs3Errors(modelValidationService.validate(this.getCs3ViewModel(id)));
        model.setCs4Errors(modelValidationService.validate(this.getCs4ViewModel(id)));
        model.setCs5Errors(modelValidationService.validate(this.getCs5ViewModel(id)));
        model.setCs6Errors(modelValidationService.validate(this.getCs6ViewModel(id)));
        model.setCs7Errors(modelValidationService.validate(this.getCs7ViewModel(id)));

        Cs8ViewModel cs8ViewModel = this.getCs8ViewModel(id);
        model.setCs8PartialAErrors(modelValidationService.validate(cs8ViewModel.getCs8PartialAViewModel()));
        model.setCs8PartialBErrors(modelValidationService.validate(cs8ViewModel.getCs8PartialBViewModel()));
        model.setCs8PartialCErrors(modelValidationService.validate(cs8ViewModel.getCs8PartialCViewModel()));

        model.setCs9Errors(modelValidationService.validate(this.getCs9ViewModel(id)));
        model.setCs10Errors(modelValidationService.validate(this.getCs10ViewModel(id)));

        return model;
    }
    /************************ ErrorViewModel : End ***********************/
}