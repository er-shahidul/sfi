package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs5;
import com.rbs.www.web.sic.repositories.SicCs5Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SicCs5Service {
    @Autowired
    private SicCs5Repository repository;

    public SicCs5 get(Integer id) {
        return repository.get(id);
    }
}
