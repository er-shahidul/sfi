package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs10;
import com.rbs.www.web.sfi.repositories.Cs10Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Cs10Service {
    @Autowired
    private Cs10Repository repository;

    public Cs10 get(Integer id) {
        return repository.get(id);
    }
}
