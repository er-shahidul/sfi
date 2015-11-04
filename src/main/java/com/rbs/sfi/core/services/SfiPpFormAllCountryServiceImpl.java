package com.rbs.sfi.core.services;

import com.rbs.sfi.core.entities.SfiPpFormAllCountry;
import com.rbs.sfi.core.repositories.SfiPpFormAllCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("sfiPpFormAllCountryService")
@Transactional
public class SfiPpFormAllCountryServiceImpl implements SfiPpFormAllCountryService
{
    @Autowired
    SfiPpFormAllCountryRepository sfiPpFormAllCountryRepository;

    public List<SfiPpFormAllCountry> list() {
        return sfiPpFormAllCountryRepository.list();
    }

}