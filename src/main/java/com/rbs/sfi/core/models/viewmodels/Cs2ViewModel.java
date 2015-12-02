package com.rbs.sfi.core.models.viewmodels;

import com.rbs.sfi.core.mapper.IViewModel;

import java.util.Set;

public class Cs2ViewModel implements IViewModel {
	private Integer id;
	private Integer usaPublicForestlandOwnMng;
	private Integer usaPrivateForestlandOwnMng;
	private Integer caCrownForestlandOwnMng;
	private Integer caPrivateForestlandOwnMng;
	private Float usaPrivateTotalAreaOwnOrManage;
	private Float usaPrivateTotalAreaCertified;
	private Float usaPrivateAreaManagedForPublic;
	private Float usaPrivateAreaCertifiedForPublic;
	private Float usaPublicTotalAreaOwnOrManage;
	private Float usaPublicTotalAreaCertified;
	private Float usaPublicAreaManagedForPublic;
	private Float usaPublicAreaCertifiedForPublic;
	private Float caCrownTotalAreaOwnOrManage;
	private Float caCrownTotalAreaCertified;
	private Float caCrownAreaManagedForPublic;
	private Float caCrownAreaCertifiedForPublic;
	private Float caPrivateTotalAreaOwnOrManage;
	private Float caPrivateTotalAreaCertified;
	private Float caPrivateAreaManagedForPublic;
	private Float caPrivateAreaCertifiedForPublic;
	private String usaPrivateForestlandOwnMngOther;
	private String usaPublicForestlandOwnMngOther;
	private String caCrownForestlandOwnMngOther;
	private String caPrivateForestlandOwnMngOther;
	private Set<String> usaPrivateRecreationCategories;
	private Set<String> usaPublicRecreationCategories;
	private Set<String> caCrownRecreationCategories;
	private Set<String> caPrivateRecreationCategories;
	private Set<SfiPpFormCs2OutsideUsaCaViewModel> outsideCountries;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getUsaPrivateTotalAreaOwnOrManage() {
		return usaPrivateTotalAreaOwnOrManage;
	}

	public void setUsaPrivateTotalAreaOwnOrManage(Float usaPrivateTotalAreaOwnOrManage) {
		this.usaPrivateTotalAreaOwnOrManage = usaPrivateTotalAreaOwnOrManage;
	}

	public Integer getUsaPrivateForestlandOwnMng() {
		return usaPrivateForestlandOwnMng;
	}

	public void setUsaPrivateForestlandOwnMng(Integer usaPrivateForestlandOwnMng) {
		this.usaPrivateForestlandOwnMng = usaPrivateForestlandOwnMng;
	}

	public String getUsaPrivateForestlandOwnMngOther() {
		return usaPrivateForestlandOwnMngOther;
	}

	public void setUsaPrivateForestlandOwnMngOther(String usaPrivateForestlandOwnMngOther) {
		this.usaPrivateForestlandOwnMngOther = usaPrivateForestlandOwnMngOther;
	}

	public Float getUsaPrivateTotalAreaCertified() {
		return usaPrivateTotalAreaCertified;
	}

	public void setUsaPrivateTotalAreaCertified(Float usaPrivateTotalAreaCertified) {
		this.usaPrivateTotalAreaCertified = usaPrivateTotalAreaCertified;
	}

	public Float getUsaPrivateAreaManagedForPublic() {
		return usaPrivateAreaManagedForPublic;
	}

	public void setUsaPrivateAreaManagedForPublic(Float usaPrivateAreaManagedForPublic) {
		this.usaPrivateAreaManagedForPublic = usaPrivateAreaManagedForPublic;
	}

	public Float getUsaPrivateAreaCertifiedForPublic() {
		return usaPrivateAreaCertifiedForPublic;
	}

	public void setUsaPrivateAreaCertifiedForPublic(Float usaPrivateAreaCertifiedForPublic) {
		this.usaPrivateAreaCertifiedForPublic = usaPrivateAreaCertifiedForPublic;
	}

	public Set<String> getUsaPrivateRecreationCategories() {
		return usaPrivateRecreationCategories;
	}

	public void setUsaPrivateRecreationCategories(Set<String> usaPrivateRecreationCategories) {
		this.usaPrivateRecreationCategories = usaPrivateRecreationCategories;
	}

	public Float getUsaPublicTotalAreaOwnOrManage() {
		return usaPublicTotalAreaOwnOrManage;
	}

	public void setUsaPublicTotalAreaOwnOrManage(Float usaPublicTotalAreaOwnOrManage) {
		this.usaPublicTotalAreaOwnOrManage = usaPublicTotalAreaOwnOrManage;
	}

	public Integer getUsaPublicForestlandOwnMng() {
		return usaPublicForestlandOwnMng;
	}

	public void setUsaPublicForestlandOwnMng(Integer usaPublicForestlandOwnMng) {
		this.usaPublicForestlandOwnMng = usaPublicForestlandOwnMng;
	}

	public String getUsaPublicForestlandOwnMngOther() {
		return usaPublicForestlandOwnMngOther;
	}

	public void setUsaPublicForestlandOwnMngOther(String usaPublicForestlandOwnMngOther) {
		this.usaPublicForestlandOwnMngOther = usaPublicForestlandOwnMngOther;
	}

	public Float getUsaPublicTotalAreaCertified() {
		return usaPublicTotalAreaCertified;
	}

	public void setUsaPublicTotalAreaCertified(Float usaPublicTotalAreaCertified) {
		this.usaPublicTotalAreaCertified = usaPublicTotalAreaCertified;
	}

	public Float getUsaPublicAreaManagedForPublic() {
		return usaPublicAreaManagedForPublic;
	}

	public void setUsaPublicAreaManagedForPublic(Float usaPublicAreaManagedForPublic) {
		this.usaPublicAreaManagedForPublic = usaPublicAreaManagedForPublic;
	}

	public Float getUsaPublicAreaCertifiedForPublic() {
		return usaPublicAreaCertifiedForPublic;
	}

	public void setUsaPublicAreaCertifiedForPublic(Float usaPublicAreaCertifiedForPublic) {
		this.usaPublicAreaCertifiedForPublic = usaPublicAreaCertifiedForPublic;
	}

	public Set<String> getUsaPublicRecreationCategories() {
		return usaPublicRecreationCategories;
	}

	public void setUsaPublicRecreationCategories(Set<String> usaPublicRecreationCategories) {
		this.usaPublicRecreationCategories = usaPublicRecreationCategories;
	}

	public Float getCaCrownTotalAreaOwnOrManage() {
		return caCrownTotalAreaOwnOrManage;
	}

	public void setCaCrownTotalAreaOwnOrManage(Float caCrownTotalAreaOwnOrManage) {
		this.caCrownTotalAreaOwnOrManage = caCrownTotalAreaOwnOrManage;
	}

	public Integer getCaCrownForestlandOwnMng() {
		return caCrownForestlandOwnMng;
	}

	public void setCaCrownForestlandOwnMng(Integer caCrownForestlandOwnMng) {
		this.caCrownForestlandOwnMng = caCrownForestlandOwnMng;
	}

	public String getCaCrownForestlandOwnMngOther() {
		return caCrownForestlandOwnMngOther;
	}

	public void setCaCrownForestlandOwnMngOther(String caCrownForestlandOwnMngOther) {
		this.caCrownForestlandOwnMngOther = caCrownForestlandOwnMngOther;
	}

	public Float getCaCrownTotalAreaCertified() {
		return caCrownTotalAreaCertified;
	}

	public void setCaCrownTotalAreaCertified(Float caCrownTotalAreaCertified) {
		this.caCrownTotalAreaCertified = caCrownTotalAreaCertified;
	}

	public Float getCaCrownAreaManagedForPublic() {
		return caCrownAreaManagedForPublic;
	}

	public void setCaCrownAreaManagedForPublic(Float caCrownAreaManagedForPublic) {
		this.caCrownAreaManagedForPublic = caCrownAreaManagedForPublic;
	}

	public Float getCaCrownAreaCertifiedForPublic() {
		return caCrownAreaCertifiedForPublic;
	}

	public void setCaCrownAreaCertifiedForPublic(Float caCrownAreaCertifiedForPublic) {
		this.caCrownAreaCertifiedForPublic = caCrownAreaCertifiedForPublic;
	}

	public Set<String> getCaCrownRecreationCategories() {
		return caCrownRecreationCategories;
	}

	public void setCaCrownRecreationCategories(Set<String> caCrownRecreationCategories) {
		this.caCrownRecreationCategories = caCrownRecreationCategories;
	}

	public Float getCaPrivateTotalAreaOwnOrManage() {
		return caPrivateTotalAreaOwnOrManage;
	}

	public void setCaPrivateTotalAreaOwnOrManage(Float caPrivateTotalAreaOwnOrManage) {
		this.caPrivateTotalAreaOwnOrManage = caPrivateTotalAreaOwnOrManage;
	}

	public Integer getCaPrivateForestlandOwnMng() {
		return caPrivateForestlandOwnMng;
	}

	public void setCaPrivateForestlandOwnMng(Integer caPrivateForestlandOwnMng) {
		this.caPrivateForestlandOwnMng = caPrivateForestlandOwnMng;
	}

	public String getCaPrivateForestlandOwnMngOther() {
		return caPrivateForestlandOwnMngOther;
	}

	public void setCaPrivateForestlandOwnMngOther(String caPrivateForestlandOwnMngOther) {
		this.caPrivateForestlandOwnMngOther = caPrivateForestlandOwnMngOther;
	}

	public Float getCaPrivateTotalAreaCertified() {
		return caPrivateTotalAreaCertified;
	}

	public void setCaPrivateTotalAreaCertified(Float caPrivateTotalAreaCertified) {
		this.caPrivateTotalAreaCertified = caPrivateTotalAreaCertified;
	}

	public Float getCaPrivateAreaManagedForPublic() {
		return caPrivateAreaManagedForPublic;
	}

	public void setCaPrivateAreaManagedForPublic(Float caPrivateAreaManagedForPublic) {
		this.caPrivateAreaManagedForPublic = caPrivateAreaManagedForPublic;
	}

	public Float getCaPrivateAreaCertifiedForPublic() {
		return caPrivateAreaCertifiedForPublic;
	}

	public void setCaPrivateAreaCertifiedForPublic(Float caPrivateAreaCertifiedForPublic) {
		this.caPrivateAreaCertifiedForPublic = caPrivateAreaCertifiedForPublic;
	}

	public Set<String> getCaPrivateRecreationCategories() {
		return caPrivateRecreationCategories;
	}

	public void setCaPrivateRecreationCategories(Set<String> caPrivateRecreationCategories) {
		this.caPrivateRecreationCategories = caPrivateRecreationCategories;
	}

	public Set<SfiPpFormCs2OutsideUsaCaViewModel> getOutsideCountries() {
		return outsideCountries;
	}

	public void setOutsideCountries(Set<SfiPpFormCs2OutsideUsaCaViewModel> outsideCountries) {
		this.outsideCountries = outsideCountries;
	}
}
