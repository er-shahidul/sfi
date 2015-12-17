package com.rbs.sfi.web.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;
import com.rbs.sfi.web.models.entities.SfiPpFormRegion;

public class SfiPpFormForestlandAreaViewModel extends BaseViewModel {

    private Integer id;
    private Float area;
    private SfiPpFormRegion region;

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

    public SfiPpFormRegion getRegion() {
        return region;
    }

    public void setRegion(SfiPpFormRegion region) {
        this.region = region;
    }
}
