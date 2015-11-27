package com.rbs.sfi.core.models.viewmodels;

import com.rbs.sfi.core.models.entities.SfiPpFormCs6Other;
import com.rbs.sfi.core.models.entities.SfiPpFormCs6UsCanada;

import java.util.List;

public class Cs6ViewModel {
	private Integer id;
	private Integer numPrivateForeOwersUs;
	private Integer numPrivateForeOwersCa;
	private Integer numPrivateLandOwersUs;
	private Integer numPrivateLandOwersCa;
	private Integer fundSFIActivStateProviUs;
	private Integer fundSFIActivStateProviCa;
	private Boolean toAssistObj8;
	private List<SfiPpFormCs6UsCanada> cs6UsCanada;
	private List<SfiPpFormCs6Other> cs6UsOthers;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Boolean getToAssistObj8() {
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
