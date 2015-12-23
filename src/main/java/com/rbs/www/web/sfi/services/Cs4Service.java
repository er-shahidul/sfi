package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs4;
import com.rbs.www.web.sfi.repositories.Cs4Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Cs4Service {
    @Autowired
    private Cs4Repository repository;

    public Cs4 get(Integer id) {
        return repository.get(id);
    }
}
