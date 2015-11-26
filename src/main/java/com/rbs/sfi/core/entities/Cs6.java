package com.rbs.sfi.core.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="sfi_pp_forms")
public class Cs6
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cs6_numPrivateForeOwers_us", nullable=true)
	private Integer numPrivateForeOwersUs;

	@Column(name="cs6_numPrivateForeOwers_ca", nullable=true)
	private Integer numPrivateForeOwersCa;

	@Column(name="cs6_numPrivateLandOwers_us", nullable=true)
	private Integer numPrivateLandOwersUs;

	@Column(name="cs6_numPrivateLandOwers_ca", nullable=true)
	private Integer numPrivateLandOwersCa;

	@Column(name="cs6_fundSFIActiv_stateProvi_us", nullable=true)
	private Integer fundSFIActivStateProviUs;

	@Column(name="cs6_fundSFIActiv_stateProvi_ca", nullable=true)
	private Integer fundSFIActivStateProviCa;

	@Column(name="cs6_toAssistObj8", nullable=true)
	private Boolean toAssistObj8;

	@OneToMany(targetEntity = SfiPpFormCs6UsCanada.class, mappedBy="sfiPpForm" , fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<SfiPpFormCs6UsCanada> cs6UsCanada;

	@OneToMany(targetEntity = SfiPpFormCs6Other.class, mappedBy="sfiPpForm" , fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<SfiPpFormCs6Other> cs6UsOthers;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCs6NumPrivateForeOwersUs() {
		return numPrivateForeOwersUs;
	}

	public void setCs6NumPrivateForeOwersUs(Integer numPrivateForeOwersUs) {
		this.numPrivateForeOwersUs = numPrivateForeOwersUs;
	}

	public Integer getCs6NumPrivateForeOwersCa() {
		return numPrivateForeOwersCa;
	}

	public void setCs6NumPrivateForeOwersCa(Integer numPrivateForeOwersCa) {
		this.numPrivateForeOwersCa = numPrivateForeOwersCa;
	}

	public Integer getCs6NumPrivateLandOwersUs() {
		return numPrivateLandOwersUs;
	}

	public void setCs6NumPrivateLandOwersUs(Integer numPrivateLandOwersUs) {
		this.numPrivateLandOwersUs = numPrivateLandOwersUs;
	}

	public Integer getCs6NumPrivateLandOwersCa() {
		return numPrivateLandOwersCa;
	}

	public void setCs6NumPrivateLandOwersCa(Integer numPrivateLandOwersCa) {
		this.numPrivateLandOwersCa = numPrivateLandOwersCa;
	}

	public Integer getNumPrivateForeOwersUs() {
		return numPrivateForeOwersUs;
	}

	public void setNumPrivateForeOwersUs(Integer numPrivateForeOwersUs) {
		this.numPrivateForeOwersUs = numPrivateForeOwersUs;
	}

	public Integer getNumPrivateForeOwersCa() {
		return numPrivateForeOwersCa;
	}

	public void setNumPrivateForeOwersCa(Integer numPrivateForeOwersCa) {
		this.numPrivateForeOwersCa = numPrivateForeOwersCa;
	}

	public Integer getNumPrivateLandOwersUs() {
		return numPrivateLandOwersUs;
	}

	public void setNumPrivateLandOwersUs(Integer numPrivateLandOwersUs) {
		this.numPrivateLandOwersUs = numPrivateLandOwersUs;
	}

	public Integer getNumPrivateLandOwersCa() {
		return numPrivateLandOwersCa;
	}

	public void setNumPrivateLandOwersCa(Integer numPrivateLandOwersCa) {
		this.numPrivateLandOwersCa = numPrivateLandOwersCa;
	}

	public Integer getFundSFIActivStateProviUs() {
		return fundSFIActivStateProviUs;
	}

	public void setFundSFIActivStateProviUs(Integer fundSFIActivStateProviUs) {
		this.fundSFIActivStateProviUs = fundSFIActivStateProviUs;
	}

	public Integer getFundSFIActivStateProviCa() {
		return fundSFIActivStateProviCa;
	}

	public void setFundSFIActivStateProviCa(Integer fundSFIActivStateProviCa) {
		this.fundSFIActivStateProviCa = fundSFIActivStateProviCa;
	}

	public Boolean isToAssistObj8() {
		return toAssistObj8;
	}

	public void setToAssistObj8(Boolean toAssistObj8) {
		this.toAssistObj8 = toAssistObj8;
	}

	public List<SfiPpFormCs6UsCanada> getCs6UsCanada() {
		return cs6UsCanada;
	}

	public void setCs6UsCanada(List<SfiPpFormCs6UsCanada> cs6UsCanada) {
		this.cs6UsCanada = cs6UsCanada;
	}

	public List<SfiPpFormCs6Other> getCs6UsOthers() {
		return cs6UsOthers;
	}

	public void setCs6UsOthers(List<SfiPpFormCs6Other> cs6UsOthers) {
		this.cs6UsOthers = cs6UsOthers;
	}
}
