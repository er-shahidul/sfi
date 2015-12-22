package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs9;
import com.rbs.www.web.sfi.repositories.Cs9Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Cs9Service {
    @Autowired
    private Cs9Repository repository;

    public Cs9 get(Integer id) {
        return repository.get(id);
    }
}
