package com.rbs.sfi.web.services;

import com.rbs.sfi.web.models.entities.Cs5;
import com.rbs.sfi.web.models.viewmodels.Cs5ViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Cs5Service {
    @Autowired
    private SfiPpFormCs3Service sfiPpFormCs3Service;

    public void manualPopulation(Cs5ViewModel model) {
        sfiPpFormCs3Service.setProjects(model);
    }

    public void setSupportDocs(Cs5 entity) {
        sfiPpFormCs3Service.setSupportDocs(entity.getProjects());
    }
}
