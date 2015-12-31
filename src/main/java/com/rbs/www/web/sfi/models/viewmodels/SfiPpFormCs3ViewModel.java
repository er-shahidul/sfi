package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.web.common.models.viewmodels.SfiPpFormRegionViewModel;

import java.util.Date;
import java.util.Set;

public class SfiPpFormCs3ViewModel extends BaseViewModel {
    private Integer id;
    private Integer totalProjectCost;
    private Integer totalProjectCostCurr;
    private Integer orgContribution;
    private Integer orgContributionCurr;

    private String projectNm;
    private String projectObj;
    private String projectDescr;
    private String conservatonPartners;
    private String organizationListAcademic;
    private String organizationListResearch;
    private String organizationListConservation;
    private String organizationListGovernment;
    private String organizationListCommunity;
    private String organizationListOther;

    private Boolean includeResearchFunding;

    private Date startDate;
    private Date endDate;

    private Integer sfiPpForm;

    private Set<SfiPpFormRegionViewModel> projectLocations;
    private Set<SfiPpFormCs3ProjectSupportDocsViewModel> supportDocs;

    private Set<SfiPpFormCs3ProjectStandardObjectiveViewModel> sfiStandard10;
    private Set<SfiPpFormCs3ProjectStandardObjectiveViewModel> sfiStandard15;

    private Boolean shareConceptData;
    private Boolean shareConceptNoName;
    private Boolean dontShare;

    private Boolean incResFunding;
    private Boolean incSFIConservation;

    private String conversionPattern;
    private String description;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConversionPattern() {
        return conversionPattern;
    }

    public void setConversionPattern(String conversionPattern) {
        this.conversionPattern = conversionPattern;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<SfiPpFormCs3ProjectStandardObjectiveViewModel> getSfiStandard10() {
        return sfiStandard10;
    }

    public void setSfiStandard10(Set<SfiPpFormCs3ProjectStandardObjectiveViewModel> sfiStandard10) {
        this.sfiStandard10 = sfiStandard10;
    }

    public Set<SfiPpFormCs3ProjectStandardObjectiveViewModel> getSfiStandard15() {
        return sfiStandard15;
    }

    public void setSfiStandard15(Set<SfiPpFormCs3ProjectStandardObjectiveViewModel> sfiStandard15) {
        this.sfiStandard15 = sfiStandard15;
    }

    public Boolean getIncResFunding() {
        return incResFunding;
    }

    public void setIncResFunding(Boolean incResFunding) {
        this.incResFunding = incResFunding;
    }

    public Boolean getIncSFIConservation() {
        return incSFIConservation;
    }

    public void setIncSFIConservation(Boolean incSFIConservation) {
        this.incSFIConservation = incSFIConservation;
    }

    public Boolean getShareConceptData() {
        return shareConceptData;
    }

    public void setShareConceptData(Boolean shareConceptData) {
        this.shareConceptData = shareConceptData;
    }

    public Boolean getShareConceptNoName() {
        return shareConceptNoName;
    }

    public void setShareConceptNoName(Boolean shareConceptNoName) {
        this.shareConceptNoName = shareConceptNoName;
    }

    public Boolean getDontShare() {
        return dontShare;
    }

    public void setDontShare(Boolean dontShare) {
        this.dontShare = dontShare;
    }

    public Integer getTotalProjectCost() {
        return totalProjectCost;
    }

    public void setTotalProjectCost(Integer totalProjectCost) {
        this.totalProjectCost = totalProjectCost;
    }

    public Integer getTotalProjectCostCurr() {
        return totalProjectCostCurr;
    }

    public void setTotalProjectCostCurr(Integer totalProjectCostCurr) {
        this.totalProjectCostCurr = totalProjectCostCurr;
    }

    public Integer getOrgContribution() {
        return orgContribution;
    }

    public void setOrgContribution(Integer orgContribution) {
        this.orgContribution = orgContribution;
    }

    public Integer getOrgContributionCurr() {
        return orgContributionCurr;
    }

    public void setOrgContributionCurr(Integer orgContributionCurr) {
        this.orgContributionCurr = orgContributionCurr;
    }

    public String getProjectNm() {
        return projectNm;
    }

    public void setProjectNm(String projectNm) {
        this.projectNm = projectNm;
    }

    public String getProjectObj() {
        return projectObj;
    }

    public void setProjectObj(String projectObj) {
        this.projectObj = projectObj;
    }

    public String getProjectDescr() {
        return projectDescr;
    }

    public void setProjectDescr(String projectDescr) {
        this.projectDescr = projectDescr;
    }

    public String getConservatonPartners() {
        return conservatonPartners;
    }

    public void setConservatonPartners(String conservatonPartners) {
        this.conservatonPartners = conservatonPartners;
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

    public Boolean getIncludeResearchFunding() {
        return includeResearchFunding;
    }

    public void setIncludeResearchFunding(Boolean includeResearchFunding) {
        this.includeResearchFunding = includeResearchFunding;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getSfiPpForm() {
        return sfiPpForm;
    }

    public void setSfiPpForm(Integer sfiPpForm) {
        this.sfiPpForm = sfiPpForm;
    }

    public Set<SfiPpFormRegionViewModel> getProjectLocations() {
        return projectLocations;
    }

    public void setProjectLocations(Set<SfiPpFormRegionViewModel> projectLocations) {
        this.projectLocations = projectLocations;
    }

    public Set<SfiPpFormCs3ProjectSupportDocsViewModel> getSupportDocs() {
        return supportDocs;
    }

    public void setSupportDocs(Set<SfiPpFormCs3ProjectSupportDocsViewModel> supportDocs) {
        this.supportDocs = supportDocs;
    }
}
