package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs2;
import com.rbs.www.web.sic.repositories.SicCs2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SicCs2Service {
    @Autowired
    private SicCs2Repository repository;

    public SicCs2 get(Integer id) {
        return repository.get(id);
    }
}
