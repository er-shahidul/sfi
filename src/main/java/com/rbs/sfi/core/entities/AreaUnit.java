package com.rbs.sfi.core.entities;

import javax.persistence.*;

@Entity
@Table(name="company_area_unit")
public class AreaUnit
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="unit_description", nullable=true)
	private String unitDescription;

	@Column(name="short_code", nullable=true)
	private String shortCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUnitDescription() {
		return unitDescription;
	}

	public void setUnitDescription(String unitDescription) {
		this.unitDescription = unitDescription;
	}

	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
}
