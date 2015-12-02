package com.rbs.sfi.core.services;

import com.rbs.sfi.core.models.viewmodels.Cs2ViewModel;
import com.rbs.sfi.core.models.viewmodels.SfiPpFormCs2OutsideUsaCaViewModel;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class Cs2Service {
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
