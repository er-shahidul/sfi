package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs3;
import com.rbs.www.web.sic.repositories.SicCs3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SicCs3Service {
    @Autowired
    private SicCs3Repository repository;

    public SicCs3 get(Integer id) {
        return repository.get(id);
    }
}
