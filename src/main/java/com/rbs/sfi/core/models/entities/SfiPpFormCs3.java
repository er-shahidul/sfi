package com.rbs.sfi.core.models.entities;

import com.rbs.sfi.core.mapper.BaseEntityModel;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="sfi_pp_form_cs3_projects")
public class SfiPpFormCs3 extends BaseEntityModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(targetEntity = Cs3.class)
	@JoinColumn(name="form_id", nullable=true)
	private Cs3 sfiPpForm;

	@Column(name="cs3_projectNm", nullable=true)
	private String cs3ProjectNm;

	@Column(name="cs3_projectObj", nullable=true)
	private String cs3ProjectObj;

	@Column(name="cs3_projectDescr", nullable=true)
	private String cs3ProjectDescr;

	@Column(name="cs3_sfiStandardObj", nullable=true)
	private Integer cs3SfiStandardObj;

	@ManyToMany(targetEntity = SfiPpFormRegion.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs3_project_locations",
			joinColumns={@JoinColumn(name="cs3_projectID")},
			inverseJoinColumns={@JoinColumn(name="cs3_project_locationID", referencedColumnName = "id")})
	private Set<SfiPpFormRegion> cs3ProjectLocations;

	@Column(name="cs3_conservatonPartners", nullable=true)
	private String cs3ConservatonPartners;

	@Column(name="cs3_startDate", nullable=true)
	private Date cs3StartDate;

	@Column(name="cs3_endDate", nullable=true)
	private Date cs3EndDate;

	@Column(name="cs3_totalProjectCost", nullable=true)
	private Integer cs3TotalProjectCost;

	@Column(name="cs3_totalProjectCost_curr", nullable=true)
	private Integer cs3TotalProjectCostCurr;

	@Column(name="cs3_orgContribution", nullable=true)
	private Integer cs3OrgContribution;

	@Column(name="cs3_orgContribution_curr", nullable=true)
	private Integer cs3OrgContributionCurr;

	@Column(name="cs3_organization_list_academic", nullable=true)
	private String cs3OrganizationListAcademic;

	@Column(name="cs3_organization_list_research", nullable=true)
	private String cs3OrganizationListResearch;

	@Column(name="cs3_organization_list_conservation", nullable=true)
	private String cs3OrganizationListConservation;

	@Column(name="cs3_organization_list_government", nullable=true)
	private String cs3OrganizationListGovernment;

	@Column(name="cs3_organization_list_community", nullable=true)
	private String cs3OrganizationListCommunity;

	@Column(name="cs3_organization_list_other", nullable=true)
	private String cs3OrganizationListOther;

	@OneToMany(targetEntity = SfiPpFormCs3ProjectSupportDocs.class, mappedBy="sfiPpFormCs3", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private Set<SfiPpFormCs3ProjectSupportDocs> cs3SupportDocs;

	@Column(name="cs3_include_research_funding", nullable=true)
	private Boolean cs3IncludeResearchFunding;

	@Column(name="cs3_shareConserData", nullable=true)
	private Boolean cs3ShareConserData;

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

	public Set<SfiPpFormRegion> getCs3ProjectLocations() {
		return cs3ProjectLocations;
	}

	public void setCs3ProjectLocations(Set<SfiPpFormRegion> cs3ProjectLocations) {
		addAll(this.cs3ProjectLocations, cs3ProjectLocations);
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

	public Set<SfiPpFormCs3ProjectSupportDocs> getCs3SupportDocs() {
		return cs3SupportDocs;
	}

	public void setCs3SupportDocs(Set<SfiPpFormCs3ProjectSupportDocs> cs3SupportDocs) {
		addAll(this.cs3SupportDocs, cs3SupportDocs);
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

	public Cs3 getSfiPpForm() {
		return sfiPpForm;
	}

	public void setSfiPpForm(Cs3 sfiPpForm) {
		this.sfiPpForm = sfiPpForm;
	}
}
