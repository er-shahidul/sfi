package com.rbs.sfi.core.services;

import com.rbs.sfi.common.services.AutoPopulateService;
import com.rbs.sfi.core.models.entities.Cs1;
import com.rbs.sfi.core.models.entities.SfiPpFormAllCountry;
import com.rbs.sfi.core.models.viewmodels.Cs1ViewModel;
import com.rbs.sfi.core.repositories.Cs1Repository;
import com.rbs.sfi.core.repositories.SfiPpFormAllCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class Cs1Service {
    @Autowired
    private Cs1Repository repository;

    @Autowired
    private AutoPopulateService populateService;

    @Autowired
	private SfiPpFormAllCountryRepository sfiPpFormAllCountryRepository;

    public Cs1ViewModel getViewModel(int id) {
        Cs1 entity = repository.findById(id);
        Cs1ViewModel model = new Cs1ViewModel();

        populateService.populate(entity, model);
        return model;
    }

    /*
    public void setEntity(Cs1ViewModel model) {
        Cs1 entity = repository.get(model.getId());
        populateService.populate(model, entity);
    }

    public Cs1ViewModel getViewModel(int id) {
        Cs1 entity = repository.get(id);
        Cs1ViewModel model = new Cs1ViewModel();

        model.setId(entity.getId());
        model.setCompanyWebsite(entity.getCompanyWebsite());
		model.setNumberEmployeesUSA(entity.getNumberEmployeesUSA());
        model.setNumberEmployeesCA(entity.getNumberEmployeesCA());
        model.setNumberEmployeesOther(entity.getNumberEmployeesOther());
        model.setCompanyDesc(entity.getCompanyDesc());
        model.setOwnsMngLands(entity.isOwnsMngLands());
        model.setOwnsMngLandsInUSA(entity.isOwnsMngLandsInUSA());
        model.setOwnsMngLandsInCA(entity.isOwnsMngLandsInCA());
        model.setOwnsMngLandsInOther(entity.isOwnsMngLandsInOther());
        model.setHasPrimaryOperMillsYards(entity.isHasPrimaryOperMillsYards());
        model.setHasPrimaryOperMillsYardsInUSA(entity.isHasPrimaryOperMillsYardsInUSA());
        model.setHasPrimaryOperMillsYardsInCA(entity.isHasPrimaryOperMillsYardsInCA());
        model.setHasPrimaryOperMillsYardsInOther(entity.isHasPrimaryOperMillsYardsInOther());
        model.setHasSecondaryOperMillsYards(entity.isHasSecondaryOperMillsYards());
        model.setHasSecondaryOperMillsYardsInUSA(entity.isHasSecondaryOperMillsYardsInUSA());
        model.setHasSecondaryOperMillsYardsInCA(entity.isHasSecondaryOperMillsYardsInCA());
        model.setHasSecondaryOperMillsYardsInOther(entity.isHasSecondaryOperMillsYardsInOther());
        model.setOwnsMngLandsOtherCountries(entity.getOwnsMngLandsOtherCountries());
        model.setPrimaryOperMillsYardsOtherCountries(entity.getPrimaryOperMillsYardsOtherCountries());
        model.setSecondaryOperMillsYardsOtherCountries(entity.getSecondaryOperMillsYardsOtherCountries());
        model.setSellsCountries(entity.getSellsCountries());

        return model;
    }
*/

    public void setEntity(Cs1ViewModel model) {
        Cs1 entity = repository.findById(model.getId());

        entity.setCompanyWebsite(model.getCompanyWebsite());
        entity.setNumberEmployeesUSA(model.getNumberEmployeesUSA());
        entity.setNumberEmployeesCA(model.getNumberEmployeesCA());
        entity.setNumberEmployeesOther(model.getNumberEmployeesOther());
        entity.setCompanyDesc(model.getCompanyDesc());
        entity.setOwnsMngLands(model.getOwnsMngLands());
        entity.setOwnsMngLandsInUSA(model.getOwnsMngLandsInUSA());
        entity.setOwnsMngLandsInCA(model.getOwnsMngLandsInCA());
        entity.setOwnsMngLandsInOther(model.getOwnsMngLandsInOther());
        entity.setHasPrimaryOperMillsYards(model.getHasPrimaryOperMillsYards());
        entity.setHasPrimaryOperMillsYardsInUSA(model.getHasPrimaryOperMillsYardsInUSA());
        entity.setHasPrimaryOperMillsYardsInCA(model.getHasPrimaryOperMillsYardsInCA());
        entity.setHasPrimaryOperMillsYardsInOther(model.getHasPrimaryOperMillsYardsInOther());
        entity.setHasSecondaryOperMillsYards(model.getHasSecondaryOperMillsYards());
        entity.setHasSecondaryOperMillsYardsInUSA(model.getHasSecondaryOperMillsYardsInUSA());
        entity.setHasSecondaryOperMillsYardsInCA(model.getHasSecondaryOperMillsYardsInCA());
        entity.setHasSecondaryOperMillsYardsInOther(model.getHasSecondaryOperMillsYardsInOther());
//        entity.setOwnsMngLandsOtherCountries(model.getOwnsMngLandsOtherCountries());
//        entity.setPrimaryOperMillsYardsOtherCountries(model.getPrimaryOperMillsYardsOtherCountries());
//        entity.setSecondaryOperMillsYardsOtherCountries(model.getSecondaryOperMillsYardsOtherCountries());
//        entity.setSellsCountries(model.getSellsCountries());
        addSellsCountries(entity, model.getSellsCountries());

        repository.save(entity);
    }

    public void addSellsCountries(Cs1 entity, Set<SfiPpFormAllCountry> sellsCountries) {
        Set<SfiPpFormAllCountry> cs1SellsCountries = entity.getSellsCountries();
        cs1SellsCountries.clear();

        for (SfiPpFormAllCountry sfiPpFormAllCountry : sellsCountries) {
			cs1SellsCountries.add(sfiPpFormAllCountryRepository.findById(sfiPpFormAllCountry.getId()));
		}
        entity.setSellsCountries(cs1SellsCountries);
	}
}
