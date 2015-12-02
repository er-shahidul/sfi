package com.rbs.sfi.core.models.entities;

import com.rbs.sfi.core.mapper.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_cs5_research_funding_categories")
public class SfiPpFormResearchType extends BaseEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cs5_researchFundingDesc", nullable=true)
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
