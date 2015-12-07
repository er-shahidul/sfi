package com.rbs.sfi.web.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sfi_pp_form_cs6_others")
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
    private Integer countriesUnits;

	@Column(name = "cs6_otherCountries_volume", nullable=true)
	private Float countriesVolume;

	@Column(name = "cs6_otherCountries_percPEFCCertified", nullable=true)
	private Float countriesPercPEFCCertified;

	@Column(name = "cs6_otherCountries_percFSCCertified", nullable=true)
	private Float countriesPercFSCCertified;

	@Column(name = "cs6_otherCountries_percPEFCFSCCertified", nullable=true)
	private Float countriesPercPEFCFSCCertified;

	@Column(name = "cs6_otherCountries_percSFIFiberSourcing", nullable=true)
	private Float countriesPercSFIFiberSourcing;

    @Column(name = "cs6_otherCountries_percOther", nullable = true)
    private Boolean countriesPercOther;

    @Column(name = "cs6_otherCountries_percOtherReason", nullable = true)
    private String countriesPercOtherReason;

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

    public Integer getCountriesUnits() {
        return countriesUnits;
    }

    public void setCountriesUnits(Integer countriesUnits) {
        this.countriesUnits = countriesUnits;
    }

    public Float getCountriesVolume() {
        return countriesVolume;
    }

    public void setCountriesVolume(Float countriesVolume) {
        this.countriesVolume = countriesVolume;
    }

    public Float getCountriesPercPEFCCertified() {
        return countriesPercPEFCCertified;
    }

    public void setCountriesPercPEFCCertified(Float countriesPercPEFCCertified) {
        this.countriesPercPEFCCertified = countriesPercPEFCCertified;
    }

    public Float getCountriesPercFSCCertified() {
        return countriesPercFSCCertified;
    }

    public void setCountriesPercFSCCertified(Float countriesPercFSCCertified) {
        this.countriesPercFSCCertified = countriesPercFSCCertified;
    }

    public Float getCountriesPercPEFCFSCCertified() {
        return countriesPercPEFCFSCCertified;
    }

    public void setCountriesPercPEFCFSCCertified(Float countriesPercPEFCFSCCertified) {
        this.countriesPercPEFCFSCCertified = countriesPercPEFCFSCCertified;
    }

    public Float getCountriesPercSFIFiberSourcing() {
        return countriesPercSFIFiberSourcing;
    }

    public void setCountriesPercSFIFiberSourcing(Float countriesPercSFIFiberSourcing) {
        this.countriesPercSFIFiberSourcing = countriesPercSFIFiberSourcing;
    }

    public Boolean getCountriesPercOther() {
        return countriesPercOther;
    }

    public void setCountriesPercOther(Boolean countriesPercOther) {
        this.countriesPercOther = countriesPercOther;
    }

    public String getCountriesPercOtherReason() {
        return countriesPercOtherReason;
    }

    public void setCountriesPercOtherReason(String countriesPercOtherReason) {
        this.countriesPercOtherReason = countriesPercOtherReason;
    }
}
