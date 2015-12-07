package com.rbs.sfi.web.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sfi_pp_form_cs3_projects")
public class SfiPpFormCs6Other extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "form_id", nullable = true)
    private Integer sfiPpForm;

    @ManyToOne(targetEntity = SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, optional = true)
    @JoinColumn(name = "cs6_otherCountries_countryID", nullable = true)
    private SfiPpFormOtherCountry country;

    @Column(name = "cs6_otherCountries_units", nullable = true)
    private Integer otherCountriesUnits;

    @Column(name = "cs6_otherCountries_volume", nullable = true)
    private String otherCountriesVolume;

    @Column(name = "cs6_otherCountries_percPEFCCertified", nullable = true)
    private String otherCountriesPercPEFCCertified;

    @Column(name = "cs6_otherCountries_percFSCCertified", nullable = true)
    private String otherCountriesPercFSCCertified;

    @Column(name = "cs6_otherCountries_percPEFCFSCCertified", nullable = true)
    private String otherCountriesPercPEFCFSCCertified;

    @Column(name = "cs6_otherCountries_percSFIFiberSourcing", nullable = true)
    private String otherCountriesPercSFIFiberSourcing;

    @Column(name = "cs6_otherCountries_percOther", nullable = true)
    private Boolean otherCountriesPercOther;

    @Column(name = "cs6_otherCountries_percOtherReason", nullable = true)
    private String otherCountriesPercOtherReason;

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

    public Integer getOtherCountriesUnits() {
        return otherCountriesUnits;
    }

    public void setOtherCountriesUnits(Integer otherCountriesUnits) {
        this.otherCountriesUnits = otherCountriesUnits;
    }

    public String getOtherCountriesVolume() {
        return otherCountriesVolume;
    }

    public void setOtherCountriesVolume(String otherCountriesVolume) {
        this.otherCountriesVolume = otherCountriesVolume;
    }

    public String getOtherCountriesPercPEFCCertified() {
        return otherCountriesPercPEFCCertified;
    }

    public void setOtherCountriesPercPEFCCertified(String otherCountriesPercPEFCCertified) {
        this.otherCountriesPercPEFCCertified = otherCountriesPercPEFCCertified;
    }

    public String getOtherCountriesPercFSCCertified() {
        return otherCountriesPercFSCCertified;
    }

    public void setOtherCountriesPercFSCCertified(String otherCountriesPercFSCCertified) {
        this.otherCountriesPercFSCCertified = otherCountriesPercFSCCertified;
    }

    public String getOtherCountriesPercPEFCFSCCertified() {
        return otherCountriesPercPEFCFSCCertified;
    }

    public void setOtherCountriesPercPEFCFSCCertified(String otherCountriesPercPEFCFSCCertified) {
        this.otherCountriesPercPEFCFSCCertified = otherCountriesPercPEFCFSCCertified;
    }

    public String getOtherCountriesPercSFIFiberSourcing() {
        return otherCountriesPercSFIFiberSourcing;
    }

    public void setOtherCountriesPercSFIFiberSourcing(String otherCountriesPercSFIFiberSourcing) {
        this.otherCountriesPercSFIFiberSourcing = otherCountriesPercSFIFiberSourcing;
    }

    public Boolean getOtherCountriesPercOther() {
        return otherCountriesPercOther;
    }

    public void setOtherCountriesPercOther(Boolean otherCountriesPercOther) {
        this.otherCountriesPercOther = otherCountriesPercOther;
    }

    public String getOtherCountriesPercOtherReason() {
        return otherCountriesPercOtherReason;
    }

    public void setOtherCountriesPercOtherReason(String otherCountriesPercOtherReason) {
        this.otherCountriesPercOtherReason = otherCountriesPercOtherReason;
    }
}
