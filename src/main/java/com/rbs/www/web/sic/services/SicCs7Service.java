package com.rbs.www.web.sic.services;

import com.rbs.www.web.sic.models.entities.SicCs7;
import com.rbs.www.web.sic.models.viewmodels.Cs7BmpReportDocViewModel;
import com.rbs.www.web.sic.models.viewmodels.SicCs7ViewModel;
import com.rbs.www.web.sic.repositories.SicCs7Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional
public class SicCs7Service {
    @Autowired
    private SicCs7Repository repository;

    public SicCs7 get(Integer id) {
        return repository.get(id);
    }

    public void manualPopulation(SicCs7ViewModel model) {
        setCs7BmpReportDocSicPpForm(model);
    }

    private void setCs7BmpReportDocSicPpForm(SicCs7ViewModel model) {
        Set<Cs7BmpReportDocViewModel> bmpReportDocs = model.getBmpReportDocs();

        for (Cs7BmpReportDocViewModel bmpReportDoc : bmpReportDocs) {
            if (bmpReportDoc.getSicPpForm() != null) continue;
            bmpReportDoc.setSicPpForm(model.getId().hashCode());
        }
    }
}
