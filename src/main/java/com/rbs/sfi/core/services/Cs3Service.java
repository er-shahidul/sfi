package com.rbs.sfi.core.services;

import com.rbs.sfi.core.mapper.services.EntityModelConversionService;
import com.rbs.sfi.core.mapper.services.ViewModelConversionService;
import com.rbs.sfi.core.models.entities.Cs3;
import com.rbs.sfi.core.models.viewmodels.Cs3ViewModel;
import com.rbs.sfi.core.repositories.Cs3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Cs3Service {
    @Autowired
    private Cs3Repository cs3Repository;

    @Autowired
    private ViewModelConversionService viewModelConversionService;

    @Autowired
    private EntityModelConversionService entityModelConversionService;

    public Cs3ViewModel getViewModel(Integer id) {
        Cs3 entity = cs3Repository.get(id);
        return viewModelConversionService.convertFromEntityModel(entity, Cs3ViewModel.class);
    }

    public void setEntity(Cs3ViewModel model) {
        Cs3 entity = entityModelConversionService.convertFromViewModel(model, Cs3.class);
    }
}
