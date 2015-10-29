package com.rbs.sfi.core.services;

import com.rbs.sfi.core.entities.AreaUnit;

import java.util.List;

public interface AreaUnitService
{
    List<AreaUnit> list();
    void save(AreaUnit areaUnit);
    AreaUnit findById(int id);
    void update(AreaUnit areaUnit);
}
