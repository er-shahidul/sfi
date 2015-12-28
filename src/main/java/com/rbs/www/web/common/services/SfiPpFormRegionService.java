package com.rbs.www.web.common.services;

import com.rbs.www.web.common.models.entities.SfiPpFormRegion;
import com.rbs.www.web.common.repositories.SfiPpFormRegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SfiPpFormRegionService {
    @Autowired
    SfiPpFormRegionRepository repository;

    public SfiPpFormRegion get(Integer id) {
        return repository.get(id);
    }

    public List<SfiPpFormRegion> getAll() {
        return repository.getAll();
    }
}