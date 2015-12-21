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
        return areaUnitRepository.findById(id);
    }

    public void save(AreaUnit areaUnit) {
        areaUnitRepository.save(areaUnit);
    }

    public void softDelete(AreaUnit areaUnit) {
        areaUnitRepository.softDelete(areaUnit);
    }

    public void update(AreaUnit areaUnit) {
        areaUnitRepository.update(areaUnit);
    }
}
