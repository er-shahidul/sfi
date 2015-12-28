package com.rbs.www.web.sic.services;

import com.rbs.www.common.mapper.EntityModelMapperService;
import com.rbs.www.common.mapper.ViewModelMapperService;
import com.rbs.www.web.sic.models.entities.*;
import com.rbs.www.web.sic.models.viewmodels.*;
import com.rbs.www.web.sic.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SicFormService {
    @Autowired
    private SicCs1Repository sicCs1Repository;

    @Autowired
    private SicCs2Repository sicCs2Repository;

    @Autowired
    private SicCs3Repository sicCs3Repository;

    @Autowired
    private SicCs4Repository sicCs4Repository;

    @Autowired
    private SicCs5Repository sicCs5Repository;

    @Autowired
    private SicCs6Repository sicCs6Repository;

    @Autowired
    private SicCs7Repository sicCs7Repository;

    @Autowired
    private SicCs8Repository sicCs8Repository;

    @Autowired
    private SicCs9Repository sicCs9Repository;

    @Autowired
    private SicCs10Repository sicCs10Repository;

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

    /************************* SicCs1 : Begin *************************/
    public SicCs1ViewModel getSicCs1ViewModel(Integer id) {
        SicCs1 entity = sicCs1Repository.get(id);
        return viewModelMapperService.convert(entity, SicCs1ViewModel.class);
    }

    public void setSicCs1Entity(SicCs1ViewModel model) {
        SicCs1 entity = entityModelMapperService.convert(model, SicCs1.class);
    }
    /************************* SicCs1 : End *************************/

    /************************* SicCs2 : Begin ***********************/
    public SicCs2ViewModel getSicCs2ViewModel(Integer id) {
        SicCs2 entity = sicCs2Repository.get(id);
        return viewModelMapperService.convert(entity, SicCs2ViewModel.class);
    }

    public void setSicCs2Entity(SicCs2ViewModel model) {
        SicCs2 entity = entityModelMapperService.convert(model, SicCs2.class);
    }
    /************************* SicCs2 : End ***********************/

    /************************* SicCs3 : Begin ***********************/
    public SicCs3ViewModel getSicCs3ViewModel(Integer id) {
        SicCs3 entity = sicCs3Repository.get(id);
        return viewModelMapperService.convert(entity, SicCs3ViewModel.class);
    }

    public void setSicCs3Entity(SicCs3ViewModel model) {
        SicCs3 entity = entityModelMapperService.convert(model, SicCs3.class);
    }
    /************************* SicCs3 : End ***********************/

    /************************* SicCs4 : Begin ***********************/
    public SicCs4ViewModel getSicCs4ViewModel(Integer id) {
        SicCs4 entity = sicCs4Repository.get(id);
        return viewModelMapperService.convert(entity, SicCs4ViewModel.class);
    }

    public void setSicCs4Entity(SicCs4ViewModel model) {
        SicCs4 entity = entityModelMapperService.convert(model, SicCs4.class);
    }
    /************************* SicCs4 : End ***********************/

    /************************* SicCs5 : Begin ***********************/
    public SicCs5ViewModel getSicCs5ViewModel(Integer id) {
        SicCs5 entity = sicCs5Repository.get(id);
        return viewModelMapperService.convert(entity, SicCs5ViewModel.class);
    }

    public void setSicCs5Entity(SicCs5ViewModel model) {
        SicCs5 entity = entityModelMapperService.convert(model, SicCs5.class);
    }
    /************************* SicCs5 : End ***********************/

    /************************* SicCs6 : Begin ***********************/
    public SicCs6ViewModel getSicCs6ViewModel(Integer id) {
        SicCs6 entity = sicCs6Repository.get(id);
        return viewModelMapperService.convert(entity, SicCs6ViewModel.class);
    }

    public void setSicCs6Entity(SicCs6ViewModel model) {
        SicCs6 entity = entityModelMapperService.convert(model, SicCs6.class);
    }
    /************************* SicCs6 : End ***********************/

    /************************* SicCs7 : Begin ***********************/
    public SicCs7ViewModel getSicCs7ViewModel(Integer id) {
        SicCs7 entity = sicCs7Repository.get(id);
        return viewModelMapperService.convert(entity, SicCs7ViewModel.class);
    }

    public void setSicCs7Entity(SicCs7ViewModel model) {
        SicCs7 entity = entityModelMapperService.convert(model, SicCs7.class);
    }
    /************************* SicCs7 : End ***********************/

    /************************* SicCs8 : Begin ***********************/
    public SicCs8ViewModel getSicCs8ViewModel(Integer id) {
        SicCs8 entity = sicCs8Repository.get(id);
        return viewModelMapperService.convert(entity, SicCs8ViewModel.class);
    }

    public void setSicCs8Entity(SicCs8ViewModel model) {
        SicCs8 entity = entityModelMapperService.convert(model, SicCs8.class);
    }
    /************************* SicCs8 : End ***********************/

    /************************* SicCs9 : Begin ***********************/
    public SicCs9ViewModel getSicCs9ViewModel(Integer id) {
        SicCs9 entity = sicCs9Repository.get(id);
        return viewModelMapperService.convert(entity, SicCs9ViewModel.class);
    }

    public void setSicCs9Entity(SicCs9ViewModel model) {
        SicCs9 entity = entityModelMapperService.convert(model, SicCs9.class);
    }
    /************************* SicCs9 : End ***********************/

    /************************* SicCs10 : Begin ***********************/
    public SicCs10ViewModel getSicCs10ViewModel(Integer id) {
        SicCs10 entity = sicCs10Repository.get(id);
        return viewModelMapperService.convert(entity, SicCs10ViewModel.class);
    }

    public void setSicCs10Entity(SicCs10ViewModel model) {
        SicCs10 entity = entityModelMapperService.convert(model, SicCs10.class);
    }
    /************************* SicCs9 : End ***********************/
}