package com.rbs.sfi.web.services;

import com.rbs.sfi.web.models.viewmodels.Cs6ViewModel;
import com.rbs.sfi.web.models.viewmodels.SfiPpFormCs6UsCanadaViewModel;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class Cs6Service {
    public void manualPopulation(Cs6ViewModel model) {
        setOutsideCountriesSfiPpForm(model);
    }

    private void setOutsideCountriesSfiPpForm(Cs6ViewModel model) {
        Set<SfiPpFormCs6UsCanadaViewModel> usCanada1 = model.getUsCanada();

        for (SfiPpFormCs6UsCanadaViewModel usCanada : usCanada1) {
            if (usCanada.getSfiPpForm() != null) continue;
            usCanada.setSfiPpForm(model.getId().hashCode());
        }
    }
}
