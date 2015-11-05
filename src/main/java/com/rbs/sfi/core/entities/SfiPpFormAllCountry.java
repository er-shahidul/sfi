package com.rbs.sfi.core.entities;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_all_country_list")
public class SfiPpFormAllCountry
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="country", nullable=true)
	private String country;

	@Column(name="isUnknown", nullable=true)
	private boolean isUnknown;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isUnknown() {
		return isUnknown;
	}

	public void setIsUnknown(boolean isUnknown) {
		this.isUnknown = isUnknown;
	}
}
