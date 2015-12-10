package com.rbs.sfi.web.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs3 extends BaseEntityModel {
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
