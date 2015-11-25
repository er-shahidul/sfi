package com.rbs.sfi.core.entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="sfi_pp_forms")
public class Cs2
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cs2_usaPrivate_totalOwnMng", nullable=true)
	private float cs2UsaPrivateTotalAreaOwnOrManage;
	@Column(name="cs2_usaPrivate_forestlandOwnMng", nullable=true)
	private int cs2UsaPrivateForestlandOwnMng;
	@Column(name="cs2_usaPrivate_forestlandOwnMngOther", nullable=true)
	private String cs2UsaPrivateForestlandOwnMngOther;
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
	@Column(name="cs2_usaPublic_forestlandOwnMng", nullable=true)
	private int cs2UsaPublicForestlandOwnMng;
	@Column(name="cs2_usaPublic_forestlandOwnMngOther", nullable=true)
	private String cs2UsaPublicForestlandOwnMngOther;
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
	@Column(name="cs2_caCrown_forestlandOwnMng", nullable=true)
	private int cs2CaCrownForestlandOwnMng;
	@Column(name="cs2_caCrown_forestlandOwnMngOther", nullable=true)
	private String cs2CaCrownForestlandOwnMngOther;

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

	@Column(name="cs2_caPrivate_forestlandOwnMng", nullable=true)
	private int cs2CaPrivateForestlandOwnMng;
	@Column(name="cs2_caPrivate_forestlandOwnMngOther", nullable=true)
	private String cs2CaPrivateForestlandOwnMngOther;

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

	@OneToMany(targetEntity = SfiPpFormCs2OutsideUsaCa.class, mappedBy="sfiPpForm" , fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<SfiPpFormCs2OutsideUsaCa> cs2OutsideCountries;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getCs2UsaPrivateForestlandOwnMng() {
		return cs2UsaPrivateForestlandOwnMng;
	}

	public void setCs2UsaPrivateForestlandOwnMng(int cs2UsaPrivateForestlandOwnMng) {
		this.cs2UsaPrivateForestlandOwnMng = cs2UsaPrivateForestlandOwnMng;
	}

	public int getCs2UsaPublicForestlandOwnMng() {
		return cs2UsaPublicForestlandOwnMng;
	}

	public void setCs2UsaPublicForestlandOwnMng(int cs2UsaPublicForestlandOwnMng) {
		this.cs2UsaPublicForestlandOwnMng = cs2UsaPublicForestlandOwnMng;
	}

	public int getCs2CaCrownForestlandOwnMng() {
		return cs2CaCrownForestlandOwnMng;
	}

	public void setCs2CaCrownForestlandOwnMng(int cs2CaCrownForestlandOwnMng) {
		this.cs2CaCrownForestlandOwnMng = cs2CaCrownForestlandOwnMng;
	}

	public int getCs2CaPrivateForestlandOwnMng() {
		return cs2CaPrivateForestlandOwnMng;
	}

	public void setCs2CaPrivateForestlandOwnMng(int cs2CaPrivateForestlandOwnMng) {
		this.cs2CaPrivateForestlandOwnMng = cs2CaPrivateForestlandOwnMng;
	}

	public String getCs2UsaPrivateForestlandOwnMngOther() {
		return cs2UsaPrivateForestlandOwnMngOther;
	}

	public void setCs2UsaPrivateForestlandOwnMngOther(String cs2UsaPrivateForestlandOwnMngOther) {
		this.cs2UsaPrivateForestlandOwnMngOther = cs2UsaPrivateForestlandOwnMngOther;
	}

	public String getCs2UsaPublicForestlandOwnMngOther() {
		return cs2UsaPublicForestlandOwnMngOther;
	}

	public void setCs2UsaPublicForestlandOwnMngOther(String cs2UsaPublicForestlandOwnMngOther) {
		this.cs2UsaPublicForestlandOwnMngOther = cs2UsaPublicForestlandOwnMngOther;
	}

	public String getCs2CaCrownForestlandOwnMngOther() {
		return cs2CaCrownForestlandOwnMngOther;
	}

	public void setCs2CaCrownForestlandOwnMngOther(String cs2CaCrownForestlandOwnMngOther) {
		this.cs2CaCrownForestlandOwnMngOther = cs2CaCrownForestlandOwnMngOther;
	}

	public String getCs2CaPrivateForestlandOwnMngOther() {
		return cs2CaPrivateForestlandOwnMngOther;
	}

	public void setCs2CaPrivateForestlandOwnMngOther(String cs2CaPrivateForestlandOwnMngOther) {
		this.cs2CaPrivateForestlandOwnMngOther = cs2CaPrivateForestlandOwnMngOther;
	}

	public List<SfiPpFormCs2OutsideUsaCa> getCs2OutsideCountries() {
		return cs2OutsideCountries;
	}

	public void setCs2OutsideCountries(List<SfiPpFormCs2OutsideUsaCa> cs2OutsideCountries) {
		this.cs2OutsideCountries = cs2OutsideCountries;
	}
}
