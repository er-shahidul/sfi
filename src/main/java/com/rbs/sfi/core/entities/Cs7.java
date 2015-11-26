package com.rbs.sfi.core.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="sfi_pp_forms")
public class Cs7
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cs7_emerIssu_bioe", nullable=true)
	private Boolean emerIssuBioe;

	@Column(name="cs7_emerIssu_carb", nullable=true)
	private Boolean emerIssuCarb;

	@Column(name="cs7_emerIssu_wate", nullable=true)
	private Boolean emerIssuWate;

	@Column(name="cs7_emerIssu_clim", nullable=true)
	private Boolean emerIssuClim;

	@Column(name="cs7_emerIssu_ecos", nullable=true)
	private Boolean emerIssuEcos;

	@Column(name="cs7_emerIssu_other", nullable=true)
	private Boolean emerIssuOther;

	@Column(name="cs7_emerIssu_otherSpec", nullable=true)
	private String emerIssuOtherSpec;

	@Column(name="cs7_investRes_ifInve", nullable=true)
	private Boolean investResIfInve;

	@Column(name="cs7_investResperc_currSupply", nullable=true)
	private Boolean investRespercCurrSupply;

	@Column(name="cs7_planInvestRes_ifPlan", nullable=true)
	private Boolean planInvestResIfPlan;

	@Column(name="cs7_planInvestRes_year", nullable=true)
	private String planInvestResYear;

	@Column(name="cs7_planCommPlant_ifPlanGE", nullable=true)
	private Boolean planCommPlantIfPlanGE;

	@Column(name="cs7_planCommPlant_year", nullable=true)
	private String planCommPlantYear;

	@Column(name="cs7_planCommPlantPerc", nullable=true)
	private Boolean planCommPlantPerc;

	@ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs7_invest_res_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormAllCountry> investResCountries = new HashSet<SfiPpFormAllCountry>();

	@ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs7_plan_invest_res_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormAllCountry> planInvestResCountries = new HashSet<SfiPpFormAllCountry>();

	@ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs7_plan_comm_plant_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormAllCountry> planCommPlantCountries = new HashSet<SfiPpFormAllCountry>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean isCs7EmerIssuBioe() {
		return emerIssuBioe;
	}

	public void setCs7EmerIssuBioe(Boolean emerIssuBioe) {
		this.emerIssuBioe = emerIssuBioe;
	}

	public Boolean isCs7EmerIssuCarb() {
		return emerIssuCarb;
	}

	public void setCs7EmerIssuCarb(Boolean emerIssuCarb) {
		this.emerIssuCarb = emerIssuCarb;
	}

	public Boolean isCs7EmerIssuWate() {
		return emerIssuWate;
	}

	public void setCs7EmerIssuWate(Boolean emerIssuWate) {
		this.emerIssuWate = emerIssuWate;
	}

	public Boolean isCs7EmerIssuClim() {
		return emerIssuClim;
	}

	public void setCs7EmerIssuClim(Boolean emerIssuClim) {
		this.emerIssuClim = emerIssuClim;
	}

	public Boolean isCs7EmerIssuEcos() {
		return emerIssuEcos;
	}

	public void setCs7EmerIssuEcos(Boolean emerIssuEcos) {
		this.emerIssuEcos = emerIssuEcos;
	}

	public Boolean isCs7EmerIssuOther() {
		return emerIssuOther;
	}

	public void setCs7EmerIssuOther(Boolean emerIssuOther) {
		this.emerIssuOther = emerIssuOther;
	}

	public String getCs7EmerIssuOtherSpec() {
		return emerIssuOtherSpec;
	}

	public void setCs7EmerIssuOtherSpec(String emerIssuOtherSpec) {
		this.emerIssuOtherSpec = emerIssuOtherSpec;
	}

	public Boolean isCs7InvestResIfInve() {
		return investResIfInve;
	}

	public void setCs7InvestResIfInve(Boolean investResIfInve) {
		this.investResIfInve = investResIfInve;
	}

	public Boolean isCs7InvestRespercCurrSupply() {
		return investRespercCurrSupply;
	}

	public void setCs7InvestRespercCurrSupply(Boolean investRespercCurrSupply) {
		this.investRespercCurrSupply = investRespercCurrSupply;
	}

	public Boolean isCs7PlanInvestResIfPlan() {
		return planInvestResIfPlan;
	}

	public void setCs7PlanInvestResIfPlan(Boolean planInvestResIfPlan) {
		this.planInvestResIfPlan = planInvestResIfPlan;
	}

	public String getCs7PlanInvestResYear() {
		return planInvestResYear;
	}

	public void setCs7PlanInvestResYear(String planInvestResYear) {
		this.planInvestResYear = planInvestResYear;
	}

	public Boolean isCs7PlanCommPlantIfPlanGE() {
		return planCommPlantIfPlanGE;
	}

	public void setCs7PlanCommPlantIfPlanGE(Boolean planCommPlantIfPlanGE) {
		this.planCommPlantIfPlanGE = planCommPlantIfPlanGE;
	}

	public String getCs7PlanCommPlantYear() {
		return planCommPlantYear;
	}

	public void setCs7PlanCommPlantYear(String planCommPlantYear) {
		this.planCommPlantYear = planCommPlantYear;
	}

	public Boolean isCs7PlanCommPlantPerc() {
		return planCommPlantPerc;
	}

	public void setCs7PlanCommPlantPerc(Boolean planCommPlantPerc) {
		this.planCommPlantPerc = planCommPlantPerc;
	}

	public Set<SfiPpFormAllCountry> getCs7InvestResCountries() {
		return investResCountries;
	}

	public void setCs7InvestResCountries(Set<SfiPpFormAllCountry> investResCountries) {
		this.investResCountries = investResCountries;
	}

	public Boolean isEmerIssuBioe() {
		return emerIssuBioe;
	}

	public void setEmerIssuBioe(Boolean emerIssuBioe) {
		this.emerIssuBioe = emerIssuBioe;
	}

	public Boolean isEmerIssuCarb() {
		return emerIssuCarb;
	}

	public void setEmerIssuCarb(Boolean emerIssuCarb) {
		this.emerIssuCarb = emerIssuCarb;
	}

	public Boolean isEmerIssuWate() {
		return emerIssuWate;
	}

	public void setEmerIssuWate(Boolean emerIssuWate) {
		this.emerIssuWate = emerIssuWate;
	}

	public Boolean isEmerIssuClim() {
		return emerIssuClim;
	}

	public void setEmerIssuClim(Boolean emerIssuClim) {
		this.emerIssuClim = emerIssuClim;
	}

	public Boolean isEmerIssuEcos() {
		return emerIssuEcos;
	}

	public void setEmerIssuEcos(Boolean emerIssuEcos) {
		this.emerIssuEcos = emerIssuEcos;
	}

	public Boolean isEmerIssuOther() {
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

	public Boolean isInvestResIfInve() {
		return investResIfInve;
	}

	public void setInvestResIfInve(Boolean investResIfInve) {
		this.investResIfInve = investResIfInve;
	}

	public Boolean isInvestRespercCurrSupply() {
		return investRespercCurrSupply;
	}

	public void setInvestRespercCurrSupply(Boolean investRespercCurrSupply) {
		this.investRespercCurrSupply = investRespercCurrSupply;
	}

	public Boolean isPlanInvestResIfPlan() {
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

	public Boolean isPlanCommPlantIfPlanGE() {
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

	public Boolean isPlanCommPlantPerc() {
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

	public Set<SfiPpFormAllCountry> getCs7PlanCommPlantCountries() {
		return planCommPlantCountries;
	}

	public void setCs7PlanCommPlantCountries(Set<SfiPpFormAllCountry> planCommPlantCountries) {
		this.planCommPlantCountries = planCommPlantCountries;
	}
}
