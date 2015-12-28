package com.rbs.www.admin.services;

import com.rbs.www.admin.models.entities.AreaUnit;
import com.rbs.www.admin.models.viewmodels.AreaUnitViewModel;
import com.rbs.www.admin.repositories.AreaUnitRepository;
import com.rbs.www.common.mapper.EntityModelMapperService;
import com.rbs.www.common.mapper.ViewModelMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AreaUnitService {
    @Autowired
    private AreaUnitRepository areaUnitRepository;

    @Autowired
    private ViewModelMapperService viewModelMapperService;

    @Autowired
    private EntityModelMapperService entityModelMapperService;

    public List<AreaUnitViewModel> list() {
        return areaUnitRepository.list();
    }

    public AreaUnitViewModel getViewModel(AreaUnit entity) {
        return viewModelMapperService.convert(entity, AreaUnitViewModel.class);
    }

    public AreaUnitViewModel getViewModelById(Integer id) {
        AreaUnit entity = areaUnitRepository.getByKey(id);
        return viewModelMapperService.convert(entity, AreaUnitViewModel.class);
    }

    public void setAreaUnitEntity(AreaUnitViewModel model) {
        model.setIsActive(true);
        AreaUnit entity = entityModelMapperService.convert(model, AreaUnit.class);
    }

    public void deleteAreaUnitEntity(AreaUnitViewModel model) {
        model.setIsActive(false);
        AreaUnit entity = entityModelMapperService.convert(model, AreaUnit.class);
    }
}
