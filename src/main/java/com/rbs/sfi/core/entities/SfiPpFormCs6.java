package com.rbs.sfi.core.entities;

import com.rbs.sfi.admin.entities.Company;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_forms_cs6")
public class SfiPpFormCs6
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne(targetEntity = Company.class)
	@JoinColumn(name="company_id", nullable=true)
	private Company company;

	@Column(name="usa_timberSellers", nullable=true)
	private int usaTimberSellers;

	@Column(name="usa_infoReceived", nullable=true)
	private int usaInfoReceived;

	@Column(name="usa_fundingProvided", nullable=true)
	private Float usaFundingProvided;

	@Column(name="ca_timberSellers", nullable=true)
	private int caTimberSellers;

	@Column(name="ca_infoReceived", nullable=true)
	private int caInfoReceived;

	@Column(name="ca_fundingProvided", nullable=true)
	private int caFundingProvided;

	@Column(name="orgYesNo", nullable=true)
	private boolean orgYesNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getUsaTimberSellers() {
		return usaTimberSellers;
	}

	public void setUsaTimberSellers(int usaTimberSellers) {
		this.usaTimberSellers = usaTimberSellers;
	}

	public int getUsaInfoReceived() {
		return usaInfoReceived;
	}

	public void setUsaInfoReceived(int usaInfoReceived) {
		this.usaInfoReceived = usaInfoReceived;
	}

	public Float getUsaFundingProvided() {
		return usaFundingProvided;
	}

	public void setUsaFundingProvided(Float usaFundingProvided) {
		this.usaFundingProvided = usaFundingProvided;
	}

	public int getCaTimberSellers() {
		return caTimberSellers;
	}

	public void setCaTimberSellers(int caTimberSellers) {
		this.caTimberSellers = caTimberSellers;
	}

	public int getCaInfoReceived() {
		return caInfoReceived;
	}

	public void setCaInfoReceived(int caInfoReceived) {
		this.caInfoReceived = caInfoReceived;
	}

	public int getCaFundingProvided() {
		return caFundingProvided;
	}

	public void setCaFundingProvided(int caFundingProvided) {
		this.caFundingProvided = caFundingProvided;
	}

	public boolean isOrgYesNo() {
		return orgYesNo;
	}

	public void setOrgYesNo(boolean orgYesNo) {
		this.orgYesNo = orgYesNo;
	}
}
