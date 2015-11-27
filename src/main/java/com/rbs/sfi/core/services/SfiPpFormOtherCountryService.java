package com.rbs.sfi.core.services;

import com.rbs.sfi.core.models.entities.SfiPpFormOtherCountry;
import com.rbs.sfi.core.repositories.SfiPpFormOtherCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("sfiPpFormOtherCountryService")
@Transactional
public class SfiPpFormOtherCountryService
{
    @Autowired
    SfiPpFormOtherCountryRepository sfiPpFormOtherCountryRepository;

    public SfiPpFormOtherCountry findById(int id) {
        return sfiPpFormOtherCountryRepository.findById(id);
    }

}