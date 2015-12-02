package com.rbs.sfi.core.services;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.core.models.entities.*;
import com.rbs.sfi.core.repositories.Cs1Repository;
import com.rbs.sfi.core.repositories.SfiPpFormAllCountryRepository;
import com.rbs.sfi.core.repositories.SfiPpFormOtherCountryRepository;
import com.rbs.sfi.core.repositories.SfiPpFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SfiPpFormService {
    @Autowired
    SfiPpFormRepository sfiPpFormRepository;

    @Autowired
    SfiPpFormAllCountryRepository sfiPpFormAllCountryRepository;

    @Autowired
    SfiPpFormOtherCountryRepository sfiPpFormOtherCountryRepository;

    @Autowired
    Cs1Repository cs1Repository;

    public List<SfiPpForm> list() {
        return sfiPpFormRepository.list();
    }

    public SfiPpForm findById(int id) {
        return sfiPpFormRepository.findById(id);
    }

    public SfiPpForm findByCompany(Company company) {
        return sfiPpFormRepository.findByCompany(company);
    }

    public void save(SfiPpForm sfiPpForm){
        sfiPpFormRepository.save(sfiPpForm);
    }
}
