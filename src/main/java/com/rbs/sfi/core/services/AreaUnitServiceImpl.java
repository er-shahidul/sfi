package com.rbs.sfi.core.services;

import com.rbs.sfi.core.entities.AreaUnit;
import com.rbs.sfi.core.repositories.AreaUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("areaUnitService")
@Transactional
public class AreaUnitServiceImpl implements AreaUnitService
{
    @Autowired
    AreaUnitRepository areaUnitRepository;

    public List<AreaUnit> list() {
        return areaUnitRepository.list();
    }

    public void save(AreaUnit areaUnit){
        areaUnitRepository.save(areaUnit);
    }

    public AreaUnit findById(int id) {
        return areaUnitRepository.findById(id);
    }

    public void update(AreaUnit areaUnit) {
        AreaUnit entity = areaUnitRepository.findById(areaUnit.getId());
        if(entity!=null){
            areaUnitRepository.update(entity);
        }
    }
}
