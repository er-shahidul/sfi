package com.rbs.www.admin.services;

import com.rbs.www.admin.models.entities.AreaUnit;
import com.rbs.www.admin.repositories.AreaUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AreaUnitService {
    @Autowired
    private AreaUnitRepository areaUnitRepository;

    public List<AreaUnit> list() {
        return areaUnitRepository.list();
    }

    public AreaUnit findById(Integer id) {
        return areaUnitRepository.getByKey(id);
    }

    public void save(AreaUnit areaUnit) {
        areaUnit.setIsActive(true);
        areaUnitRepository.persist(areaUnit);
    }

    public void softDelete(AreaUnit areaUnit) {
        AreaUnit entity = areaUnitRepository.getByKey(areaUnit.getId());
        if(entity!=null){
            entity.setIsActive(false);
            areaUnitRepository.persist(entity);
        }
    }

    public void update(AreaUnit areaUnit) {
        AreaUnit entity = areaUnitRepository.getByKey(areaUnit.getId());
        if(entity!=null){
            entity.setShortCode(areaUnit.getShortCode());
            entity.setUnitDescription(areaUnit.getUnitDescription());
            areaUnitRepository.persist(entity);
        }
    }
}
