package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.SfiPpFormCs3;
import com.rbs.www.web.sfi.models.viewmodels.Cs5ViewModel;
import com.rbs.www.web.sfi.models.viewmodels.SfiPpFormCs3ViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class SfiPpFormCs3Service {
    @Autowired
    private SfiPpFormCs3ProjectSupportDocsService sfiPpFormCs3ProjectSupportDocsService;

    public void setProjects(Cs5ViewModel model) {
        Set<SfiPpFormCs3ViewModel> projects = model.getProjects();

        for (SfiPpFormCs3ViewModel project : projects) {
            if (project.getSfiPpForm() != null) continue;
            project.setSfiPpForm(model.getId().hashCode());
        }
    }

    public void setSupportDocs(Set<SfiPpFormCs3> projects) {
        for (SfiPpFormCs3 project : projects) {
            sfiPpFormCs3ProjectSupportDocsService
                    .setSupportDocs(project.getSupportDocs(), project.getId());
        }
    }
}
