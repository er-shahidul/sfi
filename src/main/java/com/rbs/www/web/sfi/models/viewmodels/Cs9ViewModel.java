package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.SpELAssert;

import java.util.Set;

@SpELAssert.List({
        @SpELAssert(
                value = "protectionMaintenanceWaterResItems1 != null && !protectionMaintenanceWaterResItems1.isEmpty()",
                applyIf = "protectionMaintenanceWaterRes != null && protectionMaintenanceWaterRes.equals('1')",
                message = "{cs9.protectionMaintenanceWaterResItems1}"
        ),
        @SpELAssert(
                value = "protectionMaintenanceWaterResItems2 != null && !protectionMaintenanceWaterResItems2.isEmpty()",
                applyIf = "protectionMaintenanceWaterRes != null && protectionMaintenanceWaterRes.equals('2')",
                message = "{cs9.protectionMaintenanceWaterResItems2}"
        ),
        @SpELAssert(
                value = "protectionMaintenanceRationale != null && !protectionMaintenanceRationale.isEmpty()",
                applyIf = "protectionMaintenanceWaterRes != null && protectionMaintenanceWaterRes.equals('3')",
                message = "{cs9.protectionMaintenanceRationale}"
        ),
        @SpELAssert(
                value = "conservationBiodiversity413Items1 != null && !conservationBiodiversity413Items1.isEmpty()",
                applyIf = "conservationBiodiversity413 != null && conservationBiodiversity413.equals('1')",
                message = "{cs9.conservationBiodiversity413Items1}"
        ),
        @SpELAssert(
                value = "conservationBiodiversity413Items2 != null && !conservationBiodiversity413Items2.isEmpty()",
                applyIf = "conservationBiodiversity413 != null && conservationBiodiversity413.equals('2')",
                message = "{cs9.conservationBiodiversity413Items2}"
        ),
        @SpELAssert(
                value = "conservation413Rationale != null && !conservation413Rationale.isEmpty()",
                applyIf = "conservationBiodiversity413 != null && conservationBiodiversity413.equals('3')",
                message = "{cs9.conservation413Rationale}"
        ),
        @SpELAssert(
                value = "conservationBiodiversity414Items1 != null && !conservationBiodiversity414Items1.isEmpty()",
                applyIf = "conservationBiodiversity414 != null && conservationBiodiversity414.equals('1')",
                message = "{cs9.conservationBiodiversity414Items1}"
        ),
        @SpELAssert(
                value = "conservationBiodiversity414Items2 != null && !conservationBiodiversity414Items2.isEmpty()",
                applyIf = "conservationBiodiversity414 != null && conservationBiodiversity414.equals('2')",
                message = "{cs9.conservationBiodiversity414Items2}"
        ),
        @SpELAssert(
                value = "conservation414Rationale != null && !conservation414Rationale.isEmpty()",
                applyIf = "conservationBiodiversity414 != null && conservationBiodiversity414.equals('3')",
                message = "{cs9.conservation414Rationale}"
        ),
        @SpELAssert(
                value = "trainingEducationItems1 != null && !trainingEducationItems1.isEmpty()",
                applyIf = "trainingEducation != null && trainingEducation.equals('1')",
                message = "{cs9.trainingEducationItems1}"
        ),
        @SpELAssert(
                value = "trainingEduRationale != null && !trainingEduRationale.isEmpty()",
                applyIf = "trainingEducation != null && trainingEducation.equals('3')",
                message = "{cs9.trainingEduRationale}"
        ),
        @SpELAssert(
                value = "useWho1A1BNote != null && !useWho1A1BNote.isEmpty()",
                applyIf = "useWho1A1B != null && useWho1A1B",
                message = "{cs9.useWho1A1BNote}"
        ),
        @SpELAssert(
                value = "stopWho1A1BNote != null && !stopWho1A1BNote.isEmpty()",
                applyIf = "stopWho1A1B != null && stopWho1A1B",
                message = "{cs9.stopWho1A1BNote}"
        ),
        @SpELAssert(
                value = "convertForestLandExplain != null && !convertForestLandExplain.isEmpty()",
                applyIf = "convertForestLand != null && convertForestLand",
                message = "{cs9.convertForestLandExplain}"
        )
})
public class Cs9ViewModel extends BaseViewModel {
    private Integer id;
    private Boolean acknowledge;
    private Boolean convertForestCover;
    private Boolean convertForestLand;
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
    private Boolean stopWho1A1B;
    private Boolean useWho1A1B;
    private Set<Integer> conservationBiodiversity413Items;
    private Set<Integer> conservationBiodiversity414Items;
    private Set<Integer> indigenousPeoplesForestItems;
    private Set<Integer> indigenousPeoplesPrivateItems;
    private Set<Integer> indigenousPeoplesPublicItems;
    private Set<Integer> trainingEducationItems;
    private Set<SfiPpFormForestlandAreaViewModel> forestlandAreas;
    private Set<SfiPpFormStoryViewModel> stories;
    private String conservationBiodiversity413;
    private String conservationBiodiversity414;
    private String conservationBiodiversity415;
    private String convertForestLandExplain;
    private String ecologicalImpactsLandscapeArea;
    private String ecologicalImpactsSiteArea;
    private String economicOtherArea;
    private String economicOtherExplain;
    private String economicProductivityArea;
    private String economicStandArea;
    private String environmentalHarmOtherArea;
    private String environmentalHarmOtherExplain;
    private String indigenousPeoplesForest;
    private String indigenousPeoplesPrivate;
    private String indigenousPeoplesPublic;
    private String protectionMaintenanceWaterRes;
    private String respondingDiseaseArea;
    private String respondingInsectArea;
    private String respondingInvasiveArea;
    private String respondingOtherArea;
    private String respondingOtherExplain;
    private String restorationNativeArea;
    private String restorationOtherArea;
    private String restorationOtherExplain;
    private String restorationRiparianArea;
    private String stopWho1A1BNote;

    private String trainedWoodProducersChanged;
    private String trainingEducation;
    private String useWho1A1BNote;

    private Set<Integer> protectionMaintenanceWaterResItems1;
    private Set<Integer> protectionMaintenanceWaterResItems2;
    private Set<Integer> conservationBiodiversity413Items1;
    private Set<Integer> conservationBiodiversity413Items2;
    private Set<Integer> conservationBiodiversity414Items1;
    private Set<Integer> conservationBiodiversity414Items2;
    private Set<Integer> indigenousPeoplesPublicItems1;
    private Set<Integer> indigenousPeoplesPrivateItems1;
    private Set<Integer> indigenousPeoplesPrivateItems2;
    private Set<Integer> indigenousPeoplesForestItems1;
    private Set<Integer> trainingEducationItems1;

    private String conservation413DataSource1_2;
    private String conservation413DataSource1_4;
    private String conservation413DataSource2_2;
    private String conservation413DataSource2_4;
    private String conservation414Explain1_1;
    private String conservation414Explain1_2;
    private String conservation414Explain1_5;
    private String conservation414Explain1_6;
    private String conservation414Explain2_1;
    private String conservation414Explain2_2;
    private String conservation414Explain2_5;
    private String conservation414Explain2_6;
    private String conservation415Explain1_1;
    private String conservation415Explain1_2;
    private String protectionMaintenanceRationale;
    private String conservation413Rationale;
    private String conservation414Rationale;
    private String conservation415Rationale;
    private String indigenousPublicRationale;
    private String indigenousPrivateRationale;
    private String indigenousForestPractice;
    private String trainingEduRationale;

    private String conservationBiodiversity415Exp;
    private String trainingEduRationaleAnother;
    private String conservationBiodiversity415Rationale;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrainingEduRationaleAnother() {
        return trainingEduRationaleAnother;
    }

    public void setTrainingEduRationaleAnother(String trainingEduRationaleAnother) {
        this.trainingEduRationaleAnother = trainingEduRationaleAnother;
    }

    public String getConservationBiodiversity415Rationale() {
        return conservationBiodiversity415Rationale;
    }

    public void setConservationBiodiversity415Rationale(String conservationBiodiversity415Rationale) {
        this.conservationBiodiversity415Rationale = conservationBiodiversity415Rationale;
    }

    public String getConservationBiodiversity415Exp() {
        return conservationBiodiversity415Exp;
    }

    public void setConservationBiodiversity415Exp(String conservationBiodiversity415Exp) {
        this.conservationBiodiversity415Exp = conservationBiodiversity415Exp;
    }

    public Set<Integer> getProtectionMaintenanceWaterResItems1() {
        return protectionMaintenanceWaterResItems1;
    }

    public void setProtectionMaintenanceWaterResItems1(Set<Integer> protectionMaintenanceWaterResItems1) {
        this.protectionMaintenanceWaterResItems1 = protectionMaintenanceWaterResItems1;
    }

    public Set<Integer> getProtectionMaintenanceWaterResItems2() {
        return protectionMaintenanceWaterResItems2;
    }

    public void setProtectionMaintenanceWaterResItems2(Set<Integer> protectionMaintenanceWaterResItems2) {
        this.protectionMaintenanceWaterResItems2 = protectionMaintenanceWaterResItems2;
    }

    public Set<Integer> getConservationBiodiversity413Items1() {
        return conservationBiodiversity413Items1;
    }

    public void setConservationBiodiversity413Items1(Set<Integer> conservationBiodiversity413Items1) {
        this.conservationBiodiversity413Items1 = conservationBiodiversity413Items1;
    }

    public Set<Integer> getConservationBiodiversity414Items1() {
        return conservationBiodiversity414Items1;
    }

    public void setConservationBiodiversity414Items1(Set<Integer> conservationBiodiversity414Items1) {
        this.conservationBiodiversity414Items1 = conservationBiodiversity414Items1;
    }

    public Set<Integer> getIndigenousPeoplesPublicItems1() {
        return indigenousPeoplesPublicItems1;
    }

    public void setIndigenousPeoplesPublicItems1(Set<Integer> indigenousPeoplesPublicItems1) {
        this.indigenousPeoplesPublicItems1 = indigenousPeoplesPublicItems1;
    }

    public Set<Integer> getIndigenousPeoplesPrivateItems1() {
        return indigenousPeoplesPrivateItems1;
    }

    public void setIndigenousPeoplesPrivateItems1(Set<Integer> indigenousPeoplesPrivateItems1) {
        this.indigenousPeoplesPrivateItems1 = indigenousPeoplesPrivateItems1;
    }

    public Set<Integer> getIndigenousPeoplesPrivateItems2() {
        return indigenousPeoplesPrivateItems2;
    }

    public void setIndigenousPeoplesPrivateItems2(Set<Integer> indigenousPeoplesPrivateItems2) {
        this.indigenousPeoplesPrivateItems2 = indigenousPeoplesPrivateItems2;
    }

    public Set<Integer> getIndigenousPeoplesForestItems1() {
        return indigenousPeoplesForestItems1;
    }

    public void setIndigenousPeoplesForestItems1(Set<Integer> indigenousPeoplesForestItems1) {
        this.indigenousPeoplesForestItems1 = indigenousPeoplesForestItems1;
    }

    public Set<Integer> getTrainingEducationItems1() {
        return trainingEducationItems1;
    }

    public void setTrainingEducationItems1(Set<Integer> trainingEducationItems1) {
        this.trainingEducationItems1 = trainingEducationItems1;
    }

    public String getConservation413DataSource1_2() {
        return conservation413DataSource1_2;
    }

    public void setConservation413DataSource1_2(String conservation413DataSource1_2) {
        this.conservation413DataSource1_2 = conservation413DataSource1_2;
    }

    public String getConservation413DataSource1_4() {
        return conservation413DataSource1_4;
    }

    public void setConservation413DataSource1_4(String conservation413DataSource1_4) {
        this.conservation413DataSource1_4 = conservation413DataSource1_4;
    }

    public String getConservation413DataSource2_2() {
        return conservation413DataSource2_2;
    }

    public void setConservation413DataSource2_2(String conservation413DataSource2_2) {
        this.conservation413DataSource2_2 = conservation413DataSource2_2;
    }

    public String getConservation413DataSource2_4() {
        return conservation413DataSource2_4;
    }

    public void setConservation413DataSource2_4(String conservation413DataSource2_4) {
        this.conservation413DataSource2_4 = conservation413DataSource2_4;
    }

    public String getConservation414Explain1_1() {
        return conservation414Explain1_1;
    }

    public void setConservation414Explain1_1(String conservation414Explain1_1) {
        this.conservation414Explain1_1 = conservation414Explain1_1;
    }

    public String getConservation414Explain1_2() {
        return conservation414Explain1_2;
    }

    public void setConservation414Explain1_2(String conservation414Explain1_2) {
        this.conservation414Explain1_2 = conservation414Explain1_2;
    }

    public String getConservation414Explain1_5() {
        return conservation414Explain1_5;
    }

    public void setConservation414Explain1_5(String conservation414Explain1_5) {
        this.conservation414Explain1_5 = conservation414Explain1_5;
    }

    public String getConservation414Explain1_6() {
        return conservation414Explain1_6;
    }

    public void setConservation414Explain1_6(String conservation414Explain1_6) {
        this.conservation414Explain1_6 = conservation414Explain1_6;
    }

    public String getConservation414Explain2_1() {
        return conservation414Explain2_1;
    }

    public void setConservation414Explain2_1(String conservation414Explain2_1) {
        this.conservation414Explain2_1 = conservation414Explain2_1;
    }

    public String getConservation414Explain2_2() {
        return conservation414Explain2_2;
    }

    public void setConservation414Explain2_2(String conservation414Explain2_2) {
        this.conservation414Explain2_2 = conservation414Explain2_2;
    }

    public String getConservation414Explain2_5() {
        return conservation414Explain2_5;
    }

    public void setConservation414Explain2_5(String conservation414Explain2_5) {
        this.conservation414Explain2_5 = conservation414Explain2_5;
    }

    public String getConservation414Explain2_6() {
        return conservation414Explain2_6;
    }

    public void setConservation414Explain2_6(String conservation414Explain2_6) {
        this.conservation414Explain2_6 = conservation414Explain2_6;
    }

    public String getConservation415Explain1_1() {
        return conservation415Explain1_1;
    }

    public void setConservation415Explain1_1(String conservation415Explain1_1) {
        this.conservation415Explain1_1 = conservation415Explain1_1;
    }

    public String getConservation415Explain1_2() {
        return conservation415Explain1_2;
    }

    public void setConservation415Explain1_2(String conservation415Explain1_2) {
        this.conservation415Explain1_2 = conservation415Explain1_2;
    }

    public String getProtectionMaintenanceRationale() {
        return protectionMaintenanceRationale;
    }

    public void setProtectionMaintenanceRationale(String protectionMaintenanceRationale) {
        this.protectionMaintenanceRationale = protectionMaintenanceRationale;
    }

    public String getConservation413Rationale() {
        return conservation413Rationale;
    }

    public void setConservation413Rationale(String conservation413Rationale) {
        this.conservation413Rationale = conservation413Rationale;
    }

    public String getConservation414Rationale() {
        return conservation414Rationale;
    }

    public void setConservation414Rationale(String conservation414Rationale) {
        this.conservation414Rationale = conservation414Rationale;
    }

    public String getConservation415Rationale() {
        return conservation415Rationale;
    }

    public void setConservation415Rationale(String conservation415Rationale) {
        this.conservation415Rationale = conservation415Rationale;
    }

    public String getIndigenousPublicRationale() {
        return indigenousPublicRationale;
    }

    public void setIndigenousPublicRationale(String indigenousPublicRationale) {
        this.indigenousPublicRationale = indigenousPublicRationale;
    }

    public String getIndigenousPrivateRationale() {
        return indigenousPrivateRationale;
    }

    public void setIndigenousPrivateRationale(String indigenousPrivateRationale) {
        this.indigenousPrivateRationale = indigenousPrivateRationale;
    }

    public String getIndigenousForestPractice() {
        return indigenousForestPractice;
    }

    public void setIndigenousForestPractice(String indigenousForestPractice) {
        this.indigenousForestPractice = indigenousForestPractice;
    }

    public String getTrainingEduRationale() {
        return trainingEduRationale;
    }

    public void setTrainingEduRationale(String trainingEduRationale) {
        this.trainingEduRationale = trainingEduRationale;
    }

    public Boolean getAcknowledge() {
        return acknowledge;
    }

    public void setAcknowledge(Boolean acknowledge) {
        this.acknowledge = acknowledge;
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

    public Set<SfiPpFormStoryViewModel> getStories() {
        return stories;
    }

    public void setStories(Set<SfiPpFormStoryViewModel> stories) {
        this.stories = stories;
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

    public String getConvertForestLandExplain() {
        return convertForestLandExplain;
    }

    public void setConvertForestLandExplain(String convertForestLandExplain) {
        this.convertForestLandExplain = convertForestLandExplain;
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

    public String getEconomicOtherExplain() {
        return economicOtherExplain;
    }

    public void setEconomicOtherExplain(String economicOtherExplain) {
        this.economicOtherExplain = economicOtherExplain;
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

    public String getEnvironmentalHarmOtherExplain() {
        return environmentalHarmOtherExplain;
    }

    public void setEnvironmentalHarmOtherExplain(String environmentalHarmOtherExplain) {
        this.environmentalHarmOtherExplain = environmentalHarmOtherExplain;
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

    public String getRestorationOtherExplain() {
        return restorationOtherExplain;
    }

    public void setRestorationOtherExplain(String restorationOtherExplain) {
        this.restorationOtherExplain = restorationOtherExplain;
    }

    public String getRestorationRiparianArea() {
        return restorationRiparianArea;
    }

    public void setRestorationRiparianArea(String restorationRiparianArea) {
        this.restorationRiparianArea = restorationRiparianArea;
    }

    public String getStopWho1A1BNote() {
        return stopWho1A1BNote;
    }

    public void setStopWho1A1BNote(String stopWho1A1BNote) {
        this.stopWho1A1BNote = stopWho1A1BNote;
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

    public String getUseWho1A1BNote() {
        return useWho1A1BNote;
    }

    public void setUseWho1A1BNote(String useWho1A1BNote) {
        this.useWho1A1BNote = useWho1A1BNote;
    }

    public Set<Integer> getConservationBiodiversity413Items2() {
        return conservationBiodiversity413Items2;
    }

    public void setConservationBiodiversity413Items2(Set<Integer> conservationBiodiversity413Items2) {
        this.conservationBiodiversity413Items2 = conservationBiodiversity413Items2;
    }

    public Set<Integer> getConservationBiodiversity414Items2() {
        return conservationBiodiversity414Items2;
    }

    public void setConservationBiodiversity414Items2(Set<Integer> conservationBiodiversity414Items2) {
        this.conservationBiodiversity414Items2 = conservationBiodiversity414Items2;
    }
}
