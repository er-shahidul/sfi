package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sic_forms")
public class SicCs4 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs4_governmentAgencyOutreach", nullable = true)
    private Boolean governmentAgencyOutreach;

    @Column(name = "cs4_legislatureOutreach", nullable = true)
    private Boolean legislatureOutreach;

    @Column(name = "cs4_other", nullable = true)
    private Boolean other;

    @Column(name = "cs4_universityOutreach", nullable = true)
    private Boolean universityOutreach;

    @Column(name = "cs4_governmentSpecify", nullable = true)
    private String governmentSpecify;

    @Column(name = "cs4_legislatureSpecify", nullable = true)
    private String legislatureSpecify;

    @Column(name = "cs4_otherSpecify", nullable = true)
    private String otherSpecify;

    @Column(name = "cs4_universitySpecify", nullable = true)
    private String universitySpecify;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getGovernmentAgencyOutreach() {
        return governmentAgencyOutreach;
    }

    public void setGovernmentAgencyOutreach(Boolean governmentAgencyOutreach) {
        this.governmentAgencyOutreach = governmentAgencyOutreach;
    }

    public Boolean getLegislatureOutreach() {
        return legislatureOutreach;
    }

    public void setLegislatureOutreach(Boolean legislatureOutreach) {
        this.legislatureOutreach = legislatureOutreach;
    }

    public Boolean getOther() {
        return other;
    }

    public void setOther(Boolean other) {
        this.other = other;
    }

    public Boolean getUniversityOutreach() {
        return universityOutreach;
    }

    public void setUniversityOutreach(Boolean universityOutreach) {
        this.universityOutreach = universityOutreach;
    }

    public String getGovernmentSpecify() {
        return governmentSpecify;
    }

    public void setGovernmentSpecify(String governmentSpecify) {
        this.governmentSpecify = governmentSpecify;
    }

    public String getLegislatureSpecify() {
        return legislatureSpecify;
    }

    public void setLegislatureSpecify(String legislatureSpecify) {
        this.legislatureSpecify = legislatureSpecify;
    }

    public String getOtherSpecify() {
        return otherSpecify;
    }

    public void setOtherSpecify(String otherSpecify) {
        this.otherSpecify = otherSpecify;
    }

    public String getUniversitySpecify() {
        return universitySpecify;
    }

    public void setUniversitySpecify(String universitySpecify) {
        this.universitySpecify = universitySpecify;
    }
}
