package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.admin.models.viewmodels.CompanyViewModel;
import com.rbs.www.admin.models.viewmodels.UserViewModel;
import com.rbs.www.common.models.BaseViewModel;

public class SfiPpForm2014ViewModel extends BaseViewModel {
    private Integer id;
    private UserViewModel createdBy;
    private CompanyViewModel company;
    private String fileName;
    private Boolean approved;
    private String year;
    private String updatedAt;
    private String createdAt;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CompanyViewModel getCompany() {
        return company;
    }

    public void setCompany(CompanyViewModel company) {
        this.company = company;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UserViewModel getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserViewModel createdBy) {
        this.createdBy = createdBy;
    }
}
