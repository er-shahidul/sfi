package com.rbs.sfi.core.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_cs2_outside_us_and_ca")
public class SfiPpFormCs2OutsideUsaCa extends BaseEntityModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="form_id", nullable=true)
	private Integer sfiPpForm;

	@ManyToOne(targetEntity = SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, optional=true)
	@JoinColumn(name="cs2_outsideUSandCA_countryID", referencedColumnName="id", nullable=true)
	private SfiPpFormOtherCountry country;

	@Column(name="cs2_totalArea", nullable=true)
	private Float totalArea;

	@Column(name="cs2_isUnderCertStand", nullable=true)
	private Boolean underCertifiedStandard;

	@Column(name="cs2_standardType", nullable=true)
	private Integer standardType;

	@Column(name="cs2_standardType_other", nullable=true)
	private String standardTypeOther;

    @Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSfiPpForm() {
		return sfiPpForm;
	}

	public void setSfiPpForm(Integer sfiPpForm) {
		this.sfiPpForm = sfiPpForm;
	}

	public SfiPpFormOtherCountry getCountry() {
		return country;
	}

	public void setCountry(SfiPpFormOtherCountry country) {
		this.country = country;
	}

	public Float getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(Float totalArea) {
		this.totalArea = totalArea;
	}

	public Boolean getUnderCertifiedStandard() {
		return underCertifiedStandard;
	}

	public void setUnderCertifiedStandard(Boolean underCertifiedStandard) {
		this.underCertifiedStandard = underCertifiedStandard;
	}

	public Integer getStandardType() {
		return standardType;
	}

	public void setStandardType(Integer standardType) {
		this.standardType = standardType;
	}

	public String getStandardTypeOther() {
		return standardTypeOther;
	}

	public void setStandardTypeOther(String standardTypeOther) {
		this.standardTypeOther = standardTypeOther;
	}
}
