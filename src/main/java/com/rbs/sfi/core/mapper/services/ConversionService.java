package com.rbs.sfi.core.mapper.services;

import com.rbs.sfi.core.models.entities.Cs1;
import com.rbs.sfi.core.models.entities.SfiPpFormAllCountry;
import com.rbs.sfi.core.models.entities.SfiPpFormOtherCountry;
import com.rbs.sfi.core.models.entities.SfiPpFormRegion;
import com.rbs.sfi.core.models.viewmodels.Cs1ViewModel;
import com.rbs.sfi.core.models.viewmodels.SfiPpFormAllCountryViewModel;
import com.rbs.sfi.core.models.viewmodels.SfiPpFormOtherCountryViewModel;
import com.rbs.sfi.core.models.viewmodels.SfiPpFormRegionViewModel;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ConversionService {
    private Integer getInteger(Integer x) {
        if (x == null) return null;
        return new Integer(x);
    }

    private String getString(String x) {
        if (x == null) return null;
        return new String(x);
    }

    private Boolean getBoolean(Boolean x) {
        if (x == null) return null;
        return new Boolean(x);
    }

    public SfiPpFormAllCountryViewModel getSfiPpFormAllCountryViewModel(SfiPpFormAllCountry entity) {
        if (entity == null) return null;
        SfiPpFormAllCountryViewModel model = new SfiPpFormAllCountryViewModel();
        model.setId(getInteger(entity.getId()));
        model.setCountry(getString(entity.getCountry()));
        model.setIsUnknown(getBoolean(entity.isUnknown()));
        return model;
    }

    public SfiPpFormRegionViewModel getSfiPpFormRegionViewModel(SfiPpFormRegion entity) {
        SfiPpFormRegionViewModel model = new SfiPpFormRegionViewModel();
        model.setId(getInteger(entity.getId()));
        model.setName(getString(entity.getName()));
        model.setCountry(getSfiPpFormAllCountryViewModel(entity.getCountry()));
        return model;
    }

    public SfiPpFormOtherCountryViewModel getSfiPpFormOtherCountryViewModel(SfiPpFormOtherCountry entity) {
        SfiPpFormOtherCountryViewModel model = new SfiPpFormOtherCountryViewModel() ;
        model.setId(getInteger(entity.getId()));
        model.setCountry(getString(entity.getCountry()));
        return model;
    }

    public Cs1ViewModel getCs1ViewModel(Cs1 entity) {
        Cs1ViewModel model = new Cs1ViewModel();

        model.setId(getInteger(entity.getId()));
        model.setNumberEmployeesUSA(getInteger(entity.getNumberEmployeesUSA()));
        model.setNumberEmployeesCA(getInteger(entity.getNumberEmployeesCA()));
        model.setNumberEmployeesOther(getInteger(entity.getNumberEmployeesOther()));

        model.setCompanyWebsite(getString(entity.getCompanyWebsite()));
        model.setCompanyDesc(getString(entity.getCompanyDesc()));

        model.setOwnsMngLands(getBoolean(entity.isOwnsMngLands()));
        model.setOwnsMngLandsInUSA(getBoolean(entity.isOwnsMngLandsInUSA()));
        model.setOwnsMngLandsInCA(getBoolean(entity.isOwnsMngLandsInCA()));
        model.setOwnsMngLandsInOther(getBoolean(entity.isOwnsMngLandsInOther()));
        model.setHasPrimaryOperMillsYards(getBoolean(entity.isHasPrimaryOperMillsYards()));
        model.setHasPrimaryOperMillsYardsInUSA(getBoolean(entity.isHasPrimaryOperMillsYardsInUSA()));
        model.setHasPrimaryOperMillsYardsInCA(getBoolean(entity.isHasPrimaryOperMillsYardsInCA()));
        model.setHasPrimaryOperMillsYardsInOther(getBoolean(entity.isHasPrimaryOperMillsYardsInOther()));
        model.setHasSecondaryOperMillsYards(getBoolean(entity.isHasSecondaryOperMillsYards()));
        model.setHasSecondaryOperMillsYardsInUSA(getBoolean(entity.isHasSecondaryOperMillsYardsInUSA()));
        model.setHasSecondaryOperMillsYardsInCA(getBoolean(entity.isHasSecondaryOperMillsYardsInCA()));
        model.setHasSecondaryOperMillsYardsInOther(getBoolean(entity.isHasSecondaryOperMillsYardsInOther()));
        return model;
    }
}
