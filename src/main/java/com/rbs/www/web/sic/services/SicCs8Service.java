package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs8;
import com.rbs.www.web.sic.models.viewmodels.SicCs8ProjectViewModel;
import com.rbs.www.web.sic.models.viewmodels.SicCs8ViewModel;
import com.rbs.www.web.sic.repositories.SicCs8Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class SicCs8Service {
    @Autowired
    private SicCs8Repository repository;

    public SicCs8 get(Integer id) {
        return repository.get(id);
    }

    public void manualPopulation(SicCs8ViewModel model) {
        setSicFormProjects(model);
    }

    private void setSicFormProjects(SicCs8ViewModel model) {
        Set<SicCs8ProjectViewModel> projects = model.getProjects();

        for (SicCs8ProjectViewModel project : projects) {
            if (project.getSicPpForm() != null) continue;
            project.setSicPpForm(model.getId().hashCode());
        }
    }
}
