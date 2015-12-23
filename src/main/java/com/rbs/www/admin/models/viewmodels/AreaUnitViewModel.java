package com.rbs.www.admin.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class AreaUnitViewModel extends BaseViewModel {
    private Integer id;
    private String unitDescription;
    private String shortCode;
    private Boolean isActive;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitDescription() {
        return unitDescription;
    }

    public void setUnitDescription(String unitDescription) {
        this.unitDescription = unitDescription;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
