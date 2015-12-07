package com.rbs.sfi.common.models.ViewModels;

import com.rbs.sfi.common.models.BaseViewModel;

import java.util.Date;

public class CompanyViewModel extends BaseViewModel {
    private Integer id;
    private String name;
    private AreaUnitViewModel areaUnit;
    private Byte[] logo;
    private String logoName;
    private Boolean sfi;
    private Boolean sci;
    private Boolean primary;
    private Boolean secondary;
    private Boolean isActive;
    private Date createdAt;
    private Date updatedAt;
    private String createdBy;
    private String updatedBy;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AreaUnitViewModel getAreaUnit() {
        return areaUnit;
    }

    public void setAreaUnit(AreaUnitViewModel areaUnit) {
        this.areaUnit = areaUnit;
    }

    public Byte[] getLogo() {
        return logo;
    }

    public void setLogo(Byte[] logo) {
        this.logo = logo;
    }

    public String getLogoName() {
        return logoName;
    }

    public void setLogoName(String logoName) {
        this.logoName = logoName;
    }

    public Boolean getSfi() {
        return sfi;
    }

    public void setSfi(Boolean sfi) {
        this.sfi = sfi;
    }

    public Boolean getSci() {
        return sci;
    }

    public void setSci(Boolean sci) {
        this.sci = sci;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public Boolean getSecondary() {
        return secondary;
    }

    public void setSecondary(Boolean secondary) {
        this.secondary = secondary;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
