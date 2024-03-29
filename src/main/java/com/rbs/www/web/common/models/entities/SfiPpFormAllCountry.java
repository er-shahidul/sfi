package com.rbs.www.web.common.models.entities;

import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sfi_pp_form_all_country_list")
public class SfiPpFormAllCountry extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "country", nullable = true)
    private String country;

    @Column(name = "isUnknown", nullable = true)
    private Boolean isUnknown;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean isUnknown() {
        return isUnknown;
    }

    public void setIsUnknown(Boolean isUnknown) {
        this.isUnknown = isUnknown;
    }
}
