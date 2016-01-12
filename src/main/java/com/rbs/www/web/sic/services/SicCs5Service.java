package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs5;
import com.rbs.www.web.sic.models.viewmodels.*;
import com.rbs.www.web.sic.repositories.SicCs5Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class SicCs5Service {
    @Autowired
    private SicCs5Repository repository;

    public SicCs5 get(Integer id) {
        return repository.get(id);
    }

    public void manualPopulation(SicCs5ViewModel model) {
        setCs5ForestStandards2015SicPpForm(model);
        setCs5FiberSourcing2015SicPpForm(model);
        setCs5StandardObjectives2010SicPpForm(model);
    }

    private void setCs5ForestStandards2015SicPpForm(SicCs5ViewModel model) {
        Set<Cs5ForestStandards2015ViewModel> cs5MechanismDocViewModels = model.getForestStandards2015();

        for (Cs5ForestStandards2015ViewModel cs5ForestStandards2015ViewModel : cs5MechanismDocViewModels) {
            if (cs5ForestStandards2015ViewModel.getSicPpForm() != null) continue;
            cs5ForestStandards2015ViewModel.setSicPpForm(model.getId().hashCode());
        }
    }

    private void setCs5FiberSourcing2015SicPpForm(SicCs5ViewModel model) {
        Set<Cs5FiberSourcing2015ViewModel> cs5MechanismDocViewModels = model.getFiberSourcing2015();

        for (Cs5FiberSourcing2015ViewModel cs5FiberSourcing2015ViewModel : cs5MechanismDocViewModels) {
            if (cs5FiberSourcing2015ViewModel.getSicPpForm() != null) continue;
            cs5FiberSourcing2015ViewModel.setSicPpForm(model.getId().hashCode());
        }
    }

    private void setCs5StandardObjectives2010SicPpForm(SicCs5ViewModel model) {
        Set<Cs5StandardObjectives2010ViewModel> cs5MechanismDocViewModels = model.getStandardObjectives2010();

        for (Cs5StandardObjectives2010ViewModel cs5StandardObjectives2010ViewModel : cs5MechanismDocViewModels) {
            if (cs5StandardObjectives2010ViewModel.getSicPpForm() != null) continue;
            cs5StandardObjectives2010ViewModel.setSicPpForm(model.getId().hashCode());
        }
    }
}
