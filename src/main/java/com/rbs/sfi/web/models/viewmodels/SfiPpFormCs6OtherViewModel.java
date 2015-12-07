package com.rbs.sfi.web.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;

public class SfiPpFormCs6OtherViewModel extends BaseViewModel {
    private Integer id;
    private Integer sfiPpForm;
    private SfiPpFormOtherCountryViewModel country;
    private Integer otherCountriesUnits;
    private Float otherCountriesVolume;
    private Float otherCountriesPercPEFCCertified;
    private Float otherCountriesPercFSCCertified;
    private Float otherCountriesPercPEFCFSCCertified;
    private Float otherCountriesPercSFIFiberSourcing;
    private Boolean otherCountriesPercOther;
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

    public SfiPpFormOtherCountryViewModel getCountry() {
        return country;
    }

    public void setCountry(SfiPpFormOtherCountryViewModel country) {
        this.country = country;
    }

    public Integer getOtherCountriesUnits() {
        return otherCountriesUnits;
    }

    public void setOtherCountriesUnits(Integer otherCountriesUnits) {
        this.otherCountriesUnits = otherCountriesUnits;
    }

    public Float getOtherCountriesVolume() {
        return otherCountriesVolume;
    }

    public void setOtherCountriesVolume(Float otherCountriesVolume) {
        this.otherCountriesVolume = otherCountriesVolume;
    }

    public Float getOtherCountriesPercPEFCCertified() {
        return otherCountriesPercPEFCCertified;
    }

    public void setOtherCountriesPercPEFCCertified(Float otherCountriesPercPEFCCertified) {
        this.otherCountriesPercPEFCCertified = otherCountriesPercPEFCCertified;
    }

    public Float getOtherCountriesPercFSCCertified() {
        return otherCountriesPercFSCCertified;
    }

    public void setOtherCountriesPercFSCCertified(Float otherCountriesPercFSCCertified) {
        this.otherCountriesPercFSCCertified = otherCountriesPercFSCCertified;
    }

    public Float getOtherCountriesPercPEFCFSCCertified() {
        return otherCountriesPercPEFCFSCCertified;
    }

    public void setOtherCountriesPercPEFCFSCCertified(Float otherCountriesPercPEFCFSCCertified) {
        this.otherCountriesPercPEFCFSCCertified = otherCountriesPercPEFCFSCCertified;
    }

    public Float getOtherCountriesPercSFIFiberSourcing() {
        return otherCountriesPercSFIFiberSourcing;
    }

    public void setOtherCountriesPercSFIFiberSourcing(Float otherCountriesPercSFIFiberSourcing) {
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
