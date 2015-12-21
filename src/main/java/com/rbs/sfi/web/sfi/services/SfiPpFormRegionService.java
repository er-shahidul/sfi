package com.rbs.sfi.web.sfi.services;

import com.rbs.sfi.web.sfi.models.entities.SfiPpFormRegion;
import com.rbs.sfi.web.sfi.repositories.SfiPpFormRegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SfiPpFormRegionService {
    @Autowired
    SfiPpFormRegionRepository repository;

    public List<SfiPpFormRegion> getAll() {
        return repository.getAll();
    }
}