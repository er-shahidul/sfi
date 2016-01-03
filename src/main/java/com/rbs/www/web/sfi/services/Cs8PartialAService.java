package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs8PartialA;
import com.rbs.www.web.sfi.models.viewmodels.Cs8PartialAViewModel;
import com.rbs.www.web.sfi.models.viewmodels.OrgContactViewModel;
import com.rbs.www.web.sfi.models.viewmodels.PrimaryProducerViewModel;
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
       setPrimaryProducerSfiPpForm(model);
    }

    private void setOrgContactsSfiPpForm(Cs8PartialAViewModel model) {
        Set<OrgContactViewModel> orgContacts = model.getOrgContacts();

        for (OrgContactViewModel orgContact : orgContacts) {
            if (orgContact.getSfiPpForm() != null) continue;
            orgContact.setSfiPpForm(model.getId().hashCode());
        }
    }
    private void setPrimaryProducerSfiPpForm(Cs8PartialAViewModel model) {
        Set<PrimaryProducerViewModel> primaryProducers = model.getPrimaryProducers();

        for (PrimaryProducerViewModel primaryProducer : primaryProducers) {
            if (primaryProducer.getSfiPpForm() != null) continue;
            primaryProducer.setSfiPpForm(model.getId().hashCode());
        }
    }
}
