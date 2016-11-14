package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.web.sfi.validation.Cs2Ca.Cs2Ca;
import com.rbs.www.web.sfi.validation.Cs2Other.Cs2Other;
import com.rbs.www.web.sfi.validation.Cs2Usa.Cs2Usa;
import com.rbs.www.common.modules.validator.SpELAssert;

import java.util.Set;

@Cs2Usa(message = "{usaEmpty}")
@Cs2Ca(message = "{caEmpty}")
@Cs2Other(message = "{otherEmpty}")
@SpELAssert.List({
        @SpELAssert(
                value = "useWho1A1BNote != null && !useWho1A1BNote.isEmpty()",
                applyIf = "useWho1A1B != null && useWho1A1B",
                message = "{cs2.useWho1A1BNote}"
        ),
        @SpELAssert(
                value = "stopWho1A1BNote != null && !stopWho1A1BNote.isEmpty()",
                applyIf = "stopWho1A1B != null && stopWho1A1B",
                message = "{cs2.stopWho1A1BNote}"
        ),
        @SpELAssert(
                value = "convertForestLandExplain != null && !convertForestLandExplain.isEmpty()",
                applyIf = "convertForestLand != null && convertForestLand",
                message = "{cs9.convertForestLandExplain}"
        )
})
public class Cs2ViewModel extends BaseViewModel {
    private Integer id;

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

    private Boolean useWho1A1B;
    private String useWho1A1BNote;
    private Boolean stopWho1A1B;
    private String stopWho1A1BNote;
    private Boolean convertForestCover;

    private Boolean restorationForestCover;
    private Boolean restorationRiparianProtection;
    private String restorationRiparianArea;
    private Boolean restorationNativeForest;
    private String restorationNativeArea;

    private Boolean restorationOther;
    private String restorationOtherArea;
    private String restorationOtherExplain;

    private Boolean respondingForestHealth;
    private Boolean respondingInvasiveSpecies;
    private String respondingInvasiveArea;
    private Boolean respondingDiseaseIssues;
    private String respondingDiseaseArea;

    private Boolean respondingInsect;
    private String respondingInsectArea;

    private Boolean respondingOther;
    private String respondingOtherArea;
    private String respondingOtherExplain;

    private Boolean mitigatingEnvironmentalHarm;

    private Boolean ecologicalImpactsSite;
    private String ecologicalImpactsSiteArea;

    private Boolean ecologicalImpactsLandscape;
    private String ecologicalImpactsLandscapeArea;

    private Boolean environmentalHarmOther;
    private String environmentalHarmOtherArea;
    private String environmentalHarmOtherExplain;

    private Boolean economicReasons;

    private Boolean economicProductivity;
    private String economicProductivityArea;

    private Boolean economicStandQuality;
    private String economicStandArea;

    private Boolean economicOther;
    private String economicOtherArea;
    private String economicOtherExplain;

    private Boolean convertForestLand;
    private String convertForestLandExplain;

    private Set<SfiPpFormForestlandAreaViewModel> forestlandAreas;

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

    public Boolean getRespondingOther() {
        return respondingOther;
    }

    public void setRespondingOther(Boolean respondingOther) {
        this.respondingOther = respondingOther;
    }

    public String getRespondingOtherArea() {
        return respondingOtherArea;
    }

    public void setRespondingOtherArea(String respondingOtherArea) {
        this.respondingOtherArea = respondingOtherArea;
    }

    public String getRespondingOtherExplain() {
        return respondingOtherExplain;
    }

    public void setRespondingOtherExplain(String respondingOtherExplain) {
        this.respondingOtherExplain = respondingOtherExplain;
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

    public Boolean getEconomicProductivity() {
        return economicProductivity;
    }

    public void setEconomicProductivity(Boolean economicProductivity) {
        this.economicProductivity = economicProductivity;
    }

    public String getEconomicProductivityArea() {
        return economicProductivityArea;
    }

    public void setEconomicProductivityArea(String economicProductivityArea) {
        this.economicProductivityArea = economicProductivityArea;
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

    public Set<SfiPpFormForestlandAreaViewModel> getForestlandAreas() {
        return forestlandAreas;
    }

    public void setForestlandAreas(Set<SfiPpFormForestlandAreaViewModel> forestlandAreas) {
        this.forestlandAreas = forestlandAreas;
    }
}
