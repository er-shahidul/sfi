package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs2;
import com.rbs.www.web.sfi.models.viewmodels.Cs2ViewModel;
import com.rbs.www.web.sfi.models.viewmodels.SfiPpFormCs2OutsideUsaCaViewModel;
import com.rbs.www.web.sfi.repositories.Cs2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class Cs2Service {
    @Autowired
    private Cs2Repository repository;

    public Cs2 get(Integer id) {
        return repository.get(id);
    }

    public void manualPopulation(Cs2ViewModel model) {
        setOutsideCountriesSfiPpForm(model);
    }

    private void setOutsideCountriesSfiPpForm(Cs2ViewModel model) {
        Set<SfiPpFormCs2OutsideUsaCaViewModel> outsideCountries = model.getOutsideCountries();

        for (SfiPpFormCs2OutsideUsaCaViewModel outsideCountry : outsideCountries) {
            if (outsideCountry.getSfiPpForm() != null) continue;
            outsideCountry.setSfiPpForm(model.getId().hashCode());
        }
    }
}
