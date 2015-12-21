package com.rbs.sfi.web.sic.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sic_forms")
public class SicCs2 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}