package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs4;
import com.rbs.www.web.sic.repositories.SicCs4Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SicCs4Service {
    @Autowired
    private SicCs4Repository repository;

    public SicCs4 get(Integer id) {
        return repository.get(id);
    }
}
