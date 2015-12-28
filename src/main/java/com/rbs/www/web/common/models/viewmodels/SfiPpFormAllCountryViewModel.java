package com.rbs.www.web.common.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

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
