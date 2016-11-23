package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs4 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs4_totalAreaReceivedHarv_usa", nullable = true)
    private Float usaTotalHervArea;

    @Column(name = "cs4_totalAreaReceivedHarv_ca", nullable = true)
    private Float caTotalHervArea;

    @Column(name = "cs4_avgAreaClearCutHarv_usa", nullable = true)
    private Float usaAvgHervArea;

    @Column(name = "cs4_avgAreaClearCutHarv_ca", nullable = true)
    private Float caAvgHervArea;

    @Column(name = "cs4_havestArea_usa", nullable = true)
    private Boolean usaGovRegulation;

    @Column(name = "cs4_havestArea_explain_usa", nullable = true)
    @Type(type = "text")
    private String usaGovRegulationExp;

    @Column(name = "cs4_havestArea_ca", nullable = true)
    private Boolean caGovRegulation;

    @Column(name = "cs4_havestArea_explain_ca", nullable = true)
    @Type(type = "text")
    private String caGovRegulationExp;

    @Column(name = "cs4_naturDisasterInsects_usa", nullable = true)
    private Boolean usaDisResDiseaseInsects;

    @Column(name = "cs4_naturDisasterInsects_explain_usa", nullable = true)
    @Type(type = "text")
    private String usaDiseaseInsectsExp;

    @Column(name = "cs4_naturDisasterInsects_ca", nullable = true)
    private Boolean caDisResDiseaseInsects;

    @Column(name = "cs4_naturDisasterInsects_explain_ca", nullable = true)
    @Type(type = "text")
    private String caDiseaseInsectsExp;

    @Column(name = "cs4_naturDisasterFire_usa", nullable = true)
    private Boolean usaDisResFireSalvage;

    @Column(name = "cs4_naturDisasterFire_explain_usa", nullable = true)
    @Type(type = "text")
    private String usaFireSalvageExp;

    @Column(name = "cs4_naturDisasterFire_ca", nullable = true)
    private Boolean caDisResFireSalvage;

    @Column(name = "cs4_naturDisasterFire_explain_ca", nullable = true)
    @Type(type = "text")
    private String caFireSalvageExp;

    @Column(name = "cs4_naturDisasterWindthrow_usa", nullable = true)
    private Boolean usaDisResWindthrow;

    @Column(name = "cs4_naturDisasterFireWindthrow_explain_usa", nullable = true)
    @Type(type = "text")
    private String usaWindthrowExp;

    @Column(name = "cs4_naturDisasterWindthrow_ca", nullable = true)
    private Boolean caDisResWindthrow;

    @Column(name = "cs4_naturDisasterFireWindthrow_explain_ca", nullable = true)
    @Type(type = "text")
    private String caWindthrowExp;

    @Column(name = "cs4_naturDisasterHurricane_usa", nullable = true)
    private Boolean usaDisResHurricane;

    @Column(name = "cs4_naturDisasterHurricane_explain_usa", nullable = true)
    @Type(type = "text")
    private String usaHurricaneExp;

    @Column(name = "cs4_naturDisasterHurricane_ca", nullable = true)
    private Boolean caDisResHurricane;

    @Column(name = "cs4_naturDisasterHurricane_explain_ca", nullable = true)
    @Type(type = "text")
    private String caHurricaneExp;

    @Column(name = "cs4_naturDisasterIceStorms_usa", nullable = true)
    private Boolean usaDisResIceStorm;

    @Column(name = "cs4_naturDisasterIceStorms_explain_usa", nullable = true)
    @Type(type = "text")
    private String usaIceStormExp;

    @Column(name = "cs4_naturDisasterIceStorms_ca", nullable = true)
    private Boolean caDisResIceStorm;

    @Column(name = "cs4_naturDisasterIceStorms_explain_ca", nullable = true)
    @Type(type = "text")
    private String caIceStormExp;

    @Column(name = "cs4_naturDisasterOther_usa", nullable = true)
    private Boolean usaOthersApply;

    @Column(name = "cs4_naturDisasterOther_explain_usa", nullable = true)
    @Type(type = "text")
    private String usaOthersExp;

    @Column(name = "cs4_naturDisasterOther_ca", nullable = true)
    private Boolean caOthersApply;

    @Column(name = "cs4_naturDisasterOther_explain_ca", nullable = true)
    @Type(type = "text")
    private String caOthersExp;

    @Column(name = "cs4_totalAreaBySeedTreeAndShelt_usa", nullable = true)
    private Float usaSeedTreeShelterWoodArea;

    @Column(name = "cs4_totalAreaBySeedTreeAndShelt_ca", nullable = true)
    private Float caSeedTreeShelterWoodArea;

    @Column(name = "cs4_totalAreaBySelection_usa", nullable = true)
    private Float usaSelectionMethodArea;

    @Column(name = "cs4_totalAreaByThiningOrSaniSalv_usa", nullable = true)
    private Float usaSanitationArea;

    @Column(name = "cs4_totalAreaByThiningOrSaniSalv_ca", nullable = true)
    private Float caSanitationArea;

    @Column(name = "cs4_totalAreaBySelection_ca", nullable = true)
    private Float caSelectionMethodArea;

    @Column(name = "cs4_usa_artPlant_1year", nullable = true)
    private Float usaPlantingOneYr;

    @Column(name = "cs4_ca_artPlant_1year", nullable = true)
    private Float caPlantingOneYr;

    @Column(name = "cs4_usa_artPlant_2years", nullable = true)
    private Float usaPlantingTwoYr;

    @Column(name = "cs4_ca_artPlant_2years", nullable = true)
    private Float caPlantingTwoYr;

    @Column(name = "cs4_usa_artPlant_moreThn2years", nullable = true)
    private Float usaPlantingTwoPlusYr;

    @Column(name = "cs4_ca_artPlant_moreThn2years", nullable = true)
    private Float caPlantingTwoPlusYr;

    @Column(name = "cs4_usa_directSeed_1year", nullable = true)
    private Float usaSeedingOneYr;

    @Column(name = "cs4_ca_directSeed_1year", nullable = true)
    private Float caSeedingOneYr;

    @Column(name = "cs4_usa_directSeed_2years", nullable = true)
    private Float usaSeedingTwoYr;

    @Column(name = "cs4_ca_directSeed_2years", nullable = true)
    private Float caSeedingTwoYr;

    @Column(name = "cs4_usa_directSeed_moreThn2years", nullable = true)
    private Float usaSeedingTwoPlusYr;

    @Column(name = "cs4_ca_directSeed_moreThn2years", nullable = true)
    private Float caSeedingTwoPlusYr;

    @Column(name = "cs4_usa_natrualRegen", nullable = true)
    private Float usaNatRegen2014;

    @Column(name = "cs4_ca_natrualRegen", nullable = true)
    private Float caNatRegen2014;

    @Column(name = "cs4_usa_percHarvUnitsRegen", nullable = true)
    private Float usaRegenPerc5Yr;

    @Column(name = "cs4_usa_usaRegenPerc5YrHAAC", nullable = true)
    private Float usaRegenPerc5YrHAAC;

    @Column(name = "cs4_ca_percHarvUnitsRegen", nullable = true)
    private Float caRegenPerc5Yr;

    @Column(name = "cs4_ca_caRegenPerc5YrHAAC", nullable = true)
    private Float caRegenPerc5YrHAAC;

    @Column(name = "cs4_harvesUnitCompleteLastYeaQualifyHAAC", nullable = true)
    private Float harvesUnitCompleteLastYeaQualifyHAAC;

    @Column(name = "cs4_harvesUnitCompleteLastYearMethodsHAAC", nullable = true)
    private Float harvesUnitCompleteLastYearMethodsHAAC;

    @Column(name = "cs4_harvesUnitCompleteLastYearMethodsHAACExp", nullable = true)
    @Type(type = "text")
    private String harvesUnitCompleteLastYearMethodsHAACExp;

    @Column(name = "cs4_ca_harvestUnitCompleteLastYeaQualifyHAAC", nullable = true)
    private Float caHarvestUnitCompleteLastYeaQualifyHAAC;

    @Column(name = "cs4_ca_harvestUnitCompleteLastYearMethodsHAAC", nullable = true)
    private Float caHarvestUnitCompleteLastYearMethodsHAAC;

    @Column(name = "cs4_ca_harvestUnitCompleteLastYearMethodsHAACExp", nullable = true)
    @Type(type = "text")
    private String caHarvestUnitCompleteLastYearMethodsHAACExp;

    @Column(name = "cs4_caHarvesUnitCompleteLastYeaQualifyHAAC", nullable = true)
    private Float caHarvesUnitCompleteLastYeaQualifyHAAC;

    @Column(name = "cs4_caHarvesUnitCompleteLastYearMethodsHAAC", nullable = true)
    private Float caHarvesUnitCompleteLastYearMethodsHAAC;

    @Column(name = "cs4_caHarvesUnitCompleteLastYearMethodsHAACExp", nullable = true)
    @Type(type = "text")
    private String caHarvesUnitCompleteLastYearMethodsHAACExp;

    @Column(name = "cs4_usaOtherMethod", nullable = true)
    private Boolean usaOtherMethod;

    @Column(name = "cs4_usaOtherMethodHAAC", nullable = true)
    private Float usaOtherMethodHAAC;

    @Column(name = "cs4_usaOtherMethodHAACExp", nullable = true)
    @Type(type = "text")
    private String usaOtherMethodHAACExp;

    @Column(name = "cs4_caOtherMethod", nullable = true)
    private Boolean caOtherMethod;

    @Column(name = "cs4_caOtherMethodHAAC", nullable = true)
    private Float caOtherMethodHAAC;

    @Column(name = "cs4_caOtherMethodHAACExp", nullable = true)
    @Type(type = "text")
    private String caOtherMethodHAACExp;

    @Column(name = "cs4_caSanitation", nullable = true)
    private Boolean caSanitation;

    @Column(name = "cs4_caSanitationExp", nullable = true)
    @Type(type = "text")
    private String caSanitationExp;

    @Column(name = "cs4_caSelectionMethod", nullable = true)
    private Boolean caSelectionMethod;

    @Column(name = "cs4_caSelectionMethodExp", nullable = true)
    @Type(type = "text")
    private String caSelectionMethodExp;

    @Column(name = "cs4_caSeedTreeShelterWood", nullable = true)
    private Boolean caSeedTreeShelterWood;

    @Column(name = "cs4_caSeedTreeShelterWoodExp", nullable = true)
    @Type(type = "text")
    private String caSeedTreeShelterWoodExp;




    @Column(name = "cs4_usaSanitation", nullable = true)
    private Boolean usaSanitation;

    @Column(name = "cs4_usaSanitationExp", nullable = true)
    @Type(type = "text")
    private String usaSanitationExp;

    @Column(name = "cs4_usaSelectionMethod", nullable = true)
    private Boolean usaSelectionMethod;

    @Column(name = "cs4_usaSelectionMethodExp", nullable = true)
    @Type(type = "text")
    private String usaSelectionMethodExp;

    @Column(name = "cs4_usaSeedTreeShelterWood", nullable = true)
    private Boolean usaSeedTreeShelterWood;

    @Column(name = "cs4_usaSeedTreeShelterWoodExp", nullable = true)
    @Type(type = "text")
    private String usaSeedTreeShelterWoodExp;


    @Column(name = "cs4_usaFinalHarvestHAAC", nullable = true)
    private Float usaFinalHarvestHAAC;

    @Column(name = "cs4_caFinalHarvestHAAC", nullable = true)
    private Float caFinalHarvestHAAC;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getUsaTotalHervArea() {
        return usaTotalHervArea;
    }

    public void setUsaTotalHervArea(Float usaTotalHervArea) {
        this.usaTotalHervArea = usaTotalHervArea;
    }

    public Float getCaTotalHervArea() {
        return caTotalHervArea;
    }

    public void setCaTotalHervArea(Float caTotalHervArea) {
        this.caTotalHervArea = caTotalHervArea;
    }

    public Float getUsaAvgHervArea() {
        return usaAvgHervArea;
    }

    public void setUsaAvgHervArea(Float usaAvgHervArea) {
        this.usaAvgHervArea = usaAvgHervArea;
    }

    public Float getCaAvgHervArea() {
        return caAvgHervArea;
    }

    public void setCaAvgHervArea(Float caAvgHervArea) {
        this.caAvgHervArea = caAvgHervArea;
    }

    public Boolean getUsaGovRegulation() {
        return usaGovRegulation;
    }

    public void setUsaGovRegulation(Boolean usaGovRegulation) {
        this.usaGovRegulation = usaGovRegulation;
    }

    public String getUsaGovRegulationExp() {
        return usaGovRegulationExp;
    }

    public void setUsaGovRegulationExp(String usaGovRegulationExp) {
        this.usaGovRegulationExp = usaGovRegulationExp;
    }

    public Boolean getCaGovRegulation() {
        return caGovRegulation;
    }

    public void setCaGovRegulation(Boolean caGovRegulation) {
        this.caGovRegulation = caGovRegulation;
    }

    public String getCaGovRegulationExp() {
        return caGovRegulationExp;
    }

    public void setCaGovRegulationExp(String caGovRegulationExp) {
        this.caGovRegulationExp = caGovRegulationExp;
    }

    public Boolean getUsaDisResDiseaseInsects() {
        return usaDisResDiseaseInsects;
    }

    public void setUsaDisResDiseaseInsects(Boolean usaDisResDiseaseInsects) {
        this.usaDisResDiseaseInsects = usaDisResDiseaseInsects;
    }

    public String getUsaDiseaseInsectsExp() {
        return usaDiseaseInsectsExp;
    }

    public void setUsaDiseaseInsectsExp(String usaDiseaseInsectsExp) {
        this.usaDiseaseInsectsExp = usaDiseaseInsectsExp;
    }

    public Boolean getCaDisResDiseaseInsects() {
        return caDisResDiseaseInsects;
    }

    public void setCaDisResDiseaseInsects(Boolean caDisResDiseaseInsects) {
        this.caDisResDiseaseInsects = caDisResDiseaseInsects;
    }

    public String getCaDiseaseInsectsExp() {
        return caDiseaseInsectsExp;
    }

    public void setCaDiseaseInsectsExp(String caDiseaseInsectsExp) {
        this.caDiseaseInsectsExp = caDiseaseInsectsExp;
    }

    public Boolean getUsaDisResFireSalvage() {
        return usaDisResFireSalvage;
    }

    public void setUsaDisResFireSalvage(Boolean usaDisResFireSalvage) {
        this.usaDisResFireSalvage = usaDisResFireSalvage;
    }

    public String getUsaFireSalvageExp() {
        return usaFireSalvageExp;
    }

    public void setUsaFireSalvageExp(String usaFireSalvageExp) {
        this.usaFireSalvageExp = usaFireSalvageExp;
    }

    public Boolean getCaDisResFireSalvage() {
        return caDisResFireSalvage;
    }

    public void setCaDisResFireSalvage(Boolean caDisResFireSalvage) {
        this.caDisResFireSalvage = caDisResFireSalvage;
    }

    public String getCaFireSalvageExp() {
        return caFireSalvageExp;
    }

    public void setCaFireSalvageExp(String caFireSalvageExp) {
        this.caFireSalvageExp = caFireSalvageExp;
    }

    public Boolean getUsaDisResWindthrow() {
        return usaDisResWindthrow;
    }

    public void setUsaDisResWindthrow(Boolean usaDisResWindthrow) {
        this.usaDisResWindthrow = usaDisResWindthrow;
    }

    public String getUsaWindthrowExp() {
        return usaWindthrowExp;
    }

    public void setUsaWindthrowExp(String usaWindthrowExp) {
        this.usaWindthrowExp = usaWindthrowExp;
    }

    public Boolean getCaDisResWindthrow() {
        return caDisResWindthrow;
    }

    public void setCaDisResWindthrow(Boolean caDisResWindthrow) {
        this.caDisResWindthrow = caDisResWindthrow;
    }

    public String getCaWindthrowExp() {
        return caWindthrowExp;
    }

    public void setCaWindthrowExp(String caWindthrowExp) {
        this.caWindthrowExp = caWindthrowExp;
    }

    public Boolean getUsaDisResHurricane() {
        return usaDisResHurricane;
    }

    public void setUsaDisResHurricane(Boolean usaDisResHurricane) {
        this.usaDisResHurricane = usaDisResHurricane;
    }

    public String getUsaHurricaneExp() {
        return usaHurricaneExp;
    }

    public void setUsaHurricaneExp(String usaHurricaneExp) {
        this.usaHurricaneExp = usaHurricaneExp;
    }

    public Boolean getCaDisResHurricane() {
        return caDisResHurricane;
    }

    public void setCaDisResHurricane(Boolean caDisResHurricane) {
        this.caDisResHurricane = caDisResHurricane;
    }

    public String getCaHurricaneExp() {
        return caHurricaneExp;
    }

    public void setCaHurricaneExp(String caHurricaneExp) {
        this.caHurricaneExp = caHurricaneExp;
    }

    public Boolean getUsaDisResIceStorm() {
        return usaDisResIceStorm;
    }

    public void setUsaDisResIceStorm(Boolean usaDisResIceStorm) {
        this.usaDisResIceStorm = usaDisResIceStorm;
    }

    public String getUsaIceStormExp() {
        return usaIceStormExp;
    }

    public void setUsaIceStormExp(String usaIceStormExp) {
        this.usaIceStormExp = usaIceStormExp;
    }

    public Boolean getCaDisResIceStorm() {
        return caDisResIceStorm;
    }

    public void setCaDisResIceStorm(Boolean caDisResIceStorm) {
        this.caDisResIceStorm = caDisResIceStorm;
    }

    public String getCaIceStormExp() {
        return caIceStormExp;
    }

    public void setCaIceStormExp(String caIceStormExp) {
        this.caIceStormExp = caIceStormExp;
    }

    public Boolean getUsaOthersApply() {
        return usaOthersApply;
    }

    public void setUsaOthersApply(Boolean usaOthersApply) {
        this.usaOthersApply = usaOthersApply;
    }

    public String getUsaOthersExp() {
        return usaOthersExp;
    }

    public void setUsaOthersExp(String usaOthersExp) {
        this.usaOthersExp = usaOthersExp;
    }

    public Boolean getCaOthersApply() {
        return caOthersApply;
    }

    public void setCaOthersApply(Boolean caOthersApply) {
        this.caOthersApply = caOthersApply;
    }

    public String getCaOthersExp() {
        return caOthersExp;
    }

    public void setCaOthersExp(String caOthersExp) {
        this.caOthersExp = caOthersExp;
    }

    public Float getUsaSeedTreeShelterWoodArea() {
        return usaSeedTreeShelterWoodArea;
    }

    public void setUsaSeedTreeShelterWoodArea(Float usaSeedTreeShelterWoodArea) {
        this.usaSeedTreeShelterWoodArea = usaSeedTreeShelterWoodArea;
    }

    public Float getCaSeedTreeShelterWoodArea() {
        return caSeedTreeShelterWoodArea;
    }

    public void setCaSeedTreeShelterWoodArea(Float caSeedTreeShelterWoodArea) {
        this.caSeedTreeShelterWoodArea = caSeedTreeShelterWoodArea;
    }

    public Float getUsaSelectionMethodArea() {
        return usaSelectionMethodArea;
    }

    public void setUsaSelectionMethodArea(Float usaSelectionMethodArea) {
        this.usaSelectionMethodArea = usaSelectionMethodArea;
    }

    public Float getUsaSanitationArea() {
        return usaSanitationArea;
    }

    public void setUsaSanitationArea(Float usaSanitationArea) {
        this.usaSanitationArea = usaSanitationArea;
    }

    public Float getCaSanitationArea() {
        return caSanitationArea;
    }

    public void setCaSanitationArea(Float caSanitationArea) {
        this.caSanitationArea = caSanitationArea;
    }

    public Float getCaSelectionMethodArea() {
        return caSelectionMethodArea;
    }

    public void setCaSelectionMethodArea(Float caSelectionMethodArea) {
        this.caSelectionMethodArea = caSelectionMethodArea;
    }

    public Float getUsaPlantingOneYr() {
        return usaPlantingOneYr;
    }

    public void setUsaPlantingOneYr(Float usaPlantingOneYr) {
        this.usaPlantingOneYr = usaPlantingOneYr;
    }

    public Float getCaPlantingOneYr() {
        return caPlantingOneYr;
    }

    public void setCaPlantingOneYr(Float caPlantingOneYr) {
        this.caPlantingOneYr = caPlantingOneYr;
    }

    public Float getUsaPlantingTwoYr() {
        return usaPlantingTwoYr;
    }

    public void setUsaPlantingTwoYr(Float usaPlantingTwoYr) {
        this.usaPlantingTwoYr = usaPlantingTwoYr;
    }

    public Float getCaPlantingTwoYr() {
        return caPlantingTwoYr;
    }

    public void setCaPlantingTwoYr(Float caPlantingTwoYr) {
        this.caPlantingTwoYr = caPlantingTwoYr;
    }

    public Float getUsaPlantingTwoPlusYr() {
        return usaPlantingTwoPlusYr;
    }

    public void setUsaPlantingTwoPlusYr(Float usaPlantingTwoPlusYr) {
        this.usaPlantingTwoPlusYr = usaPlantingTwoPlusYr;
    }

    public Float getCaPlantingTwoPlusYr() {
        return caPlantingTwoPlusYr;
    }

    public void setCaPlantingTwoPlusYr(Float caPlantingTwoPlusYr) {
        this.caPlantingTwoPlusYr = caPlantingTwoPlusYr;
    }

    public Float getUsaSeedingOneYr() {
        return usaSeedingOneYr;
    }

    public void setUsaSeedingOneYr(Float usaSeedingOneYr) {
        this.usaSeedingOneYr = usaSeedingOneYr;
    }

    public Float getCaSeedingOneYr() {
        return caSeedingOneYr;
    }

    public void setCaSeedingOneYr(Float caSeedingOneYr) {
        this.caSeedingOneYr = caSeedingOneYr;
    }

    public Float getUsaSeedingTwoYr() {
        return usaSeedingTwoYr;
    }

    public void setUsaSeedingTwoYr(Float usaSeedingTwoYr) {
        this.usaSeedingTwoYr = usaSeedingTwoYr;
    }

    public Float getCaSeedingTwoYr() {
        return caSeedingTwoYr;
    }

    public void setCaSeedingTwoYr(Float caSeedingTwoYr) {
        this.caSeedingTwoYr = caSeedingTwoYr;
    }

    public Float getUsaSeedingTwoPlusYr() {
        return usaSeedingTwoPlusYr;
    }

    public void setUsaSeedingTwoPlusYr(Float usaSeedingTwoPlusYr) {
        this.usaSeedingTwoPlusYr = usaSeedingTwoPlusYr;
    }

    public Float getCaSeedingTwoPlusYr() {
        return caSeedingTwoPlusYr;
    }

    public void setCaSeedingTwoPlusYr(Float caSeedingTwoPlusYr) {
        this.caSeedingTwoPlusYr = caSeedingTwoPlusYr;
    }

    public Float getUsaNatRegen2014() {
        return usaNatRegen2014;
    }

    public void setUsaNatRegen2014(Float usaNatRegen2014) {
        this.usaNatRegen2014 = usaNatRegen2014;
    }

    public Float getCaNatRegen2014() {
        return caNatRegen2014;
    }

    public void setCaNatRegen2014(Float caNatRegen2014) {
        this.caNatRegen2014 = caNatRegen2014;
    }

    public Float getUsaRegenPerc5Yr() {
        return usaRegenPerc5Yr;
    }

    public void setUsaRegenPerc5Yr(Float usaRegenPerc5Yr) {
        this.usaRegenPerc5Yr = usaRegenPerc5Yr;
    }

    public Float getCaRegenPerc5Yr() {
        return caRegenPerc5Yr;
    }

    public void setCaRegenPerc5Yr(Float caRegenPerc5Yr) {
        this.caRegenPerc5Yr = caRegenPerc5Yr;
    }

    public Float getUsaRegenPerc5YrHAAC() {
        return usaRegenPerc5YrHAAC;
    }

    public void setUsaRegenPerc5YrHAAC(Float usaRegenPerc5YrHAAC) {
        this.usaRegenPerc5YrHAAC = usaRegenPerc5YrHAAC;
    }

    public Float getCaRegenPerc5YrHAAC() {
        return caRegenPerc5YrHAAC;
    }

    public void setCaRegenPerc5YrHAAC(Float caRegenPerc5YrHAAC) {
        this.caRegenPerc5YrHAAC = caRegenPerc5YrHAAC;
    }

    public Float getHarvesUnitCompleteLastYeaQualifyHAAC() {
        return harvesUnitCompleteLastYeaQualifyHAAC;
    }

    public void setHarvesUnitCompleteLastYeaQualifyHAAC(Float harvesUnitCompleteLastYeaQualifyHAAC) {
        this.harvesUnitCompleteLastYeaQualifyHAAC = harvesUnitCompleteLastYeaQualifyHAAC;
    }

    public Float getHarvesUnitCompleteLastYearMethodsHAAC() {
        return harvesUnitCompleteLastYearMethodsHAAC;
    }

    public void setHarvesUnitCompleteLastYearMethodsHAAC(Float harvesUnitCompleteLastYearMethodsHAAC) {
        this.harvesUnitCompleteLastYearMethodsHAAC = harvesUnitCompleteLastYearMethodsHAAC;
    }

    public String getHarvesUnitCompleteLastYearMethodsHAACExp() {
        return harvesUnitCompleteLastYearMethodsHAACExp;
    }

    public void setHarvesUnitCompleteLastYearMethodsHAACExp(String harvesUnitCompleteLastYearMethodsHAACExp) {
        this.harvesUnitCompleteLastYearMethodsHAACExp = harvesUnitCompleteLastYearMethodsHAACExp;
    }

    public Float getCaHarvestUnitCompleteLastYeaQualifyHAAC() {
        return caHarvestUnitCompleteLastYeaQualifyHAAC;
    }

    public void setCaHarvestUnitCompleteLastYeaQualifyHAAC(Float caHarvestUnitCompleteLastYeaQualifyHAAC) {
        this.caHarvestUnitCompleteLastYeaQualifyHAAC = caHarvestUnitCompleteLastYeaQualifyHAAC;
    }

    public Float getCaHarvestUnitCompleteLastYearMethodsHAAC() {
        return caHarvestUnitCompleteLastYearMethodsHAAC;
    }

    public void setCaHarvestUnitCompleteLastYearMethodsHAAC(Float caHarvestUnitCompleteLastYearMethodsHAAC) {
        this.caHarvestUnitCompleteLastYearMethodsHAAC = caHarvestUnitCompleteLastYearMethodsHAAC;
    }

    public String getCaHarvestUnitCompleteLastYearMethodsHAACExp() {
        return caHarvestUnitCompleteLastYearMethodsHAACExp;
    }

    public void setCaHarvestUnitCompleteLastYearMethodsHAACExp(String caHarvestUnitCompleteLastYearMethodsHAACExp) {
        this.caHarvestUnitCompleteLastYearMethodsHAACExp = caHarvestUnitCompleteLastYearMethodsHAACExp;
    }

    public Float getCaHarvesUnitCompleteLastYeaQualifyHAAC() {
        return caHarvesUnitCompleteLastYeaQualifyHAAC;
    }

    public void setCaHarvesUnitCompleteLastYeaQualifyHAAC(Float caHarvesUnitCompleteLastYeaQualifyHAAC) {
        this.caHarvesUnitCompleteLastYeaQualifyHAAC = caHarvesUnitCompleteLastYeaQualifyHAAC;
    }

    public Float getCaHarvesUnitCompleteLastYearMethodsHAAC() {
        return caHarvesUnitCompleteLastYearMethodsHAAC;
    }

    public void setCaHarvesUnitCompleteLastYearMethodsHAAC(Float caHarvesUnitCompleteLastYearMethodsHAAC) {
        this.caHarvesUnitCompleteLastYearMethodsHAAC = caHarvesUnitCompleteLastYearMethodsHAAC;
    }

    public String getCaHarvesUnitCompleteLastYearMethodsHAACExp() {
        return caHarvesUnitCompleteLastYearMethodsHAACExp;
    }

    public void setCaHarvesUnitCompleteLastYearMethodsHAACExp(String caHarvesUnitCompleteLastYearMethodsHAACExp) {
        this.caHarvesUnitCompleteLastYearMethodsHAACExp = caHarvesUnitCompleteLastYearMethodsHAACExp;
    }

    public Boolean getUsaOtherMethod() {
        return usaOtherMethod;
    }

    public void setUsaOtherMethod(Boolean usaOtherMethod) {
        this.usaOtherMethod = usaOtherMethod;
    }

    public Float getUsaOtherMethodHAAC() {
        return usaOtherMethodHAAC;
    }

    public void setUsaOtherMethodHAAC(Float usaOtherMethodHAAC) {
        this.usaOtherMethodHAAC = usaOtherMethodHAAC;
    }

    public String getUsaOtherMethodHAACExp() {
        return usaOtherMethodHAACExp;
    }

    public void setUsaOtherMethodHAACExp(String usaOtherMethodHAACExp) {
        this.usaOtherMethodHAACExp = usaOtherMethodHAACExp;
    }

    public Boolean getCaOtherMethod() {
        return caOtherMethod;
    }

    public void setCaOtherMethod(Boolean caOtherMethod) {
        this.caOtherMethod = caOtherMethod;
    }

    public Float getCaOtherMethodHAAC() {
        return caOtherMethodHAAC;
    }

    public void setCaOtherMethodHAAC(Float caOtherMethodHAAC) {
        this.caOtherMethodHAAC = caOtherMethodHAAC;
    }

    public String getCaOtherMethodHAACExp() {
        return caOtherMethodHAACExp;
    }

    public void setCaOtherMethodHAACExp(String caOtherMethodHAACExp) {
        this.caOtherMethodHAACExp = caOtherMethodHAACExp;
    }

    public Boolean getCaSanitation() {
        return caSanitation;
    }

    public void setCaSanitation(Boolean caSanitation) {
        this.caSanitation = caSanitation;
    }

    public String getCaSanitationExp() {
        return caSanitationExp;
    }

    public void setCaSanitationExp(String caSanitationExp) {
        this.caSanitationExp = caSanitationExp;
    }

    public Boolean getCaSelectionMethod() {
        return caSelectionMethod;
    }

    public void setCaSelectionMethod(Boolean caSelectionMethod) {
        this.caSelectionMethod = caSelectionMethod;
    }

    public String getCaSelectionMethodExp() {
        return caSelectionMethodExp;
    }

    public void setCaSelectionMethodExp(String caSelectionMethodExp) {
        this.caSelectionMethodExp = caSelectionMethodExp;
    }

    public Boolean getCaSeedTreeShelterWood() {
        return caSeedTreeShelterWood;
    }

    public void setCaSeedTreeShelterWood(Boolean caSeedTreeShelterWood) {
        this.caSeedTreeShelterWood = caSeedTreeShelterWood;
    }

    public String getCaSeedTreeShelterWoodExp() {
        return caSeedTreeShelterWoodExp;
    }

    public void setCaSeedTreeShelterWoodExp(String caSeedTreeShelterWoodExp) {
        this.caSeedTreeShelterWoodExp = caSeedTreeShelterWoodExp;
    }

    public Boolean getUsaSanitation() {
        return usaSanitation;
    }

    public void setUsaSanitation(Boolean usaSanitation) {
        this.usaSanitation = usaSanitation;
    }

    public String getUsaSanitationExp() {
        return usaSanitationExp;
    }

    public void setUsaSanitationExp(String usaSanitationExp) {
        this.usaSanitationExp = usaSanitationExp;
    }

    public Boolean getUsaSelectionMethod() {
        return usaSelectionMethod;
    }

    public void setUsaSelectionMethod(Boolean usaSelectionMethod) {
        this.usaSelectionMethod = usaSelectionMethod;
    }

    public String getUsaSelectionMethodExp() {
        return usaSelectionMethodExp;
    }

    public void setUsaSelectionMethodExp(String usaSelectionMethodExp) {
        this.usaSelectionMethodExp = usaSelectionMethodExp;
    }

    public Boolean getUsaSeedTreeShelterWood() {
        return usaSeedTreeShelterWood;
    }

    public void setUsaSeedTreeShelterWood(Boolean usaSeedTreeShelterWood) {
        this.usaSeedTreeShelterWood = usaSeedTreeShelterWood;
    }

    public String getUsaSeedTreeShelterWoodExp() {
        return usaSeedTreeShelterWoodExp;
    }

    public void setUsaSeedTreeShelterWoodExp(String usaSeedTreeShelterWoodExp) {
        this.usaSeedTreeShelterWoodExp = usaSeedTreeShelterWoodExp;
    }

    public Float getUsaFinalHarvestHAAC() {
        return usaFinalHarvestHAAC;
    }

    public void setUsaFinalHarvestHAAC(Float usaFinalHarvestHAAC) {
        this.usaFinalHarvestHAAC = usaFinalHarvestHAAC;
    }

    public Float getCaFinalHarvestHAAC() {
        return caFinalHarvestHAAC;
    }

    public void setCaFinalHarvestHAAC(Float caFinalHarvestHAAC) {
        this.caFinalHarvestHAAC = caFinalHarvestHAAC;
    }
}
