package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.web.sfi.validation.Cs2Ca.Cs2Ca;
import com.rbs.www.web.sfi.validation.Cs2Other.Cs2Other;
import com.rbs.www.web.sfi.validation.Cs2Usa.Cs2Usa;

import java.util.Set;

@Cs2Usa(message = "{cs2.usaEmpty}")
@Cs2Ca(message = "{cs2.caEmpty}")
@Cs2Other(message = "{cs2.otherEmpty}")
public class Cs2ViewModel extends BaseViewModel {
    private Integer id;

//  region: for validation purpose
    private Boolean ownsMngLands;
    private Boolean ownsMngLandsInUSA;
    private Boolean ownsMngLandsInCA;
    private Boolean ownsMngLandsInOther;
    private Boolean hasPrimaryOperMillsYards;
    private Boolean hasPrimaryOperMillsYardsInUSA;
    private Boolean hasPrimaryOperMillsYardsInCA;
    private Boolean hasPrimaryOperMillsYardsInOther;
//  region: ends

    private Integer usaPublicForestlandOwnMng;
    private Integer usaPrivateForestlandOwnMng;
    private Float usaPrivateTotalAreaOwnOrManage;
    private Float usaPrivateTotalAreaCertified;
    private Float usaPrivateAreaManagedForPublic;
    private Float usaPrivateAreaCertifiedForPublic;
    private Float usaPublicTotalAreaOwnOrManage;
    private Float usaPublicTotalAreaCertified;
    private Float usaPublicAreaManagedForPublic;
    private Float usaPublicAreaCertifiedForPublic;
    private String usaPrivateForestlandOwnMngOther;
    private String usaPublicForestlandOwnMngOther;
    private Set<String> usaPrivateRecreationCategories;
    private Set<String> usaPublicRecreationCategories;

    private Integer caCrownForestlandOwnMng;
    private Integer caPrivateForestlandOwnMng;
    private Float caCrownTotalAreaOwnOrManage;
    private Float caCrownTotalAreaCertified;
    private Float caCrownAreaManagedForPublic;
    private Float caCrownAreaCertifiedForPublic;
    private Float caPrivateTotalAreaOwnOrManage;
    private Float caPrivateTotalAreaCertified;
    private Float caPrivateAreaManagedForPublic;
    private Float caPrivateAreaCertifiedForPublic;
    private String caCrownForestlandOwnMngOther;
    private String caPrivateForestlandOwnMngOther;
    private Set<String> caCrownRecreationCategories;
    private Set<String> caPrivateRecreationCategories;

    private Set<SfiPpFormCs2OutsideUsaCaViewModel> outsideCountries;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setOwnsMngLandsInOther(Boolean ownsMngLandsInOther) {
        this.ownsMngLandsInOther = ownsMngLandsInOther;
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
