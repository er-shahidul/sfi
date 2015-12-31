package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.web.common.models.entities.SfiPpFormRegion;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_form_cs3_projects")
public class SfiPpFormCs3 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "form_id", nullable = true)
    private Integer sfiPpForm;

    @Column(name = "cs3_projectNm", nullable = true)
    private String projectNm;

    @Column(name = "cs3_projectObj", nullable = true)
    private String projectObj;

    @Column(name = "cs3_projectDescr", nullable = true)
    private String projectDescr;

    @OneToMany(targetEntity = SfiPpFormCs3ProjectStandardObjective.class, fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "sfi_pp_form_cs3_project_standard_objectives_sfiStandard10",
            joinColumns = {@JoinColumn(name = "sfi_pp_form_cs3_projects_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "sfi_pp_form_cs3_project_standard_objectives_id", referencedColumnName = "id")})
    private Set<SfiPpFormCs3ProjectStandardObjective> sfiStandard10;

    @OneToMany(targetEntity = SfiPpFormCs3ProjectStandardObjective.class, fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "sfi_pp_form_cs3_project_standard_objectives_sfiStandard15",
            joinColumns = {@JoinColumn(name = "sfi_pp_form_cs3_projects_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "sfi_pp_form_cs3_project_standard_objectives_id", referencedColumnName = "id")})
    private Set<SfiPpFormCs3ProjectStandardObjective> sfiStandard15;

    @ManyToMany(targetEntity = SfiPpFormRegion.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs3_project_locations",
            joinColumns = {@JoinColumn(name = "cs3_projectID")},
            inverseJoinColumns = {@JoinColumn(name = "cs3_project_locationID", referencedColumnName = "id")})
    private Set<SfiPpFormRegion> projectLocations;

    @Column(name = "cs3_conservatonPartners", nullable = true)
    private String conservatonPartners;

    @Column(name = "cs3_startDate", nullable = true)
    private Date startDate;

    @Column(name = "cs3_endDate", nullable = true)
    private Date endDate;

    @Column(name = "cs3_totalProjectCost", nullable = true)
    private Integer totalProjectCost;

    @Column(name = "cs3_totalProjectCost_curr", nullable = true)
    private Integer totalProjectCostCurr;

    @Column(name = "cs3_orgContribution", nullable = true)
    private Integer orgContribution;

    @Column(name = "cs3_orgContribution_curr", nullable = true)
    private Integer orgContributionCurr;

    @Column(name = "cs3_organization_list_academic", nullable = true)
    private String organizationListAcademic;

    @Column(name = "cs3_organization_list_research", nullable = true)
    private String organizationListResearch;

    @Column(name = "cs3_organization_list_conservation", nullable = true)
    private String organizationListConservation;

    @Column(name = "cs3_organization_list_government", nullable = true)
    private String organizationListGovernment;

    @Column(name = "cs3_organization_list_community", nullable = true)
    private String organizationListCommunity;

    @Column(name = "cs3_organization_list_other", nullable = true)
    private String organizationListOther;

    @OneToMany(targetEntity = SfiPpFormCs3ProjectSupportDocs.class, mappedBy = "sfiPpFormCs3", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
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

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<SfiPpFormCs3ProjectStandardObjective> getSfiStandard10() {
        return sfiStandard10;
    }

    public void setSfiStandard10(Set<SfiPpFormCs3ProjectStandardObjective> sfiStandard10) {
        addAll(this.sfiStandard10, sfiStandard10);
    }

    public Set<SfiPpFormCs3ProjectStandardObjective> getSfiStandard15() {
        return sfiStandard15;
    }

    public void setSfiStandard15(Set<SfiPpFormCs3ProjectStandardObjective> sfiStandard15) {
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
}
