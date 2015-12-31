package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sfi_pp_form_cs3_project_standard_objectives")
public class SfiPpFormCs3ProjectStandardObjective extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private SfiPpFormCs3 sfiPpFormCs3;

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

    public SfiPpFormCs3 getSfiPpFormCs3() {
        return sfiPpFormCs3;
    }

    public void setSfiPpFormCs3(SfiPpFormCs3 sfiPpFormCs3) {
        this.sfiPpFormCs3 = sfiPpFormCs3;
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
