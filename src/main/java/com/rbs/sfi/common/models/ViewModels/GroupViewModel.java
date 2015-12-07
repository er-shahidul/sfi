package com.rbs.sfi.common.models.ViewModels;

import com.rbs.sfi.common.models.BaseViewModel;

public class GroupViewModel extends BaseViewModel {
	private Integer id;
	private String role;
	private String description;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
