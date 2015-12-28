package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs9;
import com.rbs.www.web.sfi.models.viewmodels.Cs9ViewModel;
import com.rbs.www.web.sfi.models.viewmodels.SfiPpFormStoryViewModel;
import com.rbs.www.web.sfi.repositories.Cs9Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class Cs9Service {
    @Autowired
    private Cs9Repository repository;

    public Cs9 get(Integer id) {
        return repository.get(id);
    }

    public void manualPopulation(Cs9ViewModel model) {
       setStoriesSfiPpForm(model);
    }

    private void setStoriesSfiPpForm(Cs9ViewModel model) {
       Set<SfiPpFormStoryViewModel> stories = model.getStories();
        for (SfiPpFormStoryViewModel story : stories) {
            if (story.getSfiPpForm() != null) continue;
            story.setSfiPpForm(model.getId().hashCode());
        }
    }
}
