package com.rbs.sfi.core.models.entities;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_region_list")
public class SfiPpFormRegion
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="regionName", nullable=true)
	private String name;

	@ManyToOne(targetEntity = SfiPpFormAllCountry.class, optional=false)
	@JoinColumn(name="countryID", referencedColumnName="id", nullable=true)
	private SfiPpFormAllCountry country;

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

	public SfiPpFormAllCountry getCountry() {
		return country;
	}

	public void setCountry(SfiPpFormAllCountry country) {
		this.country = country;
	}
}
