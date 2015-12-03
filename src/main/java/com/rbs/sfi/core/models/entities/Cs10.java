package com.rbs.sfi.core.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="sfi_pp_forms")
public class Cs10 extends BaseEntityModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cs10_acknowledge", nullable=true)
	private Boolean cs10Acknowledge;

	@Column(name="updated_at", nullable=true)
	private Date updatedAt;

	@Column(name="created_at", nullable=true)
	private Date createdAt;

	@Column(name="submitted_at", nullable=true)
	private Date submittedAt;

    @Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean isCs10Acknowledge() {
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
