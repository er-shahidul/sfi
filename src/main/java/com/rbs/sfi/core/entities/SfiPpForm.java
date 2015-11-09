package com.rbs.sfi.core.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.entities.User;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="sfi_pp_forms")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SfiPpForm
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne(targetEntity = com.rbs.sfi.admin.entities.User.class, optional=true)
	@JoinColumn(name="status_id", referencedColumnName="id", nullable=true)
	private SfiPpFormStatus status;

	@JsonIgnore
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

	@Column(name="cs1_ownsMngLands", nullable=true)
	private boolean cs1OwnsMngLands;

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


	@ManyToMany(targetEntity = com.rbs.sfi.core.entities.SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs1_ownsMngLands_other_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id")})
	private Set<SfiPpFormOtherCountry> cs1OwnsMngLandsOtherCountries = new HashSet<SfiPpFormOtherCountry>();


	@ManyToMany(targetEntity = com.rbs.sfi.core.entities.SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs1_primaryOperMillsYards_other_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id")})
	private Set<SfiPpFormOtherCountry> cs1PrimaryOperMillsYardsOtherCountries = new HashSet<SfiPpFormOtherCountry>();


	@ManyToMany(targetEntity = com.rbs.sfi.core.entities.SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs1_secondaryOperMillsYards_other_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id")})
	private Set<SfiPpFormOtherCountry> cs1SecondaryOperMillsYardsOtherCountries = new HashSet<SfiPpFormOtherCountry>();


	@ManyToMany(targetEntity = com.rbs.sfi.core.entities.SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name="sfi_pp_form_cs1_sells_countries",
			joinColumns={@JoinColumn(name="form_id")},
			inverseJoinColumns={@JoinColumn(name="country_id")})
	private Set<SfiPpFormAllCountry> cs1SellsCountries = new HashSet<SfiPpFormAllCountry>();


	/*********************** Section CS2 ********************************************/


	@Column(name="cs2_usaPrivate_totalOwnMng", nullable=true)
	private float cs2UsaPrivateTotalAreaOwnOrManage;
	@Column(name="cs2_usaPrivate_totalCertified", nullable=true)
	private float cs2UsaPrivateTotalAreaCertified;
	@Column(name="cs2_usaPrivate_area", nullable=true)
	private float cs2UsaPrivateAreaManagedForPublic;
	@Column(name="cs2_usaPrivate_areaCertified", nullable=true)
	private float cs2UsaPrivateAreaCertifiedForPublic;

	@Column(name="cs2_usaPrivate_categories", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs2UsaPrivateRecreationCategories = new ArrayList<String>();

	@Column(name="cs2_usaPublic_totalOwnMng", nullable=true)
	private float cs2UsaPublicTotalAreaOwnOrManage;
	@Column(name="cs2_usaPublic_totalCertified", nullable=true)
	private float cs2UsaPublicTotalAreaCertified;
	@Column(name="cs2_usaPublic_area", nullable=true)
	private float cs2UsaPublicAreaManagedForPublic;
	@Column(name="cs2_usaPublic_areaCertified", nullable=true)
	private float cs2UsaPublicAreaCertifiedForPublic;

	@Column(name="cs2_usaPublic_categories", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs2UsaPublicRecreationCategories = new ArrayList<String>();

	@Column(name="cs2_caCrown_totalOwnMng", nullable=true)
	private float cs2CaCrownTotalAreaOwnOrManage;
	@Column(name="cs2_caCrown_totalCertified", nullable=true)
	private float cs2CaCrownTotalAreaCertified;
	@Column(name="cs2_caCrown_area", nullable=true)
	private float cs2CaCrownAreaManagedForPublic;
	@Column(name="cs2_caCrown_areaCertified", nullable=true)
	private float cs2CaCrownAreaCertifiedForPublic;

	@Column(name="cs2_caCrown_categories", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs2CaCrownRecreationCategories = new ArrayList<String>();

	@Column(name="cs2_caPrivate_totalOwnMng", nullable=true)
	private float cs2CaPrivateTotalAreaOwnOrManage;
	@Column(name="cs2_caPrivate_totalCertified", nullable=true)
	private float cs2CaPrivateTotalAreaCertified;
	@Column(name="cs2_caPrivate_area", nullable=true)
	private float cs2CaPrivateAreaManagedForPublic;
	@Column(name="cs2_caPrivate_areaCertified", nullable=true)
	private float cs2CaPrivateAreaCertifiedForPublic;

	@Column(name="cs2_caPrivate_categories", nullable=true)
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<String> cs2CaPrivateRecreationCategories = new ArrayList<String>();

	@OneToMany(targetEntity = SfiPpFormCs2OutsideUsaCa.class, mappedBy="sfiPpForm", fetch = FetchType.EAGER)
	private Set<SfiPpFormCs2OutsideUsaCa> cs2OutsideCountries = new HashSet<SfiPpFormCs2OutsideUsaCa>();



	/*********************** Section CS3 ********************************************/


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

	public List<String> getCs2UsaPrivateRecreationCategories() {
		return cs2UsaPrivateRecreationCategories;
	}

	public void setCs2UsaPrivateRecreationCategories(List<String> cs2UsaPrivateRecreationCategories) {
		this.cs2UsaPrivateRecreationCategories = cs2UsaPrivateRecreationCategories;
	}


	public float getCs2UsaPrivateTotalAreaOwnOrManage() {
		return cs2UsaPrivateTotalAreaOwnOrManage;
	}

	public void setCs2UsaPrivateTotalAreaOwnOrManage(float cs2UsaPrivateTotalAreaOwnOrManage) {
		this.cs2UsaPrivateTotalAreaOwnOrManage = cs2UsaPrivateTotalAreaOwnOrManage;
	}

	public float getCs2UsaPrivateTotalAreaCertified() {
		return cs2UsaPrivateTotalAreaCertified;
	}

	public void setCs2UsaPrivateTotalAreaCertified(float cs2UsaPrivateTotalAreaCertified) {
		this.cs2UsaPrivateTotalAreaCertified = cs2UsaPrivateTotalAreaCertified;
	}

	public float getCs2UsaPrivateAreaManagedForPublic() {
		return cs2UsaPrivateAreaManagedForPublic;
	}

	public void setCs2UsaPrivateAreaManagedForPublic(float cs2UsaPrivateAreaManagedForPublic) {
		this.cs2UsaPrivateAreaManagedForPublic = cs2UsaPrivateAreaManagedForPublic;
	}

	public float getCs2UsaPrivateAreaCertifiedForPublic() {
		return cs2UsaPrivateAreaCertifiedForPublic;
	}

	public void setCs2UsaPrivateAreaCertifiedForPublic(float cs2UsaPrivateAreaCertifiedForPublic) {
		this.cs2UsaPrivateAreaCertifiedForPublic = cs2UsaPrivateAreaCertifiedForPublic;
	}

	public float getCs2UsaPublicTotalAreaOwnOrManage() {
		return cs2UsaPublicTotalAreaOwnOrManage;
	}

	public void setCs2UsaPublicTotalAreaOwnOrManage(float cs2UsaPublicTotalAreaOwnOrManage) {
		this.cs2UsaPublicTotalAreaOwnOrManage = cs2UsaPublicTotalAreaOwnOrManage;
	}

	public float getCs2UsaPublicTotalAreaCertified() {
		return cs2UsaPublicTotalAreaCertified;
	}

	public void setCs2UsaPublicTotalAreaCertified(float cs2UsaPublicTotalAreaCertified) {
		this.cs2UsaPublicTotalAreaCertified = cs2UsaPublicTotalAreaCertified;
	}

	public float getCs2UsaPublicAreaManagedForPublic() {
		return cs2UsaPublicAreaManagedForPublic;
	}

	public void setCs2UsaPublicAreaManagedForPublic(float cs2UsaPublicAreaManagedForPublic) {
		this.cs2UsaPublicAreaManagedForPublic = cs2UsaPublicAreaManagedForPublic;
	}

	public float getCs2UsaPublicAreaCertifiedForPublic() {
		return cs2UsaPublicAreaCertifiedForPublic;
	}

	public void setCs2UsaPublicAreaCertifiedForPublic(float cs2UsaPublicAreaCertifiedForPublic) {
		this.cs2UsaPublicAreaCertifiedForPublic = cs2UsaPublicAreaCertifiedForPublic;
	}

	public List<String> getCs2UsaPublicRecreationCategories() {
		return cs2UsaPublicRecreationCategories;
	}

	public void setCs2UsaPublicRecreationCategories(List<String> cs2UsaPublicRecreationCategories) {
		this.cs2UsaPublicRecreationCategories = cs2UsaPublicRecreationCategories;
	}

	public float getCs2CaCrownTotalAreaOwnOrManage() {
		return cs2CaCrownTotalAreaOwnOrManage;
	}

	public void setCs2CaCrownTotalAreaOwnOrManage(float cs2CaCrownTotalAreaOwnOrManage) {
		this.cs2CaCrownTotalAreaOwnOrManage = cs2CaCrownTotalAreaOwnOrManage;
	}

	public float getCs2CaCrownTotalAreaCertified() {
		return cs2CaCrownTotalAreaCertified;
	}

	public void setCs2CaCrownTotalAreaCertified(float cs2CaCrownTotalAreaCertified) {
		this.cs2CaCrownTotalAreaCertified = cs2CaCrownTotalAreaCertified;
	}

	public float getCs2CaCrownAreaManagedForPublic() {
		return cs2CaCrownAreaManagedForPublic;
	}

	public void setCs2CaCrownAreaManagedForPublic(float cs2CaCrownAreaManagedForPublic) {
		this.cs2CaCrownAreaManagedForPublic = cs2CaCrownAreaManagedForPublic;
	}

	public float getCs2CaCrownAreaCertifiedForPublic() {
		return cs2CaCrownAreaCertifiedForPublic;
	}

	public void setCs2CaCrownAreaCertifiedForPublic(float cs2CaCrownAreaCertifiedForPublic) {
		this.cs2CaCrownAreaCertifiedForPublic = cs2CaCrownAreaCertifiedForPublic;
	}

	public List<String> getCs2CaCrownRecreationCategories() {
		return cs2CaCrownRecreationCategories;
	}

	public void setCs2CaCrownRecreationCategories(List<String> cs2CaCrownRecreationCategories) {
		this.cs2CaCrownRecreationCategories = cs2CaCrownRecreationCategories;
	}

	public float getCs2CaPrivateTotalAreaOwnOrManage() {
		return cs2CaPrivateTotalAreaOwnOrManage;
	}

	public void setCs2CaPrivateTotalAreaOwnOrManage(float cs2CaPrivateTotalAreaOwnOrManage) {
		this.cs2CaPrivateTotalAreaOwnOrManage = cs2CaPrivateTotalAreaOwnOrManage;
	}

	public float getCs2CaPrivateTotalAreaCertified() {
		return cs2CaPrivateTotalAreaCertified;
	}

	public void setCs2CaPrivateTotalAreaCertified(float cs2CaPrivateTotalAreaCertified) {
		this.cs2CaPrivateTotalAreaCertified = cs2CaPrivateTotalAreaCertified;
	}

	public float getCs2CaPrivateAreaManagedForPublic() {
		return cs2CaPrivateAreaManagedForPublic;
	}

	public void setCs2CaPrivateAreaManagedForPublic(float cs2CaPrivateAreaManagedForPublic) {
		this.cs2CaPrivateAreaManagedForPublic = cs2CaPrivateAreaManagedForPublic;
	}

	public float getCs2CaPrivateAreaCertifiedForPublic() {
		return cs2CaPrivateAreaCertifiedForPublic;
	}

	public void setCs2CaPrivateAreaCertifiedForPublic(float cs2CaPrivateAreaCertifiedForPublic) {
		this.cs2CaPrivateAreaCertifiedForPublic = cs2CaPrivateAreaCertifiedForPublic;
	}

	public List<String> getCs2CaPrivateRecreationCategories() {
		return cs2CaPrivateRecreationCategories;
	}

	public void setCs2CaPrivateRecreationCategories(List<String> cs2CaPrivateRecreationCategories) {
		this.cs2CaPrivateRecreationCategories = cs2CaPrivateRecreationCategories;
	}

	public Set<SfiPpFormCs2OutsideUsaCa> getCs2OutsideCountries() {
		return cs2OutsideCountries;
	}

	public void setCs2OutsideCountries(Set<SfiPpFormCs2OutsideUsaCa> cs2OutsideCountries) {
		this.cs2OutsideCountries = cs2OutsideCountries;
	}
}
