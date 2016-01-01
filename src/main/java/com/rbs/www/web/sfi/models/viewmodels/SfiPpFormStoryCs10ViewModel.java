package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class SfiPpFormStoryCs10ViewModel extends BaseViewModel {
    private Integer id;
    private Integer sfiPpForm;
    private String firstName;
    private String email;
    private String description;
    private String lastName;
    private Boolean shareNoUse;
    private Boolean shareOrgName;
    private Boolean shareUseAggregate;
    private Integer index;
    private String key;
    private String originalDocumentName;
    private String uniqueDocumentName;

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

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOriginalDocumentName() {
        return originalDocumentName;
    }

    public void setOriginalDocumentName(String originalDocumentName) {
        this.originalDocumentName = originalDocumentName;
    }

    public String getUniqueDocumentName() {
        return uniqueDocumentName;
    }

    public void setUniqueDocumentName(String uniqueDocumentName) {
        this.uniqueDocumentName = uniqueDocumentName;
    }
}
