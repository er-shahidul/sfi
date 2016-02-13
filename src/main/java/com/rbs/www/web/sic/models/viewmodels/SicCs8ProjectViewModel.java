package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.SpELAssert;
import com.rbs.www.web.common.models.datamodels.BlobNames;
import com.rbs.www.web.common.models.viewmodels.SfiPpFormRegionViewModel;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

@SpELAssert.List({
        @SpELAssert(
                value = "partnerAcademicSpecify != null && !partnerAcademicSpecify.isEmpty()",
                applyIf = "partnerAcademic != null && partnerAcademic",
                message = "{sic.cs8.project.partnerAcademicSpecify}"
        ),
        @SpELAssert(
                value = "partnerResearchSpecify != null && !partnerResearchSpecify.isEmpty()",
                applyIf = "partnerResearch != null && partnerResearch",
                message = "{sic.cs8.project.partnerResearchSpecify}"
        ),
        @SpELAssert(
                value = "partnerConservationSpecify != null && !partnerConservationSpecify.isEmpty()",
                applyIf = "partnerConservation != null && partnerConservation",
                message = "{sic.cs8.project.partnerConservationSpecify}"
        ),
        @SpELAssert(
                value = "partnerGovernmentSpecify != null && !partnerGovernmentSpecify.isEmpty()",
                applyIf = "partnerGovernment != null && partnerGovernment",
                message = "{sic.cs8.project.partnerGovernmentSpecify}"
        )
})
public class SicCs8ProjectViewModel extends BaseViewModel {
    private Integer id;
    private Integer sicPpForm;

    private Boolean partnerAcademic;
    private Boolean partnerCommunity;
    private Boolean partnerCommunity4H;
    private Boolean partnerCommunityBoyScout;
    private Boolean partnerCommunityCCAB;
    private Boolean partnerCommunityEarth;
    private Boolean partnerCommunityGirlGuide;
    private Boolean partnerCommunityGirlScout;
    private Boolean partnerCommunityHumanityCanada;
    private Boolean partnerCommunityHumanityInter;
    private Boolean partnerCommunityInterTimberCouncil;
    private Boolean partnerCommunityNatTurkeyFederation;
    private Boolean partnerCommunityOther;
    private Boolean partnerCommunityProjectTree;
    private Boolean partnerCommunityScoutsCanada;
    private Boolean partnerConservation;
    private Boolean partnerGovernment;
    private Boolean partnerResearch;
    private Boolean partnerOtherSIC;
    private Boolean partnerOther;
    private Boolean sicSupportingResearch;

    private Integer sicContribution;
    private Integer totalCost;

    @Size(max = 200, message = "{sic.cs8.project.contactEmail.size}")
    @NotNull(message = "{sic.cs8.project.contactEmail}")
    private String contactEmail;

    @NotNull(message = "{sic.cs8.project.contactName}")
    private String contactName;

    @NotNull(message = "{sic.cs8.project.description}")
    private String description;

    @NotNull(message = "{sic.cs8.project.name}")
    private String name;

    @NotNull(message = "{sic.cs8.project.organization}")
    private String organization;

    private String partnerAcademicSpecify;
    private String partnerCommunityOtherSpecify;
    private String partnerConservationSpecify;
    private String partnerGovernmentSpecify;
    private String partnerResearchSpecify;

    @NotNull(message = "{sic.cs8.project.sfiStandardObjective}")
    private String sfiStandardObjective;

    private Integer projectCostCurrency;
    private Integer sicContributionCurrency;

    @NotNull(message = "{sic.cs8.project.endDate}")
    private Date endDate;

    @NotNull(message = "{sic.cs8.project.startDate}")
    private Date startDate;

    private Set<SfiPpFormRegionViewModel> regions;
    private Set<BlobNames> supportDocs;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSfiStandardObjective() {
        return sfiStandardObjective;
    }

    public void setSfiStandardObjective(String sfiStandardObjective) {
        this.sfiStandardObjective = sfiStandardObjective;
    }

    public Integer getProjectCostCurrency() {
        return projectCostCurrency;
    }

    public void setProjectCostCurrency(Integer projectCostCurrency) {
        this.projectCostCurrency = projectCostCurrency;
    }

    public Integer getSicContributionCurrency() {
        return sicContributionCurrency;
    }

    public void setSicContributionCurrency(Integer sicContributionCurrency) {
        this.sicContributionCurrency = sicContributionCurrency;
    }

    public Integer getSicPpForm() {
        return sicPpForm;
    }

    public void setSicPpForm(Integer sicPpForm) {
        this.sicPpForm = sicPpForm;
    }

    public Boolean getPartnerAcademic() {
        return partnerAcademic;
    }

    public void setPartnerAcademic(Boolean partnerAcademic) {
        this.partnerAcademic = partnerAcademic;
    }

    public Boolean getPartnerCommunity() {
        return partnerCommunity;
    }

    public void setPartnerCommunity(Boolean partnerCommunity) {
        this.partnerCommunity = partnerCommunity;
    }

    public Boolean getPartnerCommunity4H() {
        return partnerCommunity4H;
    }

    public void setPartnerCommunity4H(Boolean partnerCommunity4H) {
        this.partnerCommunity4H = partnerCommunity4H;
    }

    public Boolean getPartnerCommunityBoyScout() {
        return partnerCommunityBoyScout;
    }

    public void setPartnerCommunityBoyScout(Boolean partnerCommunityBoyScout) {
        this.partnerCommunityBoyScout = partnerCommunityBoyScout;
    }

    public Boolean getPartnerCommunityCCAB() {
        return partnerCommunityCCAB;
    }

    public void setPartnerCommunityCCAB(Boolean partnerCommunityCCAB) {
        this.partnerCommunityCCAB = partnerCommunityCCAB;
    }

    public Boolean getPartnerCommunityEarth() {
        return partnerCommunityEarth;
    }

    public void setPartnerCommunityEarth(Boolean partnerCommunityEarth) {
        this.partnerCommunityEarth = partnerCommunityEarth;
    }

    public Boolean getPartnerCommunityGirlGuide() {
        return partnerCommunityGirlGuide;
    }

    public void setPartnerCommunityGirlGuide(Boolean partnerCommunityGirlGuide) {
        this.partnerCommunityGirlGuide = partnerCommunityGirlGuide;
    }

    public Boolean getPartnerCommunityGirlScout() {
        return partnerCommunityGirlScout;
    }

    public void setPartnerCommunityGirlScout(Boolean partnerCommunityGirlScout) {
        this.partnerCommunityGirlScout = partnerCommunityGirlScout;
    }

    public Boolean getPartnerCommunityHumanityCanada() {
        return partnerCommunityHumanityCanada;
    }

    public void setPartnerCommunityHumanityCanada(Boolean partnerCommunityHumanityCanada) {
        this.partnerCommunityHumanityCanada = partnerCommunityHumanityCanada;
    }

    public Boolean getPartnerCommunityHumanityInter() {
        return partnerCommunityHumanityInter;
    }

    public void setPartnerCommunityHumanityInter(Boolean partnerCommunityHumanityInter) {
        this.partnerCommunityHumanityInter = partnerCommunityHumanityInter;
    }

    public Boolean getPartnerCommunityInterTimberCouncil() {
        return partnerCommunityInterTimberCouncil;
    }

    public void setPartnerCommunityInterTimberCouncil(Boolean partnerCommunityInterTimberCouncil) {
        this.partnerCommunityInterTimberCouncil = partnerCommunityInterTimberCouncil;
    }

    public Boolean getPartnerCommunityNatTurkeyFederation() {
        return partnerCommunityNatTurkeyFederation;
    }

    public void setPartnerCommunityNatTurkeyFederation(Boolean partnerCommunityNatTurkeyFederation) {
        this.partnerCommunityNatTurkeyFederation = partnerCommunityNatTurkeyFederation;
    }

    public Boolean getPartnerCommunityOther() {
        return partnerCommunityOther;
    }

    public void setPartnerCommunityOther(Boolean partnerCommunityOther) {
        this.partnerCommunityOther = partnerCommunityOther;
    }

    public Boolean getPartnerCommunityProjectTree() {
        return partnerCommunityProjectTree;
    }

    public void setPartnerCommunityProjectTree(Boolean partnerCommunityProjectTree) {
        this.partnerCommunityProjectTree = partnerCommunityProjectTree;
    }

    public Boolean getPartnerCommunityScoutsCanada() {
        return partnerCommunityScoutsCanada;
    }

    public void setPartnerCommunityScoutsCanada(Boolean partnerCommunityScoutsCanada) {
        this.partnerCommunityScoutsCanada = partnerCommunityScoutsCanada;
    }

    public Boolean getPartnerConservation() {
        return partnerConservation;
    }

    public void setPartnerConservation(Boolean partnerConservation) {
        this.partnerConservation = partnerConservation;
    }

    public Boolean getPartnerGovernment() {
        return partnerGovernment;
    }

    public void setPartnerGovernment(Boolean partnerGovernment) {
        this.partnerGovernment = partnerGovernment;
    }

    public Boolean getPartnerResearch() {
        return partnerResearch;
    }

    public void setPartnerResearch(Boolean partnerResearch) {
        this.partnerResearch = partnerResearch;
    }

    public Boolean getPartnerOtherSIC() {
        return partnerOtherSIC;
    }

    public void setPartnerOtherSIC(Boolean partnerOtherSIC) {
        this.partnerOtherSIC = partnerOtherSIC;
    }

    public Boolean getPartnerOther() {
        return partnerOther;
    }

    public void setPartnerOther(Boolean partnerOther) {
        this.partnerOther = partnerOther;
    }

    public Boolean getSicSupportingResearch() {
        return sicSupportingResearch;
    }

    public void setSicSupportingResearch(Boolean sicSupportingResearch) {
        this.sicSupportingResearch = sicSupportingResearch;
    }

    public Integer getSicContribution() {
        return sicContribution;
    }

    public void setSicContribution(Integer sicContribution) {
        this.sicContribution = sicContribution;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPartnerAcademicSpecify() {
        return partnerAcademicSpecify;
    }

    public void setPartnerAcademicSpecify(String partnerAcademicSpecify) {
        this.partnerAcademicSpecify = partnerAcademicSpecify;
    }

    public String getPartnerCommunityOtherSpecify() {
        return partnerCommunityOtherSpecify;
    }

    public void setPartnerCommunityOtherSpecify(String partnerCommunityOtherSpecify) {
        this.partnerCommunityOtherSpecify = partnerCommunityOtherSpecify;
    }

    public String getPartnerConservationSpecify() {
        return partnerConservationSpecify;
    }

    public void setPartnerConservationSpecify(String partnerConservationSpecify) {
        this.partnerConservationSpecify = partnerConservationSpecify;
    }

    public String getPartnerGovernmentSpecify() {
        return partnerGovernmentSpecify;
    }

    public void setPartnerGovernmentSpecify(String partnerGovernmentSpecify) {
        this.partnerGovernmentSpecify = partnerGovernmentSpecify;
    }

    public String getPartnerResearchSpecify() {
        return partnerResearchSpecify;
    }

    public void setPartnerResearchSpecify(String partnerResearchSpecify) {
        this.partnerResearchSpecify = partnerResearchSpecify;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Set<SfiPpFormRegionViewModel> getRegions() {
        return regions;
    }

    public void setRegions(Set<SfiPpFormRegionViewModel> regions) {
        this.regions = regions;
    }

    public Set<BlobNames> getSupportDocs() {
        return supportDocs;
    }

    public void setSupportDocs(Set<BlobNames> supportDocs) {
        this.supportDocs = supportDocs;
    }
}
