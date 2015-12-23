package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs7;
import com.rbs.www.web.sfi.repositories.Cs7Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Cs7Service {
    @Autowired
    private Cs7Repository repository;

    public Cs7 get(Integer id) {
        return repository.get(id);
    }
 }
