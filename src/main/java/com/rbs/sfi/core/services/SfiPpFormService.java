package com.rbs.sfi.core.services;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.core.entities.*;
import com.rbs.sfi.core.repositories.Cs1Repository;
import com.rbs.sfi.core.repositories.SfiPpFormAllCountryRepository;
import com.rbs.sfi.core.repositories.SfiPpFormOtherCountryRepository;
import com.rbs.sfi.core.repositories.SfiPpFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("sfiPpFormService")
@Transactional
public class SfiPpFormService
{
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

    public SfiPpForm saveCS1(SfiPpForm sfiPpForm){
        SfiPpForm entity = sfiPpFormRepository.findById(sfiPpForm.getId());
        if(entity!=null){
            Util.merge(entity, sfiPpForm);

            rePopulateCs1SellsCountries(entity.getId());
            rePopulateOtherCountry(entity.getId());
            rePopulateOtherCountry1(entity.getId());
            rePopulateOtherCountry2(entity.getId());
//
//            for (SfiPpFormAllCountry sfiPpFormAllCountry : entity.getCs1SellsCountries()) {
//                sfiPpFormAllCountryRepository.merge(sfiPpFormAllCountry);
//            }

            sfiPpFormRepository.save(entity);
        }

        return  entity;
    }

    private void rePopulateCs1SellsCountries(int id) {
        Cs1 entity = cs1Repository.findById(id);

        Set<SfiPpFormAllCountry> cs1SellsCountries = new HashSet<SfiPpFormAllCountry>();

        for (SfiPpFormAllCountry sfiPpFormAllCountry : entity.getCs1SellsCountries()) {
            cs1SellsCountries.add(sfiPpFormAllCountryRepository.findById(sfiPpFormAllCountry.getId()));
        }

        entity.setCs1SellsCountries(cs1SellsCountries);
        cs1Repository.save(entity);
    }

    private void rePopulateOtherCountry(int id) {
        Cs1 entity = cs1Repository.findById(id);

        Set<SfiPpFormOtherCountry> cs1SellsCountries = new HashSet<SfiPpFormOtherCountry>();

        for (SfiPpFormOtherCountry sfiPpFormAllCountry : entity.getCs1SecondaryOperMillsYardsOtherCountries()) {
            cs1SellsCountries.add(sfiPpFormOtherCountryRepository.findById(sfiPpFormAllCountry.getId()));
        }

        entity.setCs1SecondaryOperMillsYardsOtherCountries(cs1SellsCountries);
        cs1Repository.save(entity);
    }

    private void rePopulateOtherCountry1(int id) {
        Cs1 entity = cs1Repository.findById(id);

        Set<SfiPpFormOtherCountry> cs1SellsCountries = new HashSet<SfiPpFormOtherCountry>();

        for (SfiPpFormOtherCountry sfiPpFormAllCountry : entity.getCs1PrimaryOperMillsYardsOtherCountries()) {
            cs1SellsCountries.add(sfiPpFormOtherCountryRepository.findById(sfiPpFormAllCountry.getId()));
        }

        entity.setCs1PrimaryOperMillsYardsOtherCountries(cs1SellsCountries);
        cs1Repository.save(entity);
    }

    private void rePopulateOtherCountry2(int id) {
        Cs1 entity = cs1Repository.findById(id);

        Set<SfiPpFormOtherCountry> cs1SellsCountries = new HashSet<SfiPpFormOtherCountry>();

        for (SfiPpFormOtherCountry sfiPpFormAllCountry : entity.getCs1OwnsMngLandsOtherCountries()) {
            cs1SellsCountries.add(sfiPpFormOtherCountryRepository.findById(sfiPpFormAllCountry.getId()));
        }

        entity.setCs1OwnsMngLandsOtherCountries(cs1SellsCountries);
        cs1Repository.save(entity);
    }

    public SfiPpForm saveCS2(SfiPpForm sfiPpForm){
        SfiPpForm entity = sfiPpFormRepository.findById(sfiPpForm.getId());
        if(entity!=null){
            Util.merge(entity, sfiPpForm);

//            rePopulateCs3Projects(entity);

            sfiPpFormRepository.save(entity);
        }

        return entity;
    }

}
