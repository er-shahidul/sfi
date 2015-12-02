package com.rbs.sfi.core.models.viewmodels;

import com.rbs.sfi.core.mapper.IViewModel;

import java.util.Set;

public class Cs3ViewModel implements IViewModel {
	private Integer id;
	private Boolean isInPartnership;
	private Set<SfiPpFormCs3ViewModel> projects;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getIsInPartnership() {
		return isInPartnership;
	}

	public void setIsInPartnership(Boolean isInPartnership) {
		this.isInPartnership = isInPartnership;
	}

	public Set<SfiPpFormCs3ViewModel> getProjects() {
		return projects;
	}

	public void setProjects(Set<SfiPpFormCs3ViewModel> projects) {
		this.projects = projects;
	}
}
