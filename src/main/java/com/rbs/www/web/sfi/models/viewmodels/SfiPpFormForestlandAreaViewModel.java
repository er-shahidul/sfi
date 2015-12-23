package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class SfiPpFormForestlandAreaViewModel extends BaseViewModel {
    private Integer id;
    private Float area;
    private SfiPpFormRegionViewModel region;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public SfiPpFormRegionViewModel getRegion() {
        return region;
    }

    public void setRegion(SfiPpFormRegionViewModel region) {
        this.region = region;
    }
}
