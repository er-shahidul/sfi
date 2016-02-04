package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class UsaCaSelectorViewModel extends BaseViewModel {
    private Integer id;

    private Boolean ownsMngLands;
    private Boolean ownsMngLandsInUSA;
    private Boolean ownsMngLandsInCA;
    private Boolean ownsMngLandsInOther;
    private Boolean hasPrimaryOperMillsYards;
    private Boolean hasPrimaryOperMillsYardsInUSA;
    private Boolean hasPrimaryOperMillsYardsInCA;
    private Boolean hasPrimaryOperMillsYardsInOther;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getOwnsMngLands() {
        return ownsMngLands;
    }

    public void setOwnsMngLands(Boolean ownsMngLands) {
        this.ownsMngLands = ownsMngLands;
    }

    public Boolean getOwnsMngLandsInUSA() {
        return ownsMngLandsInUSA;
    }

    public void setOwnsMngLandsInUSA(Boolean ownsMngLandsInUSA) {
        this.ownsMngLandsInUSA = ownsMngLandsInUSA;
    }

    public Boolean getOwnsMngLandsInCA() {
        return ownsMngLandsInCA;
    }

    public void setOwnsMngLandsInCA(Boolean ownsMngLandsInCA) {
        this.ownsMngLandsInCA = ownsMngLandsInCA;
    }

    public Boolean getOwnsMngLandsInOther() {
        return ownsMngLandsInOther;
    }

    public void setOwnsMngLandsInOther(Boolean ownsMngLandsInOther) {
        this.ownsMngLandsInOther = ownsMngLandsInOther;
    }

    public Boolean getHasPrimaryOperMillsYards() {
        return hasPrimaryOperMillsYards;
    }

    public void setHasPrimaryOperMillsYards(Boolean hasPrimaryOperMillsYards) {
        this.hasPrimaryOperMillsYards = hasPrimaryOperMillsYards;
    }

    public Boolean getHasPrimaryOperMillsYardsInUSA() {
        return hasPrimaryOperMillsYardsInUSA;
    }

    public void setHasPrimaryOperMillsYardsInUSA(Boolean hasPrimaryOperMillsYardsInUSA) {
        this.hasPrimaryOperMillsYardsInUSA = hasPrimaryOperMillsYardsInUSA;
    }

    public Boolean getHasPrimaryOperMillsYardsInCA() {
        return hasPrimaryOperMillsYardsInCA;
    }

    public void setHasPrimaryOperMillsYardsInCA(Boolean hasPrimaryOperMillsYardsInCA) {
        this.hasPrimaryOperMillsYardsInCA = hasPrimaryOperMillsYardsInCA;
    }

    public Boolean getHasPrimaryOperMillsYardsInOther() {
        return hasPrimaryOperMillsYardsInOther;
    }

    public void setHasPrimaryOperMillsYardsInOther(Boolean hasPrimaryOperMillsYardsInOther) {
        this.hasPrimaryOperMillsYardsInOther = hasPrimaryOperMillsYardsInOther;
    }
}
