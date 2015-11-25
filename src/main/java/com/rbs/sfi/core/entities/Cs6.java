package com.rbs.sfi.core.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="sfi_pp_forms")
public class Cs6
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cs6_numPrivateForeOwers_us", nullable=true)
	private int cs6NumPrivateForeOwersUs;

	@Column(name="cs6_numPrivateForeOwers_ca", nullable=true)
	private int cs6NumPrivateForeOwersCa;

	@Column(name="cs6_numPrivateLandOwers_us", nullable=true)
	private int cs6NumPrivateLandOwersUs;

	@Column(name="cs6_numPrivateLandOwers_ca", nullable=true)
	private int cs6NumPrivateLandOwersCa;

	@Column(name="cs6_fundSFIActiv_stateProvi_us", nullable=true)
	private int cs6FundSFIActivStateProviUs;

	@Column(name="cs6_fundSFIActiv_stateProvi_ca", nullable=true)
	private int cs6FundSFIActivStateProviCa;

	@Column(name="cs6_toAssistObj8", nullable=true)
	private boolean cs6ToAssistObj8;

	@OneToMany(targetEntity = SfiPpFormCs6UsCanada.class, mappedBy="sfiPpForm" , fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<SfiPpFormCs6UsCanada> cs6UsCanada;

	@OneToMany(targetEntity = SfiPpFormCs6Other.class, mappedBy="sfiPpForm" , fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<SfiPpFormCs6Other> cs6UsOthers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCs6NumPrivateForeOwersUs() {
		return cs6NumPrivateForeOwersUs;
	}

	public void setCs6NumPrivateForeOwersUs(int cs6NumPrivateForeOwersUs) {
		this.cs6NumPrivateForeOwersUs = cs6NumPrivateForeOwersUs;
	}

	public int getCs6NumPrivateForeOwersCa() {
		return cs6NumPrivateForeOwersCa;
	}

	public void setCs6NumPrivateForeOwersCa(int cs6NumPrivateForeOwersCa) {
		this.cs6NumPrivateForeOwersCa = cs6NumPrivateForeOwersCa;
	}

	public int getCs6NumPrivateLandOwersUs() {
		return cs6NumPrivateLandOwersUs;
	}

	public void setCs6NumPrivateLandOwersUs(int cs6NumPrivateLandOwersUs) {
		this.cs6NumPrivateLandOwersUs = cs6NumPrivateLandOwersUs;
	}

	public int getCs6NumPrivateLandOwersCa() {
		return cs6NumPrivateLandOwersCa;
	}

	public void setCs6NumPrivateLandOwersCa(int cs6NumPrivateLandOwersCa) {
		this.cs6NumPrivateLandOwersCa = cs6NumPrivateLandOwersCa;
	}

	public int getCs6FundSFIActivStateProviUs() {
		return cs6FundSFIActivStateProviUs;
	}

	public void setCs6FundSFIActivStateProviUs(int cs6FundSFIActivStateProviUs) {
		this.cs6FundSFIActivStateProviUs = cs6FundSFIActivStateProviUs;
	}

	public int getCs6FundSFIActivStateProviCa() {
		return cs6FundSFIActivStateProviCa;
	}

	public void setCs6FundSFIActivStateProviCa(int cs6FundSFIActivStateProviCa) {
		this.cs6FundSFIActivStateProviCa = cs6FundSFIActivStateProviCa;
	}

	public boolean isCs6ToAssistObj8() {
		return cs6ToAssistObj8;
	}

	public void setCs6ToAssistObj8(boolean cs6ToAssistObj8) {
		this.cs6ToAssistObj8 = cs6ToAssistObj8;
	}

//	public List<SfiPpFormCs6UsCanada> getCs6UsCanada() {
//		return cs6UsCanada;
//	}
//
//	public void setCs6UsCanada(List<SfiPpFormCs6UsCanada> cs6UsCanada) {
//		this.cs6UsCanada = cs6UsCanada;
//	}

//	public List<SfiPpFormCs6Other> getCs6UsOthers() {
//		return cs6UsOthers;
//	}
//
//	public void setCs6UsOthers(List<SfiPpFormCs6Other> cs6UsOthers) {
//		this.cs6UsOthers = cs6UsOthers;
//	}
}
