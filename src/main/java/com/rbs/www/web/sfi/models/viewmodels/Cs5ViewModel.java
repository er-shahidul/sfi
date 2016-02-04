package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.SpELAssert;
import com.rbs.www.web.sfi.validation.Cs5OrgList.Cs5OrgList;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;

@Cs5OrgList(message = "{cs5.orgList}")
@SpELAssert.List({
        @SpELAssert(
                value = "otherText != null && !otherText.isEmpty()",
                applyIf = "isOtherEnabled != null && isOtherEnabled",
                message = "{cs5.otherText}"
        ),
        @SpELAssert(
                value = "projects != null && !projects.isEmpty()",
                applyIf = "isInPartnership != null && isInPartnership",
                message = "{cs5.isInPartnership}"
        )
})
public class Cs5ViewModel extends BaseViewModel {
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

    private Boolean isInPartnership;

    @Valid
    private Set<SfiPpFormCs3ViewModel> projects;

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
