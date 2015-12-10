package com.rbs.sfi.web.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;
import com.rbs.sfi.common.models.ViewModels.CompanyViewModel;
import com.rbs.sfi.common.models.ViewModels.UserViewModel;

public class SfiPpFormDataViewModel extends BaseViewModel {
    private Integer id;
    private SfiPpFormStatusViewModel status;
    private CompanyViewModel company;
    private UserViewModel createdBy;
    private Boolean isSaved;
    private Boolean isComplete;

    public SfiPpFormStatusViewModel getStatus() {
        return status;
    }

    public void setStatus(SfiPpFormStatusViewModel status) {
        this.status = status;
    }

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

    public UserViewModel getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserViewModel createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getIsSaved() {
        return isSaved;
    }

    public void setIsSaved(Boolean isSaved) {
        this.isSaved = isSaved;
    }

    public Boolean getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Boolean isComplete) {
        this.isComplete = isComplete;
    }
}
