package com.rbs.sfi.core.models.viewmodels;

import com.rbs.sfi.core.mapper.IViewModel;

public class SfiPpFormRegionViewModel implements IViewModel {
	private Integer id;
	private String name;

	private SfiPpFormAllCountryViewModel country;

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

	public SfiPpFormAllCountryViewModel getCountry() {
		return country;
	}
	public void setCountry(SfiPpFormAllCountryViewModel country) {
		this.country = country;
	}
}
