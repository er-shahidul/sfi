package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class SicCs4ViewModel extends BaseViewModel {
    private Integer id;

    private Boolean governmentAgencyOutreach;
    private Boolean legislatureOutreach;
    private Boolean other;
    private Boolean universityOutreach;

    private String governmentSpecify;
    private String legislatureSpecify;
    private String otherSpecify;
    private String universitySpecify;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getGovernmentAgencyOutreach() {
        return governmentAgencyOutreach;
    }

    public void setGovernmentAgencyOutreach(Boolean governmentAgencyOutreach) {
        this.governmentAgencyOutreach = governmentAgencyOutreach;
    }

    public Boolean getLegislatureOutreach() {
        return legislatureOutreach;
    }

    public void setLegislatureOutreach(Boolean legislatureOutreach) {
        this.legislatureOutreach = legislatureOutreach;
    }

    public Boolean getOther() {
        return other;
    }

    public void setOther(Boolean other) {
        this.other = other;
    }

    public Boolean getUniversityOutreach() {
        return universityOutreach;
    }

    public void setUniversityOutreach(Boolean universityOutreach) {
        this.universityOutreach = universityOutreach;
    }

    public String getGovernmentSpecify() {
        return governmentSpecify;
    }

    public void setGovernmentSpecify(String governmentSpecify) {
        this.governmentSpecify = governmentSpecify;
    }

    public String getLegislatureSpecify() {
        return legislatureSpecify;
    }

    public void setLegislatureSpecify(String legislatureSpecify) {
        this.legislatureSpecify = legislatureSpecify;
    }

    public String getOtherSpecify() {
        return otherSpecify;
    }

    public void setOtherSpecify(String otherSpecify) {
        this.otherSpecify = otherSpecify;
    }

    public String getUniversitySpecify() {
        return universitySpecify;
    }

    public void setUniversitySpecify(String universitySpecify) {
        this.universitySpecify = universitySpecify;
    }
}
