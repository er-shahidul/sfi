package com.rbs.sfi.core.models.viewmodels;

import com.rbs.sfi.core.models.entities.SfiPpFormCs3;

import java.util.List;

public class Cs3ViewModel {
	private Integer id;
	private Boolean isInPartnership;
	private List<SfiPpFormCs3> projects;

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

	public List<SfiPpFormCs3> getProjects() {
		return projects;
	}

	public void setProjects(List<SfiPpFormCs3> projects) {
		this.projects = projects;
	}
}
