package com.rbs.www.web.sfi.services;

import com.rbs.www.common.mapper.EntityModelMapperService;
import com.rbs.www.common.mapper.ViewModelMapperService;
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

    /************************* Cs1 : Begin ***********************/
    public Cs1ViewModel getCs1ViewModel(Integer id) {
        Cs1 entity = cs1Service.get(id);
        return viewModelMapperService.convert(entity, Cs1ViewModel.class);
    }

    public void setCs1Entity(Cs1ViewModel model) {
        Cs1 entity = entityModelMapperService.convert(model, Cs1.class);
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
    }
    /************************ Cs2 : End ***********************/

    /************************* Cs3 : Begin ***********************/
    public Cs3ViewModel getCs3ViewModel(Integer id) {
        Cs3 entity = cs3Service.get(id);
        return viewModelMapperService.convert(entity, Cs3ViewModel.class);
    }

    public void setCs3Entity(Cs3ViewModel model) {
        Cs3 entity = entityModelMapperService.convert(model, Cs3.class);
    }
    /************************ Cs3 : End ***********************/

    /************************* Cs4 : Begin ***********************/
    public Cs4ViewModel getCs4ViewModel(Integer id) {
        Cs4 entity = cs4Service.get(id);
        return viewModelMapperService.convert(entity, Cs4ViewModel.class);
    }

    public void setCs4Entity(Cs4ViewModel model) {
        Cs4 entity = entityModelMapperService.convert(model, Cs4.class);
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

        cs5Service.setSupportDocs(entity);
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
    }
    /************************ Cs6 : End ***********************/

    /************************* Cs7 : Begin ***********************/
    public Cs7ViewModel getCs7ViewModel(Integer id) {
        Cs7 entity = cs7Service.get(id);
        return viewModelMapperService.convert(entity, Cs7ViewModel.class);
    }

    public void setCs7Entity(Cs7ViewModel model) {
        Cs7 entity = entityModelMapperService.convert(model, Cs7.class);
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
    }
    /************************ Cs9 : End ***********************/

    /************************* Cs10 : Begin ***********************/
    public Cs10ViewModel getCs10ViewModel(Integer id) {
        Cs10 entity = cs10Service.get(id);
        return viewModelMapperService.convert(entity, Cs10ViewModel.class);
    }

    public void setCs10Entity(Cs10ViewModel model) {
        Cs10 entity = entityModelMapperService.convert(model, Cs10.class);
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

    /************************* SfiPpFormCs3ProjectSupportDocsViewModel : Begin ***********************/
    public SfiPpFormCs3ProjectSupportDocsViewModel getSfiPpFormCs3ProjectSupportDocsViewModel(String fileName) {
        SfiPpFormCs3ProjectSupportDocsViewModel model = new SfiPpFormCs3ProjectSupportDocsViewModel();
        model.setProjectOriginalDocumentName(fileName);

        String generatedFileName = sfiPpFormCs3ProjectSupportDocsService.generateUniqueName()
                + fileName.substring(fileName.lastIndexOf("."));
        model.setProjectUniqueDocumentName(generatedFileName);
        return model;
    }
    /************************ SfiPpFormCs3ProjectSupportDocsViewModel : End ***********************/
}