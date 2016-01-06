package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs9;
import com.rbs.www.web.sic.repositories.SicCs9Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SicCs9Service {
    @Autowired
    private SicCs9Repository repository;

    public SicCs9 get(Integer id) {
        return repository.get(id);
    }
}
