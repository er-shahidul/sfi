package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class SfiPpFormCs6OtherViewModel extends BaseViewModel {
    private Integer id;
    private Integer sfiPpForm;
    private SfiPpFormOtherCountryViewModel country;
    private Integer units;
    private Float volume;
    private Float percPEFCCertified;
    private Float percFSCCertified;
    private Float percPEFCFSCCertified;
    private Float percSFIFiberSourcing;
    private Boolean percOther;
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

    public SfiPpFormOtherCountryViewModel getCountry() {
        return country;
    }

    public void setCountry(SfiPpFormOtherCountryViewModel country) {
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

    public Boolean getPercOther() {
        return percOther;
    }

    public void setPercOther(Boolean percOther) {
        this.percOther = percOther;
    }

    public String getPercOtherReason() {
        return percOtherReason;
    }

    public void setPercOtherReason(String percOtherReason) {
        this.percOtherReason = percOtherReason;
    }
}
