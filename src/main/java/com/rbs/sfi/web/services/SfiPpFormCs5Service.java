package com.rbs.sfi.web.services;

import com.rbs.sfi.web.models.entities.SfiPpFormCs5;
import com.rbs.sfi.web.models.entities.SfiPpFormResearchType;
import com.rbs.sfi.web.repositories.SfiPpFormCs5Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SfiPpFormCs5Service {
    @Autowired
    SfiPpFormCs5Repository sfiPpFormCs5Repository;

    public SfiPpFormCs5 createByFormAndResearchType(Integer form, SfiPpFormResearchType researchType) {
        SfiPpFormCs5 entity = new SfiPpFormCs5();
        entity.setForm(form);
        entity.setResearchType(researchType);
        sfiPpFormCs5Repository.create(entity);

        return entity;
    }

    public SfiPpFormCs5 getByFormAndResearchType(Integer form, Integer researchType) {
        return sfiPpFormCs5Repository.getByFormAndResearchType(form, researchType);
    }
}