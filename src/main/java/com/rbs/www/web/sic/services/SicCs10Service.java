package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs10;
import com.rbs.www.web.sic.repositories.SicCs10Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SicCs10Service {
    @Autowired
    private SicCs10Repository repository;

    public SicCs10 get(Integer id) {
        return repository.get(id);
    }
}
