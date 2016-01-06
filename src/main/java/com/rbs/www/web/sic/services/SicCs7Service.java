package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs7;
import com.rbs.www.web.sic.repositories.SicCs7Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SicCs7Service {
    @Autowired
    private SicCs7Repository repository;

    public SicCs7 get(Integer id) {
        return repository.get(id);
    }
}
