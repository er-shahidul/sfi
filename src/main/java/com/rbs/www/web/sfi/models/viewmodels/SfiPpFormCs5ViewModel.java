package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.SpELAssert;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SpELAssert.List({
        @SpELAssert(value = "false", message = "head spel first list", property = "hello"),
        @SpELAssert(value = "false", message = "head spel second list", property = "world")
})
public class SfiPpFormCs5ViewModel extends BaseViewModel {
    private Integer id;
    private Integer form;
    private SfiPpFormResearchTypeViewModel researchType;
    private Float internalUsd;
    private Float externalUsd;
    private Float internalCad;
    private Float externalCad;

    @NotNull
    @Size(min = 1000, max = 1000, message = "{large.string}")
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
