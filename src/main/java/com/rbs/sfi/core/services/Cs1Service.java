package com.rbs.sfi.core.services;

import com.rbs.sfi.core.mapper.services.EntityModelConversionService;
import com.rbs.sfi.core.mapper.services.ViewModelConversionService;
import com.rbs.sfi.core.models.entities.Cs1;
import com.rbs.sfi.core.models.entities.SfiPpFormAllCountry;
import com.rbs.sfi.core.models.entities.SfiPpFormOtherCountry;
import com.rbs.sfi.core.models.viewmodels.Cs1ViewModel;
import com.rbs.sfi.core.repositories.Cs1Repository;
import com.rbs.sfi.core.repositories.SfiPpFormAllCountryRepository;
import com.rbs.sfi.core.repositories.SfiPpFormOtherCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class Cs1Service {
    @Autowired
    private Cs1Repository cs1Repository;

    @Autowired
    private ViewModelConversionService viewModelConversionService;

    @Autowired
    private EntityModelConversionService entityModelConversionService;

    @Autowired
	private SfiPpFormAllCountryRepository sfiPpFormAllCountryRepository;

    @Autowired
    private SfiPpFormOtherCountryRepository sfiPpFormOtherCountryRepository;

    public Cs1ViewModel getViewModel(Integer id) {
        Cs1 entity = cs1Repository.get(id);
        return viewModelConversionService.convertFromEntityModel(entity, Cs1ViewModel.class);
    }

    public void setEntity(Cs1ViewModel model) {
        Cs1 entity = entityModelConversionService.convertFromViewModel(model, Cs1.class);
    }

    /*
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
        addOwnsMngLandsOtherCountries(entity, model.getOwnsMngLandsOtherCountries());
        addPrimaryOperMillsYardsOtherCountries(entity, model.getPrimaryOperMillsYardsOtherCountries());
        addSecondaryOperMillsYardsOtherCountries(entity, model.getSecondaryOperMillsYardsOtherCountries());
        addSellsCountries(entity, model.getSellsCountries());

        repository.save(entity);
    }
    */

    private void addSecondaryOperMillsYardsOtherCountries(Cs1 entity, Set<SfiPpFormOtherCountry> secondaryOperMillsYardsOtherCountries) {
        Set<SfiPpFormOtherCountry> cs1secondaryOperMillsYardsOtherCountries = entity.getSecondaryOperMillsYardsOtherCountries();
        cs1secondaryOperMillsYardsOtherCountries.clear();

        for (SfiPpFormOtherCountry sfiPpFormOtherCountry : secondaryOperMillsYardsOtherCountries) {
			cs1secondaryOperMillsYardsOtherCountries.add(sfiPpFormOtherCountryRepository.findById(sfiPpFormOtherCountry.getId()));
		}
        entity.setSecondaryOperMillsYardsOtherCountries(cs1secondaryOperMillsYardsOtherCountries);
    }

    private void addPrimaryOperMillsYardsOtherCountries(Cs1 entity, Set<SfiPpFormOtherCountry> primaryOperMillsYardsOtherCountries) {
        Set<SfiPpFormOtherCountry> cs1primaryOperMillsYardsOtherCountries = entity.getPrimaryOperMillsYardsOtherCountries();
        cs1primaryOperMillsYardsOtherCountries.clear();

        for (SfiPpFormOtherCountry sfiPpFormOtherCountry : primaryOperMillsYardsOtherCountries) {
			cs1primaryOperMillsYardsOtherCountries.add(sfiPpFormOtherCountryRepository.findById(sfiPpFormOtherCountry.getId()));
		}
        entity.setPrimaryOperMillsYardsOtherCountries(cs1primaryOperMillsYardsOtherCountries);
    }

    private void addOwnsMngLandsOtherCountries(Cs1 entity, Set<SfiPpFormOtherCountry> ownsMngLandsOtherCountries) {
        Set<SfiPpFormOtherCountry> cs1ownsMngLandsOtherCountries = entity.getOwnsMngLandsOtherCountries();
        cs1ownsMngLandsOtherCountries.clear();

        for (SfiPpFormOtherCountry sfiPpFormOtherCountry : ownsMngLandsOtherCountries) {
			cs1ownsMngLandsOtherCountries.add(sfiPpFormOtherCountryRepository.findById(sfiPpFormOtherCountry.getId()));
		}
        entity.setOwnsMngLandsOtherCountries(cs1ownsMngLandsOtherCountries);
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
