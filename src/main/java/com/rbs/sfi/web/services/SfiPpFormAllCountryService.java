package com.rbs.sfi.web.services;

import com.rbs.sfi.web.models.entities.SfiPpFormAllCountry;
import com.rbs.sfi.web.repositories.SfiPpFormAllCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SfiPpFormAllCountryService {
    @Autowired
    SfiPpFormAllCountryRepository sfiPpFormAllCountryRepository;

    public List<SfiPpFormAllCountry> getAll() {
        return sfiPpFormAllCountryRepository.getAll();
    }

    public SfiPpFormAllCountry get(int id) {
        return sfiPpFormAllCountryRepository.get(id);
    }
}