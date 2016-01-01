package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs10;
import com.rbs.www.web.sfi.models.viewmodels.Cs10ViewModel;
import com.rbs.www.web.sfi.models.viewmodels.SfiPpFormStoryCs10ViewModel;
import com.rbs.www.web.sfi.repositories.Cs10Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class Cs10Service {
    @Autowired
    private Cs10Repository repository;

    public Cs10 get(Integer id) {
        return repository.get(id);
    }

    public void manualPopulation(Cs10ViewModel model) {
        setStoriesSfiPpForm(model);
    }

    private void setStoriesSfiPpForm(Cs10ViewModel model) {
        Set<SfiPpFormStoryCs10ViewModel> stories = model.getStories();
        for (SfiPpFormStoryCs10ViewModel story : stories) {
            if (story.getSfiPpForm() != null) continue;
            story.setSfiPpForm(model.getId().hashCode());
        }
    }
}
