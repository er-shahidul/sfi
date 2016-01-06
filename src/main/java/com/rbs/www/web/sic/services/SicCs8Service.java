package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs8;
import com.rbs.www.web.sic.repositories.SicCs8Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SicCs8Service {
    @Autowired
    private SicCs8Repository repository;

    public SicCs8 get(Integer id) {
        return repository.get(id);
    }
}
