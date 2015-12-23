package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs8PartialA;
import com.rbs.www.web.sfi.models.viewmodels.Cs8PartialAViewModel;
import com.rbs.www.web.sfi.models.viewmodels.OrgContactViewModel;
import com.rbs.www.web.sfi.repositories.Cs8PartialARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class Cs8PartialAService {
    @Autowired
    private Cs8PartialARepository repository;

    public Cs8PartialA get(Integer id) {
        return repository.get(id);
    }

    public void manualPopulation(Cs8PartialAViewModel model) {
       setOrgContactsSfiPpForm(model);
    }

    private void setOrgContactsSfiPpForm(Cs8PartialAViewModel model) {
        Set<OrgContactViewModel> outsideCountries = model.getOrgContacts();

        for (OrgContactViewModel outsideCountry : outsideCountries) {
            if (outsideCountry.getSfiPpForm() != null) continue;
            outsideCountry.setSfiPpForm(model.getId().hashCode());
        }
    }
}
