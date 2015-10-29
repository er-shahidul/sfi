package com.rbs.sfi.core.repositories;

import com.rbs.sfi.core.entities.AreaUnit;

import java.util.List;

public interface AreaUnitRepository
{
    List<AreaUnit> list();
    AreaUnit findById(int id);
    void save(AreaUnit areaUnit);
    void update(AreaUnit areaUnit);
}
