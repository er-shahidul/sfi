package com.rbs.sfi.core.models.viewmodels;

import com.rbs.sfi.core.mapper.IViewModel;

public class SfiPpFormOtherCountryViewModel implements IViewModel {
	private Integer id;
	private String country;

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
}
