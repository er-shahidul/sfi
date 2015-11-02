package com.rbs.sfi.core.services;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.core.entities.SfiPpForm;
import com.rbs.sfi.core.repositories.SfiPpFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("sfiPpFormService")
@Transactional
public class SfiPpFormServiceImpl implements SfiPpFormService
{
    @Autowired
    SfiPpFormRepository sfiPpFormRepository;

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
