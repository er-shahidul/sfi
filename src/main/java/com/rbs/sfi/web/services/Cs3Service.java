package com.rbs.sfi.web.services;

import com.rbs.sfi.web.models.viewmodels.Cs3ViewModel;
import com.rbs.sfi.web.models.viewmodels.SfiPpFormCs3ViewModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class Cs3Service {
//    public void manualPopulation(Cs3ViewModel model) {
//       setProjectsSfiPpForm(model);
//    }
//
//    private void setProjectsSfiPpForm(Cs3ViewModel model) {
//        Set<SfiPpFormCs3ViewModel> projects = model.getProjects();
//
//        for (SfiPpFormCs3ViewModel project : projects) {
//            if (project.getSfiPpForm() != null) continue;
//            project.setSfiPpForm(model.getId().hashCode());
//        }
//    }
}
