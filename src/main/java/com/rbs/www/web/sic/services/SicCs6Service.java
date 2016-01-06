package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs6;
import com.rbs.www.web.sic.repositories.SicCs6Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SicCs6Service {
    @Autowired
    private SicCs6Repository repository;

    public SicCs6 get(Integer id) {
        return repository.get(id);
    }
}
