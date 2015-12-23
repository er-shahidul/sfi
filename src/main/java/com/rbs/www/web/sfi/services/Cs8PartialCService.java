package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs8PartialC;
import com.rbs.www.web.sfi.repositories.Cs8PartialCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Cs8PartialCService {
    @Autowired
    private Cs8PartialCRepository repository;

    public Cs8PartialC get(Integer id) {
        return repository.get(id);
    }
}
