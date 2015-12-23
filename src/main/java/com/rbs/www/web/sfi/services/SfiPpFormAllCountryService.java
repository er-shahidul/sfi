package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.SfiPpFormAllCountry;
import com.rbs.www.web.sfi.repositories.SfiPpFormAllCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SfiPpFormAllCountryService {
    @Autowired
    SfiPpFormAllCountryRepository repository;

    public SfiPpFormAllCountry get(Integer id) {
        return repository.get(id);
    }
    public List<SfiPpFormAllCountry> getAll() {
        return repository.getAll();
    }

    public SfiPpFormAllCountry get(int id) {
        return repository.get(id);
    }
}