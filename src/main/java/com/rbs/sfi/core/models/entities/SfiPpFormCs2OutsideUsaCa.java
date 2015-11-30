package com.rbs.sfi.core.models.entities;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_cs2_outside_us_and_ca")
public class SfiPpFormCs2OutsideUsaCa
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(targetEntity = Cs2.class, optional=true)
	@JoinColumn(name="form_id", nullable=true)
	private Cs2 sfiPpForm;

	@ManyToOne(targetEntity = SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, optional=true)
	@JoinColumn(name="cs2_outsideUSandCA_countryID", referencedColumnName="id", nullable=true)
	private SfiPpFormOtherCountry country;

	@Column(name="cs2_totalArea", nullable=true)
	private Float cs2TotalArea;

	@Column(name="cs2_isUnderCertStand", nullable=true)
	private Boolean cs2UnderCertifiedStandard;

	@Column(name="cs2_standardType", nullable=true)
	private Integer cs2StandardType;

	@Column(name="cs2_standardType_other", nullable=true)
	private String cs2StandardTypeOther;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getCs2TotalArea() {
		return cs2TotalArea;
	}

	public void setCs2TotalArea(Float cs2TotalArea) {
		this.cs2TotalArea = cs2TotalArea;
	}

	public Boolean isCs2UnderCertifiedStandard() {
		return cs2UnderCertifiedStandard;
	}

	public void setCs2UnderCertifiedStandard(Boolean cs2UnderCertifiedStandard) {
		this.cs2UnderCertifiedStandard = cs2UnderCertifiedStandard;
	}

	public Integer getCs2StandardType() {
		return cs2StandardType;
	}

	public void setCs2StandardType(Integer cs2StandardType) {
		this.cs2StandardType = cs2StandardType;
	}

	public String getCs2StandardTypeOther() {
		return cs2StandardTypeOther;
	}

	public void setCs2StandardTypeOther(String cs2StandardTypeOther) {
		this.cs2StandardTypeOther = cs2StandardTypeOther;
	}

	public SfiPpFormOtherCountry getCountry() {
		return country;
	}

	public void setCountry(SfiPpFormOtherCountry country) {
		this.country = country;
	}

	public Cs2 getSfiPpForm() {
		return sfiPpForm;
	}

	public void setSfiPpForm(Cs2 sfiPpForm) {
		this.sfiPpForm = sfiPpForm;
	}
}
