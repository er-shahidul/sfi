package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.SfiPpFormOtherCountry;
import com.rbs.www.web.sfi.repositories.SfiPpFormOtherCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SfiPpFormOtherCountryService {
    @Autowired
    private SfiPpFormOtherCountryRepository repository;

    public SfiPpFormOtherCountry get(Integer id) {
        return repository.get(id);
    }
}