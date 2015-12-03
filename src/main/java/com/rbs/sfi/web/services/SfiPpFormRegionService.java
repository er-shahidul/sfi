package com.rbs.sfi.web.services;

import com.rbs.sfi.web.models.entities.SfiPpFormRegion;
import com.rbs.sfi.web.repositories.SfiPpFormRegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SfiPpFormRegionService {
    @Autowired
    SfiPpFormRegionRepository sfiPpFormRegionRepository;

    public List<SfiPpFormRegion> list() {
        return sfiPpFormRegionRepository.list();
    }

}