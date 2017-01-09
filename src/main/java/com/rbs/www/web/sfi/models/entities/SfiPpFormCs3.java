package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.web.common.models.entities.SfiPpFormRegion;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_form_cs3_projects")
public class SfiPpFormCs3 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Transient
    private Integer customOrder;

    @Column(name = "form_id", nullable = true)
    private Integer sfiPpForm;

    @Column(name = "cs3_projectNm", nullable = true)
    private String projectNm;

    @Column(name = "cs3_conversionPattern", nullable = true)
    private String conversionPattern;

    @Column(name = "cs3_description", nullable = true)
    private String description;

    @Column(name = "cs3_projectObj", nullable = true)
    private String projectObj;

    @Column(name = "cs3_projectDescr", nullable = true)
    @Type(type="text")
    private String projectDescr;

    @ManyToMany(targetEntity = SfiPpFormCs3ProjectStandardObjective2015.class, fetch = FetchType.EAGER,
            cascade = CascadeType.DETACH)
    @JoinTable(name = "sfi_pp_form_cs3_project_standard_objectives_sfiStandard10",
            joinColumns = {@JoinColumn(name = "sfi_pp_form_cs3_projects_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "sfi_pp_form_cs3_project_standard_objectives_id", referencedColumnName = "id")})
    private Set<SfiPpFormCs3ProjectStandardObjective2015> sfiStandard15;

    @ManyToMany(targetEntity = SfiPpFormCs3ProjectStandardObjective.class, fetch = FetchType.EAGER,
            cascade = CascadeType.DETACH)
    @JoinTable(name = "sfi_pp_form_cs3_project_standard_objectives_sfiStandard15",
            joinColumns = {@JoinColumn(name = "sfi_pp_form_cs3_projects_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "sfi_pp_form_cs3_project_standard_objectives_id", referencedColumnName = "id")})
    private Set<SfiPpFormCs3ProjectStandardObjective> sfiStandard10;

    @ManyToMany(targetEntity = SfiPpFormRegion.class, cascade = {CascadeType.DETACH}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs3_project_locations",
            joinColumns = {@JoinColumn(name = "cs3_projectID")},
            inverseJoinColumns = {@JoinColumn(name = "cs3_project_locationID", referencedColumnName = "id")})
    private Set<SfiPpFormRegion> projectLocations;

    @Column(name = "cs3_conservatonPartners", nullable = true)
    private String conservatonPartners;

    @Column(name = "cs3_startDate1", nullable = true)
    private String startDate;

    @Column(name = "cs3_endDate1", nullable = true)
    private String endDate;

    @Column(name = "cs3_totalProjectCost", nullable = true)
    private Integer totalProjectCost;

    @Column(name = "cs3_totalProjectCost_curr", nullable = true)
    private Integer totalProjectCostCurr;

    @Column(name = "cs3_orgContribution", nullable = true)
    private Integer orgContribution;

    @Column(name = "cs3_orgContribution_curr", nullable = true)
    private Integer orgContributionCurr;

    @Column(name = "cs3_organization_list_academic", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic;

    @Column(name = "cs3_organization_list_research", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch;

    @Column(name = "cs3_organization_list_conservation", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation;

    @Column(name = "cs3_organization_list_government", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment;

    @Column(name = "cs3_organization_list_community", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity;

    @Column(name = "cs3_organization_list_other", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther;

    @Column(name = "cs3_other", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other;

    @OneToMany(targetEntity = SfiPpFormCs3ProjectSupportDocs.class, fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "sfi_pp_form_cs3_projects_supportDocs",
            joinColumns = {@JoinColumn(name = "sfi_pp_form_cs3_projects_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "sfi_pp_form_cs3_project_support_docs_id", referencedColumnName = "id")})
    private Set<SfiPpFormCs3ProjectSupportDocs> supportDocs;

    @Column(name = "cs3_include_research_funding", nullable = true)
    private Boolean includeResearchFunding;

    @Column(name = "cs3_share_concept_data", nullable = true)
    private Boolean shareConceptData;

    @Column(name = "cs3_share_concept_no_name", nullable = true)
    private Boolean shareConceptNoName;

    @Column(name = "cs3_dont_share", nullable = true)
    private Boolean dontShare;

    @Column(name = "cs3_incResFunding", nullable = true)
    private Boolean incResFunding;

    @Column(name = "cs3_incSFIConservation", nullable = true)
    private Boolean incSFIConservation;

    @Column(name = "cs3_incResFundingText", nullable = true)
    private String incResFundingText;

    @Column(name = "cs3_sfiStandardObj", nullable = true)
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

    public Set<SfiPpFormCs3ProjectStandardObjective> getSfiStandard10() {
        return sfiStandard10;
    }

    public void setSfiStandard10(Set<SfiPpFormCs3ProjectStandardObjective> sfiStandard10) {
        addAll(this.sfiStandard10, sfiStandard10);
    }

    public Set<SfiPpFormCs3ProjectStandardObjective2015> getSfiStandard15() {
        return sfiStandard15;
    }

    public void setSfiStandard15(Set<SfiPpFormCs3ProjectStandardObjective2015> sfiStandard15) {
        addAll(this.sfiStandard15, sfiStandard15);
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

    public Integer getSfiPpForm() {
        return sfiPpForm;
    }

    public void setSfiPpForm(Integer sfiPpForm) {
        this.sfiPpForm = sfiPpForm;
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

    public Set<SfiPpFormRegion> getProjectLocations() {
        return projectLocations;
    }

    public void setProjectLocations(Set<SfiPpFormRegion> projectLocations) {
        addAll(this.projectLocations, projectLocations);
    }

    public String getConservatonPartners() {
        return conservatonPartners;
    }

    public void setConservatonPartners(String conservatonPartners) {
        this.conservatonPartners = conservatonPartners;
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

    public Set<SfiPpFormCs3ProjectSupportDocs> getSupportDocs() {
        return supportDocs;
    }

    public void setSupportDocs(Set<SfiPpFormCs3ProjectSupportDocs> supportDocs) {
        addAll(this.supportDocs, supportDocs);
    }

    public Boolean getIncludeResearchFunding() {
        return includeResearchFunding;
    }

    public void setIncludeResearchFunding(Boolean includeResearchFunding) {
        this.includeResearchFunding = includeResearchFunding;
    }

    public Set<String> getOrganizationListAcademic() {
        return organizationListAcademic;
    }

    public void setOrganizationListAcademic(Set<String> organizationListAcademic) {
        addAll(this.organizationListAcademic, organizationListAcademic);
    }

    public Set<String> getOrganizationListResearch() {
        return organizationListResearch;
    }

    public void setOrganizationListResearch(Set<String> organizationListResearch) {
        addAll(this.organizationListResearch, organizationListResearch);
    }

    public Set<String> getOrganizationListConservation() {
        return organizationListConservation;
    }

    public void setOrganizationListConservation(Set<String> organizationListConservation) {
        addAll(this.organizationListConservation, organizationListConservation);
    }

    public Set<String> getOrganizationListGovernment() {
        return organizationListGovernment;
    }

    public void setOrganizationListGovernment(Set<String> organizationListGovernment) {
        addAll(this.organizationListGovernment, organizationListGovernment);
    }

    public Set<String> getOrganizationListCommunity() {
        return organizationListCommunity;
    }

    public void setOrganizationListCommunity(Set<String> organizationListCommunity) {
        addAll(this.organizationListCommunity, organizationListCommunity);
    }

    public Set<String> getOrganizationListOther() {
        return organizationListOther;
    }

    public void setOrganizationListOther(Set<String> organizationListOther) {
        addAll(this.organizationListOther, organizationListOther);
    }

    public Set<String> getOther() {
        return other;
    }

    public void setOther(Set<String> other) {
        addAll(this.other, other);
    }

    public Integer getCustomOrder() {
        return customOrder;
    }

    public void setCustomOrder(Integer customOrder) {
        this.customOrder = customOrder;
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
}
