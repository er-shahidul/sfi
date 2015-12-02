package com.rbs.sfi.core.models.viewmodels;

import com.rbs.sfi.core.mapper.IViewModel;
import com.rbs.sfi.core.models.entities.SfiPpFormAllCountry;

import java.util.Set;

public class Cs7ViewModel implements IViewModel {
	private Integer id;
	private Boolean emerIssuBioe;
	private Boolean emerIssuCarb;
	private Boolean emerIssuWate;
	private Boolean emerIssuClim;
	private Boolean emerIssuEcos;
	private Boolean emerIssuOther;
	private String emerIssuOtherSpec;
	private Boolean investResIfInve;
	private Boolean investRespercCurrSupply;
	private Boolean planInvestResIfPlan;
	private String planInvestResYear;
	private Boolean planCommPlantIfPlanGE;
	private String planCommPlantYear;
	private Boolean planCommPlantPerc;
	private Set<SfiPpFormAllCountry> investResCountries;
	private Set<SfiPpFormAllCountry> planInvestResCountries;
	private Set<SfiPpFormAllCountry> planCommPlantCountries;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getEmerIssuBioe() {
		return emerIssuBioe;
	}

	public void setEmerIssuBioe(Boolean emerIssuBioe) {
		this.emerIssuBioe = emerIssuBioe;
	}

	public Boolean getEmerIssuCarb() {
		return emerIssuCarb;
	}

	public void setEmerIssuCarb(Boolean emerIssuCarb) {
		this.emerIssuCarb = emerIssuCarb;
	}

	public Boolean getEmerIssuWate() {
		return emerIssuWate;
	}

	public void setEmerIssuWate(Boolean emerIssuWate) {
		this.emerIssuWate = emerIssuWate;
	}

	public Boolean getEmerIssuClim() {
		return emerIssuClim;
	}

	public void setEmerIssuClim(Boolean emerIssuClim) {
		this.emerIssuClim = emerIssuClim;
	}

	public Boolean getEmerIssuEcos() {
		return emerIssuEcos;
	}

	public void setEmerIssuEcos(Boolean emerIssuEcos) {
		this.emerIssuEcos = emerIssuEcos;
	}

	public Boolean getEmerIssuOther() {
		return emerIssuOther;
	}

	public void setEmerIssuOther(Boolean emerIssuOther) {
		this.emerIssuOther = emerIssuOther;
	}

	public String getEmerIssuOtherSpec() {
		return emerIssuOtherSpec;
	}

	public void setEmerIssuOtherSpec(String emerIssuOtherSpec) {
		this.emerIssuOtherSpec = emerIssuOtherSpec;
	}

	public Boolean getInvestResIfInve() {
		return investResIfInve;
	}

	public void setInvestResIfInve(Boolean investResIfInve) {
		this.investResIfInve = investResIfInve;
	}

	public Boolean getInvestRespercCurrSupply() {
		return investRespercCurrSupply;
	}

	public void setInvestRespercCurrSupply(Boolean investRespercCurrSupply) {
		this.investRespercCurrSupply = investRespercCurrSupply;
	}

	public Boolean getPlanInvestResIfPlan() {
		return planInvestResIfPlan;
	}

	public void setPlanInvestResIfPlan(Boolean planInvestResIfPlan) {
		this.planInvestResIfPlan = planInvestResIfPlan;
	}

	public String getPlanInvestResYear() {
		return planInvestResYear;
	}

	public void setPlanInvestResYear(String planInvestResYear) {
		this.planInvestResYear = planInvestResYear;
	}

	public Boolean getPlanCommPlantIfPlanGE() {
		return planCommPlantIfPlanGE;
	}

	public void setPlanCommPlantIfPlanGE(Boolean planCommPlantIfPlanGE) {
		this.planCommPlantIfPlanGE = planCommPlantIfPlanGE;
	}

	public String getPlanCommPlantYear() {
		return planCommPlantYear;
	}

	public void setPlanCommPlantYear(String planCommPlantYear) {
		this.planCommPlantYear = planCommPlantYear;
	}

	public Boolean getPlanCommPlantPerc() {
		return planCommPlantPerc;
	}

	public void setPlanCommPlantPerc(Boolean planCommPlantPerc) {
		this.planCommPlantPerc = planCommPlantPerc;
	}

	public Set<SfiPpFormAllCountry> getInvestResCountries() {
		return investResCountries;
	}

	public void setInvestResCountries(Set<SfiPpFormAllCountry> investResCountries) {
		this.investResCountries = investResCountries;
	}

	public Set<SfiPpFormAllCountry> getPlanInvestResCountries() {
		return planInvestResCountries;
	}

	public void setPlanInvestResCountries(Set<SfiPpFormAllCountry> planInvestResCountries) {
		this.planInvestResCountries = planInvestResCountries;
	}

	public Set<SfiPpFormAllCountry> getPlanCommPlantCountries() {
		return planCommPlantCountries;
	}

	public void setPlanCommPlantCountries(Set<SfiPpFormAllCountry> planCommPlantCountries) {
		this.planCommPlantCountries = planCommPlantCountries;
	}
}
