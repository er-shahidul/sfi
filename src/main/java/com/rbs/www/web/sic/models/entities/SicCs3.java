package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "sic_forms")
public class SicCs3 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs3_brochure", nullable = true)
    private Boolean brochure;

    @Column(name = "cs3_other", nullable = true)
    private Boolean other;

    @Column(name = "cs3_tours", nullable = true)
    private Boolean tours;

    @Column(name = "cs3_workshop", nullable = true)
    private Boolean workshop;

    @Column(name = "cs3_brochureSpecify", nullable = true)
    @Type(type="text")
    private String brochureSpecify;

    @Column(name = "cs3_otherSpecify", nullable = true)
    @Type(type="text")
    private String otherSpecify;

    @Column(name = "cs3_toursSpecify", nullable = true)
    @Type(type="text")
    private String toursSpecify;

    @Column(name = "cs3_workshopSpecify", nullable = true)
    @Type(type="text")
    private String workshopSpecify;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getBrochure() {
        return brochure;
    }

    public void setBrochure(Boolean brochure) {
        this.brochure = brochure;
    }

    public Boolean getOther() {
        return other;
    }

    public void setOther(Boolean other) {
        this.other = other;
    }

    public Boolean getTours() {
        return tours;
    }

    public void setTours(Boolean tours) {
        this.tours = tours;
    }

    public Boolean getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Boolean workshop) {
        this.workshop = workshop;
    }

    public String getBrochureSpecify() {
        return brochureSpecify;
    }

    public void setBrochureSpecify(String brochureSpecify) {
        this.brochureSpecify = brochureSpecify;
    }

    public String getOtherSpecify() {
        return otherSpecify;
    }

    public void setOtherSpecify(String otherSpecify) {
        this.otherSpecify = otherSpecify;
    }

    public String getToursSpecify() {
        return toursSpecify;
    }

    public void setToursSpecify(String toursSpecify) {
        this.toursSpecify = toursSpecify;
    }

    public String getWorkshopSpecify() {
        return workshopSpecify;
    }

    public void setWorkshopSpecify(String workshopSpecify) {
        this.workshopSpecify = workshopSpecify;
    }
}
