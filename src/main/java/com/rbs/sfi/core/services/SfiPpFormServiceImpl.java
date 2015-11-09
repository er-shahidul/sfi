package com.rbs.sfi.core.services;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.core.entities.SfiPpForm;
import com.rbs.sfi.core.entities.SfiPpFormAllCountry;
import com.rbs.sfi.core.repositories.SfiPpFormAllCountryRepository;
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

    @Autowired
    SfiPpFormAllCountryRepository sfiPpFormAllCountryRepository;

    public SfiPpForm findById(int id) {
        return sfiPpFormRepository.findById(id);
    }

    public SfiPpForm findByCompany(Company company) {
        return sfiPpFormRepository.findByCompany(company);
    }

    public void save(SfiPpForm sfiPpForm){
        sfiPpFormRepository.save(sfiPpForm);
    }

    public SfiPpForm saveCS1(SfiPpForm sfiPpForm){
        SfiPpForm entity = sfiPpFormRepository.findById(sfiPpForm.getId());
        if(entity!=null){
            Util.merge(entity, sfiPpForm);

            entity.setCs1SellsCountries(sfiPpForm.getCs1SellsCountries());
            entity.setCs1SecondaryOperMillsYardsOtherCountries(sfiPpForm.getCs1SecondaryOperMillsYardsOtherCountries());
            entity.setCs1PrimaryOperMillsYardsOtherCountries(sfiPpForm.getCs1PrimaryOperMillsYardsOtherCountries());
            entity.setCs1OwnsMngLandsOtherCountries(sfiPpForm.getCs1OwnsMngLandsOtherCountries());
//            for (SfiPpFormAllCountry sfiPpFormAllCountry : entity.getCs1SellsCountries()) {
//                sfiPpFormAllCountryRepository.merge(sfiPpFormAllCountry);
//            }
//
//            for (SfiPpFormAllCountry sfiPpFormAllCountry : entity.getCs1SellsCountries()) {
//                sfiPpFormAllCountryRepository.merge(sfiPpFormAllCountry);
//            }

            sfiPpFormRepository.save(entity);
        }

        return  entity;
    }
}
