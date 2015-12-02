package com.rbs.sfi.core.models.entities;

import com.rbs.sfi.core.mapper.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_other_country")
public class SfiPpFormCountry extends BaseEntityModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="name", nullable=true)
	private String name;

	@Column(name="isUnknown", nullable=true)
	private Boolean isUnknown;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isUnknown() {
		return isUnknown;
	}

	public void setIsUnknown(Boolean isUnknown) {
		this.isUnknown = isUnknown;
	}
}
