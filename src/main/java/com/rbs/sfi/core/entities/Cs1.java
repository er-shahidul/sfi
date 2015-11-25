package com.rbs.sfi.core.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="sfi_pp_forms")
public class Cs1
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cs1_companyWebsite", nullable=true)
	private String cs1CompanyWebsite;

	@Column(name="cs1_numberEmployees_USA", nullable = false, columnDefinition = "int default 0")
	private int cs1NumberEmployeesUSA;

	@Column(name="cs1_numberEmployees_CA", nullable = false, columnDefinition = "int default 0")
	private int cs1NumberEmployeesCA;

	@Column(name="cs1_numberEmployees_Other", nullable = false, columnDefinition = "int default 0")
	private int cs1NumberEmployeesOther;

	@Column(name="cs1_companyDescr", nullable=true)
	private String cs1CompanyDesc;

	@Column(name="cs1_ownsMngLands", nullable = false, columnDefinition = "boolean default false")
	private boolean cs1OwnsMngLands;

	@Column(name="cs1_ownsMngLands_inUSA", nullable = false, columnDefinition = "boolean default false")
	private boolean cs1OwnsMngLandsInUSA;

	@Column(name="cs1_ownsMngLands_inCA", nullable = false, columnDefinition = "boolean default false")
	private boolean cs1OwnsMngLandsInCA;

	@Column(name="cs1_ownsMngLands_inOther", nullable = false, columnDefinition = "boolean default false")
	private boolean cs1OwnsMngLandsInOther;

	@Column(name="cs1_hasPrimaryOperMillsYards", nullable = false, columnDefinition = "boolean default false")
	private boolean cs1HasPrimaryOperMillsYards;
	@Column(name="cs1_hasPrimaryOperMillsYards_inUSA", nullable = false, columnDefinition = "boolean default false")
	private boolean cs1HasPrimaryOperMillsYardsInUSA;
	@Column(name="cs1_hasPrimaryOperMillsYards_inCA", nullable = false, columnDefinition = "boolean default false")
	private boolean cs1HasPrimaryOperMillsYardsInCA;
	@Column(name="cs1_hasPrimaryOperMillsYards_inOther", nullable = false, columnDefinition = "boolean default false")
	private boolean cs1HasPrimaryOperMillsYardsInOther;

	@Column(name="cs1_hasSecondaryOperMillsYards", nullable = false, columnDefinition = "boolean default false")
	private boolean cs1HasSecondaryOperMillsYards;
	@Column(name="cs1_hasSecondaryOperMillsYards_inUSA", nullable = false, columnDefinition = "boolean default false")
	private boolean cs1HasSecondaryOperMillsYardsInUSA;
	@Column(name="cs1_hasSecondaryOperMillsYards_inCA", nullable = false, columnDefinition = "boolean default false")
	private boolean cs1HasSecondaryOperMillsYardsInCA;
	@Column(name="cs1_hasSecondaryOperMillsYards_inOther", nullable = false, columnDefinition = "boolean default false")
	private boolean cs1HasSecondaryOperMillsYardsInOther;

	@ManyToMany(targetEntity = SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs1_ownsMngLands_other_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormOtherCountry> cs1OwnsMngLandsOtherCountries = new HashSet<SfiPpFormOtherCountry>();

	@ManyToMany(targetEntity = SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs1_primaryOperMillsYards_other_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormOtherCountry> cs1PrimaryOperMillsYardsOtherCountries = new HashSet<SfiPpFormOtherCountry>();

	@ManyToMany(targetEntity = SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs1_secondaryOperMillsYards_other_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormOtherCountry> cs1SecondaryOperMillsYardsOtherCountries = new HashSet<SfiPpFormOtherCountry>();

	@ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs1_sells_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormAllCountry> cs1SellsCountries = new HashSet<SfiPpFormAllCountry>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCs1CompanyWebsite() {
		return cs1CompanyWebsite;
	}

	public void setCs1CompanyWebsite(String cs1CompanyWebsite) {
		this.cs1CompanyWebsite = cs1CompanyWebsite;
	}

	public String getCs1CompanyDesc() {
		return cs1CompanyDesc;
	}

	public void setCs1CompanyDesc(String cs1CompanyDesc) {
		this.cs1CompanyDesc = cs1CompanyDesc;
	}


	public int getCs1NumberEmployeesUSA() {
		return cs1NumberEmployeesUSA;
	}

	public void setCs1NumberEmployeesUSA(int cs1NumberEmployeesUSA) {
		this.cs1NumberEmployeesUSA = cs1NumberEmployeesUSA;
	}

	public int getCs1NumberEmployeesCA() {
		return cs1NumberEmployeesCA;
	}

	public void setCs1NumberEmployeesCA(int cs1NumberEmployeesCA) {
		this.cs1NumberEmployeesCA = cs1NumberEmployeesCA;
	}

	public int getCs1NumberEmployeesOther() {
		return cs1NumberEmployeesOther;
	}

	public void setCs1NumberEmployeesOther(int cs1NumberEmployeesOther) {
		this.cs1NumberEmployeesOther = cs1NumberEmployeesOther;
	}

	public boolean isCs1OwnsMngLands() {
		return cs1OwnsMngLands;
	}

	public void setCs1OwnsMngLands(boolean cs1OwnsMngLands) {
		this.cs1OwnsMngLands = cs1OwnsMngLands;
	}

	public boolean isCs1OwnsMngLandsInUSA() {
		return cs1OwnsMngLandsInUSA;
	}

	public void setCs1OwnsMngLandsInUSA(boolean cs1OwnsMngLandsInUSA) {
		this.cs1OwnsMngLandsInUSA = cs1OwnsMngLandsInUSA;
	}

	public boolean isCs1OwnsMngLandsInCA() {
		return cs1OwnsMngLandsInCA;
	}

	public void setCs1OwnsMngLandsInCA(boolean cs1OwnsMngLandsInCA) {
		this.cs1OwnsMngLandsInCA = cs1OwnsMngLandsInCA;
	}

	public boolean isCs1OwnsMngLandsInOther() {
		return cs1OwnsMngLandsInOther;
	}

	public void setCs1OwnsMngLandsInOther(boolean cs1OwnsMngLandsInOther) {
		this.cs1OwnsMngLandsInOther = cs1OwnsMngLandsInOther;
	}

	public boolean isCs1HasPrimaryOperMillsYards() {
		return cs1HasPrimaryOperMillsYards;
	}

	public void setCs1HasPrimaryOperMillsYards(boolean cs1HasPrimaryOperMillsYards) {
		this.cs1HasPrimaryOperMillsYards = cs1HasPrimaryOperMillsYards;
	}

	public boolean isCs1HasPrimaryOperMillsYardsInUSA() {
		return cs1HasPrimaryOperMillsYardsInUSA;
	}

	public void setCs1HasPrimaryOperMillsYardsInUSA(boolean cs1HasPrimaryOperMillsYardsInUSA) {
		this.cs1HasPrimaryOperMillsYardsInUSA = cs1HasPrimaryOperMillsYardsInUSA;
	}

	public boolean isCs1HasPrimaryOperMillsYardsInCA() {
		return cs1HasPrimaryOperMillsYardsInCA;
	}

	public void setCs1HasPrimaryOperMillsYardsInCA(boolean cs1HasPrimaryOperMillsYardsInCA) {
		this.cs1HasPrimaryOperMillsYardsInCA = cs1HasPrimaryOperMillsYardsInCA;
	}

	public boolean isCs1HasPrimaryOperMillsYardsInOther() {
		return cs1HasPrimaryOperMillsYardsInOther;
	}

	public void setCs1HasPrimaryOperMillsYardsInOther(boolean cs1HasPrimaryOperMillsYardsInOther) {
		this.cs1HasPrimaryOperMillsYardsInOther = cs1HasPrimaryOperMillsYardsInOther;
	}

	public boolean isCs1HasSecondaryOperMillsYards() {
		return cs1HasSecondaryOperMillsYards;
	}

	public void setCs1HasSecondaryOperMillsYards(boolean cs1HasSecondaryOperMillsYards) {
		this.cs1HasSecondaryOperMillsYards = cs1HasSecondaryOperMillsYards;
	}

	public boolean isCs1HasSecondaryOperMillsYardsInUSA() {
		return cs1HasSecondaryOperMillsYardsInUSA;
	}

	public void setCs1HasSecondaryOperMillsYardsInUSA(boolean cs1HasSecondaryOperMillsYardsInUSA) {
		this.cs1HasSecondaryOperMillsYardsInUSA = cs1HasSecondaryOperMillsYardsInUSA;
	}

	public boolean isCs1HasSecondaryOperMillsYardsInCA() {
		return cs1HasSecondaryOperMillsYardsInCA;
	}

	public void setCs1HasSecondaryOperMillsYardsInCA(boolean cs1HasSecondaryOperMillsYardsInCA) {
		this.cs1HasSecondaryOperMillsYardsInCA = cs1HasSecondaryOperMillsYardsInCA;
	}

	public boolean isCs1HasSecondaryOperMillsYardsInOther() {
		return cs1HasSecondaryOperMillsYardsInOther;
	}

	public void setCs1HasSecondaryOperMillsYardsInOther(boolean cs1HasSecondaryOperMillsYardsInOther) {
		this.cs1HasSecondaryOperMillsYardsInOther = cs1HasSecondaryOperMillsYardsInOther;
	}

	public Set<SfiPpFormOtherCountry> getCs1OwnsMngLandsOtherCountries() {
		return cs1OwnsMngLandsOtherCountries;
	}

	public void setCs1OwnsMngLandsOtherCountries(Set<SfiPpFormOtherCountry> cs1OwnsMngLandsOtherCountries) {
		this.cs1OwnsMngLandsOtherCountries = cs1OwnsMngLandsOtherCountries;
	}

	public Set<SfiPpFormOtherCountry> getCs1PrimaryOperMillsYardsOtherCountries() {
		return cs1PrimaryOperMillsYardsOtherCountries;
	}

	public void setCs1PrimaryOperMillsYardsOtherCountries(Set<SfiPpFormOtherCountry> cs1PrimaryOperMillsYardsOtherCountries) {
		this.cs1PrimaryOperMillsYardsOtherCountries = cs1PrimaryOperMillsYardsOtherCountries;
	}

	public Set<SfiPpFormOtherCountry> getCs1SecondaryOperMillsYardsOtherCountries() {
		return cs1SecondaryOperMillsYardsOtherCountries;
	}

	public void setCs1SecondaryOperMillsYardsOtherCountries(Set<SfiPpFormOtherCountry> cs1SecondaryOperMillsYardsOtherCountries) {
		this.cs1SecondaryOperMillsYardsOtherCountries = cs1SecondaryOperMillsYardsOtherCountries;
	}

	public Set<SfiPpFormAllCountry> getCs1SellsCountries() {
		return cs1SellsCountries;
	}

	public void setCs1SellsCountries(Set<SfiPpFormAllCountry> cs1SellsCountries) {
		this.cs1SellsCountries = cs1SellsCountries;
	}
}
