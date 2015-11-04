package com.rbs.sfi.core.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.entities.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="sfi_pp_forms")
public class SfiPpForm
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne(targetEntity = com.rbs.sfi.admin.entities.User.class, optional=true)
	@JoinColumn(name="status_id", referencedColumnName="id", nullable=true)
	private SfiPpFormStatus status;

	@OneToOne(targetEntity = com.rbs.sfi.admin.entities.Company.class, optional=false)
	@JoinColumn(name="company_id", referencedColumnName="id", nullable=true)
	private Company company;

	@JsonIgnore
	@ManyToOne(targetEntity = com.rbs.sfi.admin.entities.User.class, optional=true)
	@JoinColumn(name="created_by", referencedColumnName="id", nullable=true)
	private User createdBy;

	@Column(name="isSaved", nullable=true)
	private boolean isSaved;

	@Column(name="isComplete", nullable=true)
	private boolean isComplete;

	/*********************** Section CS1 ********************************************/

	@Column(name="cs1_companyWebsite", nullable=true)
	private String cs1CompanyWebsite;

	@Column(name="cs1_numberEmployees_USA", nullable=true)
	private int cs1NumberEmployeesUSA;

	@Column(name="cs1_numberEmployees_CA", nullable=true)
	private int cs1NumberEmployeesCA;

	@Column(name="cs1_numberEmployees_Other", nullable=true)
	private int cs1NumberEmployeesOther;

	@Column(name="cs1_companyDescr", nullable=true)
	private String cs1CompanyDesc;

	@Column(name="cs1_ownsMngLands_inUSA", nullable=true)
	private boolean cs1OwnsMngLandsInUSA;

	@Column(name="cs1_ownsMngLands_inCA", nullable=true)
	private boolean cs1OwnsMngLandsInCA;

	@Column(name="cs1_ownsMngLands_inOther", nullable=true)
	private boolean cs1OwnsMngLandsInOther;

	@Column(name="cs1_hasPrimaryOperMillsYards", nullable=true)
	private boolean cs1HasPrimaryOperMillsYards;
	@Column(name="cs1_hasPrimaryOperMillsYards_inUSA", nullable=true)
	private boolean cs1HasPrimaryOperMillsYardsInUSA;
	@Column(name="cs1_hasPrimaryOperMillsYards_inCA", nullable=true)
	private boolean cs1HasPrimaryOperMillsYardsInCA;
	@Column(name="cs1_hasPrimaryOperMillsYards_inOther", nullable=true)
	private boolean cs1HasPrimaryOperMillsYardsInOther;


	@Column(name="cs1_hasSecondaryOperMillsYards", nullable=true)
	private boolean cs1HasSecondaryOperMillsYards;
	@Column(name="cs1_hasSecondaryOperMillsYards_inUSA", nullable=true)
	private boolean cs1HasSecondaryOperMillsYardsInUSA;
	@Column(name="cs1_hasSecondaryOperMillsYards_inCA", nullable=true)
	private boolean cs1HasSecondaryOperMillsYardsInCA;
	@Column(name="cs1_hasSecondaryOperMillsYards_inOther", nullable=true)
	private boolean cs1HasSecondaryOperMillsYardsInOther;

	@Column(name="cs1_hasOperMillsYards", nullable=true)
	private boolean cs1HasOperationsYards;

	@Column(name="cs1_mng_inUSA", nullable=true)
	private boolean cs1OperatesInUsa;

	@Column(name="cs1_mng_inCA", nullable=true)
	private boolean cs1OperatesInCanada;

	@Column(name="cs1_manages_operates_other", nullable=true)
	private boolean cs1OperatesInOthers;

	@JsonIgnore
	@ManyToMany(targetEntity = com.rbs.sfi.core.entities.SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL})
	@JoinTable(name="sfi_pp_form_cs1_ownsMngLands_other_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id")})
	private Set<SfiPpFormOtherCountry> sfiPpFormCs1OwnsMngLandsOtherCountries = new HashSet<SfiPpFormOtherCountry>();

	@JsonIgnore
	@ManyToMany(targetEntity = com.rbs.sfi.core.entities.SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL})
	@JoinTable(name="sfi_pp_form_cs1_primaryOperMillsYards_other_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id")})
	private Set<SfiPpFormOtherCountry> sfiPpFormCs1PrimaryOperMillsYardsOtherCountries = new HashSet<SfiPpFormOtherCountry>();

	@JsonIgnore
	@ManyToMany(targetEntity = com.rbs.sfi.core.entities.SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL})
	@JoinTable(name="sfi_pp_form_cs1_secondaryOperMillsYards_other_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id")})
	private Set<SfiPpFormOtherCountry> sfiPpFormCs1SecondaryOperMillsYardsOtherCountries = new HashSet<SfiPpFormOtherCountry>();

	@ManyToMany(targetEntity = com.rbs.sfi.core.entities.SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs1_sells_other_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id")})
	private Set<SfiPpFormAllCountry> sfiPpFormCs1SellsOtherCountries = new HashSet<SfiPpFormAllCountry>();


	/*********************** Section CS2 ********************************************/






	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public SfiPpFormStatus getStatus() {
		return status;
	}

	public void setStatus(SfiPpFormStatus status) {
		this.status = status;
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

	public boolean isCs1HasOperationsYards() {
		return cs1HasOperationsYards;
	}

	public void setCs1HasOperationsYards(boolean cs1HasOperationsYards) {
		this.cs1HasOperationsYards = cs1HasOperationsYards;
	}

	public boolean isCs1OperatesInUsa() {
		return cs1OperatesInUsa;
	}

	public void setCs1OperatesInUsa(boolean cs1OperatesInUsa) {
		this.cs1OperatesInUsa = cs1OperatesInUsa;
	}

	public boolean isCs1OperatesInCanada() {
		return cs1OperatesInCanada;
	}

	public void setCs1OperatesInCanada(boolean cs1OperatesInCanada) {
		this.cs1OperatesInCanada = cs1OperatesInCanada;
	}

	public boolean isCs1OperatesInOthers() {
		return cs1OperatesInOthers;
	}

	public void setCs1OperatesInOthers(boolean cs1OperatesInOthers) {
		this.cs1OperatesInOthers = cs1OperatesInOthers;
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

	public Set<SfiPpFormOtherCountry> getSfiPpFormCs1OwnsMngLandsOtherCountries() {
		return sfiPpFormCs1OwnsMngLandsOtherCountries;
	}

	public void setSfiPpFormCs1OwnsMngLandsOtherCountries(Set<SfiPpFormOtherCountry> sfiPpFormCs1OwnsMngLandsOtherCountries) {
		this.sfiPpFormCs1OwnsMngLandsOtherCountries = sfiPpFormCs1OwnsMngLandsOtherCountries;
	}

	public Set<SfiPpFormOtherCountry> getSfiPpFormCs1PrimaryOperMillsYardsOtherCountries() {
		return sfiPpFormCs1PrimaryOperMillsYardsOtherCountries;
	}

	public void setSfiPpFormCs1PrimaryOperMillsYardsOtherCountries(Set<SfiPpFormOtherCountry> sfiPpFormCs1PrimaryOperMillsYardsOtherCountries) {
		this.sfiPpFormCs1PrimaryOperMillsYardsOtherCountries = sfiPpFormCs1PrimaryOperMillsYardsOtherCountries;
	}

	public Set<SfiPpFormOtherCountry> getSfiPpFormCs1SecondaryOperMillsYardsOtherCountries() {
		return sfiPpFormCs1SecondaryOperMillsYardsOtherCountries;
	}

	public void setSfiPpFormCs1SecondaryOperMillsYardsOtherCountries(Set<SfiPpFormOtherCountry> sfiPpFormCs1SecondaryOperMillsYardsOtherCountries) {
		this.sfiPpFormCs1SecondaryOperMillsYardsOtherCountries = sfiPpFormCs1SecondaryOperMillsYardsOtherCountries;
	}

	public Set<SfiPpFormAllCountry> getSfiPpFormCs1SellsOtherCountries() {
		return sfiPpFormCs1SellsOtherCountries;
	}

	public void setSfiPpFormCs1SellsOtherCountries(Set<SfiPpFormAllCountry> sfiPpFormCs1SellsOtherCountries) {
		this.sfiPpFormCs1SellsOtherCountries = sfiPpFormCs1SellsOtherCountries;
	}

	public boolean isSaved() {
		return isSaved;
	}

	public void setIsSaved(boolean isSaved) {
		this.isSaved = isSaved;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setIsComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
}
