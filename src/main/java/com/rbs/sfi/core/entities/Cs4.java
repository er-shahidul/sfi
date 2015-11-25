package com.rbs.sfi.core.entities;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_forms")
public class Cs4
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cs4_totalAreaReceivedHarv_usa", nullable=true)
	private Float cs4UsaTotalHervArea;

	@Column(name="cs4_totalAreaReceivedHarv_ca", nullable=true)
	private Float cs4CaTotalHervArea;

	@Column(name="cs4_avgAreaClearCutHarv_usa", nullable=true)
	private Float cs4UsaAvgHervArea;

	@Column(name="cs4_avgAreaClearCutHarv_ca", nullable=true)
	private Float cs4CaAvgHervArea;

	@Column(name="cs4_havestArea_usa", nullable=true)
	private boolean cs4UsaGovRegulation;

	@Column(name="cs4_havestArea_explain_usa", nullable=true)
	private String cs4UsaGovRegulationExp;

	@Column(name="cs4_havestArea_ca", nullable=true)
	private boolean cs4CaGovRegulation;

	@Column(name="cs4_havestArea_explain_ca", nullable=true)
	private String cs4CaGovRegulationExp;

	@Column(name="cs4_naturDisasterInsects_usa", nullable=true)
	private boolean cs4UsaDisResDiseaseInsects;

	@Column(name="cs4_naturDisasterInsects_explain_usa", nullable=true)
	private String cs4UsaDiseaseInsectsExp;

	@Column(name="cs4_naturDisasterInsects_ca", nullable=true)
	private boolean cs4CaDisResDiseaseInsects;

	@Column(name="cs4_naturDisasterInsects_explain_ca", nullable=true)
	private String cs4CaDiseaseInsectsExp;

	@Column(name="cs4_naturDisasterFire_usa", nullable=true)
	private boolean cs4UsaDisResFireSalvage;

	@Column(name="cs4_naturDisasterFire_explain_usa", nullable=true)
	private String cs4UsaFireSalvageExp;

	@Column(name="cs4_naturDisasterFire_ca", nullable=true)
	private boolean cs4CaDisResFireSalvage;

	@Column(name="cs4_naturDisasterFire_explain_ca", nullable=true)
	private String cs4CaFireSalvageExp;

	@Column(name="cs4_naturDisasterWindthrow_usa", nullable=true)
	private boolean cs4UsaDisResWindthrow;

	@Column(name="cs4_naturDisasterFireWindthrow_explain_usa", nullable=true)
	private String cs4UsaWindthrowExp;

	@Column(name="cs4_naturDisasterWindthrow_ca", nullable=true)
	private boolean cs4CaDisResWindthrow;

	@Column(name="cs4_naturDisasterFireWindthrow_explain_ca", nullable=true)
	private String cs4CaWindthrowExp;

	@Column(name="cs4_naturDisasterHurricane_usa", nullable=true)
	private boolean cs4UsaDisResHurricane;

	@Column(name="cs4_naturDisasterHurricane_explain_usa", nullable=true)
	private String cs4UsaHurricaneExp;

	@Column(name="cs4_naturDisasterHurricane_ca", nullable=true)
	private boolean cs4CaDisResHurricane;

	@Column(name="cs4_naturDisasterHurricane_explain_ca", nullable=true)
	private String cs4CaHurricaneExp;

	@Column(name="cs4_naturDisasterIceStorms_usa", nullable=true)
	private boolean cs4UsaDisResIceStorm;

	@Column(name="cs4_naturDisasterIceStorms_explain_usa", nullable=true)
	private String cs4UsaIceStormExp;

	@Column(name="cs4_naturDisasterIceStorms_ca", nullable=true)
	private boolean cs4CaDisResIceStorm;

	@Column(name="cs4_naturDisasterIceStorms_explain_ca", nullable=true)
	private String cs4CaIceStormExp;

	@Column(name="cs4_naturDisasterOther_usa", nullable=true)
	private boolean cs4UsaOthersApply;

	@Column(name="cs4_naturDisasterOther_explain_usa", nullable=true)
	private String cs4UsaOthersExp;

	@Column(name="cs4_naturDisasterOther_ca", nullable=true)
	private boolean cs4CaOthersApply;

	@Column(name="cs4_naturDisasterOther_explain_ca", nullable=true)
	private String cs4CaOthersExp;

	@Column(name="cs4_totalAreaBySeedTreeAndShelt_usa", nullable=true)
	private Float cs4UsaSeedTreeShelterWoodArea;

	@Column(name="cs4_totalAreaBySeedTreeAndShelt_ca", nullable=true)
	private Float cs4CaSeedTreeShelterWoodArea;

	@Column(name="cs4_totalAreaBySelection_usa", nullable=true)
	private Float cs4UsaSelectionMethodArea;

	@Column(name="cs4_totalAreaByThiningOrSaniSalv_usa", nullable=true)
	private Float cs4UsaSanitationArea;

	@Column(name="cs4_totalAreaByThiningOrSaniSalv_ca", nullable=true)
	private Float cs4CaSanitationArea;

	@Column(name="cs4_totalAreaBySelection_ca", nullable=true)
	private Float cs4CaSelectionMethodArea;

	@Column(name="cs4_usa_artPlant_1year", nullable=true)
	private Float cs4UsaPlantingOneYr;

	@Column(name="cs4_ca_artPlant_1year", nullable=true)
	private Float cs4CaPlantingOneYr;

	@Column(name="cs4_usa_artPlant_2years", nullable=true)
	private Float cs4UsaPlantingTwoYr;

	@Column(name="cs4_ca_artPlant_2years", nullable=true)
	private Float cs4CaPlantingTwoYr;

	@Column(name="cs4_usa_artPlant_moreThn2years", nullable=true)
	private Float cs4UsaPlantingTwoPlusYr;

	@Column(name="cs4_ca_artPlant_moreThn2years", nullable=true)
	private Float cs4CaPlantingTwoPlusYr;

	@Column(name="cs4_usa_directSeed_1year", nullable=true)
	private Float cs4UsaSeedingOneYr;

	@Column(name="cs4_ca_directSeed_1year", nullable=true)
	private Float cs4CaSeedingOneYr;

	@Column(name="cs4_usa_directSeed_2years", nullable=true)
	private Float cs4UsaSeedingTwoYr;

	@Column(name="cs4_ca_directSeed_2years", nullable=true)
	private Float cs4CaSeedingTwoYr;

	@Column(name="cs4_usa_directSeed_moreThn2years", nullable=true)
	private Float cs4UsaSeedingTwoPlusYr;

	@Column(name="cs4_ca_directSeed_moreThn2years", nullable=true)
	private Float cs4CaSeedingTwoPlusYr;

	@Column(name="cs4_usa_natrualRegen", nullable=true)
	private Float cs4UsaNatRegen2014;

	@Column(name="cs4_ca_natrualRegen", nullable=true)
	private Float cs4CaNatRegen2014;

	@Column(name="cs4_usa_percHarvUnitsRegen", nullable=true)
	private Float cs4UsaRegenPerc5Yr;

	@Column(name="cs4_ca_percHarvUnitsRegen", nullable=true)
	private Float cs4CaRegenPerc5Yr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Float getCs4UsaTotalHervArea() {
		return cs4UsaTotalHervArea;
	}

	public void setCs4UsaTotalHervArea(Float cs4UsaTotalHervArea) {
		this.cs4UsaTotalHervArea = cs4UsaTotalHervArea;
	}

	public Float getCs4CaTotalHervArea() {
		return cs4CaTotalHervArea;
	}

	public void setCs4CaTotalHervArea(Float cs4CaTotalHervArea) {
		this.cs4CaTotalHervArea = cs4CaTotalHervArea;
	}

	public Float getCs4UsaAvgHervArea() {
		return cs4UsaAvgHervArea;
	}

	public void setCs4UsaAvgHervArea(Float cs4UsaAvgHervArea) {
		this.cs4UsaAvgHervArea = cs4UsaAvgHervArea;
	}

	public Float getCs4CaAvgHervArea() {
		return cs4CaAvgHervArea;
	}

	public void setCs4CaAvgHervArea(Float cs4CaAvgHervArea) {
		this.cs4CaAvgHervArea = cs4CaAvgHervArea;
	}

	public boolean isCs4UsaGovRegulation() {
		return cs4UsaGovRegulation;
	}

	public void setCs4UsaGovRegulation(boolean cs4UsaGovRegulation) {
		this.cs4UsaGovRegulation = cs4UsaGovRegulation;
	}

	public String getCs4UsaGovRegulationExp() {
		return cs4UsaGovRegulationExp;
	}

	public void setCs4UsaGovRegulationExp(String cs4UsaGovRegulationExp) {
		this.cs4UsaGovRegulationExp = cs4UsaGovRegulationExp;
	}

	public boolean isCs4CaGovRegulation() {
		return cs4CaGovRegulation;
	}

	public void setCs4CaGovRegulation(boolean cs4CaGovRegulation) {
		this.cs4CaGovRegulation = cs4CaGovRegulation;
	}

	public String getCs4CaGovRegulationExp() {
		return cs4CaGovRegulationExp;
	}

	public void setCs4CaGovRegulationExp(String cs4CaGovRegulationExp) {
		this.cs4CaGovRegulationExp = cs4CaGovRegulationExp;
	}

	public boolean isCs4UsaDisResDiseaseInsects() {
		return cs4UsaDisResDiseaseInsects;
	}

	public void setCs4UsaDisResDiseaseInsects(boolean cs4UsaDisResDiseaseInsects) {
		this.cs4UsaDisResDiseaseInsects = cs4UsaDisResDiseaseInsects;
	}

	public String getCs4UsaDiseaseInsectsExp() {
		return cs4UsaDiseaseInsectsExp;
	}

	public void setCs4UsaDiseaseInsectsExp(String cs4UsaDiseaseInsectsExp) {
		this.cs4UsaDiseaseInsectsExp = cs4UsaDiseaseInsectsExp;
	}

	public boolean isCs4CaDisResDiseaseInsects() {
		return cs4CaDisResDiseaseInsects;
	}

	public void setCs4CaDisResDiseaseInsects(boolean cs4CaDisResDiseaseInsects) {
		this.cs4CaDisResDiseaseInsects = cs4CaDisResDiseaseInsects;
	}

	public String getCs4CaDiseaseInsectsExp() {
		return cs4CaDiseaseInsectsExp;
	}

	public void setCs4CaDiseaseInsectsExp(String cs4CaDiseaseInsectsExp) {
		this.cs4CaDiseaseInsectsExp = cs4CaDiseaseInsectsExp;
	}

	public boolean isCs4UsaDisResFireSalvage() {
		return cs4UsaDisResFireSalvage;
	}

	public void setCs4UsaDisResFireSalvage(boolean cs4UsaDisResFireSalvage) {
		this.cs4UsaDisResFireSalvage = cs4UsaDisResFireSalvage;
	}

	public String getCs4UsaFireSalvageExp() {
		return cs4UsaFireSalvageExp;
	}

	public void setCs4UsaFireSalvageExp(String cs4UsaFireSalvageExp) {
		this.cs4UsaFireSalvageExp = cs4UsaFireSalvageExp;
	}

	public boolean isCs4CaDisResFireSalvage() {
		return cs4CaDisResFireSalvage;
	}

	public void setCs4CaDisResFireSalvage(boolean cs4CaDisResFireSalvage) {
		this.cs4CaDisResFireSalvage = cs4CaDisResFireSalvage;
	}

	public String getCs4CaFireSalvageExp() {
		return cs4CaFireSalvageExp;
	}

	public void setCs4CaFireSalvageExp(String cs4CaFireSalvageExp) {
		this.cs4CaFireSalvageExp = cs4CaFireSalvageExp;
	}

	public boolean isCs4UsaDisResWindthrow() {
		return cs4UsaDisResWindthrow;
	}

	public void setCs4UsaDisResWindthrow(boolean cs4UsaDisResWindthrow) {
		this.cs4UsaDisResWindthrow = cs4UsaDisResWindthrow;
	}

	public String getCs4UsaWindthrowExp() {
		return cs4UsaWindthrowExp;
	}

	public void setCs4UsaWindthrowExp(String cs4UsaWindthrowExp) {
		this.cs4UsaWindthrowExp = cs4UsaWindthrowExp;
	}

	public boolean isCs4CaDisResWindthrow() {
		return cs4CaDisResWindthrow;
	}

	public void setCs4CaDisResWindthrow(boolean cs4CaDisResWindthrow) {
		this.cs4CaDisResWindthrow = cs4CaDisResWindthrow;
	}

	public String getCs4CaWindthrowExp() {
		return cs4CaWindthrowExp;
	}

	public void setCs4CaWindthrowExp(String cs4CaWindthrowExp) {
		this.cs4CaWindthrowExp = cs4CaWindthrowExp;
	}

	public boolean isCs4UsaDisResHurricane() {
		return cs4UsaDisResHurricane;
	}

	public void setCs4UsaDisResHurricane(boolean cs4UsaDisResHurricane) {
		this.cs4UsaDisResHurricane = cs4UsaDisResHurricane;
	}

	public String getCs4UsaHurricaneExp() {
		return cs4UsaHurricaneExp;
	}

	public void setCs4UsaHurricaneExp(String cs4UsaHurricaneExp) {
		this.cs4UsaHurricaneExp = cs4UsaHurricaneExp;
	}

	public boolean isCs4CaDisResHurricane() {
		return cs4CaDisResHurricane;
	}

	public void setCs4CaDisResHurricane(boolean cs4CaDisResHurricane) {
		this.cs4CaDisResHurricane = cs4CaDisResHurricane;
	}

	public String getCs4CaHurricaneExp() {
		return cs4CaHurricaneExp;
	}

	public void setCs4CaHurricaneExp(String cs4CaHurricaneExp) {
		this.cs4CaHurricaneExp = cs4CaHurricaneExp;
	}

	public boolean isCs4UsaDisResIceStorm() {
		return cs4UsaDisResIceStorm;
	}

	public void setCs4UsaDisResIceStorm(boolean cs4UsaDisResIceStorm) {
		this.cs4UsaDisResIceStorm = cs4UsaDisResIceStorm;
	}

	public String getCs4UsaIceStormExp() {
		return cs4UsaIceStormExp;
	}

	public void setCs4UsaIceStormExp(String cs4UsaIceStormExp) {
		this.cs4UsaIceStormExp = cs4UsaIceStormExp;
	}

	public boolean isCs4CaDisResIceStorm() {
		return cs4CaDisResIceStorm;
	}

	public void setCs4CaDisResIceStorm(boolean cs4CaDisResIceStorm) {
		this.cs4CaDisResIceStorm = cs4CaDisResIceStorm;
	}

	public String getCs4CaIceStormExp() {
		return cs4CaIceStormExp;
	}

	public void setCs4CaIceStormExp(String cs4CaIceStormExp) {
		this.cs4CaIceStormExp = cs4CaIceStormExp;
	}

	public boolean isCs4UsaOthersApply() {
		return cs4UsaOthersApply;
	}

	public void setCs4UsaOthersApply(boolean cs4UsaOthersApply) {
		this.cs4UsaOthersApply = cs4UsaOthersApply;
	}

	public String getCs4UsaOthersExp() {
		return cs4UsaOthersExp;
	}

	public void setCs4UsaOthersExp(String cs4UsaOthersExp) {
		this.cs4UsaOthersExp = cs4UsaOthersExp;
	}

	public boolean isCs4CaOthersApply() {
		return cs4CaOthersApply;
	}

	public void setCs4CaOthersApply(boolean cs4CaOthersApply) {
		this.cs4CaOthersApply = cs4CaOthersApply;
	}

	public String getCs4CaOthersExp() {
		return cs4CaOthersExp;
	}

	public void setCs4CaOthersExp(String cs4CaOthersExp) {
		this.cs4CaOthersExp = cs4CaOthersExp;
	}

	public Float getCs4UsaSeedTreeShelterWoodArea() {
		return cs4UsaSeedTreeShelterWoodArea;
	}

	public void setCs4UsaSeedTreeShelterWoodArea(Float cs4UsaSeedTreeShelterWoodArea) {
		this.cs4UsaSeedTreeShelterWoodArea = cs4UsaSeedTreeShelterWoodArea;
	}

	public Float getCs4CaSeedTreeShelterWoodArea() {
		return cs4CaSeedTreeShelterWoodArea;
	}

	public void setCs4CaSeedTreeShelterWoodArea(Float cs4CaSeedTreeShelterWoodArea) {
		this.cs4CaSeedTreeShelterWoodArea = cs4CaSeedTreeShelterWoodArea;
	}

	public Float getCs4UsaSelectionMethodArea() {
		return cs4UsaSelectionMethodArea;
	}

	public void setCs4UsaSelectionMethodArea(Float cs4UsaSelectionMethodArea) {
		this.cs4UsaSelectionMethodArea = cs4UsaSelectionMethodArea;
	}

	public Float getCs4UsaSanitationArea() {
		return cs4UsaSanitationArea;
	}

	public void setCs4UsaSanitationArea(Float cs4UsaSanitationArea) {
		this.cs4UsaSanitationArea = cs4UsaSanitationArea;
	}

	public Float getCs4CaSanitationArea() {
		return cs4CaSanitationArea;
	}

	public void setCs4CaSanitationArea(Float cs4CaSanitationArea) {
		this.cs4CaSanitationArea = cs4CaSanitationArea;
	}

	public Float getCs4CaSelectionMethodArea() {
		return cs4CaSelectionMethodArea;
	}

	public void setCs4CaSelectionMethodArea(Float cs4CaSelectionMethodArea) {
		this.cs4CaSelectionMethodArea = cs4CaSelectionMethodArea;
	}

	public Float getCs4UsaPlantingOneYr() {
		return cs4UsaPlantingOneYr;
	}

	public void setCs4UsaPlantingOneYr(Float cs4UsaPlantingOneYr) {
		this.cs4UsaPlantingOneYr = cs4UsaPlantingOneYr;
	}

	public Float getCs4CaPlantingOneYr() {
		return cs4CaPlantingOneYr;
	}

	public void setCs4CaPlantingOneYr(Float cs4CaPlantingOneYr) {
		this.cs4CaPlantingOneYr = cs4CaPlantingOneYr;
	}

	public Float getCs4UsaPlantingTwoYr() {
		return cs4UsaPlantingTwoYr;
	}

	public void setCs4UsaPlantingTwoYr(Float cs4UsaPlantingTwoYr) {
		this.cs4UsaPlantingTwoYr = cs4UsaPlantingTwoYr;
	}

	public Float getCs4CaPlantingTwoYr() {
		return cs4CaPlantingTwoYr;
	}

	public void setCs4CaPlantingTwoYr(Float cs4CaPlantingTwoYr) {
		this.cs4CaPlantingTwoYr = cs4CaPlantingTwoYr;
	}

	public Float getCs4UsaPlantingTwoPlusYr() {
		return cs4UsaPlantingTwoPlusYr;
	}

	public void setCs4UsaPlantingTwoPlusYr(Float cs4UsaPlantingTwoPlusYr) {
		this.cs4UsaPlantingTwoPlusYr = cs4UsaPlantingTwoPlusYr;
	}

	public Float getCs4CaPlantingTwoPlusYr() {
		return cs4CaPlantingTwoPlusYr;
	}

	public void setCs4CaPlantingTwoPlusYr(Float cs4CaPlantingTwoPlusYr) {
		this.cs4CaPlantingTwoPlusYr = cs4CaPlantingTwoPlusYr;
	}

	public Float getCs4UsaSeedingOneYr() {
		return cs4UsaSeedingOneYr;
	}

	public void setCs4UsaSeedingOneYr(Float cs4UsaSeedingOneYr) {
		this.cs4UsaSeedingOneYr = cs4UsaSeedingOneYr;
	}

	public Float getCs4CaSeedingOneYr() {
		return cs4CaSeedingOneYr;
	}

	public void setCs4CaSeedingOneYr(Float cs4CaSeedingOneYr) {
		this.cs4CaSeedingOneYr = cs4CaSeedingOneYr;
	}

	public Float getCs4UsaSeedingTwoYr() {
		return cs4UsaSeedingTwoYr;
	}

	public void setCs4UsaSeedingTwoYr(Float cs4UsaSeedingTwoYr) {
		this.cs4UsaSeedingTwoYr = cs4UsaSeedingTwoYr;
	}

	public Float getCs4CaSeedingTwoYr() {
		return cs4CaSeedingTwoYr;
	}

	public void setCs4CaSeedingTwoYr(Float cs4CaSeedingTwoYr) {
		this.cs4CaSeedingTwoYr = cs4CaSeedingTwoYr;
	}

	public Float getCs4UsaSeedingTwoPlusYr() {
		return cs4UsaSeedingTwoPlusYr;
	}

	public void setCs4UsaSeedingTwoPlusYr(Float cs4UsaSeedingTwoPlusYr) {
		this.cs4UsaSeedingTwoPlusYr = cs4UsaSeedingTwoPlusYr;
	}

	public Float getCs4CaSeedingTwoPlusYr() {
		return cs4CaSeedingTwoPlusYr;
	}

	public void setCs4CaSeedingTwoPlusYr(Float cs4CaSeedingTwoPlusYr) {
		this.cs4CaSeedingTwoPlusYr = cs4CaSeedingTwoPlusYr;
	}

	public Float getCs4UsaNatRegen2014() {
		return cs4UsaNatRegen2014;
	}

	public void setCs4UsaNatRegen2014(Float cs4UsaNatRegen2014) {
		this.cs4UsaNatRegen2014 = cs4UsaNatRegen2014;
	}

	public Float getCs4CaNatRegen2014() {
		return cs4CaNatRegen2014;
	}

	public void setCs4CaNatRegen2014(Float cs4CaNatRegen2014) {
		this.cs4CaNatRegen2014 = cs4CaNatRegen2014;
	}

	public Float getCs4UsaRegenPerc5Yr() {
		return cs4UsaRegenPerc5Yr;
	}

	public void setCs4UsaRegenPerc5Yr(Float cs4UsaRegenPerc5Yr) {
		this.cs4UsaRegenPerc5Yr = cs4UsaRegenPerc5Yr;
	}

	public Float getCs4CaRegenPerc5Yr() {
		return cs4CaRegenPerc5Yr;
	}

	public void setCs4CaRegenPerc5Yr(Float cs4CaRegenPerc5Yr) {
		this.cs4CaRegenPerc5Yr = cs4CaRegenPerc5Yr;
	}
}
