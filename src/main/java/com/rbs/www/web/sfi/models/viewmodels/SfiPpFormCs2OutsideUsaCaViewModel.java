package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class SfiPpFormCs2OutsideUsaCaViewModel extends BaseViewModel {
    private Integer id;
    private Integer sfiPpForm;
    private Integer standardType;

    private Float totalArea;
    private Boolean underCertifiedStandard;
    private String standardTypeOther;

    private SfiPpFormOtherCountryViewModel country;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSfiPpForm() {
        return sfiPpForm;
    }

    public void setSfiPpForm(Integer sfiPpForm) {
        this.sfiPpForm = sfiPpForm;
    }

    public Float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Float totalArea) {
        this.totalArea = totalArea;
    }

    public Boolean getUnderCertifiedStandard() {
        return underCertifiedStandard;
    }

    public void setUnderCertifiedStandard(Boolean underCertifiedStandard) {
        this.underCertifiedStandard = underCertifiedStandard;
    }

    public Integer getStandardType() {
        return standardType;
    }

    public void setStandardType(Integer standardType) {
        this.standardType = standardType;
    }

    public String getStandardTypeOther() {
        return standardTypeOther;
    }

    public void setStandardTypeOther(String standardTypeOther) {
        this.standardTypeOther = standardTypeOther;
    }

    public SfiPpFormOtherCountryViewModel getCountry() {
        return country;
    }

    public void setCountry(SfiPpFormOtherCountryViewModel country) {
        this.country = country;
    }
}
