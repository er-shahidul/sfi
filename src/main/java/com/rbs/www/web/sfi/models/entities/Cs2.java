package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs2 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs2_usaPrivate_totalOwnMng", nullable = true)
    private Float usaPrivateTotalAreaOwnOrManage;
    @Column(name = "cs2_usaPrivate_forestlandOwnMng", nullable = true)
    private Integer usaPrivateForestlandOwnMng;
    @Column(name = "cs2_usaPrivate_forestlandOwnMngOther", nullable = true)
    private String usaPrivateForestlandOwnMngOther;
    @Column(name = "cs2_usaPrivate_totalCertified", nullable = true)
    private Float usaPrivateTotalAreaCertified;
    @Column(name = "cs2_usaPrivate_area", nullable = true)
    private Float usaPrivateAreaManagedForPublic;
    @Column(name = "cs2_usaPrivate_areaCertified", nullable = true)
    private Float usaPrivateAreaCertifiedForPublic;

    @Column(name = "cs2_usaPrivate_categories", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> usaPrivateRecreationCategories;

    @Column(name = "cs2_usaPublic_totalOwnMng", nullable = true)
    private Float usaPublicTotalAreaOwnOrManage;
    @Column(name = "cs2_usaPublic_forestlandOwnMng", nullable = true)
    private Integer usaPublicForestlandOwnMng;
    @Column(name = "cs2_usaPublic_forestlandOwnMngOther", nullable = true)
    private String usaPublicForestlandOwnMngOther;
    @Column(name = "cs2_usaPublic_totalCertified", nullable = true)
    private Float usaPublicTotalAreaCertified;
    @Column(name = "cs2_usaPublic_area", nullable = true)
    private Float usaPublicAreaManagedForPublic;
    @Column(name = "cs2_usaPublic_areaCertified", nullable = true)
    private Float usaPublicAreaCertifiedForPublic;

    @Column(name = "cs2_usaPublic_categories", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> usaPublicRecreationCategories;

    @Column(name = "cs2_caCrown_totalOwnMng", nullable = true)
    private Float caCrownTotalAreaOwnOrManage;
    @Column(name = "cs2_caCrown_forestlandOwnMng", nullable = true)
    private Integer caCrownForestlandOwnMng;
    @Column(name = "cs2_caCrown_forestlandOwnMngOther", nullable = true)
    private String caCrownForestlandOwnMngOther;

    @Column(name = "cs2_caCrown_totalCertified", nullable = true)
    private Float caCrownTotalAreaCertified;
    @Column(name = "cs2_caCrown_area", nullable = true)
    private Float caCrownAreaManagedForPublic;
    @Column(name = "cs2_caCrown_areaCertified", nullable = true)
    private Float caCrownAreaCertifiedForPublic;

    @Column(name = "cs2_caCrown_categories", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> caCrownRecreationCategories;

    @Column(name = "cs2_caPrivate_totalOwnMng", nullable = true)
    private Float caPrivateTotalAreaOwnOrManage;

    @Column(name = "cs2_caPrivate_forestlandOwnMng", nullable = true)
    private Integer caPrivateForestlandOwnMng;
    @Column(name = "cs2_caPrivate_forestlandOwnMngOther", nullable = true)
    private String caPrivateForestlandOwnMngOther;

    @Column(name = "cs2_caPrivate_totalCertified", nullable = true)
    private Float caPrivateTotalAreaCertified;
    @Column(name = "cs2_caPrivate_area", nullable = true)
    private Float caPrivateAreaManagedForPublic;
    @Column(name = "cs2_caPrivate_areaCertified", nullable = true)
    private Float caPrivateAreaCertifiedForPublic;

    @Column(name = "cs2_caPrivate_categories", nullable = true)
    @Type(type = "text")
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> caPrivateRecreationCategories;

    @OneToMany(targetEntity = SfiPpFormCs2OutsideUsaCa.class, mappedBy = "sfiPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SfiPpFormCs2OutsideUsaCa> outsideCountries;

    @Column(name = "cs9_useWho1A1B", nullable = true)
    private Boolean useWho1A1B;

    @Column(name = "cs9_useWho1A1BNote", nullable = true)
    @Type(type="text")
    private String useWho1A1BNote;

    @Column(name = "cs9_stopWho1A1B", nullable = true)
    private Boolean stopWho1A1B;

    @Column(name = "cs9_stopWho1A1BNote", nullable = true)
    @Type(type="text")
    private String stopWho1A1BNote;

    @Column(name = "cs9_convertForestCover", nullable = true)
    private Boolean convertForestCover;

    @Column(name = "cs9_restorationForestCover", nullable = true)
    private Boolean restorationForestCover;

    @Column(name = "cs9_restorationRiparianProtection", nullable = true)
    private Boolean restorationRiparianProtection;

    @Column(name = "cs9_restorationRiparianArea", nullable = true)
    private String restorationRiparianArea;

    @Column(name = "cs9_restorationNativeForest", nullable = true)
    private Boolean restorationNativeForest;

    @Column(name = "cs9_restorationNativeArea", nullable = true)
    private String restorationNativeArea;

    @Column(name = "cs9_restorationOther", nullable = true)
    private Boolean restorationOther;

    @Column(name = "cs9_restorationOtherArea", nullable = true)
    private String restorationOtherArea;

    @Column(name = "cs9_restorationOtherExplain", nullable = true)
    @Type(type="text")
    private String restorationOtherExplain;

    @Column(name = "cs9_respondingForestHealth", nullable = true)
    private Boolean respondingForestHealth;

    @Column(name = "cs9_respondingInvasiveSpecies", nullable = true)
    private Boolean respondingInvasiveSpecies;

    @Column(name = "cs9_respondingInvasiveArea", nullable = true)
    private String respondingInvasiveArea;

    @Column(name = "cs9_respondingDiseaseIssues", nullable = true)
    private Boolean respondingDiseaseIssues;

    @Column(name = "cs9_respondingDiseaseArea", nullable = true)
    private String respondingDiseaseArea;

    @Column(name = "cs9_respondingInsect", nullable = true)
    private Boolean respondingInsect;

    @Column(name = "cs9_respondingInsectArea", nullable = true)
    private String respondingInsectArea;

    @Column(name = "cs9_respondingOther", nullable = true)
    private Boolean respondingOther;

    @Column(name = "cs9_respondingOtherArea", nullable = true)
    private String respondingOtherArea;

    @Column(name = "cs9_respondingOtherExplain", nullable = true)
    @Type(type="text")
    private String respondingOtherExplain;

    @Column(name = "cs9_mitigatingEnvironmentalHarm", nullable = true)
    private Boolean mitigatingEnvironmentalHarm;

    @Column(name = "cs9_ecologicalImpactsSite", nullable = true)
    private Boolean ecologicalImpactsSite;

    @Column(name = "cs9_ecologicalImpactsSiteArea", nullable = true)
    private String ecologicalImpactsSiteArea;

    @Column(name = "cs9_ecologicalImpactsLandscape", nullable = true)
    private Boolean ecologicalImpactsLandscape;

    @Column(name = "cs9_ecologicalImpactsLandscapeArea", nullable = true)
    private String ecologicalImpactsLandscapeArea;

    @Column(name = "cs9_environmentalHarmOther", nullable = true)
    private Boolean environmentalHarmOther;

    @Column(name = "cs9_environmentalHarmOtherArea", nullable = true)
    private String environmentalHarmOtherArea;

    @Column(name = "cs9_environmentalHarmOtherExplain", nullable = true)
    @Type(type="text")
    private String environmentalHarmOtherExplain;

    @Column(name = "cs9_economicReasons", nullable = true)
    private Boolean economicReasons;

    @Column(name = "cs9_economicProductivity", nullable = true)
    private Boolean economicProductivity;

    @Column(name = "cs9_economicProductivityArea", nullable = true)
    private String economicProductivityArea;

    @Column(name = "cs9_economicStandQuality", nullable = true)
    private Boolean economicStandQuality;

    @Column(name = "cs9_economicStandArea", nullable = true)
    private String economicStandArea;

    @Column(name = "cs9_economicOther", nullable = true)
    private Boolean economicOther;

    @Column(name = "cs9_economicOtherArea", nullable = true)
    private String economicOtherArea;

    @Column(name = "cs9_economicOtherExplain", nullable = true)
    @Type(type="text")
    private String economicOtherExplain;

    @Column(name = "cs9_convertForestLand", nullable = true)
    private Boolean convertForestLand;

    @Column(name = "cs9_convertForestLandExplain", nullable = true)
    @Type(type="text")
    private String convertForestLandExplain;

    @OneToMany(targetEntity = SfiPpFormForestlandArea.class, fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SfiPpFormForestlandArea> forestlandAreas;

    @Override
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
        addAll(this.usaPrivateRecreationCategories, usaPrivateRecreationCategories);
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
        addAll(this.usaPublicRecreationCategories, usaPublicRecreationCategories);
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
        addAll(this.caCrownRecreationCategories, caCrownRecreationCategories);
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
        addAll(this.caPrivateRecreationCategories, caPrivateRecreationCategories);
    }

    public Set<SfiPpFormCs2OutsideUsaCa> getOutsideCountries() {
        return outsideCountries;
    }

    public void setOutsideCountries(Set<SfiPpFormCs2OutsideUsaCa> outsideCountries) {
        addAll(this.outsideCountries, outsideCountries);
    }

    public Boolean getUseWho1A1B() {
        return useWho1A1B;
    }

    public void setUseWho1A1B(Boolean useWho1A1B) {
        this.useWho1A1B = useWho1A1B;
    }

    public String getUseWho1A1BNote() {
        return useWho1A1BNote;
    }

    public void setUseWho1A1BNote(String useWho1A1BNote) {
        this.useWho1A1BNote = useWho1A1BNote;
    }

    public Boolean getStopWho1A1B() {
        return stopWho1A1B;
    }

    public void setStopWho1A1B(Boolean stopWho1A1B) {
        this.stopWho1A1B = stopWho1A1B;
    }

    public String getStopWho1A1BNote() {
        return stopWho1A1BNote;
    }

    public void setStopWho1A1BNote(String stopWho1A1BNote) {
        this.stopWho1A1BNote = stopWho1A1BNote;
    }

    public Boolean getConvertForestCover() {
        return convertForestCover;
    }

    public void setConvertForestCover(Boolean convertForestCover) {
        this.convertForestCover = convertForestCover;
    }

    public Boolean getRestorationForestCover() {
        return restorationForestCover;
    }

    public void setRestorationForestCover(Boolean restorationForestCover) {
        this.restorationForestCover = restorationForestCover;
    }

    public Boolean getRestorationRiparianProtection() {
        return restorationRiparianProtection;
    }

    public void setRestorationRiparianProtection(Boolean restorationRiparianProtection) {
        this.restorationRiparianProtection = restorationRiparianProtection;
    }

    public String getRestorationRiparianArea() {
        return restorationRiparianArea;
    }

    public void setRestorationRiparianArea(String restorationRiparianArea) {
        this.restorationRiparianArea = restorationRiparianArea;
    }

    public Boolean getRestorationNativeForest() {
        return restorationNativeForest;
    }

    public void setRestorationNativeForest(Boolean restorationNativeForest) {
        this.restorationNativeForest = restorationNativeForest;
    }

    public String getRestorationNativeArea() {
        return restorationNativeArea;
    }

    public void setRestorationNativeArea(String restorationNativeArea) {
        this.restorationNativeArea = restorationNativeArea;
    }

    public Boolean getRestorationOther() {
        return restorationOther;
    }

    public void setRestorationOther(Boolean restorationOther) {
        this.restorationOther = restorationOther;
    }

    public String getRestorationOtherArea() {
        return restorationOtherArea;
    }

    public void setRestorationOtherArea(String restorationOtherArea) {
        this.restorationOtherArea = restorationOtherArea;
    }

    public String getRestorationOtherExplain() {
        return restorationOtherExplain;
    }

    public void setRestorationOtherExplain(String restorationOtherExplain) {
        this.restorationOtherExplain = restorationOtherExplain;
    }

    public Boolean getRespondingForestHealth() {
        return respondingForestHealth;
    }

    public void setRespondingForestHealth(Boolean respondingForestHealth) {
        this.respondingForestHealth = respondingForestHealth;
    }

    public Boolean getRespondingInvasiveSpecies() {
        return respondingInvasiveSpecies;
    }

    public void setRespondingInvasiveSpecies(Boolean respondingInvasiveSpecies) {
        this.respondingInvasiveSpecies = respondingInvasiveSpecies;
    }

    public String getRespondingInvasiveArea() {
        return respondingInvasiveArea;
    }

    public void setRespondingInvasiveArea(String respondingInvasiveArea) {
        this.respondingInvasiveArea = respondingInvasiveArea;
    }

    public Boolean getRespondingDiseaseIssues() {
        return respondingDiseaseIssues;
    }

    public void setRespondingDiseaseIssues(Boolean respondingDiseaseIssues) {
        this.respondingDiseaseIssues = respondingDiseaseIssues;
    }

    public String getRespondingDiseaseArea() {
        return respondingDiseaseArea;
    }

    public void setRespondingDiseaseArea(String respondingDiseaseArea) {
        this.respondingDiseaseArea = respondingDiseaseArea;
    }

    public Boolean getRespondingInsect() {
        return respondingInsect;
    }

    public void setRespondingInsect(Boolean respondingInsect) {
        this.respondingInsect = respondingInsect;
    }

    public String getRespondingInsectArea() {
        return respondingInsectArea;
    }

    public void setRespondingInsectArea(String respondingInsectArea) {
        this.respondingInsectArea = respondingInsectArea;
    }

    public String getRespondingOtherExplain() {
        return respondingOtherExplain;
    }

    public void setRespondingOtherExplain(String respondingOtherExplain) {
        this.respondingOtherExplain = respondingOtherExplain;
    }

    public String getRespondingOtherArea() {
        return respondingOtherArea;
    }

    public void setRespondingOtherArea(String respondingOtherArea) {
        this.respondingOtherArea = respondingOtherArea;
    }

    public Boolean getRespondingOther() {
        return respondingOther;
    }

    public void setRespondingOther(Boolean respondingOther) {
        this.respondingOther = respondingOther;
    }

    public Boolean getMitigatingEnvironmentalHarm() {
        return mitigatingEnvironmentalHarm;
    }

    public void setMitigatingEnvironmentalHarm(Boolean mitigatingEnvironmentalHarm) {
        this.mitigatingEnvironmentalHarm = mitigatingEnvironmentalHarm;
    }

    public Boolean getEcologicalImpactsSite() {
        return ecologicalImpactsSite;
    }

    public void setEcologicalImpactsSite(Boolean ecologicalImpactsSite) {
        this.ecologicalImpactsSite = ecologicalImpactsSite;
    }

    public String getEcologicalImpactsSiteArea() {
        return ecologicalImpactsSiteArea;
    }

    public void setEcologicalImpactsSiteArea(String ecologicalImpactsSiteArea) {
        this.ecologicalImpactsSiteArea = ecologicalImpactsSiteArea;
    }

    public Boolean getEcologicalImpactsLandscape() {
        return ecologicalImpactsLandscape;
    }

    public void setEcologicalImpactsLandscape(Boolean ecologicalImpactsLandscape) {
        this.ecologicalImpactsLandscape = ecologicalImpactsLandscape;
    }

    public String getEcologicalImpactsLandscapeArea() {
        return ecologicalImpactsLandscapeArea;
    }

    public void setEcologicalImpactsLandscapeArea(String ecologicalImpactsLandscapeArea) {
        this.ecologicalImpactsLandscapeArea = ecologicalImpactsLandscapeArea;
    }

    public Boolean getEnvironmentalHarmOther() {
        return environmentalHarmOther;
    }

    public void setEnvironmentalHarmOther(Boolean environmentalHarmOther) {
        this.environmentalHarmOther = environmentalHarmOther;
    }

    public String getEnvironmentalHarmOtherArea() {
        return environmentalHarmOtherArea;
    }

    public void setEnvironmentalHarmOtherArea(String environmentalHarmOtherArea) {
        this.environmentalHarmOtherArea = environmentalHarmOtherArea;
    }

    public String getEnvironmentalHarmOtherExplain() {
        return environmentalHarmOtherExplain;
    }

    public void setEnvironmentalHarmOtherExplain(String environmentalHarmOtherExplain) {
        this.environmentalHarmOtherExplain = environmentalHarmOtherExplain;
    }

    public Boolean getEconomicReasons() {
        return economicReasons;
    }

    public void setEconomicReasons(Boolean economicReasons) {
        this.economicReasons = economicReasons;
    }

    public String getEconomicProductivityArea() {
        return economicProductivityArea;
    }

    public void setEconomicProductivityArea(String economicProductivityArea) {
        this.economicProductivityArea = economicProductivityArea;
    }

    public Boolean getEconomicProductivity() {
        return economicProductivity;
    }

    public void setEconomicProductivity(Boolean economicProductivity) {
        this.economicProductivity = economicProductivity;
    }

    public Boolean getEconomicStandQuality() {
        return economicStandQuality;
    }

    public void setEconomicStandQuality(Boolean economicStandQuality) {
        this.economicStandQuality = economicStandQuality;
    }

    public String getEconomicStandArea() {
        return economicStandArea;
    }

    public void setEconomicStandArea(String economicStandArea) {
        this.economicStandArea = economicStandArea;
    }

    public Boolean getEconomicOther() {
        return economicOther;
    }

    public void setEconomicOther(Boolean economicOther) {
        this.economicOther = economicOther;
    }

    public String getEconomicOtherArea() {
        return economicOtherArea;
    }

    public void setEconomicOtherArea(String economicOtherArea) {
        this.economicOtherArea = economicOtherArea;
    }

    public String getEconomicOtherExplain() {
        return economicOtherExplain;
    }

    public void setEconomicOtherExplain(String economicOtherExplain) {
        this.economicOtherExplain = economicOtherExplain;
    }

    public Boolean getConvertForestLand() {
        return convertForestLand;
    }

    public void setConvertForestLand(Boolean convertForestLand) {
        this.convertForestLand = convertForestLand;
    }

    public String getConvertForestLandExplain() {
        return convertForestLandExplain;
    }

    public void setConvertForestLandExplain(String convertForestLandExplain) {
        this.convertForestLandExplain = convertForestLandExplain;
    }

    public Set<SfiPpFormForestlandArea> getForestlandAreas() {
        return forestlandAreas;
    }

    public void setForestlandAreas(Set<SfiPpFormForestlandArea> forestlandAreas) {
        addAll(this.forestlandAreas, forestlandAreas);
    }
}
