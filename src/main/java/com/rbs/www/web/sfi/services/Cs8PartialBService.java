package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs8PartialB;
import com.rbs.www.web.sfi.repositories.Cs8PartialBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Cs8PartialBService {
    @Autowired
    private Cs8PartialBRepository repository;

    public Cs8PartialB get(Integer id) {
        return repository.get(id);
    }
}
