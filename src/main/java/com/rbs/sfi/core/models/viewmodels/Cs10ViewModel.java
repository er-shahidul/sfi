package com.rbs.sfi.core.models.viewmodels;

import java.util.Date;

public class Cs10ViewModel {
	private Integer id;
	private Boolean cs10Acknowledge;
	private Date updatedAt;
	private Date createdAt;
	private Date submittedAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getCs10Acknowledge() {
		return cs10Acknowledge;
	}

	public void setCs10Acknowledge(Boolean cs10Acknowledge) {
		this.cs10Acknowledge = cs10Acknowledge;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getSubmittedAt() {
		return submittedAt;
	}

	public void setSubmittedAt(Date submittedAt) {
		this.submittedAt = submittedAt;
	}
}
