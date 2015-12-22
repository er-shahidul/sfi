package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.SfiPpFormResearchType;
import com.rbs.www.web.sfi.repositories.SfiPpFormResearchTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SfiPpFormResearchTypeService {
    @Autowired
    private SfiPpFormResearchTypeRepository repository;

    public SfiPpFormResearchType get(Integer id) {
        return repository.get(id);
    }

    public List<SfiPpFormResearchType> getAll() {
        return repository.getAll();
    }
}
