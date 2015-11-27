package com.rbs.sfi.core.models.entities;

import javax.persistence.*;

@Entity
@Table(name="sfi_pp_form_other_country")
public class SfiPpFormCountry
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="name", nullable=true)
	private String name;

	@Column(name="isUnknown", nullable=true)
	private boolean isUnknown;

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

	public boolean isUnknown() {
		return isUnknown;
	}

	public void setIsUnknown(boolean isUnknown) {
		this.isUnknown = isUnknown;
	}
}
