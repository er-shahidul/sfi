package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sfi_pp_form_cs3_project_standard_objectives_2015")
public class SfiPpFormCs3ProjectStandardObjective2015 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs3_sfiStandardObj", nullable = true)
    private Integer sfiStandardObj;

    @Column(name = "cs3_sfiStandardObjDesc", nullable = true)
    private String sfiStandardObjDesc;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSfiStandardObj() {
        return sfiStandardObj;
    }

    public void setSfiStandardObj(Integer sfiStandardObj) {
        this.sfiStandardObj = sfiStandardObj;
    }

    public String getSfiStandardObjDesc() {
        return sfiStandardObjDesc;
    }

    public void setSfiStandardObjDesc(String sfiStandardObjDesc) {
        this.sfiStandardObjDesc = sfiStandardObjDesc;
    }
}
