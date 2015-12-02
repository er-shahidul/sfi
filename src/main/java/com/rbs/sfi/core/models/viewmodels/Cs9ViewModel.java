package com.rbs.sfi.core.models.viewmodels;

import com.rbs.sfi.core.mapper.BaseViewModel;

public class Cs9ViewModel extends BaseViewModel {
	private Integer id;
	private Boolean cs9Acknowledge;

    @Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getCs9Acknowledge() {
		return cs9Acknowledge;
	}

	public void setCs9Acknowledge(Boolean cs9Acknowledge) {
		this.cs9Acknowledge = cs9Acknowledge;
	}
}
