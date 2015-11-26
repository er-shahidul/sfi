package com.rbs.sfi.core.models.entities;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_forms")
public class Cs5
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cs5_organization_list_academic", nullable=true)
	private String organizationListAcademic;

	@Column(name="cs5_organization_list_research", nullable=true)
	private String organizationListResearch;

	@Column(name="cs5_organization_list_conservation", nullable=true)
	private String organizationListConservation;

	@Column(name="cs5_organization_list_government", nullable=true)
	private String organizationListGovernment;

	@Column(name="cs5_organization_list_community", nullable=true)
	private String organizationListCommunity;

	@Column(name="cs5_organization_list_other", nullable=true)
	private String organizationListOther;

	@Column(name="cs5_other", nullable=true)
	private String other;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCs5OrganizationListAcademic() {
		return organizationListAcademic;
	}

	public void setCs5OrganizationListAcademic(String organizationListAcademic) {
		this.organizationListAcademic = organizationListAcademic;
	}

	public String getCs5OrganizationListResearch() {
		return organizationListResearch;
	}

	public void setCs5OrganizationListResearch(String organizationListResearch) {
		this.organizationListResearch = organizationListResearch;
	}

	public String getCs5OrganizationListConservation() {
		return organizationListConservation;
	}

	public void setCs5OrganizationListConservation(String organizationListConservation) {
		this.organizationListConservation = organizationListConservation;
	}

	public String getCs5OrganizationListGovernment() {
		return organizationListGovernment;
	}

	public void setCs5OrganizationListGovernment(String organizationListGovernment) {
		this.organizationListGovernment = organizationListGovernment;
	}

	public String getCs5OrganizationListCommunity() {
		return organizationListCommunity;
	}

	public void setCs5OrganizationListCommunity(String organizationListCommunity) {
		this.organizationListCommunity = organizationListCommunity;
	}

	public String getCs5OrganizationListOther() {
		return organizationListOther;
	}

	public void setCs5OrganizationListOther(String organizationListOther) {
		this.organizationListOther = organizationListOther;
	}

	public String getCs5Other() {
		return other;
	}

	public void setCs5Other(String other) {
		this.other = other;
	}
}
