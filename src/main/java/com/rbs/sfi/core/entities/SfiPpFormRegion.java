package com.rbs.sfi.core.entities;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_region_list")
public class SfiPpFormRegion
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="regionID", nullable=false)
	private int id;

	@Column(name="regionName", nullable=true)
	private String name;

	@ManyToOne(targetEntity = com.rbs.sfi.core.entities.SfiPpFormAllCountry.class, optional=false)
	@JoinColumn(name="countryID", referencedColumnName="countryID", nullable=true)
	private SfiPpFormAllCountry country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
