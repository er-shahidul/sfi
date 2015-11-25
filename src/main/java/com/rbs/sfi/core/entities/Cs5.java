package com.rbs.sfi.core.entities;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_forms")
public class Cs5
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cs5_organization_list_academic", nullable=true)
	private String cs5OrganizationListAcademic;

	@Column(name="cs5_organization_list_research", nullable=true)
	private String cs5OrganizationListResearch;

	@Column(name="cs5_organization_list_conservation", nullable=true)
	private String cs5OrganizationListConservation;

	@Column(name="cs5_organization_list_government", nullable=true)
	private String cs5OrganizationListGovernment;

	@Column(name="cs5_organization_list_community", nullable=true)
	private String cs5OrganizationListCommunity;

	@Column(name="cs5_organization_list_other", nullable=true)
	private String cs5OrganizationListOther;

	@Column(name="cs5_other", nullable=true)
	private String cs5Other;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCs5OrganizationListAcademic() {
		return cs5OrganizationListAcademic;
	}

	public void setCs5OrganizationListAcademic(String cs5OrganizationListAcademic) {
		this.cs5OrganizationListAcademic = cs5OrganizationListAcademic;
	}

	public String getCs5OrganizationListResearch() {
		return cs5OrganizationListResearch;
	}

	public void setCs5OrganizationListResearch(String cs5OrganizationListResearch) {
		this.cs5OrganizationListResearch = cs5OrganizationListResearch;
	}

	public String getCs5OrganizationListConservation() {
		return cs5OrganizationListConservation;
	}

	public void setCs5OrganizationListConservation(String cs5OrganizationListConservation) {
		this.cs5OrganizationListConservation = cs5OrganizationListConservation;
	}

	public String getCs5OrganizationListGovernment() {
		return cs5OrganizationListGovernment;
	}

	public void setCs5OrganizationListGovernment(String cs5OrganizationListGovernment) {
		this.cs5OrganizationListGovernment = cs5OrganizationListGovernment;
	}

	public String getCs5OrganizationListCommunity() {
		return cs5OrganizationListCommunity;
	}

	public void setCs5OrganizationListCommunity(String cs5OrganizationListCommunity) {
		this.cs5OrganizationListCommunity = cs5OrganizationListCommunity;
	}

	public String getCs5OrganizationListOther() {
		return cs5OrganizationListOther;
	}

	public void setCs5OrganizationListOther(String cs5OrganizationListOther) {
		this.cs5OrganizationListOther = cs5OrganizationListOther;
	}

	public String getCs5Other() {
		return cs5Other;
	}

	public void setCs5Other(String cs5Other) {
		this.cs5Other = cs5Other;
	}
}
