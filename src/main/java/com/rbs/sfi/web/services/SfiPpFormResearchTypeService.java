package com.rbs.sfi.web.services;

import com.rbs.sfi.web.models.entities.SfiPpFormResearchType;
import com.rbs.sfi.web.repositories.SfiPpFormResearchTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SfiPpFormResearchTypeService {
    @Autowired
    private SfiPpFormResearchTypeRepository repository;

    public List<SfiPpFormResearchType> getAll() {
        return repository.getAll();
    }
}
