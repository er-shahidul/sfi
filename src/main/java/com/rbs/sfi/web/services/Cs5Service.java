package com.rbs.sfi.web.services;

import com.rbs.sfi.web.models.viewmodels.Cs5ViewModel;
import com.rbs.sfi.web.models.viewmodels.SfiPpFormCs3ViewModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class Cs5Service {
    public void manualPopulation(Cs5ViewModel model) {
        setProjectsSfiPpForm(model);
    }

    private void setProjectsSfiPpForm(Cs5ViewModel model) {
        Set<SfiPpFormCs3ViewModel> projects = model.getProjects();

        for (SfiPpFormCs3ViewModel project : projects) {
            if (project.getSfiPpForm() != null) continue;
            project.setSfiPpForm(model.getId().hashCode());
        }
    }
}
