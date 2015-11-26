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
	private String companyWebsite;

	@Column(name="cs1_numberEmployees_USA", nullable = false, columnDefinition = "int default 0")
	private int numberEmployeesUSA;

	@Column(name="cs1_numberEmployees_CA", nullable = false, columnDefinition = "int default 0")
	private int numberEmployeesCA;

	@Column(name="cs1_numberEmployees_Other", nullable = false, columnDefinition = "int default 0")
	private int numberEmployeesOther;

	@Column(name="cs1_companyDescr", nullable=true)
	private String companyDesc;

	@Column(name="cs1_ownsMngLands", nullable = false, columnDefinition = "boolean default false")
	private boolean ownsMngLands;

	@Column(name="cs1_ownsMngLands_inUSA", nullable = false, columnDefinition = "boolean default false")
	private boolean ownsMngLandsInUSA;

	@Column(name="cs1_ownsMngLands_inCA", nullable = false, columnDefinition = "boolean default false")
	private boolean ownsMngLandsInCA;

	@Column(name="cs1_ownsMngLands_inOther", nullable = false, columnDefinition = "boolean default false")
	private boolean ownsMngLandsInOther;

	@Column(name="cs1_hasPrimaryOperMillsYards", nullable = false, columnDefinition = "boolean default false")
	private boolean hasPrimaryOperMillsYards;
	@Column(name="cs1_hasPrimaryOperMillsYards_inUSA", nullable = false, columnDefinition = "boolean default false")
	private boolean hasPrimaryOperMillsYardsInUSA;
	@Column(name="cs1_hasPrimaryOperMillsYards_inCA", nullable = false, columnDefinition = "boolean default false")
	private boolean hasPrimaryOperMillsYardsInCA;
	@Column(name="cs1_hasPrimaryOperMillsYards_inOther", nullable = false, columnDefinition = "boolean default false")
	private boolean hasPrimaryOperMillsYardsInOther;

	@Column(name="cs1_hasSecondaryOperMillsYards", nullable = false, columnDefinition = "boolean default false")
	private boolean hasSecondaryOperMillsYards;
	@Column(name="cs1_hasSecondaryOperMillsYards_inUSA", nullable = false, columnDefinition = "boolean default false")
	private boolean hasSecondaryOperMillsYardsInUSA;
	@Column(name="cs1_hasSecondaryOperMillsYards_inCA", nullable = false, columnDefinition = "boolean default false")
	private boolean hasSecondaryOperMillsYardsInCA;
	@Column(name="cs1_hasSecondaryOperMillsYards_inOther", nullable = false, columnDefinition = "boolean default false")
	private boolean hasSecondaryOperMillsYardsInOther;


	@ManyToMany(targetEntity = SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs1_ownsMngLands_other_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormOtherCountry> ownsMngLandsOtherCountries = new HashSet<SfiPpFormOtherCountry>();

	@ManyToMany(targetEntity = SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs1_primaryOperMillsYards_other_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormOtherCountry> primaryOperMillsYardsOtherCountries = new HashSet<SfiPpFormOtherCountry>();

	@ManyToMany(targetEntity = SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs1_secondaryOperMillsYards_other_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormOtherCountry> secondaryOperMillsYardsOtherCountries = new HashSet<SfiPpFormOtherCountry>();

	@ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs1_sells_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id", referencedColumnName = "id")})
	private Set<SfiPpFormAllCountry> sellsCountries = new HashSet<SfiPpFormAllCountry>();



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	public int getNumberEmployeesUSA() {
		return numberEmployeesUSA;
	}

	public void setNumberEmployeesUSA(int numberEmployeesUSA) {
		this.numberEmployeesUSA = numberEmployeesUSA;
	}

	public int getNumberEmployeesCA() {
		return numberEmployeesCA;
	}

	public void setNumberEmployeesCA(int numberEmployeesCA) {
		this.numberEmployeesCA = numberEmployeesCA;
	}

	public int getNumberEmployeesOther() {
		return numberEmployeesOther;
	}

	public void setNumberEmployeesOther(int numberEmployeesOther) {
		this.numberEmployeesOther = numberEmployeesOther;
	}

	public String getCompanyDesc() {
		return companyDesc;
	}

	public void setCompanyDesc(String companyDesc) {
		this.companyDesc = companyDesc;
	}

	public boolean isOwnsMngLands() {
		return ownsMngLands;
	}

	public void setOwnsMngLands(boolean ownsMngLands) {
		this.ownsMngLands = ownsMngLands;
	}

	public boolean isOwnsMngLandsInUSA() {
		return ownsMngLandsInUSA;
	}

	public void setOwnsMngLandsInUSA(boolean ownsMngLandsInUSA) {
		this.ownsMngLandsInUSA = ownsMngLandsInUSA;
	}

	public boolean isOwnsMngLandsInCA() {
		return ownsMngLandsInCA;
	}

	public void setOwnsMngLandsInCA(boolean ownsMngLandsInCA) {
		this.ownsMngLandsInCA = ownsMngLandsInCA;
	}

	public boolean isOwnsMngLandsInOther() {
		return ownsMngLandsInOther;
	}

	public void setOwnsMngLandsInOther(boolean ownsMngLandsInOther) {
		this.ownsMngLandsInOther = ownsMngLandsInOther;
	}

	public boolean isHasPrimaryOperMillsYards() {
		return hasPrimaryOperMillsYards;
	}

	public void setHasPrimaryOperMillsYards(boolean hasPrimaryOperMillsYards) {
		this.hasPrimaryOperMillsYards = hasPrimaryOperMillsYards;
	}

	public boolean isHasPrimaryOperMillsYardsInUSA() {
		return hasPrimaryOperMillsYardsInUSA;
	}

	public void setHasPrimaryOperMillsYardsInUSA(boolean hasPrimaryOperMillsYardsInUSA) {
		this.hasPrimaryOperMillsYardsInUSA = hasPrimaryOperMillsYardsInUSA;
	}

	public boolean isHasPrimaryOperMillsYardsInCA() {
		return hasPrimaryOperMillsYardsInCA;
	}

	public void setHasPrimaryOperMillsYardsInCA(boolean hasPrimaryOperMillsYardsInCA) {
		this.hasPrimaryOperMillsYardsInCA = hasPrimaryOperMillsYardsInCA;
	}

	public boolean isHasPrimaryOperMillsYardsInOther() {
		return hasPrimaryOperMillsYardsInOther;
	}

	public void setHasPrimaryOperMillsYardsInOther(boolean hasPrimaryOperMillsYardsInOther) {
		this.hasPrimaryOperMillsYardsInOther = hasPrimaryOperMillsYardsInOther;
	}

	public boolean isHasSecondaryOperMillsYards() {
		return hasSecondaryOperMillsYards;
	}

	public void setHasSecondaryOperMillsYards(boolean hasSecondaryOperMillsYards) {
		this.hasSecondaryOperMillsYards = hasSecondaryOperMillsYards;
	}

	public boolean isHasSecondaryOperMillsYardsInUSA() {
		return hasSecondaryOperMillsYardsInUSA;
	}

	public void setHasSecondaryOperMillsYardsInUSA(boolean hasSecondaryOperMillsYardsInUSA) {
		this.hasSecondaryOperMillsYardsInUSA = hasSecondaryOperMillsYardsInUSA;
	}

	public boolean isHasSecondaryOperMillsYardsInCA() {
		return hasSecondaryOperMillsYardsInCA;
	}

	public void setHasSecondaryOperMillsYardsInCA(boolean hasSecondaryOperMillsYardsInCA) {
		this.hasSecondaryOperMillsYardsInCA = hasSecondaryOperMillsYardsInCA;
	}

	public boolean isHasSecondaryOperMillsYardsInOther() {
		return hasSecondaryOperMillsYardsInOther;
	}

	public void setHasSecondaryOperMillsYardsInOther(boolean hasSecondaryOperMillsYardsInOther) {
		this.hasSecondaryOperMillsYardsInOther = hasSecondaryOperMillsYardsInOther;
	}

	public Set<SfiPpFormOtherCountry> getOwnsMngLandsOtherCountries() {
		return ownsMngLandsOtherCountries;
	}

	public void setOwnsMngLandsOtherCountries(Set<SfiPpFormOtherCountry> ownsMngLandsOtherCountries) {
		this.ownsMngLandsOtherCountries = ownsMngLandsOtherCountries;
	}

	public Set<SfiPpFormOtherCountry> getPrimaryOperMillsYardsOtherCountries() {
		return primaryOperMillsYardsOtherCountries;
	}

	public void setPrimaryOperMillsYardsOtherCountries(Set<SfiPpFormOtherCountry> primaryOperMillsYardsOtherCountries) {
		this.primaryOperMillsYardsOtherCountries = primaryOperMillsYardsOtherCountries;
	}

	public Set<SfiPpFormOtherCountry> getSecondaryOperMillsYardsOtherCountries() {
		return secondaryOperMillsYardsOtherCountries;
	}

	public void setSecondaryOperMillsYardsOtherCountries(Set<SfiPpFormOtherCountry> secondaryOperMillsYardsOtherCountries) {
		this.secondaryOperMillsYardsOtherCountries = secondaryOperMillsYardsOtherCountries;
	}

	public Set<SfiPpFormAllCountry> getSellsCountries() {
		return sellsCountries;
	}

	public void setSellsCountries(Set<SfiPpFormAllCountry> sellsCountries) {
		this.sellsCountries = sellsCountries;
	}


}
