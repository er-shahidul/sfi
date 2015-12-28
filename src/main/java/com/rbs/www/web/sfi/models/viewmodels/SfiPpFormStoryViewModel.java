package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

import java.util.Set;

public class SfiPpFormStoryViewModel extends BaseViewModel {
    private Integer id;
    private Integer sfiPpForm;
    private String firstName;
    private String email;
    private String description;
    private String lastName;
    private Boolean shareNoUse;
    private Boolean shareOrgName;
    private Boolean shareUseAggregate;
    private Set<SfiPpFormCs3ProjectSupportDocsViewModel> supportDocs;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getShareNoUse() {
        return shareNoUse;
    }

    public void setShareNoUse(Boolean shareNoUse) {
        this.shareNoUse = shareNoUse;
    }

    public Boolean getShareOrgName() {
        return shareOrgName;
    }

    public void setShareOrgName(Boolean shareOrgName) {
        this.shareOrgName = shareOrgName;
    }

    public Boolean getShareUseAggregate() {
        return shareUseAggregate;
    }

    public void setShareUseAggregate(Boolean shareUseAggregate) {
        this.shareUseAggregate = shareUseAggregate;
    }

    public Set<SfiPpFormCs3ProjectSupportDocsViewModel> getSupportDocs() {
        return supportDocs;
    }

    public void setSupportDocs(Set<SfiPpFormCs3ProjectSupportDocsViewModel> supportDocs) {
        this.supportDocs = supportDocs;
    }
}
