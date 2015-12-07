package com.rbs.sfi.web.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;

public class SfiPpFormCs6OtherViewModel extends BaseViewModel {
    private Integer id;
    private Integer sfiPpForm;
    private SfiPpFormOtherCountryViewModel country;
    private Integer countriesUnits;
    private Float countriesVolume;
    private Float countriesPercPEFCCertified;
    private Float countriesPercFSCCertified;
    private Float countriesPercPEFCFSCCertified;
    private Float countriesPercSFIFiberSourcing;
    private Boolean countriesPercOther;
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

    public SfiPpFormOtherCountryViewModel getCountry() {
        return country;
    }

    public void setCountry(SfiPpFormOtherCountryViewModel country) {
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
