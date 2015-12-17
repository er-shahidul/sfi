package com.rbs.sfi.web.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs9 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs9_acknowledge", nullable = true)
    private Boolean acknowledge;

    @Column(name = "cs9_conservationBiodiversity413Items", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> conservationBiodiversity413Items;

    @Column(name = "cs9_conservationBiodiversity414Items", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> conservationBiodiversity414Items;

    @Column(name = "cs9_indigenousPeoplesForestItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> indigenousPeoplesForestItems;

    @Column(name = "cs9_indigenousPeoplesPrivateItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> indigenousPeoplesPrivateItems;

    @Column(name = "cs9_indigenousPeoplesPublicItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> indigenousPeoplesPublicItems;

    @Column(name = "cs9_protectionMaintenanceWaterResItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> protectionMaintenanceWaterResItems;

    @Column(name = "cs9_trainingEducationItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> trainingEducationItems;

    @OneToMany(targetEntity = SfiPpFormForestlandArea.class, fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SfiPpFormForestlandArea> forestlandAreas;

    @Column(name = "cs9_convertForestCover", nullable = true)
    private Boolean convertForestCover;

    @Column(name = "cs9_convertForestLand", nullable = true)
    private Boolean convertForestLand;

    @Column(name = "cs9_ecologicalImpactsLandscap", nullable = true)
    private Boolean ecologicalImpactsLandscap;

    @Column(name = "cs9_ecologicalImpactsSit", nullable = true)
    private Boolean ecologicalImpactsSit;

    @Column(name = "cs9_economicOthe", nullable = true)
    private Boolean economicOthe;

    @Column(name = "cs9_economicProductivit", nullable = true)
    private Boolean economicProductivit;

    @Column(name = "cs9_economicReason", nullable = true)
    private Boolean economicReason;

    @Column(name = "cs9_economicStandQualit", nullable = true)
    private Boolean economicStandQualit;

    @Column(name = "cs9_environmentalHarmOthe", nullable = true)
    private Boolean environmentalHarmOthe;

    @Column(name = "cs9_mitigatingEnvironmentalHar", nullable = true)
    private Boolean mitigatingEnvironmentalHar;

    @Column(name = "cs9_respondingDiseaseIssue", nullable = true)
    private Boolean respondingDiseaseIssue;

    @Column(name = "cs9_respondingForestHealt", nullable = true)
    private Boolean respondingForestHealt;

    @Column(name = "cs9_respondingInsec", nullable = true)
    private Boolean respondingInsec;

    @Column(name = "cs9_respondingInvasiveSpecie", nullable = true)
    private Boolean respondingInvasiveSpecie;

    @Column(name = "cs9_respondingOthe", nullable = true)
    private Boolean respondingOthe;

    @Column(name = "cs9_restorationForestCove", nullable = true)
    private Boolean restorationForestCove;

    @Column(name = "cs9_restorationNativeFores", nullable = true)
    private Boolean restorationNativeFores;

    @Column(name = "cs9_restorationOthe", nullable = true)
    private Boolean restorationOthe;

    @Column(name = "cs9_restorationRiparianProtectio", nullable = true)
    private Boolean restorationRiparianProtectio;

    @Column(name = "cs9_stopWho1A1B", nullable = true)
    private Boolean stopWho1A1B;

    @Column(name = "cs9_useWho1A1B", nullable = true)
    private Boolean useWho1A1B;

    @Column(name = "cs9_convertForestLandExplain", nullable = true)
    private String convertForestLandExplain;

    @Column(name = "cs9_economicOtherExplain", nullable = true)
    private String economicOtherExplain;

    @Column(name = "cs9_environmentalHarmOtherExplain", nullable = true)
    private String environmentalHarmOtherExplain;

    @Column(name = "cs9_respondingOtherExplain", nullable = true)
    private String respondingOtherExplain;

    @Column(name = "cs9_restorationOtherExplain", nullable = true)
    private String restorationOtherExplain;

    @Column(name = "cs9_stopWho1A1BNote", nullable = true)
    private String stopWho1A1BNote;

    @Column(name = "cs9_useWho1A1BNote", nullable = true)
    private String useWho1A1BNote;

    @Column(name = "cs9_conservationBiodiversity413", nullable = true)
    private String conservationBiodiversity413;

    @Column(name = "cs9_conservationBiodiversity414", nullable = true)
    private String conservationBiodiversity414;

    @Column(name = "cs9_conservationBiodiversity415", nullable = true)
    private String conservationBiodiversity415;

    @Column(name = "cs9_ecologicalImpactsLandscapeArea", nullable = true)
    private String ecologicalImpactsLandscapeArea;

    @Column(name = "cs9_ecologicalImpactsSiteArea", nullable = true)
    private String ecologicalImpactsSiteArea;

    @Column(name = "cs9_economicOtherArea", nullable = true)
    private String economicOtherArea;

    @Column(name = "cs9_economicProductivityArea", nullable = true)
    private String economicProductivityArea;

    @Column(name = "cs9_economicStandArea", nullable = true)
    private String economicStandArea;

    @Column(name = "cs9_environmentalHarmOtherArea", nullable = true)
    private String environmentalHarmOtherArea;

    @Column(name = "cs9_indigenousPeoplesForest", nullable = true)
    private String indigenousPeoplesForest;

    @Column(name = "cs9_indigenousPeoplesPrivate", nullable = true)
    private String indigenousPeoplesPrivate;

    @Column(name = "cs9_indigenousPeoplesPublic", nullable = true)
    private String indigenousPeoplesPublic;

    @Column(name = "cs9_protectionMaintenanceWaterRes", nullable = true)
    private String protectionMaintenanceWaterRes;

    @Column(name = "cs9_respondingDiseaseArea", nullable = true)
    private String respondingDiseaseArea;

    @Column(name = "cs9_respondingInsectArea", nullable = true)
    private String respondingInsectArea;

    @Column(name = "cs9_respondingInvasiveArea", nullable = true)
    private String respondingInvasiveArea;

    @Column(name = "cs9_restorationNativeArea", nullable = true)
    private String restorationNativeArea;

    @Column(name = "cs9_restorationOtherArea", nullable = true)
    private String restorationOtherArea;

    @Column(name = "cs9_trainedWoodProducersChanged", nullable = true)
    private String trainedWoodProducersChanged;

    @Column(name = "cs9_trainingEducation", nullable = true)
    private String trainingEducation;

    @Column(name = "cs9_restorationRiparianArea", nullable = true)
    private String restorationRiparianArea;

    @Column(name = "cs9_respondingOtherArea", nullable = true)
    private String respondingOtherArea;

    @Override
    public Integer getId() {
        return id;
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
        addAll(this.conservationBiodiversity413Items, conservationBiodiversity413Items);
    }

    public Set<Integer> getConservationBiodiversity414Items() {
        return conservationBiodiversity414Items;
    }

    public void setConservationBiodiversity414Items(Set<Integer> conservationBiodiversity414Items) {
        addAll(this.conservationBiodiversity414Items, conservationBiodiversity414Items);
    }

    public Set<Integer> getIndigenousPeoplesForestItems() {
        return indigenousPeoplesForestItems;
    }

    public void setIndigenousPeoplesForestItems(Set<Integer> indigenousPeoplesForestItems) {
        addAll(this.indigenousPeoplesForestItems, indigenousPeoplesForestItems);
    }

    public Set<Integer> getIndigenousPeoplesPrivateItems() {
        return indigenousPeoplesPrivateItems;
    }

    public void setIndigenousPeoplesPrivateItems(Set<Integer> indigenousPeoplesPrivateItems) {
        addAll(this.indigenousPeoplesPrivateItems, indigenousPeoplesPrivateItems);
    }

    public Set<Integer> getIndigenousPeoplesPublicItems() {
        return indigenousPeoplesPublicItems;
    }

    public void setIndigenousPeoplesPublicItems(Set<Integer> indigenousPeoplesPublicItems) {
        addAll(this.indigenousPeoplesPublicItems, indigenousPeoplesPublicItems);
    }

    public Set<Integer> getProtectionMaintenanceWaterResItems() {
        return protectionMaintenanceWaterResItems;
    }

    public void setProtectionMaintenanceWaterResItems(Set<Integer> protectionMaintenanceWaterResItems) {
        addAll(this.protectionMaintenanceWaterResItems, protectionMaintenanceWaterResItems);
    }

    public Set<Integer> getTrainingEducationItems() {
        return trainingEducationItems;
    }

    public void setTrainingEducationItems(Set<Integer> trainingEducationItems) {
        addAll(this.trainingEducationItems, trainingEducationItems);
    }

    public Set<SfiPpFormForestlandArea> getForestlandAreas() {
        return forestlandAreas;
    }

    public void setForestlandAreas(Set<SfiPpFormForestlandArea> forestlandAreas) {
        addAll(this.forestlandAreas, forestlandAreas);
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
}
