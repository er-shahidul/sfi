package com.rbs.sfi.core.models.entities;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_cs3_projects")
public class SfiPpFormCs6Other
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(targetEntity = Cs6.class)
	@JoinColumn(name="form_id", nullable=true)
	private Cs6 sfiPpForm;

	@ManyToOne(targetEntity = SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, optional=true)
	@JoinColumn(name="cs6_otherCountries_countryID", nullable=true)
	private SfiPpFormOtherCountry country;

	@Column(name="cs6_otherCountries_units", nullable=true)
	private Integer cs6OtherCountriesUnits;

	@Column(name="cs6_otherCountries_volume", nullable=true)
	private String cs6OtherCountriesVolume;

	@Column(name="cs6_otherCountries_percPEFCCertified", nullable=true)
	private String cs6OtherCountriesPercPEFCCertified;

	@Column(name="cs6_otherCountries_percFSCCertified", nullable=true)
	private String cs6OtherCountriesPercFSCCertified;

	@Column(name="cs6_otherCountries_percPEFCFSCCertified", nullable=true)
	private String cs6OtherCountriesPercPEFCFSCCertified;

	@Column(name="cs6_otherCountries_percSFIFiberSourcing", nullable=true)
	private String cs6OtherCountriesPercSFIFiberSourcing;

	@Column(name="cs6_otherCountries_percOther", nullable=true)
	private Boolean cs6OtherCountriesPercOther;

	@Column(name="cs6_otherCountries_percOtherReason", nullable=true)
	private String cs6OtherCountriesPercOtherReason;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cs6 getSfiPpForm() {
		return sfiPpForm;
	}

	public void setSfiPpForm(Cs6 sfiPpForm) {
		this.sfiPpForm = sfiPpForm;
	}

	public SfiPpFormOtherCountry getCountry() {
		return country;
	}

	public void setCountry(SfiPpFormOtherCountry country) {
		this.country = country;
	}

	public Integer getCs6OtherCountriesUnits() {
		return cs6OtherCountriesUnits;
	}

	public void setCs6OtherCountriesUnits(Integer cs6OtherCountriesUnits) {
		this.cs6OtherCountriesUnits = cs6OtherCountriesUnits;
	}

	public String getCs6OtherCountriesVolume() {
		return cs6OtherCountriesVolume;
	}

	public void setCs6OtherCountriesVolume(String cs6OtherCountriesVolume) {
		this.cs6OtherCountriesVolume = cs6OtherCountriesVolume;
	}

	public String getCs6OtherCountriesPercPEFCCertified() {
		return cs6OtherCountriesPercPEFCCertified;
	}

	public void setCs6OtherCountriesPercPEFCCertified(String cs6OtherCountriesPercPEFCCertified) {
		this.cs6OtherCountriesPercPEFCCertified = cs6OtherCountriesPercPEFCCertified;
	}

	public String getCs6OtherCountriesPercFSCCertified() {
		return cs6OtherCountriesPercFSCCertified;
	}

	public void setCs6OtherCountriesPercFSCCertified(String cs6OtherCountriesPercFSCCertified) {
		this.cs6OtherCountriesPercFSCCertified = cs6OtherCountriesPercFSCCertified;
	}

	public String getCs6OtherCountriesPercPEFCFSCCertified() {
		return cs6OtherCountriesPercPEFCFSCCertified;
	}

	public void setCs6OtherCountriesPercPEFCFSCCertified(String cs6OtherCountriesPercPEFCFSCCertified) {
		this.cs6OtherCountriesPercPEFCFSCCertified = cs6OtherCountriesPercPEFCFSCCertified;
	}

	public String getCs6OtherCountriesPercSFIFiberSourcing() {
		return cs6OtherCountriesPercSFIFiberSourcing;
	}

	public void setCs6OtherCountriesPercSFIFiberSourcing(String cs6OtherCountriesPercSFIFiberSourcing) {
		this.cs6OtherCountriesPercSFIFiberSourcing = cs6OtherCountriesPercSFIFiberSourcing;
	}

	public Boolean isCs6OtherCountriesPercOther() {
		return cs6OtherCountriesPercOther;
	}

	public void setCs6OtherCountriesPercOther(Boolean cs6OtherCountriesPercOther) {
		this.cs6OtherCountriesPercOther = cs6OtherCountriesPercOther;
	}

	public String getCs6OtherCountriesPercOtherReason() {
		return cs6OtherCountriesPercOtherReason;
	}

	public void setCs6OtherCountriesPercOtherReason(String cs6OtherCountriesPercOtherReason) {
		this.cs6OtherCountriesPercOtherReason = cs6OtherCountriesPercOtherReason;
	}
}
