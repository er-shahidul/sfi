package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.admin.models.viewmodels.CompanyViewModel;
import com.rbs.www.admin.models.viewmodels.UserViewModel;
import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.web.common.models.viewmodels.SfiPpFormStatusViewModel;

import java.util.Date;

public class SfiPpFormDataViewModel extends BaseViewModel {
    private Integer id;
    private SfiPpFormStatusViewModel status;
    private CompanyViewModel company;
    private UserViewModel createdBy;
    private UserViewModel updatedBy;
    private Date createdAt;
    private Date updatedAt;
    private Boolean isSaved;
    private Boolean isComplete;
    private Boolean approved;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SfiPpFormStatusViewModel getStatus() {
        return status;
    }

    public void setStatus(SfiPpFormStatusViewModel status) {
        this.status = status;
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

    public UserViewModel getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(UserViewModel updatedBy) {
        this.updatedBy = updatedBy;
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

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }
}
