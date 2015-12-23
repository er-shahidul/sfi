package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs1;
import com.rbs.www.web.sfi.repositories.Cs1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Cs1Service {
    @Autowired
    private Cs1Repository repository;

    public Cs1 get(Integer id) {
        return repository.get(id);
    }
}
