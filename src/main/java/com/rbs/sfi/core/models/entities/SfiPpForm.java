package com.rbs.sfi.core.models.entities;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.entities.User;
import com.rbs.sfi.core.mapper.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_forms")
public class SfiPpForm extends BaseEntityModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(targetEntity = SfiPpFormStatus.class, optional=true)
	@JoinColumn(name="status_id", referencedColumnName="id", nullable=true)
	private SfiPpFormStatus status;

	@OneToOne(targetEntity = Company.class, optional=false)
	@JoinColumn(name="company_id", referencedColumnName="id", nullable=true)
	private Company company;

	@ManyToOne(targetEntity = User.class, optional=true)
	@JoinColumn(name="created_by", referencedColumnName="id", nullable=true)
	private User createdBy;

	@Column(name="isSaved", nullable=true)
	private Boolean isSaved;

	@Column(name="isComplete", nullable=true)
	private Boolean isComplete;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SfiPpFormStatus getStatus() {
		return status;
	}

	public void setStatus(SfiPpFormStatus status) {
		this.status = status;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Boolean isSaved() {
		return isSaved;
	}

	public void setIsSaved(Boolean isSaved) {
		this.isSaved = isSaved;
	}

	public Boolean isComplete() {
		return isComplete;
	}

	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}
}
