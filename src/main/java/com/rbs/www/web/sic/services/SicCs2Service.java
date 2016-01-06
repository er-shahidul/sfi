package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs2;
import com.rbs.www.web.sic.models.viewmodels.SicCs2ViewModel;
import com.rbs.www.web.sic.models.viewmodels.SicPpFormNeighborEventViewModel;
import com.rbs.www.web.sic.repositories.SicCs2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class SicCs2Service {
    @Autowired
    private SicCs2Repository repository;

    public SicCs2 get(Integer id) {
        return repository.get(id);
    }

    public void manualPopulation(SicCs2ViewModel model) {
        setSicNeighborEventsSicPpForm(model);
    }

    private void setSicNeighborEventsSicPpForm(SicCs2ViewModel model) {
        Set<SicPpFormNeighborEventViewModel> sicNeighborEvents = model.getSicNeighborEvents();

        for (SicPpFormNeighborEventViewModel sicNeighborEvent : sicNeighborEvents) {
            if (sicNeighborEvent.getSicPpForm() != null) continue;
            sicNeighborEvent.setSicPpForm(model.getId().hashCode());
        }
    }
}
