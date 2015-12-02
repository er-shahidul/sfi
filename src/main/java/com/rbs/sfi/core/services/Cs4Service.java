package com.rbs.sfi.core.services;

import com.rbs.sfi.core.mapper.services.EntityModelConversionService;
import com.rbs.sfi.core.mapper.services.ViewModelConversionService;
import com.rbs.sfi.core.models.entities.Cs4;
import com.rbs.sfi.core.models.viewmodels.Cs4ViewModel;
import com.rbs.sfi.core.repositories.Cs4Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Cs4Service {
    @Autowired
    private Cs4Repository cs4Repository;

    @Autowired
    private ViewModelConversionService viewModelConversionService;

    @Autowired
    private EntityModelConversionService entityModelConversionService;

    public Cs4ViewModel getViewModel(Integer id) {
        Cs4 entity = cs4Repository.get(id);
        return viewModelConversionService.convertFromEntityModel(entity, Cs4ViewModel.class);
    }

    public void setEntity(Cs4ViewModel model) {
        Cs4 entity = entityModelConversionService.convertFromViewModel(model, Cs4.class);
    }
}
