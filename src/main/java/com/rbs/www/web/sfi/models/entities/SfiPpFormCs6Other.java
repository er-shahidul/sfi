package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sfi_pp_form_cs6_others")
public class SfiPpFormCs6Other extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "form_id", nullable = true)
    private Integer sfiPpForm;

    @ManyToOne(targetEntity = SfiPpFormOtherCountry.class, cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "cs6_otherCountries_countryID", nullable = true)
    private SfiPpFormOtherCountry country;

    @Column(name = "cs6_otherCountries_units", nullable = true)
    private Integer units;

    @Column(name = "cs6_otherCountries_volume", nullable = true)
    private Float volume;

    @Column(name = "cs6_otherCountries_percPEFCCertified", nullable = true)
    private Float percPEFCCertified;

    @Column(name = "cs6_otherCountries_percFSCCertified", nullable = true)
    private Float percFSCCertified;

    @Column(name = "cs6_otherCountries_percPEFCFSCCertified", nullable = true)
    private Float percPEFCFSCCertified;

    @Column(name = "cs6_otherCountries_percSFIFiberSourcing", nullable = true)
    private Float percSFIFiberSourcing;

//    @Column(name = "cs6_otherCountries_percOther", nullable = true)
//    private Boolean percOther;

    @Column(name = "cs6_otherCountries_percOther_val", nullable = true)
    private Float percOtherVal;

    @Column(name = "cs6_otherCountries_percOtherReason", nullable = true)
    private String percOtherReason;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSfiPpForm() {
        return sfiPpForm;
    }

    public void setSfiPpForm(Integer sfiPpForm) {
        this.sfiPpForm = sfiPpForm;
    }

    public SfiPpFormOtherCountry getCountry() {
        return country;
    }

    public void setCountry(SfiPpFormOtherCountry country) {
        this.country = country;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Float getPercPEFCCertified() {
        return percPEFCCertified;
    }

    public void setPercPEFCCertified(Float percPEFCCertified) {
        this.percPEFCCertified = percPEFCCertified;
    }

    public Float getPercFSCCertified() {
        return percFSCCertified;
    }

    public void setPercFSCCertified(Float percFSCCertified) {
        this.percFSCCertified = percFSCCertified;
    }

    public Float getPercPEFCFSCCertified() {
        return percPEFCFSCCertified;
    }

    public void setPercPEFCFSCCertified(Float percPEFCFSCCertified) {
        this.percPEFCFSCCertified = percPEFCFSCCertified;
    }

    public Float getPercSFIFiberSourcing() {
        return percSFIFiberSourcing;
    }

    public void setPercSFIFiberSourcing(Float percSFIFiberSourcing) {
        this.percSFIFiberSourcing = percSFIFiberSourcing;
    }

//    public Boolean getPercOther() {
//        return percOther;
//    }
//
//    public void setPercOther(Boolean percOther) {
//        this.percOther = percOther;
//    }

    public String getPercOtherReason() {
        return percOtherReason;
    }

    public void setPercOtherReason(String percOtherReason) {
        this.percOtherReason = percOtherReason;
    }

    public Float getPercOtherVal() {
        return percOtherVal;
    }

    public void setPercOtherVal(Float percOtherVal) {
        this.percOtherVal = percOtherVal;
    }
}
