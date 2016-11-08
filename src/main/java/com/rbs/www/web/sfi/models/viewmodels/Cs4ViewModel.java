package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.web.sfi.validation.Cs4Ca.Cs4Ca;
import com.rbs.www.web.sfi.validation.Cs4Usa.Cs4Usa;

@Cs4Usa(message = "{usaEmpty}")
@Cs4Ca(message = "{caEmpty}")
public class Cs4ViewModel extends BaseViewModel {
    private Integer id;

    private Float usaTotalHervArea;
    private Float usaAvgHervArea;
    private Float usaSeedTreeShelterWoodArea;
    private Float usaSelectionMethodArea;
    private Float usaSanitationArea;
    private Float usaPlantingOneYr;
    private Float usaPlantingTwoYr;
    private Float usaPlantingTwoPlusYr;
    private Float usaSeedingOneYr;
    private Float usaSeedingTwoYr;
    private Float usaSeedingTwoPlusYr;
    private Float usaNatRegen2014;
    private Float usaRegenPerc5Yr;
    private String usaGovRegulationExp;
    private String usaDiseaseInsectsExp;
    private String usaFireSalvageExp;
    private String usaWindthrowExp;
    private String usaHurricaneExp;
    private String usaIceStormExp;
    private String usaOthersExp;
    private Boolean usaGovRegulation;
    private Boolean usaDisResDiseaseInsects;
    private Boolean usaDisResFireSalvage;
    private Boolean usaDisResWindthrow;
    private Boolean usaDisResHurricane;
    private Boolean usaDisResIceStorm;
    private Boolean usaOthersApply;

    private Float caTotalHervArea;
    private Float caAvgHervArea;
    private Float caSeedTreeShelterWoodArea;
    private Float caSanitationArea;
    private Float caSelectionMethodArea;
    private Float caPlantingOneYr;
    private Float caPlantingTwoYr;
    private Float caPlantingTwoPlusYr;
    private Float caSeedingOneYr;
    private Float caSeedingTwoYr;
    private Float caSeedingTwoPlusYr;
    private Float caNatRegen2014;
    private Float caRegenPerc5Yr;
    private String caGovRegulationExp;
    private String caDiseaseInsectsExp;
    private String caFireSalvageExp;
    private String caWindthrowExp;
    private String caHurricaneExp;
    private String caIceStormExp;
    private String caOthersExp;
    private Boolean caGovRegulation;
    private Boolean caDisResDiseaseInsects;
    private Boolean caDisResFireSalvage;
    private Boolean caDisResWindthrow;
    private Boolean caDisResHurricane;
    private Boolean caDisResIceStorm;
    private Boolean caOthersApply;

    private Float usaRegenPerc5YrHAAC;
    private Float caRegenPerc5YrHAAC;

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
}
