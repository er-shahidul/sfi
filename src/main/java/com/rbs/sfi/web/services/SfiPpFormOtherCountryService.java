package com.rbs.sfi.web.services;

import com.rbs.sfi.web.models.entities.SfiPpFormOtherCountry;
import com.rbs.sfi.web.repositories.SfiPpFormOtherCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SfiPpFormOtherCountryService {
    @Autowired
    SfiPpFormOtherCountryRepository sfiPpFormOtherCountryRepository;

    public SfiPpFormOtherCountry findById(int id) {
        return sfiPpFormOtherCountryRepository.findById(id);
    }

}