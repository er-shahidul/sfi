package com.rbs.www.web.sic.services;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.mapper.EntityModelMapperService;
import com.rbs.www.common.modules.mapper.ViewModelMapperService;
import com.rbs.www.web.common.models.datamodels.UpdateDate;
import com.rbs.www.web.common.services.ModelValidationService;
import com.rbs.www.web.sic.models.entities.*;
import com.rbs.www.web.sic.models.viewmodels.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SicFormService {

    private final String pending = "pending";

    @Autowired
    private SicFormDataService sicFormDataService;

    @Autowired
    private SicCs1Service sicCs1Service;

    @Autowired
    private SicCs2Service sicCs2Service;

    @Autowired
    private SicCs3Service sicCs3Service;

    @Autowired
    private SicCs4Service sicCs4Service;

    @Autowired
    private SicCs5Service sicCs5Service;

    @Autowired
    private SicCs6Service sicCs6Service;

    @Autowired
    private SicCs7Service sicCs7Service;

    @Autowired
    private SicCs8Service sicCs8Service;

    @Autowired
    private SicCs9Service sicCs9Service;

    @Autowired
    private SicCs10Service sicCs10Service;

    @Autowired
    private ViewModelMapperService viewModelMapperService;

    @Autowired
    private EntityModelMapperService entityModelMapperService;

    @Autowired
    private ModelValidationService modelValidationService;


    /************************* SicCs1 : Begin *************************/
    public SicCs1ViewModel getSicCs1ViewModel(Integer id) {
        SicCs1 entity = sicCs1Service.get(id);
        return this.validate(viewModelMapperService.convert(entity, SicCs1ViewModel.class));
    }

    public void setSicCs1Entity(SicCs1ViewModel model) {
        sicCs1Service.manualPopulation(model);
        SicCs1 entity = entityModelMapperService.convert(model, SicCs1.class);
        sicFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************* SicCs1 : End ***************************/

    /************************* SicCs2 : Begin *************************/
    public SicCs2ViewModel getSicCs2ViewModel(Integer id) {
        SicCs2 entity = sicCs2Service.get(id);
        return this.validate(viewModelMapperService.convert(entity, SicCs2ViewModel.class));
    }

    public void setSicCs2Entity(SicCs2ViewModel model) {
        sicCs2Service.manualPopulation(model);
        SicCs2 entity = entityModelMapperService.convert(model, SicCs2.class);
        sicFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************* SicCs2 : End *************************/

    /************************* SicCs3 : Begin ***********************/
    public SicCs3ViewModel getSicCs3ViewModel(Integer id) {
        SicCs3 entity = sicCs3Service.get(id);
        return this.validate(viewModelMapperService.convert(entity, SicCs3ViewModel.class));
    }

    public void setSicCs3Entity(SicCs3ViewModel model) {
        SicCs3 entity = entityModelMapperService.convert(model, SicCs3.class);
        sicFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************* SicCs3 : End *************************/

    /************************* SicCs4 : Begin ***********************/
    public SicCs4ViewModel getSicCs4ViewModel(Integer id) {
        SicCs4 entity = sicCs4Service.get(id);
        return this.validate(viewModelMapperService.convert(entity, SicCs4ViewModel.class));
    }

    public void setSicCs4Entity(SicCs4ViewModel model) {
        SicCs4 entity = entityModelMapperService.convert(model, SicCs4.class);
        sicFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************* SicCs4 : End *************************/

    /************************* SicCs5 : Begin ***********************/
    public SicCs5ViewModel getSicCs5ViewModel(Integer id) {
        SicCs5 entity = sicCs5Service.get(id);
        return this.validate(viewModelMapperService.convert(entity, SicCs5ViewModel.class));
    }

    public void setSicCs5Entity(SicCs5ViewModel model) {
        sicCs5Service.manualPopulation(model);
        SicCs5 entity = entityModelMapperService.convert(model, SicCs5.class);
        sicFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************* SicCs5 : End *************************/

    /************************* SicCs6 : Begin ***********************/
    public SicCs6ViewModel getSicCs6ViewModel(Integer id) {
        SicCs6 entity = sicCs6Service.get(id);
        return this.validate(viewModelMapperService.convert(entity, SicCs6ViewModel.class));
    }

    public void setSicCs6Entity(SicCs6ViewModel model) {
        SicCs6 entity = entityModelMapperService.convert(model, SicCs6.class);
        sicFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************* SicCs6 : End *************************/

    /************************* SicCs7 : Begin ***********************/
    public SicCs7ViewModel getSicCs7ViewModel(Integer id) {
        SicCs7 entity = sicCs7Service.get(id);
        return this.validate(viewModelMapperService.convert(entity, SicCs7ViewModel.class));
    }

    public void setSicCs7Entity(SicCs7ViewModel model) {
        SicCs7 entity = entityModelMapperService.convert(model, SicCs7.class);
        sicFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************* SicCs7 : End *************************/

    /************************* SicCs8 : Begin ***********************/
    public SicCs8ViewModel getSicCs8ViewModel(Integer id) {
        SicCs8 entity = sicCs8Service.get(id);
        return this.validate(viewModelMapperService.convert(entity, SicCs8ViewModel.class));
    }

    public void setSicCs8Entity(SicCs8ViewModel model) {
        sicCs8Service.manualPopulation(model);
        SicCs8 entity = entityModelMapperService.convert(model, SicCs8.class);
        sicFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************* SicCs8 : End *************************/

    /************************* SicCs9 : Begin ***********************/
    public SicCs9ViewModel getSicCs9ViewModel(Integer id) {
        SicCs9 entity = sicCs9Service.get(id);
        return this.validate(viewModelMapperService.convert(entity, SicCs9ViewModel.class));
    }

    public void setSicCs9Entity(SicCs9ViewModel model) {
        SicCs9 entity = entityModelMapperService.convert(model, SicCs9.class);
        sicFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************* SicCs9 : End *************************/

    /************************ SicCs10 : Begin ***********************/
    public SicCs10ViewModel getSicCs10ViewModel(Integer id) {
        SicCs10 entity = sicCs10Service.get(id);
        return this.validate(viewModelMapperService.convert(entity, SicCs10ViewModel.class));
    }

    public void setSicCs10Entity(SicCs10ViewModel model) {
        SicCs10 entity = entityModelMapperService.convert(model, SicCs10.class);
        sicFormDataService.setAuditInfo(model.getId(), pending);
    }
    /************************ SicCs10 : End *************************/

    /************************* UpdateDate : Begin ***********************/
    public UpdateDate getUpdateDate(Integer id) {
        UpdateDate model = new UpdateDate();
        model.setUpdateDate(sicFormDataService.getUpdateAt(id).toString());

        return model;
    }

    /************************* UpdateDate : End ***********************/
    private <T extends BaseViewModel> T validate(T model) {
        modelValidationService.validate(model);
        return model;
    }
}