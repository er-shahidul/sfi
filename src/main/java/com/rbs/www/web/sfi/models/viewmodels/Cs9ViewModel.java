package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

import java.util.Set;

public class Cs9ViewModel extends BaseViewModel {
    private Integer id;
    private Boolean acknowledge;
    private Set<Integer> conservationBiodiversity413Items;
    private Set<Integer> conservationBiodiversity414Items;
    private Set<Integer> indigenousPeoplesForestItems;
    private Set<Integer> indigenousPeoplesPrivateItems;
    private Set<Integer> indigenousPeoplesPublicItems;
    private Set<Integer> protectionMaintenanceWaterResItems;
    private Set<Integer> trainingEducationItems;
    private Set<SfiPpFormForestlandAreaViewModel> forestlandAreas;
    private Set<SfiPpFormStoryViewModel> story;

    private Boolean convertForestCover;
    private Boolean convertForestLand;
    private Boolean ecologicalImpactsLandscap;
    private Boolean ecologicalImpactsSit;
    private Boolean economicOthe;
    private Boolean economicProductivit;
    private Boolean economicReason;
    private Boolean economicStandQualit;
    private Boolean environmentalHarmOthe;
    private Boolean mitigatingEnvironmentalHar;
    private Boolean respondingDiseaseIssue;
    private Boolean respondingForestHealt;
    private Boolean respondingInsec;
    private Boolean respondingInvasiveSpecie;
    private Boolean respondingOthe;
    private Boolean restorationForestCove;
    private Boolean restorationNativeFores;
    private Boolean restorationOthe;
    private Boolean restorationRiparianProtectio;
    private Boolean stopWho1A1B;
    private Boolean useWho1A1B;
    private String convertForestLandExplain;
    private String economicOtherExplain;
    private String environmentalHarmOtherExplain;
    private String respondingOtherExplain;
    private String restorationOtherExplain;
    private String stopWho1A1BNote;
    private String useWho1A1BNote;
    private String conservationBiodiversity413;
    private String conservationBiodiversity414;
    private String conservationBiodiversity415;
    private String ecologicalImpactsLandscapeArea;
    private String ecologicalImpactsSiteArea;
    private String economicOtherArea;
    private String economicProductivityArea;
    private String economicStandArea;
    private String environmentalHarmOtherArea;
    private String indigenousPeoplesForest;
    private String indigenousPeoplesPrivate;
    private String indigenousPeoplesPublic;
    private String protectionMaintenanceWaterRes;
    private String respondingDiseaseArea;
    private String respondingInsectArea;
    private String respondingInvasiveArea;
    private String restorationNativeArea;
    private String restorationOtherArea;
    private String trainedWoodProducersChanged;
    private String trainingEducation;
    private String restorationRiparianArea;
    private String respondingOtherArea;

    private Boolean ecologicalImpactsLandscape;
    private Boolean ecologicalImpactsSite;
    private Boolean economicOther;
    private Boolean economicProductivity;
    private Boolean economicReasons;
    private Boolean economicStandQuality;
    private Boolean environmentalHarmOther;
    private Boolean mitigatingEnvironmentalHarm;
    private Boolean respondingDiseaseIssues;
    private Boolean respondingForestHealth;
    private Boolean respondingInsect;
    private Boolean respondingInvasiveSpecies;
    private Boolean respondingOther;
    private Boolean restorationForestCover;
    private Boolean restorationNativeForest;
    private Boolean restorationOther;
    private Boolean restorationRiparianProtection;

    private String conservationBiodiversity414_explain1;
    private String conservationBiodiversity414_explain2;
    private String conservationBiodiversity414_explain5;
    private String conservationBiodiversity414_explain6;

    @Override
    public Integer getId() {
        return id;
    }

    public Set<SfiPpFormStoryViewModel> getStory() {
        return story;
    }

    public void setStory(Set<SfiPpFormStoryViewModel> story) {
        this.story = story;
    }

    public String getConservationBiodiversity414_explain1() {
        return conservationBiodiversity414_explain1;
    }

    public void setConservationBiodiversity414_explain1(String conservationBiodiversity414_explain1) {
        this.conservationBiodiversity414_explain1 = conservationBiodiversity414_explain1;
    }

    public String getConservationBiodiversity414_explain2() {
        return conservationBiodiversity414_explain2;
    }

    public void setConservationBiodiversity414_explain2(String conservationBiodiversity414_explain2) {
        this.conservationBiodiversity414_explain2 = conservationBiodiversity414_explain2;
    }

    public String getConservationBiodiversity414_explain5() {
        return conservationBiodiversity414_explain5;
    }

    public void setConservationBiodiversity414_explain5(String conservationBiodiversity414_explain5) {
        this.conservationBiodiversity414_explain5 = conservationBiodiversity414_explain5;
    }

    public String getConservationBiodiversity414_explain6() {
        return conservationBiodiversity414_explain6;
    }

    public void setConservationBiodiversity414_explain6(String conservationBiodiversity414_explain6) {
        this.conservationBiodiversity414_explain6 = conservationBiodiversity414_explain6;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAcknowledge() {
        return acknowledge;
    }

    public void setAcknowledge(Boolean acknowledge) {
        this.acknowledge = acknowledge;
    }

    public Set<Integer> getConservationBiodiversity413Items() {
        return conservationBiodiversity413Items;
    }

    public void setConservationBiodiversity413Items(Set<Integer> conservationBiodiversity413Items) {
        this.conservationBiodiversity413Items = conservationBiodiversity413Items;
    }

    public Set<Integer> getConservationBiodiversity414Items() {
        return conservationBiodiversity414Items;
    }

    public void setConservationBiodiversity414Items(Set<Integer> conservationBiodiversity414Items) {
        this.conservationBiodiversity414Items = conservationBiodiversity414Items;
    }

    public Set<Integer> getIndigenousPeoplesForestItems() {
        return indigenousPeoplesForestItems;
    }

    public void setIndigenousPeoplesForestItems(Set<Integer> indigenousPeoplesForestItems) {
        this.indigenousPeoplesForestItems = indigenousPeoplesForestItems;
    }

    public Set<Integer> getIndigenousPeoplesPrivateItems() {
        return indigenousPeoplesPrivateItems;
    }

    public void setIndigenousPeoplesPrivateItems(Set<Integer> indigenousPeoplesPrivateItems) {
        this.indigenousPeoplesPrivateItems = indigenousPeoplesPrivateItems;
    }

    public Set<Integer> getIndigenousPeoplesPublicItems() {
        return indigenousPeoplesPublicItems;
    }

    public void setIndigenousPeoplesPublicItems(Set<Integer> indigenousPeoplesPublicItems) {
        this.indigenousPeoplesPublicItems = indigenousPeoplesPublicItems;
    }

    public Set<Integer> getProtectionMaintenanceWaterResItems() {
        return protectionMaintenanceWaterResItems;
    }

    public void setProtectionMaintenanceWaterResItems(Set<Integer> protectionMaintenanceWaterResItems) {
        this.protectionMaintenanceWaterResItems = protectionMaintenanceWaterResItems;
    }

    public Set<Integer> getTrainingEducationItems() {
        return trainingEducationItems;
    }

    public void setTrainingEducationItems(Set<Integer> trainingEducationItems) {
        this.trainingEducationItems = trainingEducationItems;
    }

    public Set<SfiPpFormForestlandAreaViewModel> getForestlandAreas() {
        return forestlandAreas;
    }

    public void setForestlandAreas(Set<SfiPpFormForestlandAreaViewModel> forestlandAreas) {
        this.forestlandAreas = forestlandAreas;
    }

    public Boolean getConvertForestCover() {
        return convertForestCover;
    }

    public void setConvertForestCover(Boolean convertForestCover) {
        this.convertForestCover = convertForestCover;
    }

    public Boolean getConvertForestLand() {
        return convertForestLand;
    }

    public void setConvertForestLand(Boolean convertForestLand) {
        this.convertForestLand = convertForestLand;
    }

    public Boolean getEcologicalImpactsLandscap() {
        return ecologicalImpactsLandscap;
    }

    public void setEcologicalImpactsLandscap(Boolean ecologicalImpactsLandscap) {
        this.ecologicalImpactsLandscap = ecologicalImpactsLandscap;
    }

    public Boolean getEcologicalImpactsSit() {
        return ecologicalImpactsSit;
    }

    public void setEcologicalImpactsSit(Boolean ecologicalImpactsSit) {
        this.ecologicalImpactsSit = ecologicalImpactsSit;
    }

    public Boolean getEconomicOthe() {
        return economicOthe;
    }

    public void setEconomicOthe(Boolean economicOthe) {
        this.economicOthe = economicOthe;
    }

    public Boolean getEconomicProductivit() {
        return economicProductivit;
    }

    public void setEconomicProductivit(Boolean economicProductivit) {
        this.economicProductivit = economicProductivit;
    }

    public Boolean getEconomicReason() {
        return economicReason;
    }

    public void setEconomicReason(Boolean economicReason) {
        this.economicReason = economicReason;
    }

    public Boolean getEconomicStandQualit() {
        return economicStandQualit;
    }

    public void setEconomicStandQualit(Boolean economicStandQualit) {
        this.economicStandQualit = economicStandQualit;
    }

    public Boolean getEnvironmentalHarmOthe() {
        return environmentalHarmOthe;
    }

    public void setEnvironmentalHarmOthe(Boolean environmentalHarmOthe) {
        this.environmentalHarmOthe = environmentalHarmOthe;
    }

    public Boolean getMitigatingEnvironmentalHar() {
        return mitigatingEnvironmentalHar;
    }

    public void setMitigatingEnvironmentalHar(Boolean mitigatingEnvironmentalHar) {
        this.mitigatingEnvironmentalHar = mitigatingEnvironmentalHar;
    }

    public Boolean getRespondingDiseaseIssue() {
        return respondingDiseaseIssue;
    }

    public void setRespondingDiseaseIssue(Boolean respondingDiseaseIssue) {
        this.respondingDiseaseIssue = respondingDiseaseIssue;
    }

    public Boolean getRespondingForestHealt() {
        return respondingForestHealt;
    }

    public void setRespondingForestHealt(Boolean respondingForestHealt) {
        this.respondingForestHealt = respondingForestHealt;
    }

    public Boolean getRespondingInsec() {
        return respondingInsec;
    }

    public void setRespondingInsec(Boolean respondingInsec) {
        this.respondingInsec = respondingInsec;
    }

    public Boolean getRespondingInvasiveSpecie() {
        return respondingInvasiveSpecie;
    }

    public void setRespondingInvasiveSpecie(Boolean respondingInvasiveSpecie) {
        this.respondingInvasiveSpecie = respondingInvasiveSpecie;
    }

    public Boolean getRespondingOthe() {
        return respondingOthe;
    }

    public void setRespondingOthe(Boolean respondingOthe) {
        this.respondingOthe = respondingOthe;
    }

    public Boolean getRestorationForestCove() {
        return restorationForestCove;
    }

    public void setRestorationForestCove(Boolean restorationForestCove) {
        this.restorationForestCove = restorationForestCove;
    }

    public Boolean getRestorationNativeFores() {
        return restorationNativeFores;
    }

    public void setRestorationNativeFores(Boolean restorationNativeFores) {
        this.restorationNativeFores = restorationNativeFores;
    }

    public Boolean getRestorationOthe() {
        return restorationOthe;
    }

    public void setRestorationOthe(Boolean restorationOthe) {
        this.restorationOthe = restorationOthe;
    }

    public Boolean getRestorationRiparianProtectio() {
        return restorationRiparianProtectio;
    }

    public void setRestorationRiparianProtectio(Boolean restorationRiparianProtectio) {
        this.restorationRiparianProtectio = restorationRiparianProtectio;
    }

    public Boolean getStopWho1A1B() {
        return stopWho1A1B;
    }

    public void setStopWho1A1B(Boolean stopWho1A1B) {
        this.stopWho1A1B = stopWho1A1B;
    }

    public Boolean getUseWho1A1B() {
        return useWho1A1B;
    }

    public void setUseWho1A1B(Boolean useWho1A1B) {
        this.useWho1A1B = useWho1A1B;
    }

    public String getConvertForestLandExplain() {
        return convertForestLandExplain;
    }

    public void setConvertForestLandExplain(String convertForestLandExplain) {
        this.convertForestLandExplain = convertForestLandExplain;
    }

    public String getEconomicOtherExplain() {
        return economicOtherExplain;
    }

    public void setEconomicOtherExplain(String economicOtherExplain) {
        this.economicOtherExplain = economicOtherExplain;
    }

    public String getEnvironmentalHarmOtherExplain() {
        return environmentalHarmOtherExplain;
    }

    public void setEnvironmentalHarmOtherExplain(String environmentalHarmOtherExplain) {
        this.environmentalHarmOtherExplain = environmentalHarmOtherExplain;
    }

    public String getRespondingOtherExplain() {
        return respondingOtherExplain;
    }

    public void setRespondingOtherExplain(String respondingOtherExplain) {
        this.respondingOtherExplain = respondingOtherExplain;
    }

    public String getRestorationOtherExplain() {
        return restorationOtherExplain;
    }

    public void setRestorationOtherExplain(String restorationOtherExplain) {
        this.restorationOtherExplain = restorationOtherExplain;
    }

    public String getStopWho1A1BNote() {
        return stopWho1A1BNote;
    }

    public void setStopWho1A1BNote(String stopWho1A1BNote) {
        this.stopWho1A1BNote = stopWho1A1BNote;
    }

    public String getUseWho1A1BNote() {
        return useWho1A1BNote;
    }

    public void setUseWho1A1BNote(String useWho1A1BNote) {
        this.useWho1A1BNote = useWho1A1BNote;
    }

    public String getConservationBiodiversity413() {
        return conservationBiodiversity413;
    }

    public void setConservationBiodiversity413(String conservationBiodiversity413) {
        this.conservationBiodiversity413 = conservationBiodiversity413;
    }

    public String getConservationBiodiversity414() {
        return conservationBiodiversity414;
    }

    public void setConservationBiodiversity414(String conservationBiodiversity414) {
        this.conservationBiodiversity414 = conservationBiodiversity414;
    }

    public String getConservationBiodiversity415() {
        return conservationBiodiversity415;
    }

    public void setConservationBiodiversity415(String conservationBiodiversity415) {
        this.conservationBiodiversity415 = conservationBiodiversity415;
    }

    public String getEcologicalImpactsLandscapeArea() {
        return ecologicalImpactsLandscapeArea;
    }

    public void setEcologicalImpactsLandscapeArea(String ecologicalImpactsLandscapeArea) {
        this.ecologicalImpactsLandscapeArea = ecologicalImpactsLandscapeArea;
    }

    public String getEcologicalImpactsSiteArea() {
        return ecologicalImpactsSiteArea;
    }

    public void setEcologicalImpactsSiteArea(String ecologicalImpactsSiteArea) {
        this.ecologicalImpactsSiteArea = ecologicalImpactsSiteArea;
    }

    public String getEconomicOtherArea() {
        return economicOtherArea;
    }

    public void setEconomicOtherArea(String economicOtherArea) {
        this.economicOtherArea = economicOtherArea;
    }

    public String getEconomicProductivityArea() {
        return economicProductivityArea;
    }

    public void setEconomicProductivityArea(String economicProductivityArea) {
        this.economicProductivityArea = economicProductivityArea;
    }

    public String getEconomicStandArea() {
        return economicStandArea;
    }

    public void setEconomicStandArea(String economicStandArea) {
        this.economicStandArea = economicStandArea;
    }

    public String getEnvironmentalHarmOtherArea() {
        return environmentalHarmOtherArea;
    }

    public void setEnvironmentalHarmOtherArea(String environmentalHarmOtherArea) {
        this.environmentalHarmOtherArea = environmentalHarmOtherArea;
    }

    public String getIndigenousPeoplesForest() {
        return indigenousPeoplesForest;
    }

    public void setIndigenousPeoplesForest(String indigenousPeoplesForest) {
        this.indigenousPeoplesForest = indigenousPeoplesForest;
    }

    public String getIndigenousPeoplesPrivate() {
        return indigenousPeoplesPrivate;
    }

    public void setIndigenousPeoplesPrivate(String indigenousPeoplesPrivate) {
        this.indigenousPeoplesPrivate = indigenousPeoplesPrivate;
    }

    public String getIndigenousPeoplesPublic() {
        return indigenousPeoplesPublic;
    }

    public void setIndigenousPeoplesPublic(String indigenousPeoplesPublic) {
        this.indigenousPeoplesPublic = indigenousPeoplesPublic;
    }

    public String getProtectionMaintenanceWaterRes() {
        return protectionMaintenanceWaterRes;
    }

    public void setProtectionMaintenanceWaterRes(String protectionMaintenanceWaterRes) {
        this.protectionMaintenanceWaterRes = protectionMaintenanceWaterRes;
    }

    public String getRespondingDiseaseArea() {
        return respondingDiseaseArea;
    }

    public void setRespondingDiseaseArea(String respondingDiseaseArea) {
        this.respondingDiseaseArea = respondingDiseaseArea;
    }

    public String getRespondingInsectArea() {
        return respondingInsectArea;
    }

    public void setRespondingInsectArea(String respondingInsectArea) {
        this.respondingInsectArea = respondingInsectArea;
    }

    public String getRespondingInvasiveArea() {
        return respondingInvasiveArea;
    }

    public void setRespondingInvasiveArea(String respondingInvasiveArea) {
        this.respondingInvasiveArea = respondingInvasiveArea;
    }

    public String getRestorationNativeArea() {
        return restorationNativeArea;
    }

    public void setRestorationNativeArea(String restorationNativeArea) {
        this.restorationNativeArea = restorationNativeArea;
    }

    public String getRestorationOtherArea() {
        return restorationOtherArea;
    }

    public void setRestorationOtherArea(String restorationOtherArea) {
        this.restorationOtherArea = restorationOtherArea;
    }

    public String getTrainedWoodProducersChanged() {
        return trainedWoodProducersChanged;
    }

    public void setTrainedWoodProducersChanged(String trainedWoodProducersChanged) {
        this.trainedWoodProducersChanged = trainedWoodProducersChanged;
    }

    public String getTrainingEducation() {
        return trainingEducation;
    }

    public void setTrainingEducation(String trainingEducation) {
        this.trainingEducation = trainingEducation;
    }

    public String getRestorationRiparianArea() {
        return restorationRiparianArea;
    }

    public void setRestorationRiparianArea(String restorationRiparianArea) {
        this.restorationRiparianArea = restorationRiparianArea;
    }

    public String getRespondingOtherArea() {
        return respondingOtherArea;
    }

    public void setRespondingOtherArea(String respondingOtherArea) {
        this.respondingOtherArea = respondingOtherArea;
    }

    public Boolean getEcologicalImpactsLandscape() {
        return ecologicalImpactsLandscape;
    }

    public void setEcologicalImpactsLandscape(Boolean ecologicalImpactsLandscape) {
        this.ecologicalImpactsLandscape = ecologicalImpactsLandscape;
    }

    public Boolean getEcologicalImpactsSite() {
        return ecologicalImpactsSite;
    }

    public void setEcologicalImpactsSite(Boolean ecologicalImpactsSite) {
        this.ecologicalImpactsSite = ecologicalImpactsSite;
    }

    public Boolean getEconomicOther() {
        return economicOther;
    }

    public void setEconomicOther(Boolean economicOther) {
        this.economicOther = economicOther;
    }

    public Boolean getEconomicProductivity() {
        return economicProductivity;
    }

    public void setEconomicProductivity(Boolean economicProductivity) {
        this.economicProductivity = economicProductivity;
    }

    public Boolean getEconomicReasons() {
        return economicReasons;
    }

    public void setEconomicReasons(Boolean economicReasons) {
        this.economicReasons = economicReasons;
    }

    public Boolean getEconomicStandQuality() {
        return economicStandQuality;
    }

    public void setEconomicStandQuality(Boolean economicStandQuality) {
        this.economicStandQuality = economicStandQuality;
    }

    public Boolean getEnvironmentalHarmOther() {
        return environmentalHarmOther;
    }

    public void setEnvironmentalHarmOther(Boolean environmentalHarmOther) {
        this.environmentalHarmOther = environmentalHarmOther;
    }

    public Boolean getMitigatingEnvironmentalHarm() {
        return mitigatingEnvironmentalHarm;
    }

    public void setMitigatingEnvironmentalHarm(Boolean mitigatingEnvironmentalHarm) {
        this.mitigatingEnvironmentalHarm = mitigatingEnvironmentalHarm;
    }

    public Boolean getRespondingDiseaseIssues() {
        return respondingDiseaseIssues;
    }

    public void setRespondingDiseaseIssues(Boolean respondingDiseaseIssues) {
        this.respondingDiseaseIssues = respondingDiseaseIssues;
    }

    public Boolean getRespondingForestHealth() {
        return respondingForestHealth;
    }

    public void setRespondingForestHealth(Boolean respondingForestHealth) {
        this.respondingForestHealth = respondingForestHealth;
    }

    public Boolean getRespondingInsect() {
        return respondingInsect;
    }

    public void setRespondingInsect(Boolean respondingInsect) {
        this.respondingInsect = respondingInsect;
    }

    public Boolean getRespondingInvasiveSpecies() {
        return respondingInvasiveSpecies;
    }

    public void setRespondingInvasiveSpecies(Boolean respondingInvasiveSpecies) {
        this.respondingInvasiveSpecies = respondingInvasiveSpecies;
    }

    public Boolean getRespondingOther() {
        return respondingOther;
    }

    public void setRespondingOther(Boolean respondingOther) {
        this.respondingOther = respondingOther;
    }

    public Boolean getRestorationForestCover() {
        return restorationForestCover;
    }

    public void setRestorationForestCover(Boolean restorationForestCover) {
        this.restorationForestCover = restorationForestCover;
    }

    public Boolean getRestorationNativeForest() {
        return restorationNativeForest;
    }

    public void setRestorationNativeForest(Boolean restorationNativeForest) {
        this.restorationNativeForest = restorationNativeForest;
    }

    public Boolean getRestorationOther() {
        return restorationOther;
    }

    public void setRestorationOther(Boolean restorationOther) {
        this.restorationOther = restorationOther;
    }

    public Boolean getRestorationRiparianProtection() {
        return restorationRiparianProtection;
    }

    public void setRestorationRiparianProtection(Boolean restorationRiparianProtection) {
        this.restorationRiparianProtection = restorationRiparianProtection;
    }
}
