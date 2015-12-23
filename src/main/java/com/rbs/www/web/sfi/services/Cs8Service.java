package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs8;
import com.rbs.www.web.sfi.repositories.Cs8Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Cs8Service {
    @Autowired
    private Cs8Repository repository;

    public Cs8 get(Integer id) {
        return repository.get(id);
    }
}
