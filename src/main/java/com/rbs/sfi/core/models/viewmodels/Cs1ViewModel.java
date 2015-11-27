package com.rbs.sfi.core.models.viewmodels;

import com.rbs.sfi.core.models.entities.SfiPpFormAllCountry;
import com.rbs.sfi.core.models.entities.SfiPpFormOtherCountry;

import java.util.Set;

public class Cs1ViewModel {
	private Integer id;
	private String companyWebsite;
	private Integer numberEmployeesUSA;
	private Integer numberEmployeesCA;
	private Integer numberEmployeesOther;
	private String companyDesc;
	private Boolean ownsMngLands;
	private Boolean ownsMngLandsInUSA;
	private Boolean ownsMngLandsInCA;
	private Boolean ownsMngLandsInOther;
	private Boolean hasPrimaryOperMillsYards;
	private Boolean hasPrimaryOperMillsYardsInUSA;
	private Boolean hasPrimaryOperMillsYardsInCA;
	private Boolean hasPrimaryOperMillsYardsInOther;
	private Boolean hasSecondaryOperMillsYards;
	private Boolean hasSecondaryOperMillsYardsInUSA;
	private Boolean hasSecondaryOperMillsYardsInCA;
	private Boolean hasSecondaryOperMillsYardsInOther;
	private Set<SfiPpFormOtherCountry> ownsMngLandsOtherCountries;
	private Set<SfiPpFormOtherCountry> primaryOperMillsYardsOtherCountries;
	private Set<SfiPpFormOtherCountry> secondaryOperMillsYardsOtherCountries;
	private Set<SfiPpFormAllCountry> sellsCountries;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	public Integer getNumberEmployeesUSA() {
		return numberEmployeesUSA;
	}

	public void setNumberEmployeesUSA(Integer numberEmployeesUSA) {
		this.numberEmployeesUSA = numberEmployeesUSA;
	}

	public Integer getNumberEmployeesCA() {
		return numberEmployeesCA;
	}

	public void setNumberEmployeesCA(Integer numberEmployeesCA) {
		this.numberEmployeesCA = numberEmployeesCA;
	}

	public Integer getNumberEmployeesOther() {
		return numberEmployeesOther;
	}

	public void setNumberEmployeesOther(Integer numberEmployeesOther) {
		this.numberEmployeesOther = numberEmployeesOther;
	}

	public String getCompanyDesc() {
		return companyDesc;
	}

	public void setCompanyDesc(String companyDesc) {
		this.companyDesc = companyDesc;
	}

	public Boolean getOwnsMngLands() {
		return ownsMngLands;
	}

	public void setOwnsMngLands(Boolean ownsMngLands) {
		this.ownsMngLands = ownsMngLands;
	}

	public Boolean getOwnsMngLandsInUSA() {
		return ownsMngLandsInUSA;
	}

	public void setOwnsMngLandsInUSA(Boolean ownsMngLandsInUSA) {
		this.ownsMngLandsInUSA = ownsMngLandsInUSA;
	}

	public Boolean getOwnsMngLandsInCA() {
		return ownsMngLandsInCA;
	}

	public void setOwnsMngLandsInCA(Boolean ownsMngLandsInCA) {
		this.ownsMngLandsInCA = ownsMngLandsInCA;
	}

	public Boolean getOwnsMngLandsInOther() {
		return ownsMngLandsInOther;
	}

	public void setOwnsMngLandsInOther(Boolean ownsMngLandsInOther) {
		this.ownsMngLandsInOther = ownsMngLandsInOther;
	}

	public Boolean getHasPrimaryOperMillsYards() {
		return hasPrimaryOperMillsYards;
	}

	public void setHasPrimaryOperMillsYards(Boolean hasPrimaryOperMillsYards) {
		this.hasPrimaryOperMillsYards = hasPrimaryOperMillsYards;
	}

	public Boolean getHasPrimaryOperMillsYardsInUSA() {
		return hasPrimaryOperMillsYardsInUSA;
	}

	public void setHasPrimaryOperMillsYardsInUSA(Boolean hasPrimaryOperMillsYardsInUSA) {
		this.hasPrimaryOperMillsYardsInUSA = hasPrimaryOperMillsYardsInUSA;
	}

	public Boolean getHasPrimaryOperMillsYardsInCA() {
		return hasPrimaryOperMillsYardsInCA;
	}

	public void setHasPrimaryOperMillsYardsInCA(Boolean hasPrimaryOperMillsYardsInCA) {
		this.hasPrimaryOperMillsYardsInCA = hasPrimaryOperMillsYardsInCA;
	}

	public Boolean getHasPrimaryOperMillsYardsInOther() {
		return hasPrimaryOperMillsYardsInOther;
	}

	public void setHasPrimaryOperMillsYardsInOther(Boolean hasPrimaryOperMillsYardsInOther) {
		this.hasPrimaryOperMillsYardsInOther = hasPrimaryOperMillsYardsInOther;
	}

	public Boolean getHasSecondaryOperMillsYards() {
		return hasSecondaryOperMillsYards;
	}

	public void setHasSecondaryOperMillsYards(Boolean hasSecondaryOperMillsYards) {
		this.hasSecondaryOperMillsYards = hasSecondaryOperMillsYards;
	}

	public Boolean getHasSecondaryOperMillsYardsInUSA() {
		return hasSecondaryOperMillsYardsInUSA;
	}

	public void setHasSecondaryOperMillsYardsInUSA(Boolean hasSecondaryOperMillsYardsInUSA) {
		this.hasSecondaryOperMillsYardsInUSA = hasSecondaryOperMillsYardsInUSA;
	}

	public Boolean getHasSecondaryOperMillsYardsInCA() {
		return hasSecondaryOperMillsYardsInCA;
	}

	public void setHasSecondaryOperMillsYardsInCA(Boolean hasSecondaryOperMillsYardsInCA) {
		this.hasSecondaryOperMillsYardsInCA = hasSecondaryOperMillsYardsInCA;
	}

	public Boolean getHasSecondaryOperMillsYardsInOther() {
		return hasSecondaryOperMillsYardsInOther;
	}

	public void setHasSecondaryOperMillsYardsInOther(Boolean hasSecondaryOperMillsYardsInOther) {
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
