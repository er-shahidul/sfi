package com.rbs.sfi.web.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;

public class SfiPpFormCs6OtherViewModel extends BaseViewModel {
    private Integer id;
    private Integer sfiPpForm;
    private SfiPpFormOtherCountryViewModel country;
    private Integer otherCountriesUnits;
    private String otherCountriesVolume;
    private String otherCountriesPercPEFCCertified;
    private String otherCountriesPercFSCCertified;
    private String otherCountriesPercPEFCFSCCertified;
    private String otherCountriesPercSFIFiberSourcing;
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
