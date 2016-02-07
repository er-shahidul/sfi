package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

import javax.validation.constraints.NotNull;
import java.util.Set;

public class SicCs6ViewModel extends BaseViewModel {
    private Integer id;

    @NotNull(message = "{sic.cs6.trainingPrograms}")
    private Set<Integer> trainingPrograms;
    @NotNull(message = "{sic.cs6.certifiedLoggingProfessional}")
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
