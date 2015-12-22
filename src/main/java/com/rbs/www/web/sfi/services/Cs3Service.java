package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs3;
import com.rbs.www.web.sfi.repositories.Cs3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Cs3Service {
    @Autowired
    private Cs3Repository repository;

    public Cs3 get(Integer id) {
        return repository.get(id);
    }
}
