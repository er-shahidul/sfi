package com.rbs.sfi.core.services;

import com.rbs.sfi.core.entities.SfiPpFormAllCountry;
import com.rbs.sfi.core.entities.SfiPpFormOtherCountry;
import com.rbs.sfi.core.repositories.SfiPpFormAllCountryRepository;
import com.rbs.sfi.core.repositories.SfiPpFormOtherCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("sfiPpFormOtherCountryService")
@Transactional
public class SfiPpFormOtherCountryServiceImpl implements SfiPpFormOtherCountryService
{
    @Autowired
    SfiPpFormOtherCountryRepository sfiPpFormOtherCountryRepository;

    public SfiPpFormOtherCountry findById(int id) {
        return sfiPpFormOtherCountryRepository.findById(id);
    }

}