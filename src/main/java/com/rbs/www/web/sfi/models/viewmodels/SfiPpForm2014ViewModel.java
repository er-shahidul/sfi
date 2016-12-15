package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.admin.models.viewmodels.CompanyViewModel;
import com.rbs.www.common.models.BaseViewModel;

public class SfiPpForm2014ViewModel extends BaseViewModel {
    private Integer id;
    private CompanyViewModel company;
    private String fileName;
    private Boolean approved;
    private String year;

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
}
