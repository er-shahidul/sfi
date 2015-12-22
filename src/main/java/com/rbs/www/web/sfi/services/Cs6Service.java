package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs6;
import com.rbs.www.web.sfi.models.viewmodels.Cs6ViewModel;
import com.rbs.www.web.sfi.models.viewmodels.SfiPpFormCs6OtherViewModel;
import com.rbs.www.web.sfi.models.viewmodels.SfiPpFormCs6UsCanadaViewModel;
import com.rbs.www.web.sfi.repositories.Cs6Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class Cs6Service {
    @Autowired
    private Cs6Repository repository;

    public Cs6 get(Integer id) {
        return repository.get(id);
    }

    public void manualPopulation(Cs6ViewModel model) {
        setUsCanadaSfiPpForm(model);
        setUsOthersSfiPpForm(model);
    }

    private void setUsCanadaSfiPpForm(Cs6ViewModel model) {
        Set<SfiPpFormCs6UsCanadaViewModel> usCanadaSet = model.getUsCanada();

        for (SfiPpFormCs6UsCanadaViewModel usCanada : usCanadaSet) {
            if (usCanada.getSfiPpForm() != null) continue;
            usCanada.setSfiPpForm(model.getId().hashCode());
        }
    }

    private void setUsOthersSfiPpForm(Cs6ViewModel model) {
        Set<SfiPpFormCs6OtherViewModel> usOthers = model.getUsOthers();

        for (SfiPpFormCs6OtherViewModel usOther : usOthers) {
            if (usOther.getSfiPpForm() != null) continue;
            usOther.setSfiPpForm(model.getId().hashCode());
        }
    }
}
