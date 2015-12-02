package com.rbs.sfi.core.models.viewmodels;

import com.rbs.sfi.core.mapper.BaseViewModel;

import java.util.Date;
import java.util.Set;

public class SfiPpFormCs3ViewModel extends BaseViewModel {
    private Integer id;
    private Integer cs3SfiStandardObj;
    private Integer cs3TotalProjectCost;
    private Integer cs3TotalProjectCostCurr;
    private Integer cs3OrgContribution;
    private Integer cs3OrgContributionCurr;

    private String cs3ProjectNm;
    private String cs3ProjectObj;
    private String cs3ProjectDescr;
    private String cs3ConservatonPartners;
    private String cs3OrganizationListAcademic;
    private String cs3OrganizationListResearch;
    private String cs3OrganizationListConservation;
    private String cs3OrganizationListGovernment;
    private String cs3OrganizationListCommunity;
    private String cs3OrganizationListOther;

    private Boolean cs3IncludeResearchFunding;
    private Boolean cs3ShareConserData;

    private Date cs3StartDate;
    private Date cs3EndDate;

    private Cs3ViewModel sfiPpForm;

    private Set<SfiPpFormRegionViewModel> cs3ProjectLocations;
    private Set<SfiPpFormCs3ProjectSupportDocsViewModel> cs3SupportDocs;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCs3ProjectNm() {
        return cs3ProjectNm;
    }

    public void setCs3ProjectNm(String cs3ProjectNm) {
        this.cs3ProjectNm = cs3ProjectNm;
    }

    public String getCs3ProjectObj() {
        return cs3ProjectObj;
    }

    public void setCs3ProjectObj(String cs3ProjectObj) {
        this.cs3ProjectObj = cs3ProjectObj;
    }

    public String getCs3ProjectDescr() {
        return cs3ProjectDescr;
    }

    public void setCs3ProjectDescr(String cs3ProjectDescr) {
        this.cs3ProjectDescr = cs3ProjectDescr;
    }

    public Integer getCs3SfiStandardObj() {
        return cs3SfiStandardObj;
    }

    public void setCs3SfiStandardObj(Integer cs3SfiStandardObj) {
        this.cs3SfiStandardObj = cs3SfiStandardObj;
    }

    public Set<SfiPpFormRegionViewModel> getCs3ProjectLocations() {
        return cs3ProjectLocations;
    }

    public void setCs3ProjectLocations(Set<SfiPpFormRegionViewModel> cs3ProjectLocations) {
        this.cs3ProjectLocations = cs3ProjectLocations;
    }

    public String getCs3ConservatonPartners() {
        return cs3ConservatonPartners;
    }

    public void setCs3ConservatonPartners(String cs3ConservatonPartners) {
        this.cs3ConservatonPartners = cs3ConservatonPartners;
    }

    public Date getCs3StartDate() {
        return cs3StartDate;
    }

    public void setCs3StartDate(Date cs3StartDate) {
        this.cs3StartDate = cs3StartDate;
    }

    public Date getCs3EndDate() {
        return cs3EndDate;
    }

    public void setCs3EndDate(Date cs3EndDate) {
        this.cs3EndDate = cs3EndDate;
    }

    public Integer getCs3TotalProjectCost() {
        return cs3TotalProjectCost;
    }

    public void setCs3TotalProjectCost(Integer cs3TotalProjectCost) {
        this.cs3TotalProjectCost = cs3TotalProjectCost;
    }

    public Integer getCs3TotalProjectCostCurr() {
        return cs3TotalProjectCostCurr;
    }

    public void setCs3TotalProjectCostCurr(Integer cs3TotalProjectCostCurr) {
        this.cs3TotalProjectCostCurr = cs3TotalProjectCostCurr;
    }

    public Integer getCs3OrgContribution() {
        return cs3OrgContribution;
    }

    public void setCs3OrgContribution(Integer cs3OrgContribution) {
        this.cs3OrgContribution = cs3OrgContribution;
    }

    public Integer getCs3OrgContributionCurr() {
        return cs3OrgContributionCurr;
    }

    public void setCs3OrgContributionCurr(Integer cs3OrgContributionCurr) {
        this.cs3OrgContributionCurr = cs3OrgContributionCurr;
    }

    public String getCs3OrganizationListAcademic() {
        return cs3OrganizationListAcademic;
    }

    public void setCs3OrganizationListAcademic(String cs3OrganizationListAcademic) {
        this.cs3OrganizationListAcademic = cs3OrganizationListAcademic;
    }

    public String getCs3OrganizationListResearch() {
        return cs3OrganizationListResearch;
    }

    public void setCs3OrganizationListResearch(String cs3OrganizationListResearch) {
        this.cs3OrganizationListResearch = cs3OrganizationListResearch;
    }

    public String getCs3OrganizationListConservation() {
        return cs3OrganizationListConservation;
    }

    public void setCs3OrganizationListConservation(String cs3OrganizationListConservation) {
        this.cs3OrganizationListConservation = cs3OrganizationListConservation;
    }

    public String getCs3OrganizationListGovernment() {
        return cs3OrganizationListGovernment;
    }

    public void setCs3OrganizationListGovernment(String cs3OrganizationListGovernment) {
        this.cs3OrganizationListGovernment = cs3OrganizationListGovernment;
    }

    public String getCs3OrganizationListCommunity() {
        return cs3OrganizationListCommunity;
    }

    public void setCs3OrganizationListCommunity(String cs3OrganizationListCommunity) {
        this.cs3OrganizationListCommunity = cs3OrganizationListCommunity;
    }

    public String getCs3OrganizationListOther() {
        return cs3OrganizationListOther;
    }

    public void setCs3OrganizationListOther(String cs3OrganizationListOther) {
        this.cs3OrganizationListOther = cs3OrganizationListOther;
    }

    public Set<SfiPpFormCs3ProjectSupportDocsViewModel> getCs3SupportDocs() {
        return cs3SupportDocs;
    }

    public void setCs3SupportDocs(Set<SfiPpFormCs3ProjectSupportDocsViewModel> cs3SupportDocs) {
        this.cs3SupportDocs = cs3SupportDocs;
    }

    public Boolean isCs3IncludeResearchFunding() {
        return cs3IncludeResearchFunding;
    }

    public void setCs3IncludeResearchFunding(Boolean cs3IncludeResearchFunding) {
        this.cs3IncludeResearchFunding = cs3IncludeResearchFunding;
    }

    public Boolean isCs3ShareConserData() {
        return cs3ShareConserData;
    }

    public void setCs3ShareConserData(Boolean cs3ShareConserData) {
        this.cs3ShareConserData = cs3ShareConserData;
    }

    public Cs3ViewModel getSfiPpForm() {
        return sfiPpForm;
    }

    public void setSfiPpForm(Cs3ViewModel sfiPpForm) {
        this.sfiPpForm = sfiPpForm;
    }
}
