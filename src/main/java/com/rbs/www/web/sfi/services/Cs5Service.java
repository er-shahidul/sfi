package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.Cs5;
import com.rbs.www.web.sfi.models.viewmodels.Cs5ViewModel;
import com.rbs.www.web.sfi.repositories.Cs5Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Cs5Service {
    @Autowired
    private Cs5Repository repository;

    public Cs5 get(Integer id) {
        return repository.get(id);
    }

    @Autowired
    private SfiPpFormCs3Service sfiPpFormCs3Service;

    public void manualPopulation(Cs5ViewModel model) {
        sfiPpFormCs3Service.setProjects(model);
    }

    public void setSupportDocs(Cs5 entity) {
        sfiPpFormCs3Service.setSupportDocs(entity.getProjects());
    }
}
