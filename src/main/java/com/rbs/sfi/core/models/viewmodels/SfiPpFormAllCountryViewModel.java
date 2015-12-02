package com.rbs.sfi.core.models.viewmodels;

import com.rbs.sfi.core.mapper.BaseViewModel;

public class SfiPpFormAllCountryViewModel extends BaseViewModel {
    private Integer id;
    private String country;
    private Boolean isUnknown;

    @Override
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean isUnknown() {
        return isUnknown;
    }
    public void setIsUnknown(Boolean isUnknown) {
        this.isUnknown = isUnknown;
    }
}
