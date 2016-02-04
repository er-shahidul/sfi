package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.UsaCaSelector;
import com.rbs.www.web.sfi.repositories.UsaCaSelectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsaCaSelectorService {
    @Autowired
    private UsaCaSelectorRepository repository;

    public UsaCaSelector get(Integer id) {
        return repository.get(id);
    }
}
