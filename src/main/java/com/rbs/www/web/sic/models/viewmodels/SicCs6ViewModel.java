package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

import java.util.Set;

public class SicCs6ViewModel extends BaseViewModel {
    private Integer id;

    private Set<Integer> trainingPrograms;
    private Boolean certifiedLoggingProfessional;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Integer> getTrainingPrograms() {
        return trainingPrograms;
    }

    public void setTrainingPrograms(Set<Integer> trainingPrograms) {
        this.trainingPrograms = trainingPrograms;
    }

    public Boolean getCertifiedLoggingProfessional() {
        return certifiedLoggingProfessional;
    }

    public void setCertifiedLoggingProfessional(Boolean certifiedLoggingProfessional) {
        this.certifiedLoggingProfessional = certifiedLoggingProfessional;
    }
}
