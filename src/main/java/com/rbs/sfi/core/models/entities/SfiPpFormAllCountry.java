package com.rbs.sfi.core.models.entities;

import com.rbs.sfi.core.mapper.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_all_country_list")
public class SfiPpFormAllCountry extends BaseEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="country", nullable=true)
	private String country;

	@Column(name="isUnknown", nullable=true)
	private Boolean isUnknown;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Boolean isUnknown() {
		return isUnknown;
	}

	public void setIsUnknown(Boolean isUnknown) {
		this.isUnknown = isUnknown;
	}
}
