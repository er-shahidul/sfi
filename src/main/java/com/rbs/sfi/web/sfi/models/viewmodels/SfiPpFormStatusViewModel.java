package com.rbs.sfi.web.sfi.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;

public class SfiPpFormStatusViewModel extends BaseViewModel {
    private Integer id;
    private String status;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
