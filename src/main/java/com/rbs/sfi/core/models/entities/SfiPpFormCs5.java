package com.rbs.sfi.core.models.entities;

import com.rbs.sfi.core.mapper.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_cs5_research_funding")
public class SfiPpFormCs5 extends BaseEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(targetEntity = SfiPpForm.class)
	@JoinColumn(name="form_id", nullable=true)
	private SfiPpForm form;

	@ManyToOne(targetEntity = SfiPpFormResearchType.class)
	@JoinColumn(name="research_id", nullable=true)
	private SfiPpFormResearchType researchType;

	@Column(name="cs5_interUSD", nullable=true)
	private Float internalUsd;

	@Column(name="cs5_exterUSD", nullable=true)
	private Float externalUsd;

	@Column(name="cs5_interCA", nullable=true)
	private Float internalCad;

	@Column(name="cs5_exterCA", nullable=true)
	private Float externalCad;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SfiPpForm getForm() {
		return form;
	}

	public void setForm(SfiPpForm form) {
		this.form = form;
	}

	public SfiPpFormResearchType getResearchType() {
		return researchType;
	}

	public void setResearchType(SfiPpFormResearchType researchType) {
		this.researchType = researchType;
	}

	public Float getInternalUsd() {
		return internalUsd;
	}

	public void setInternalUsd(Float internalUsd) {
		this.internalUsd = internalUsd;
	}

	public Float getExternalUsd() {
		return externalUsd;
	}

	public void setExternalUsd(Float externalUsd) {
		this.externalUsd = externalUsd;
	}

	public Float getInternalCad() {
		return internalCad;
	}

	public void setInternalCad(Float internalCad) {
		this.internalCad = internalCad;
	}

	public Float getExternalCad() {
		return externalCad;
	}

	public void setExternalCad(Float externalCad) {
		this.externalCad = externalCad;
	}
}
