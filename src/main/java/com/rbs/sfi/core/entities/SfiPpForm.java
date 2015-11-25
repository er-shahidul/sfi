package com.rbs.sfi.core.entities;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.entities.User;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_forms")
public class SfiPpForm
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

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
	private boolean isSaved;

	@Column(name="isComplete", nullable=true)
	private boolean isComplete;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public boolean isSaved() {
		return isSaved;
	}

	public void setIsSaved(boolean isSaved) {
		this.isSaved = isSaved;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setIsComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
}
