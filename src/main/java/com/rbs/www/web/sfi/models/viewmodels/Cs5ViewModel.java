package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.CascadeIf;
import com.rbs.www.common.modules.validator.SpELAssert;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@SpELAssert.List({
        @SpELAssert(value = "projects != null && projects.size() > 20",
                    applyIf = "isInPartnership != null && isInPartnership",
                    message = "There must be more than 20 projects",
                    property = "projects")
})
public class Cs5ViewModel extends BaseViewModel {
    // Don't use "property" in field level validation
    @SpELAssert(value = "#this != null && #this > 42", message = "Id must be greater than 42")
    private Integer id;

    private Set<String> organizationListAcademic;
    private Set<String> organizationListResearch;
    private Set<String> organizationListConservation;
    private Set<String> organizationListGovernment;
    private Set<String> organizationListCommunity;
    private Set<String> organizationListOther;
    private Set<String> other;

    private Boolean isOtherEnabled;
    private String otherText;

    @NotNull
    private Boolean isInPartnership;

    // "projects" will be validated if the following expression is true
    @Valid
    @CascadeIf(value = "isInPartnership != null && isInPartnership")
    private Set<SfiPpFormCs3ViewModel> projects;

    // if there's no CascadeIf, "items" will always be validated unless it is null
    @Valid
    private List<SfiPpFormCs5ViewModel> items;
    private Integer fundSFIActivStateProviCa;
    private Integer fundSFIActivStateProviUs;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsOtherEnabled() {
        return isOtherEnabled;
    }

    public void setIsOtherEnabled(Boolean isOtherEnabled) {
        this.isOtherEnabled = isOtherEnabled;
    }

    public String getOtherText() {
        return otherText;
    }

    public void setOtherText(String otherText) {
        this.otherText = otherText;
    }

    public Integer getFundSFIActivStateProviUs() {
        return fundSFIActivStateProviUs;
    }

    public void setFundSFIActivStateProviUs(Integer fundSFIActivStateProviUs) {
        this.fundSFIActivStateProviUs = fundSFIActivStateProviUs;
    }

    public Integer getFundSFIActivStateProviCa() {
        return fundSFIActivStateProviCa;
    }

    public void setFundSFIActivStateProviCa(Integer fundSFIActivStateProviCa) {
        this.fundSFIActivStateProviCa = fundSFIActivStateProviCa;
    }

    public Boolean getIsInPartnership() {
        return isInPartnership;
    }

    public void setIsInPartnership(Boolean isInPartnership) {
        this.isInPartnership = isInPartnership;
    }

    public Set<SfiPpFormCs3ViewModel> getProjects() {
        return projects;
    }

    public void setProjects(Set<SfiPpFormCs3ViewModel> projects) {
        this.projects = projects;
    }

    public List<SfiPpFormCs5ViewModel> getItems() {
        return items;
    }

    public void setItems(List<SfiPpFormCs5ViewModel> items) {
        this.items = items;
    }

    public Set<String> getOrganizationListAcademic() {
        return organizationListAcademic;
    }

    public void setOrganizationListAcademic(Set<String> organizationListAcademic) {
        this.organizationListAcademic = organizationListAcademic;
    }

    public Set<String> getOrganizationListResearch() {
        return organizationListResearch;
    }

    public void setOrganizationListResearch(Set<String> organizationListResearch) {
        this.organizationListResearch = organizationListResearch;
    }

    public Set<String> getOrganizationListConservation() {
        return organizationListConservation;
    }

    public void setOrganizationListConservation(Set<String> organizationListConservation) {
        this.organizationListConservation = organizationListConservation;
    }

    public Set<String> getOrganizationListGovernment() {
        return organizationListGovernment;
    }

    public void setOrganizationListGovernment(Set<String> organizationListGovernment) {
        this.organizationListGovernment = organizationListGovernment;
    }

    public Set<String> getOrganizationListCommunity() {
        return organizationListCommunity;
    }

    public void setOrganizationListCommunity(Set<String> organizationListCommunity) {
        this.organizationListCommunity = organizationListCommunity;
    }

    public Set<String> getOrganizationListOther() {
        return organizationListOther;
    }

    public void setOrganizationListOther(Set<String> organizationListOther) {
        this.organizationListOther = organizationListOther;
    }

    public Set<String> getOther() {
        return other;
    }

    public void setOther(Set<String> other) {
        this.other = other;
    }
}
