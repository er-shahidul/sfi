package com.rbs.www.web.sfi.models.viewmodels;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.util.JsonDateSerializer;
import com.rbs.www.web.common.models.viewmodels.SfiPpFormRegionViewModel;
import com.rbs.www.web.sfi.validation.SfiPpFormCs3OrgList.SfiPpFormCs3OrgList;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

@SfiPpFormCs3OrgList(message = "{orgList}")
public class SfiPpFormCs3ViewModel extends BaseViewModel {
    private Integer id;

    private Integer customOrder;

    private Integer totalProjectCost;
    private Integer totalProjectCostCurr;
    private Integer orgContribution;
    private Integer orgContributionCurr;

    @NotNull(message = "{project.name}")
    private String projectNm;

    @NotNull(message = "{project.objective}")
    private String projectObj;

    @Length(max = 4000, message = "{project.description}")
    private String projectDescr;

    private String conservatonPartners;

    private Set<String> organizationListAcademic;
    private Set<String> organizationListResearch;
    private Set<String> organizationListConservation;
    private Set<String> organizationListGovernment;
    private Set<String> organizationListCommunity;
    private Set<String> organizationListOther;
    private Set<String> other;

    private Boolean includeResearchFunding;

    @NotNull(message = "{project.startdate}")
    private String startDate;

    @NotNull(message = "{project.enddate}")
    private String endDate;

    private Integer sfiPpForm;

    private Set<SfiPpFormRegionViewModel> projectLocations;
    private Set<SfiPpFormCs3ProjectSupportDocsViewModel> supportDocs;

    private Set<SfiPpFormCs3ProjectStandardObjectiveViewModel> sfiStandard10;
    private Set<SfiPpFormCs3ProjectStandardObjective2015ViewModel> sfiStandard15;

    private Boolean shareConceptData;
    private Boolean shareConceptNoName;
    private Boolean dontShare;

    private Boolean incResFunding;
    private Boolean incSFIConservation;

    private String conversionPattern;
    private String description;

    private String incResFundingText;
    private Integer sfiStandardObj;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIncResFundingText() {
        return incResFundingText;
    }

    public void setIncResFundingText(String incResFundingText) {
        this.incResFundingText = incResFundingText;
    }

    public Integer getSfiStandardObj() {
        return sfiStandardObj;
    }

    public void setSfiStandardObj(Integer sfiStandardObj) {
        this.sfiStandardObj = sfiStandardObj;
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

    public Set<SfiPpFormCs3ProjectStandardObjective2015ViewModel> getSfiStandard15() {
        return sfiStandard15;
    }

    public void setSfiStandard15(Set<SfiPpFormCs3ProjectStandardObjective2015ViewModel> sfiStandard15) {
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

    public Boolean getIncludeResearchFunding() {
        return includeResearchFunding;
    }

    public void setIncludeResearchFunding(Boolean includeResearchFunding) {
        this.includeResearchFunding = includeResearchFunding;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
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

    public Integer getCustomOrder() {
        return customOrder;
    }

    public void setCustomOrder(Integer customOrder) {
        this.customOrder = customOrder;
    }

    public Boolean getShouldShow() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (this.endDate == null) {
            return false;
        }
        Date compareDate = sdf.parse("2016-01-01");
        Date endDate = sdf.parse(this.endDate);

        return getDifferenceDays(compareDate,endDate) >= 1;

    }

    public int getDifferenceDays(Date d1, Date d2) {
        int daysDiff=0;
        long diff = d2.getTime() - d1.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000)+1;
        daysDiff = (int) diffDays;
        return daysDiff;
    }
}
