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
	private int id;

	@Column(name="cs7_emerIssu_bioe", nullable=true)
	private boolean cs7EmerIssuBioe;

	@Column(name="cs7_emerIssu_carb", nullable=true)
	private boolean cs7EmerIssuCarb;

	@Column(name="cs7_emerIssu_wate", nullable=true)
	private boolean cs7EmerIssuWate;

	@Column(name="cs7_emerIssu_clim", nullable=true)
	private boolean cs7EmerIssuClim;

	@Column(name="cs7_emerIssu_ecos", nullable=true)
	private boolean cs7EmerIssuEcos;

	@Column(name="cs7_emerIssu_other", nullable=true)
	private boolean cs7EmerIssuOther;

	@Column(name="cs7_emerIssu_otherSpec", nullable=true)
	private String cs7EmerIssuOtherSpec;

	@Column(name="cs7_investRes_ifInve", nullable=true)
	private boolean cs7InvestResIfInve;

	@Column(name="cs7_investResperc_currSupply", nullable=true)
	private boolean cs7InvestRespercCurrSupply;

	@Column(name="cs7_planInvestRes_ifPlan", nullable=true)
	private boolean cs7PlanInvestResIfPlan;

	@Column(name="cs7_planInvestRes_year", nullable=true)
	private String cs7PlanInvestResYear;

	@Column(name="cs7_planCommPlant_ifPlanGE", nullable=true)
	private boolean cs7PlanCommPlantIfPlanGE;

	@Column(name="cs7_planCommPlant_year", nullable=true)
	private String cs7PlanCommPlantYear;

	@Column(name="cs7_planCommPlantPerc", nullable=true)
	private boolean cs7PlanCommPlantPerc;

	@ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs7_invest_res_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormAllCountry> cs7InvestResCountries = new HashSet<SfiPpFormAllCountry>();

	@ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs7_plan_invest_res_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormAllCountry> cs7planInvestResCountries = new HashSet<SfiPpFormAllCountry>();

	@ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs7_plan_comm_plant_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormAllCountry> cs7PlanCommPlantCountries = new HashSet<SfiPpFormAllCountry>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isCs7EmerIssuBioe() {
		return cs7EmerIssuBioe;
	}

	public void setCs7EmerIssuBioe(boolean cs7EmerIssuBioe) {
		this.cs7EmerIssuBioe = cs7EmerIssuBioe;
	}

	public boolean isCs7EmerIssuCarb() {
		return cs7EmerIssuCarb;
	}

	public void setCs7EmerIssuCarb(boolean cs7EmerIssuCarb) {
		this.cs7EmerIssuCarb = cs7EmerIssuCarb;
	}

	public boolean isCs7EmerIssuWate() {
		return cs7EmerIssuWate;
	}

	public void setCs7EmerIssuWate(boolean cs7EmerIssuWate) {
		this.cs7EmerIssuWate = cs7EmerIssuWate;
	}

	public boolean isCs7EmerIssuClim() {
		return cs7EmerIssuClim;
	}

	public void setCs7EmerIssuClim(boolean cs7EmerIssuClim) {
		this.cs7EmerIssuClim = cs7EmerIssuClim;
	}

	public boolean isCs7EmerIssuEcos() {
		return cs7EmerIssuEcos;
	}

	public void setCs7EmerIssuEcos(boolean cs7EmerIssuEcos) {
		this.cs7EmerIssuEcos = cs7EmerIssuEcos;
	}

	public boolean isCs7EmerIssuOther() {
		return cs7EmerIssuOther;
	}

	public void setCs7EmerIssuOther(boolean cs7EmerIssuOther) {
		this.cs7EmerIssuOther = cs7EmerIssuOther;
	}

	public String getCs7EmerIssuOtherSpec() {
		return cs7EmerIssuOtherSpec;
	}

	public void setCs7EmerIssuOtherSpec(String cs7EmerIssuOtherSpec) {
		this.cs7EmerIssuOtherSpec = cs7EmerIssuOtherSpec;
	}

	public boolean isCs7InvestResIfInve() {
		return cs7InvestResIfInve;
	}

	public void setCs7InvestResIfInve(boolean cs7InvestResIfInve) {
		this.cs7InvestResIfInve = cs7InvestResIfInve;
	}

	public boolean isCs7InvestRespercCurrSupply() {
		return cs7InvestRespercCurrSupply;
	}

	public void setCs7InvestRespercCurrSupply(boolean cs7InvestRespercCurrSupply) {
		this.cs7InvestRespercCurrSupply = cs7InvestRespercCurrSupply;
	}

	public boolean isCs7PlanInvestResIfPlan() {
		return cs7PlanInvestResIfPlan;
	}

	public void setCs7PlanInvestResIfPlan(boolean cs7PlanInvestResIfPlan) {
		this.cs7PlanInvestResIfPlan = cs7PlanInvestResIfPlan;
	}

	public String getCs7PlanInvestResYear() {
		return cs7PlanInvestResYear;
	}

	public void setCs7PlanInvestResYear(String cs7PlanInvestResYear) {
		this.cs7PlanInvestResYear = cs7PlanInvestResYear;
	}

	public boolean isCs7PlanCommPlantIfPlanGE() {
		return cs7PlanCommPlantIfPlanGE;
	}

	public void setCs7PlanCommPlantIfPlanGE(boolean cs7PlanCommPlantIfPlanGE) {
		this.cs7PlanCommPlantIfPlanGE = cs7PlanCommPlantIfPlanGE;
	}

	public String getCs7PlanCommPlantYear() {
		return cs7PlanCommPlantYear;
	}

	public void setCs7PlanCommPlantYear(String cs7PlanCommPlantYear) {
		this.cs7PlanCommPlantYear = cs7PlanCommPlantYear;
	}

	public boolean isCs7PlanCommPlantPerc() {
		return cs7PlanCommPlantPerc;
	}

	public void setCs7PlanCommPlantPerc(boolean cs7PlanCommPlantPerc) {
		this.cs7PlanCommPlantPerc = cs7PlanCommPlantPerc;
	}

	public Set<SfiPpFormAllCountry> getCs7InvestResCountries() {
		return cs7InvestResCountries;
	}

	public void setCs7InvestResCountries(Set<SfiPpFormAllCountry> cs7InvestResCountries) {
		this.cs7InvestResCountries = cs7InvestResCountries;
	}

	public Set<SfiPpFormAllCountry> getCs7planInvestResCountries() {
		return cs7planInvestResCountries;
	}

	public void setCs7planInvestResCountries(Set<SfiPpFormAllCountry> cs7planInvestResCountries) {
		this.cs7planInvestResCountries = cs7planInvestResCountries;
	}

	public Set<SfiPpFormAllCountry> getCs7PlanCommPlantCountries() {
		return cs7PlanCommPlantCountries;
	}

	public void setCs7PlanCommPlantCountries(Set<SfiPpFormAllCountry> cs7PlanCommPlantCountries) {
		this.cs7PlanCommPlantCountries = cs7PlanCommPlantCountries;
	}
}
