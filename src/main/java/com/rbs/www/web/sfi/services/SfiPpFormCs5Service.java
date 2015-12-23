package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.SfiPpFormCs5;
import com.rbs.www.web.sfi.models.entities.SfiPpFormResearchType;
import com.rbs.www.web.sfi.repositories.SfiPpFormCs5Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SfiPpFormCs5Service {
    @Autowired
    SfiPpFormCs5Repository repository;

    public SfiPpFormCs5 get(Integer id) {
        return repository.get(id);
    }

    public SfiPpFormCs5 createByFormAndResearchType(Integer form, SfiPpFormResearchType researchType) {
        SfiPpFormCs5 entity = new SfiPpFormCs5();
        entity.setForm(form);
        entity.setResearchType(researchType);
        repository.create(entity);

        return entity;
    }

    public SfiPpFormCs5 getByFormAndResearchType(Integer form, Integer researchType) {
        return repository.getByFormAndResearchType(form, researchType);
    }
}