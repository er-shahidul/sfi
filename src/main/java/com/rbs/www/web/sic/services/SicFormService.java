package com.rbs.www.web.sic.services;

import com.rbs.www.web.common.mapper.EntityModelMapperService;
import com.rbs.www.web.common.mapper.ViewModelMapperService;
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
    private SicCs1Service sicCs1Service;

    @Autowired
    private SicCs2Service sicCs2Service;

    @Autowired
    private SicCs3Service sicCs3Service;

    @Autowired
    private SicCs4Service sicCs4Service;

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
}