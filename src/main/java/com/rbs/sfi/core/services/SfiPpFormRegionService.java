package com.rbs.sfi.core.services;

import com.rbs.sfi.core.models.entities.SfiPpFormRegion;
import com.rbs.sfi.core.repositories.SfiPpFormRegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("sfiPpFormRegionService")
@Transactional
public class SfiPpFormRegionService
{
    @Autowired
    SfiPpFormRegionRepository sfiPpFormRegionRepository;

    public List<SfiPpFormRegion> list() {
        return sfiPpFormRegionRepository.list();
    }

}