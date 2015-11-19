package com.rbs.sfi.core.services;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.core.entities.*;
import com.rbs.sfi.core.repositories.SfiPpFormAllCountryRepository;
//import com.rbs.sfi.core.repositories.SfiPpFormCs3Repository;
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
public class SfiPpFormServiceImpl implements SfiPpFormService
{
    @Autowired
    SfiPpFormRepository sfiPpFormRepository;

//    @Autowired
//    SfiPpFormCs3Repository sfiPpFormCs3Repository;

    @Autowired
    SfiPpFormAllCountryRepository sfiPpFormAllCountryRepository;

    @Autowired
    SfiPpFormOtherCountryRepository sfiPpFormOtherCountryRepository;

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

            rePopulateCs1SellsCountries(entity);
            rePopulateOtherCountry(entity);
            rePopulateOtherCountry1(entity);
            rePopulateOtherCountry2(entity);
//
//            for (SfiPpFormAllCountry sfiPpFormAllCountry : entity.getCs1SellsCountries()) {
//                sfiPpFormAllCountryRepository.merge(sfiPpFormAllCountry);
//            }

            sfiPpFormRepository.save(entity);
        }

        return  entity;
    }

    private void rePopulateCs1SellsCountries(SfiPpForm entity) {
        Set<SfiPpFormAllCountry> cs1SellsCountries = new HashSet<SfiPpFormAllCountry>();

        for (SfiPpFormAllCountry sfiPpFormAllCountry : entity.getCs1SellsCountries()) {
            cs1SellsCountries.add(sfiPpFormAllCountryRepository.findById(sfiPpFormAllCountry.getId()));
        }

        entity.setCs1SellsCountries(cs1SellsCountries);
    }

    private void rePopulateOtherCountry(SfiPpForm entity) {
        Set<SfiPpFormOtherCountry> cs1SellsCountries = new HashSet<SfiPpFormOtherCountry>();

        for (SfiPpFormOtherCountry sfiPpFormAllCountry : entity.getCs1SecondaryOperMillsYardsOtherCountries()) {
            cs1SellsCountries.add(sfiPpFormOtherCountryRepository.findById(sfiPpFormAllCountry.getId()));
        }

        entity.setCs1SecondaryOperMillsYardsOtherCountries(cs1SellsCountries);
    }

    private void rePopulateOtherCountry1(SfiPpForm entity) {
        Set<SfiPpFormOtherCountry> cs1SellsCountries = new HashSet<SfiPpFormOtherCountry>();

        for (SfiPpFormOtherCountry sfiPpFormAllCountry : entity.getCs1PrimaryOperMillsYardsOtherCountries()) {
            cs1SellsCountries.add(sfiPpFormOtherCountryRepository.findById(sfiPpFormAllCountry.getId()));
        }

        entity.setCs1PrimaryOperMillsYardsOtherCountries(cs1SellsCountries);
    }

    private void rePopulateOtherCountry2(SfiPpForm entity) {
        Set<SfiPpFormOtherCountry> cs1SellsCountries = new HashSet<SfiPpFormOtherCountry>();

        for (SfiPpFormOtherCountry sfiPpFormAllCountry : entity.getCs1OwnsMngLandsOtherCountries()) {
            cs1SellsCountries.add(sfiPpFormOtherCountryRepository.findById(sfiPpFormAllCountry.getId()));
        }

        entity.setCs1OwnsMngLandsOtherCountries(cs1SellsCountries);
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

//    private void rePopulateCs3Projects(SfiPpForm entity) {
//        Set<SfiPpFormCs3> sfiPpFormCs3 = new HashSet<SfiPpFormCs3>();
//
//        for (SfiPpFormCs3 sfiPpFormCs3Loop : entity.getCs3Projects()) {
//            sfiPpFormCs3.add(sfiPpFormCs3Repository.findById(sfiPpFormCs3Loop.getId()));
////            rePopulateCs3ProjectLocations(entity);
////            rePopulateCs3SupportDocs(entity);
//        }
//
//        entity.setCs3Projects(sfiPpFormCs3);
//    }

//    private void rePopulateCs3ProjectLocations(SfiPpFormRegion entity) {
//        Set<SfiPpFormOtherCountry> cs1SellsCountries = new HashSet<SfiPpFormOtherCountry>();
//
//        for (SfiPpFormOtherCountry sfiPpFormAllCountry : entity.getCs1PrimaryOperMillsYardsOtherCountries()) {
//            cs1SellsCountries.add(sfiPpFormOtherCountryRepository.findById(sfiPpFormAllCountry.getId()));
//        }
//
//        entity.setCs1PrimaryOperMillsYardsOtherCountries(cs1SellsCountries);
//    }

//    private void rePopulateCs3SupportDocs(SfiPpForm entity) {
//        Set<SfiPpFormOtherCountry> cs1SellsCountries = new HashSet<SfiPpFormOtherCountry>();
//
//        for (SfiPpFormOtherCountry sfiPpFormAllCountry : entity.getCs1OwnsMngLandsOtherCountries()) {
//            cs1SellsCountries.add(sfiPpFormOtherCountryRepository.findById(sfiPpFormAllCountry.getId()));
//        }
//
//        entity.setCs1OwnsMngLandsOtherCountries(cs1SellsCountries);
//    }
}
