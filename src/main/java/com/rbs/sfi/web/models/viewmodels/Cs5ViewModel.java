package com.rbs.sfi.web.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;

public class Cs5ViewModel extends BaseViewModel {
	private Integer id;
	private String organizationListAcademic;
	private String organizationListResearch;
	private String organizationListConservation;
	private String organizationListGovernment;
	private String organizationListCommunity;
	private String organizationListOther;
	private String other;

    @Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
}
