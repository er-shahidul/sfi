package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class UsaCaSelector extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs1_ownsMngLands", nullable = false, columnDefinition = "Boolean default false")
    private Boolean ownsMngLands;
    @Column(name = "cs1_ownsMngLands_inUSA", nullable = false, columnDefinition = "Boolean default false")
    private Boolean ownsMngLandsInUSA;
    @Column(name = "cs1_ownsMngLands_inCA", nullable = false, columnDefinition = "Boolean default false")
    private Boolean ownsMngLandsInCA;
    @Column(name = "cs1_ownsMngLands_inOther", nullable = false, columnDefinition = "Boolean default false")
    private Boolean ownsMngLandsInOther;

    @Column(name = "cs1_hasPrimaryOperMillsYards", nullable = false, columnDefinition = "Boolean default false")
    private Boolean hasPrimaryOperMillsYards;
    @Column(name = "cs1_hasPrimaryOperMillsYards_inUSA", nullable = false, columnDefinition = "Boolean default false")
    private Boolean hasPrimaryOperMillsYardsInUSA;
    @Column(name = "cs1_hasPrimaryOperMillsYards_inCA", nullable = false, columnDefinition = "Boolean default false")
    private Boolean hasPrimaryOperMillsYardsInCA;
    @Column(name = "cs1_hasPrimaryOperMillsYards_inOther", nullable = false, columnDefinition = "Boolean default false")
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

    public void setOwnsMngLands(Boolean ownsMngLands) {
        this.ownsMngLands = ownsMngLands;
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
