package com.rbs.sfi.web.sfi.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;

import java.util.Set;

public class Cs6ViewModel extends BaseViewModel {
    private Integer id;
    private Integer numPrivateForeOwersUs;
    private Integer numPrivateForeOwersCa;
    private Integer numPrivateLandOwersUs;
    private Integer numPrivateLandOwersCa;
    private Boolean toAssistObj8;
    private Set<SfiPpFormCs6UsCanadaViewModel> usCanada;
    private Set<SfiPpFormCs6OtherViewModel> usOthers;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumPrivateForeOwersUs() {
        return numPrivateForeOwersUs;
    }

    public void setNumPrivateForeOwersUs(Integer numPrivateForeOwersUs) {
        this.numPrivateForeOwersUs = numPrivateForeOwersUs;
    }

    public Integer getNumPrivateForeOwersCa() {
        return numPrivateForeOwersCa;
    }

    public void setNumPrivateForeOwersCa(Integer numPrivateForeOwersCa) {
        this.numPrivateForeOwersCa = numPrivateForeOwersCa;
    }

    public Integer getNumPrivateLandOwersUs() {
        return numPrivateLandOwersUs;
    }

    public void setNumPrivateLandOwersUs(Integer numPrivateLandOwersUs) {
        this.numPrivateLandOwersUs = numPrivateLandOwersUs;
    }

    public Integer getNumPrivateLandOwersCa() {
        return numPrivateLandOwersCa;
    }

    public void setNumPrivateLandOwersCa(Integer numPrivateLandOwersCa) {
        this.numPrivateLandOwersCa = numPrivateLandOwersCa;
    }

    public Boolean getToAssistObj8() {
        return toAssistObj8;
    }

    public void setToAssistObj8(Boolean toAssistObj8) {
        this.toAssistObj8 = toAssistObj8;
    }

    public Set<SfiPpFormCs6UsCanadaViewModel> getUsCanada() {
        return usCanada;
    }

    public void setUsCanada(Set<SfiPpFormCs6UsCanadaViewModel> usCanada) {
        this.usCanada = usCanada;
    }

    public Set<SfiPpFormCs6OtherViewModel> getUsOthers() {
        return usOthers;
    }

    public void setUsOthers(Set<SfiPpFormCs6OtherViewModel> usOthers) {
        this.usOthers = usOthers;
    }
}
