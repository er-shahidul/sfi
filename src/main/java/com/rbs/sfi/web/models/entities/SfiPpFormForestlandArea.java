package com.rbs.sfi.web.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sfi_pp_forms_cs9_forest_land_area")
public class SfiPpFormForestlandArea extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs9_area", nullable = true)
    private Float area;

    @ManyToOne(targetEntity = SfiPpFormRegion.class, optional = true)
    @JoinColumn(name = "cs9_region", referencedColumnName = "id", nullable = true)
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
