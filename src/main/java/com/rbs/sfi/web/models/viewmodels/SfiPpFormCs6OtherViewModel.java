package com.rbs.sfi.web.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;

public class SfiPpFormCs6OtherViewModel extends BaseViewModel {
	private Integer id;
    private Integer cs6OtherCountriesUnits;
	private Cs6ViewModel sfiPpForm;
	private SfiPpFormOtherCountryViewModel country;
	private String cs6OtherCountriesVolume;
	private String cs6OtherCountriesPercPEFCCertified;
	private String cs6OtherCountriesPercFSCCertified;
	private String cs6OtherCountriesPercPEFCFSCCertified;
	private String cs6OtherCountriesPercSFIFiberSourcing;
	private String cs6OtherCountriesPercOtherReason;
    private Boolean cs6OtherCountriesPercOther;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCs6OtherCountriesUnits() {
        return cs6OtherCountriesUnits;
    }

    public void setCs6OtherCountriesUnits(Integer cs6OtherCountriesUnits) {
        this.cs6OtherCountriesUnits = cs6OtherCountriesUnits;
    }

    public Cs6ViewModel getSfiPpForm() {
        return sfiPpForm;
    }

    public void setSfiPpForm(Cs6ViewModel sfiPpForm) {
        this.sfiPpForm = sfiPpForm;
    }

    public SfiPpFormOtherCountryViewModel getCountry() {
        return country;
    }

    public void setCountry(SfiPpFormOtherCountryViewModel country) {
        this.country = country;
    }

    public String getCs6OtherCountriesVolume() {
        return cs6OtherCountriesVolume;
    }

    public void setCs6OtherCountriesVolume(String cs6OtherCountriesVolume) {
        this.cs6OtherCountriesVolume = cs6OtherCountriesVolume;
    }

    public String getCs6OtherCountriesPercPEFCCertified() {
        return cs6OtherCountriesPercPEFCCertified;
    }

    public void setCs6OtherCountriesPercPEFCCertified(String cs6OtherCountriesPercPEFCCertified) {
        this.cs6OtherCountriesPercPEFCCertified = cs6OtherCountriesPercPEFCCertified;
    }

    public String getCs6OtherCountriesPercFSCCertified() {
        return cs6OtherCountriesPercFSCCertified;
    }

    public void setCs6OtherCountriesPercFSCCertified(String cs6OtherCountriesPercFSCCertified) {
        this.cs6OtherCountriesPercFSCCertified = cs6OtherCountriesPercFSCCertified;
    }

    public String getCs6OtherCountriesPercPEFCFSCCertified() {
        return cs6OtherCountriesPercPEFCFSCCertified;
    }

    public void setCs6OtherCountriesPercPEFCFSCCertified(String cs6OtherCountriesPercPEFCFSCCertified) {
        this.cs6OtherCountriesPercPEFCFSCCertified = cs6OtherCountriesPercPEFCFSCCertified;
    }

    public String getCs6OtherCountriesPercSFIFiberSourcing() {
        return cs6OtherCountriesPercSFIFiberSourcing;
    }

    public void setCs6OtherCountriesPercSFIFiberSourcing(String cs6OtherCountriesPercSFIFiberSourcing) {
        this.cs6OtherCountriesPercSFIFiberSourcing = cs6OtherCountriesPercSFIFiberSourcing;
    }

    public String getCs6OtherCountriesPercOtherReason() {
        return cs6OtherCountriesPercOtherReason;
    }

    public void setCs6OtherCountriesPercOtherReason(String cs6OtherCountriesPercOtherReason) {
        this.cs6OtherCountriesPercOtherReason = cs6OtherCountriesPercOtherReason;
    }

    public Boolean getCs6OtherCountriesPercOther() {
        return cs6OtherCountriesPercOther;
    }

    public void setCs6OtherCountriesPercOther(Boolean cs6OtherCountriesPercOther) {
        this.cs6OtherCountriesPercOther = cs6OtherCountriesPercOther;
    }
}
