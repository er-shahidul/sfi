package com.rbs.sfi.web.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_forms")
public class Cs4 extends BaseEntityModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cs4_totalAreaReceivedHarv_usa", nullable=true)
	private Float usaTotalHervArea;

	@Column(name="cs4_totalAreaReceivedHarv_ca", nullable=true)
	private Float caTotalHervArea;

	@Column(name="cs4_avgAreaClearCutHarv_usa", nullable=true)
	private Float usaAvgHervArea;

	@Column(name="cs4_avgAreaClearCutHarv_ca", nullable=true)
	private Float caAvgHervArea;

	@Column(name="cs4_havestArea_usa", nullable=true)
	private Boolean usaGovRegulation;

	@Column(name="cs4_havestArea_explain_usa", nullable=true)
	private String usaGovRegulationExp;

	@Column(name="cs4_havestArea_ca", nullable=true)
	private Boolean caGovRegulation;

	@Column(name="cs4_havestArea_explain_ca", nullable=true)
	private String caGovRegulationExp;

	@Column(name="cs4_naturDisasterInsects_usa", nullable=true)
	private Boolean usaDisResDiseaseInsects;

	@Column(name="cs4_naturDisasterInsects_explain_usa", nullable=true)
	private String usaDiseaseInsectsExp;

	@Column(name="cs4_naturDisasterInsects_ca", nullable=true)
	private Boolean caDisResDiseaseInsects;

	@Column(name="cs4_naturDisasterInsects_explain_ca", nullable=true)
	private String caDiseaseInsectsExp;

	@Column(name="cs4_naturDisasterFire_usa", nullable=true)
	private Boolean usaDisResFireSalvage;

	@Column(name="cs4_naturDisasterFire_explain_usa", nullable=true)
	private String usaFireSalvageExp;

	@Column(name="cs4_naturDisasterFire_ca", nullable=true)
	private Boolean caDisResFireSalvage;

	@Column(name="cs4_naturDisasterFire_explain_ca", nullable=true)
	private String caFireSalvageExp;

	@Column(name="cs4_naturDisasterWindthrow_usa", nullable=true)
	private Boolean usaDisResWindthrow;

	@Column(name="cs4_naturDisasterFireWindthrow_explain_usa", nullable=true)
	private String usaWindthrowExp;

	@Column(name="cs4_naturDisasterWindthrow_ca", nullable=true)
	private Boolean caDisResWindthrow;

	@Column(name="cs4_naturDisasterFireWindthrow_explain_ca", nullable=true)
	private String caWindthrowExp;

	@Column(name="cs4_naturDisasterHurricane_usa", nullable=true)
	private Boolean usaDisResHurricane;

	@Column(name="cs4_naturDisasterHurricane_explain_usa", nullable=true)
	private String usaHurricaneExp;

	@Column(name="cs4_naturDisasterHurricane_ca", nullable=true)
	private Boolean caDisResHurricane;

	@Column(name="cs4_naturDisasterHurricane_explain_ca", nullable=true)
	private String caHurricaneExp;

	@Column(name="cs4_naturDisasterIceStorms_usa", nullable=true)
	private Boolean usaDisResIceStorm;

	@Column(name="cs4_naturDisasterIceStorms_explain_usa", nullable=true)
	private String usaIceStormExp;

	@Column(name="cs4_naturDisasterIceStorms_ca", nullable=true)
	private Boolean caDisResIceStorm;

	@Column(name="cs4_naturDisasterIceStorms_explain_ca", nullable=true)
	private String caIceStormExp;

	@Column(name="cs4_naturDisasterOther_usa", nullable=true)
	private Boolean usaOthersApply;

	@Column(name="cs4_naturDisasterOther_explain_usa", nullable=true)
	private String usaOthersExp;

	@Column(name="cs4_naturDisasterOther_ca", nullable=true)
	private Boolean caOthersApply;

	@Column(name="cs4_naturDisasterOther_explain_ca", nullable=true)
	private String caOthersExp;

	@Column(name="cs4_totalAreaBySeedTreeAndShelt_usa", nullable=true)
	private Float usaSeedTreeShelterWoodArea;

	@Column(name="cs4_totalAreaBySeedTreeAndShelt_ca", nullable=true)
	private Float caSeedTreeShelterWoodArea;

	@Column(name="cs4_totalAreaBySelection_usa", nullable=true)
	private Float usaSelectionMethodArea;

	@Column(name="cs4_totalAreaByThiningOrSaniSalv_usa", nullable=true)
	private Float usaSanitationArea;

	@Column(name="cs4_totalAreaByThiningOrSaniSalv_ca", nullable=true)
	private Float caSanitationArea;

	@Column(name="cs4_totalAreaBySelection_ca", nullable=true)
	private Float caSelectionMethodArea;

	@Column(name="cs4_usa_artPlant_1year", nullable=true)
	private Float usaPlantingOneYr;

	@Column(name="cs4_ca_artPlant_1year", nullable=true)
	private Float caPlantingOneYr;

	@Column(name="cs4_usa_artPlant_2years", nullable=true)
	private Float usaPlantingTwoYr;

	@Column(name="cs4_ca_artPlant_2years", nullable=true)
	private Float caPlantingTwoYr;

	@Column(name="cs4_usa_artPlant_moreThn2years", nullable=true)
	private Float usaPlantingTwoPlusYr;

	@Column(name="cs4_ca_artPlant_moreThn2years", nullable=true)
	private Float caPlantingTwoPlusYr;

	@Column(name="cs4_usa_directSeed_1year", nullable=true)
	private Float usaSeedingOneYr;

	@Column(name="cs4_ca_directSeed_1year", nullable=true)
	private Float caSeedingOneYr;

	@Column(name="cs4_usa_directSeed_2years", nullable=true)
	private Float usaSeedingTwoYr;

	@Column(name="cs4_ca_directSeed_2years", nullable=true)
	private Float caSeedingTwoYr;

	@Column(name="cs4_usa_directSeed_moreThn2years", nullable=true)
	private Float usaSeedingTwoPlusYr;

	@Column(name="cs4_ca_directSeed_moreThn2years", nullable=true)
	private Float caSeedingTwoPlusYr;

	@Column(name="cs4_usa_natrualRegen", nullable=true)
	private Float usaNatRegen2014;

	@Column(name="cs4_ca_natrualRegen", nullable=true)
	private Float caNatRegen2014;

	@Column(name="cs4_usa_percHarvUnitsRegen", nullable=true)
	private Float usaRegenPerc5Yr;

	@Column(name="cs4_ca_percHarvUnitsRegen", nullable=true)
	private Float caRegenPerc5Yr;

    @Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getCs4UsaTotalHervArea() {
		return usaTotalHervArea;
	}

	public void setCs4UsaTotalHervArea(Float usaTotalHervArea) {
		this.usaTotalHervArea = usaTotalHervArea;
	}

	public Float getCs4CaTotalHervArea() {
		return caTotalHervArea;
	}

	public void setCs4CaTotalHervArea(Float caTotalHervArea) {
		this.caTotalHervArea = caTotalHervArea;
	}

	public Float getCs4UsaAvgHervArea() {
		return usaAvgHervArea;
	}

	public void setCs4UsaAvgHervArea(Float usaAvgHervArea) {
		this.usaAvgHervArea = usaAvgHervArea;
	}

	public Float getCs4CaAvgHervArea() {
		return caAvgHervArea;
	}

	public void setCs4CaAvgHervArea(Float caAvgHervArea) {
		this.caAvgHervArea = caAvgHervArea;
	}

	public Boolean isCs4UsaGovRegulation() {
		return usaGovRegulation;
	}

	public void setCs4UsaGovRegulation(Boolean usaGovRegulation) {
		this.usaGovRegulation = usaGovRegulation;
	}

	public String getCs4UsaGovRegulationExp() {
		return usaGovRegulationExp;
	}

	public void setCs4UsaGovRegulationExp(String usaGovRegulationExp) {
		this.usaGovRegulationExp = usaGovRegulationExp;
	}

	public Boolean isCs4CaGovRegulation() {
		return caGovRegulation;
	}

	public void setCs4CaGovRegulation(Boolean caGovRegulation) {
		this.caGovRegulation = caGovRegulation;
	}

	public String getCs4CaGovRegulationExp() {
		return caGovRegulationExp;
	}

	public void setCs4CaGovRegulationExp(String caGovRegulationExp) {
		this.caGovRegulationExp = caGovRegulationExp;
	}

	public Boolean isCs4UsaDisResDiseaseInsects() {
		return usaDisResDiseaseInsects;
	}

	public void setCs4UsaDisResDiseaseInsects(Boolean usaDisResDiseaseInsects) {
		this.usaDisResDiseaseInsects = usaDisResDiseaseInsects;
	}

	public String getCs4UsaDiseaseInsectsExp() {
		return usaDiseaseInsectsExp;
	}

	public void setCs4UsaDiseaseInsectsExp(String usaDiseaseInsectsExp) {
		this.usaDiseaseInsectsExp = usaDiseaseInsectsExp;
	}

	public Boolean isCs4CaDisResDiseaseInsects() {
		return caDisResDiseaseInsects;
	}

	public void setCs4CaDisResDiseaseInsects(Boolean caDisResDiseaseInsects) {
		this.caDisResDiseaseInsects = caDisResDiseaseInsects;
	}

	public String getCs4CaDiseaseInsectsExp() {
		return caDiseaseInsectsExp;
	}

	public void setCs4CaDiseaseInsectsExp(String caDiseaseInsectsExp) {
		this.caDiseaseInsectsExp = caDiseaseInsectsExp;
	}

	public Boolean isCs4UsaDisResFireSalvage() {
		return usaDisResFireSalvage;
	}

	public void setCs4UsaDisResFireSalvage(Boolean usaDisResFireSalvage) {
		this.usaDisResFireSalvage = usaDisResFireSalvage;
	}

	public String getCs4UsaFireSalvageExp() {
		return usaFireSalvageExp;
	}

	public void setCs4UsaFireSalvageExp(String usaFireSalvageExp) {
		this.usaFireSalvageExp = usaFireSalvageExp;
	}

	public Boolean isCs4CaDisResFireSalvage() {
		return caDisResFireSalvage;
	}

	public void setCs4CaDisResFireSalvage(Boolean caDisResFireSalvage) {
		this.caDisResFireSalvage = caDisResFireSalvage;
	}

	public String getCs4CaFireSalvageExp() {
		return caFireSalvageExp;
	}

	public void setCs4CaFireSalvageExp(String caFireSalvageExp) {
		this.caFireSalvageExp = caFireSalvageExp;
	}

	public Boolean isCs4UsaDisResWindthrow() {
		return usaDisResWindthrow;
	}

	public void setCs4UsaDisResWindthrow(Boolean usaDisResWindthrow) {
		this.usaDisResWindthrow = usaDisResWindthrow;
	}

	public String getCs4UsaWindthrowExp() {
		return usaWindthrowExp;
	}

	public void setCs4UsaWindthrowExp(String usaWindthrowExp) {
		this.usaWindthrowExp = usaWindthrowExp;
	}

	public Boolean isCs4CaDisResWindthrow() {
		return caDisResWindthrow;
	}

	public void setCs4CaDisResWindthrow(Boolean caDisResWindthrow) {
		this.caDisResWindthrow = caDisResWindthrow;
	}

	public String getCs4CaWindthrowExp() {
		return caWindthrowExp;
	}

	public void setCs4CaWindthrowExp(String caWindthrowExp) {
		this.caWindthrowExp = caWindthrowExp;
	}

	public Boolean isCs4UsaDisResHurricane() {
		return usaDisResHurricane;
	}

	public void setCs4UsaDisResHurricane(Boolean usaDisResHurricane) {
		this.usaDisResHurricane = usaDisResHurricane;
	}

	public String getCs4UsaHurricaneExp() {
		return usaHurricaneExp;
	}

	public void setCs4UsaHurricaneExp(String usaHurricaneExp) {
		this.usaHurricaneExp = usaHurricaneExp;
	}

	public Boolean isCs4CaDisResHurricane() {
		return caDisResHurricane;
	}

	public void setCs4CaDisResHurricane(Boolean caDisResHurricane) {
		this.caDisResHurricane = caDisResHurricane;
	}

	public String getCs4CaHurricaneExp() {
		return caHurricaneExp;
	}

	public void setCs4CaHurricaneExp(String caHurricaneExp) {
		this.caHurricaneExp = caHurricaneExp;
	}

	public Boolean isCs4UsaDisResIceStorm() {
		return usaDisResIceStorm;
	}

	public void setCs4UsaDisResIceStorm(Boolean usaDisResIceStorm) {
		this.usaDisResIceStorm = usaDisResIceStorm;
	}

	public String getCs4UsaIceStormExp() {
		return usaIceStormExp;
	}

	public void setCs4UsaIceStormExp(String usaIceStormExp) {
		this.usaIceStormExp = usaIceStormExp;
	}

	public Boolean isCs4CaDisResIceStorm() {
		return caDisResIceStorm;
	}

	public void setCs4CaDisResIceStorm(Boolean caDisResIceStorm) {
		this.caDisResIceStorm = caDisResIceStorm;
	}

	public String getCs4CaIceStormExp() {
		return caIceStormExp;
	}

	public void setCs4CaIceStormExp(String caIceStormExp) {
		this.caIceStormExp = caIceStormExp;
	}

	public Boolean isCs4UsaOthersApply() {
		return usaOthersApply;
	}

	public void setCs4UsaOthersApply(Boolean usaOthersApply) {
		this.usaOthersApply = usaOthersApply;
	}

	public String getCs4UsaOthersExp() {
		return usaOthersExp;
	}

	public void setCs4UsaOthersExp(String usaOthersExp) {
		this.usaOthersExp = usaOthersExp;
	}

	public Boolean isCs4CaOthersApply() {
		return caOthersApply;
	}

	public void setCs4CaOthersApply(Boolean caOthersApply) {
		this.caOthersApply = caOthersApply;
	}

	public String getCs4CaOthersExp() {
		return caOthersExp;
	}

	public void setCs4CaOthersExp(String caOthersExp) {
		this.caOthersExp = caOthersExp;
	}

	public Float getCs4UsaSeedTreeShelterWoodArea() {
		return usaSeedTreeShelterWoodArea;
	}

	public void setCs4UsaSeedTreeShelterWoodArea(Float usaSeedTreeShelterWoodArea) {
		this.usaSeedTreeShelterWoodArea = usaSeedTreeShelterWoodArea;
	}

	public Float getCs4CaSeedTreeShelterWoodArea() {
		return caSeedTreeShelterWoodArea;
	}

	public void setCs4CaSeedTreeShelterWoodArea(Float caSeedTreeShelterWoodArea) {
		this.caSeedTreeShelterWoodArea = caSeedTreeShelterWoodArea;
	}

	public Float getCs4UsaSelectionMethodArea() {
		return usaSelectionMethodArea;
	}

	public void setCs4UsaSelectionMethodArea(Float usaSelectionMethodArea) {
		this.usaSelectionMethodArea = usaSelectionMethodArea;
	}

	public Float getCs4UsaSanitationArea() {
		return usaSanitationArea;
	}

	public void setCs4UsaSanitationArea(Float usaSanitationArea) {
		this.usaSanitationArea = usaSanitationArea;
	}

	public Float getCs4CaSanitationArea() {
		return caSanitationArea;
	}

	public void setCs4CaSanitationArea(Float caSanitationArea) {
		this.caSanitationArea = caSanitationArea;
	}

	public Float getCs4CaSelectionMethodArea() {
		return caSelectionMethodArea;
	}

	public void setCs4CaSelectionMethodArea(Float caSelectionMethodArea) {
		this.caSelectionMethodArea = caSelectionMethodArea;
	}

	public Float getCs4UsaPlantingOneYr() {
		return usaPlantingOneYr;
	}

	public void setCs4UsaPlantingOneYr(Float usaPlantingOneYr) {
		this.usaPlantingOneYr = usaPlantingOneYr;
	}

	public Float getCs4CaPlantingOneYr() {
		return caPlantingOneYr;
	}

	public void setCs4CaPlantingOneYr(Float caPlantingOneYr) {
		this.caPlantingOneYr = caPlantingOneYr;
	}

	public Float getCs4UsaPlantingTwoYr() {
		return usaPlantingTwoYr;
	}

	public void setCs4UsaPlantingTwoYr(Float usaPlantingTwoYr) {
		this.usaPlantingTwoYr = usaPlantingTwoYr;
	}

	public Float getCs4CaPlantingTwoYr() {
		return caPlantingTwoYr;
	}

	public void setCs4CaPlantingTwoYr(Float caPlantingTwoYr) {
		this.caPlantingTwoYr = caPlantingTwoYr;
	}

	public Float getCs4UsaPlantingTwoPlusYr() {
		return usaPlantingTwoPlusYr;
	}

	public void setCs4UsaPlantingTwoPlusYr(Float usaPlantingTwoPlusYr) {
		this.usaPlantingTwoPlusYr = usaPlantingTwoPlusYr;
	}

	public Float getCs4CaPlantingTwoPlusYr() {
		return caPlantingTwoPlusYr;
	}

	public void setCs4CaPlantingTwoPlusYr(Float caPlantingTwoPlusYr) {
		this.caPlantingTwoPlusYr = caPlantingTwoPlusYr;
	}

	public Float getCs4UsaSeedingOneYr() {
		return usaSeedingOneYr;
	}

	public void setCs4UsaSeedingOneYr(Float usaSeedingOneYr) {
		this.usaSeedingOneYr = usaSeedingOneYr;
	}

	public Float getCs4CaSeedingOneYr() {
		return caSeedingOneYr;
	}

	public void setCs4CaSeedingOneYr(Float caSeedingOneYr) {
		this.caSeedingOneYr = caSeedingOneYr;
	}

	public Float getCs4UsaSeedingTwoYr() {
		return usaSeedingTwoYr;
	}

	public void setCs4UsaSeedingTwoYr(Float usaSeedingTwoYr) {
		this.usaSeedingTwoYr = usaSeedingTwoYr;
	}

	public Float getCs4CaSeedingTwoYr() {
		return caSeedingTwoYr;
	}

	public void setCs4CaSeedingTwoYr(Float caSeedingTwoYr) {
		this.caSeedingTwoYr = caSeedingTwoYr;
	}

	public Float getCs4UsaSeedingTwoPlusYr() {
		return usaSeedingTwoPlusYr;
	}

	public void setCs4UsaSeedingTwoPlusYr(Float usaSeedingTwoPlusYr) {
		this.usaSeedingTwoPlusYr = usaSeedingTwoPlusYr;
	}

	public Float getCs4CaSeedingTwoPlusYr() {
		return caSeedingTwoPlusYr;
	}

	public void setCs4CaSeedingTwoPlusYr(Float caSeedingTwoPlusYr) {
		this.caSeedingTwoPlusYr = caSeedingTwoPlusYr;
	}

	public Float getCs4UsaNatRegen2014() {
		return usaNatRegen2014;
	}

	public void setCs4UsaNatRegen2014(Float usaNatRegen2014) {
		this.usaNatRegen2014 = usaNatRegen2014;
	}

	public Float getCs4CaNatRegen2014() {
		return caNatRegen2014;
	}

	public void setCs4CaNatRegen2014(Float caNatRegen2014) {
		this.caNatRegen2014 = caNatRegen2014;
	}

	public Float getCs4UsaRegenPerc5Yr() {
		return usaRegenPerc5Yr;
	}

	public void setCs4UsaRegenPerc5Yr(Float usaRegenPerc5Yr) {
		this.usaRegenPerc5Yr = usaRegenPerc5Yr;
	}

	public Float getCs4CaRegenPerc5Yr() {
		return caRegenPerc5Yr;
	}

	public void setCs4CaRegenPerc5Yr(Float caRegenPerc5Yr) {
		this.caRegenPerc5Yr = caRegenPerc5Yr;
	}
}
