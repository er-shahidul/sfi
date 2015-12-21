package com.rbs.sfi.web.sfi.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;

import java.util.List;
import java.util.Set;

public class Cs5ViewModel extends BaseViewModel {
    private Integer id;
    private String organizationListAcademic;
    private String organizationListResearch;
    private String organizationListConservation;
    private String organizationListGovernment;
    private String organizationListCommunity;
    private String organizationListOther;
    private String other;
    private Boolean isInPartnership;
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

    public String getOrganizationListAcademic() {
        return organizationListAcademic;
    }

    public void setOrganizationListAcademic(String organizationListAcademic) {
        this.organizationListAcademic = organizationListAcademic;
    }

    public String getOrganizationListResearch() {
        return organizationListResearch;
    }

    public void setOrganizationListResearch(String organizationListResearch) {
        this.organizationListResearch = organizationListResearch;
    }

    public String getOrganizationListConservation() {
        return organizationListConservation;
    }

    public void setOrganizationListConservation(String organizationListConservation) {
        this.organizationListConservation = organizationListConservation;
    }

    public String getOrganizationListGovernment() {
        return organizationListGovernment;
    }

    public void setOrganizationListGovernment(String organizationListGovernment) {
        this.organizationListGovernment = organizationListGovernment;
    }

    public String getOrganizationListCommunity() {
        return organizationListCommunity;
    }

    public void setOrganizationListCommunity(String organizationListCommunity) {
        this.organizationListCommunity = organizationListCommunity;
    }

    public String getOrganizationListOther() {
        return organizationListOther;
    }

    public void setOrganizationListOther(String organizationListOther) {
        this.organizationListOther = organizationListOther;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
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
}
