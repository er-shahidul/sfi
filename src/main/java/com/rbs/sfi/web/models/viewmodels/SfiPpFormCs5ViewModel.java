package com.rbs.sfi.web.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;

public class SfiPpFormCs5ViewModel extends BaseViewModel {
    private Integer id;
    private Integer form;
    private SfiPpFormResearchTypeViewModel researchType;
    private Float internalUsd;
    private Float externalUsd;
    private Float internalCad;
    private Float externalCad;
    private String description;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getForm() {
        return form;
    }

    public void setForm(Integer form) {
        this.form = form;
    }

    public SfiPpFormResearchTypeViewModel getResearchType() {
        return researchType;
    }

    public void setResearchType(SfiPpFormResearchTypeViewModel researchType) {
        this.researchType = researchType;
    }

    public Float getInternalUsd() {
        return internalUsd;
    }

    public void setInternalUsd(Float internalUsd) {
        this.internalUsd = internalUsd;
    }

    public Float getExternalUsd() {
        return externalUsd;
    }

    public void setExternalUsd(Float externalUsd) {
        this.externalUsd = externalUsd;
    }

    public Float getInternalCad() {
        return internalCad;
    }

    public void setInternalCad(Float internalCad) {
        this.internalCad = internalCad;
    }

    public Float getExternalCad() {
        return externalCad;
    }

    public void setExternalCad(Float externalCad) {
        this.externalCad = externalCad;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
