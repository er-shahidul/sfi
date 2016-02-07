package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

import javax.validation.constraints.NotNull;

public class SicCs10ViewModel extends BaseViewModel {
    private Integer id;

    @NotNull(message = "{sic.cs10.confirmation}")
    private Boolean confirmation;
    private Boolean sfiCouldServeEducation;
    private Boolean sfiCouldServeInformation;
    private Boolean sfiCouldServeMarketing;
    private Boolean sfiCouldServeOther;
    private Boolean sfiCouldServeWebContent;
    private Boolean sfiCouldServeWebinar;
    private Boolean shareReport;
    private String fullName;
    private String sfiEducationDetail;
    private String sfiInformationDetail;
    private String sfiMarketingDetail;
    private String sfiOtherDetail;
    private String sfiWebContentDetail;
    private String sfiWebinarDetail;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(Boolean confirmation) {
        this.confirmation = confirmation;
    }

    public Boolean getSfiCouldServeEducation() {
        return sfiCouldServeEducation;
    }

    public void setSfiCouldServeEducation(Boolean sfiCouldServeEducation) {
        this.sfiCouldServeEducation = sfiCouldServeEducation;
    }

    public Boolean getSfiCouldServeInformation() {
        return sfiCouldServeInformation;
    }

    public void setSfiCouldServeInformation(Boolean sfiCouldServeInformation) {
        this.sfiCouldServeInformation = sfiCouldServeInformation;
    }

    public Boolean getSfiCouldServeMarketing() {
        return sfiCouldServeMarketing;
    }

    public void setSfiCouldServeMarketing(Boolean sfiCouldServeMarketing) {
        this.sfiCouldServeMarketing = sfiCouldServeMarketing;
    }

    public Boolean getSfiCouldServeOther() {
        return sfiCouldServeOther;
    }

    public void setSfiCouldServeOther(Boolean sfiCouldServeOther) {
        this.sfiCouldServeOther = sfiCouldServeOther;
    }

    public Boolean getSfiCouldServeWebContent() {
        return sfiCouldServeWebContent;
    }

    public void setSfiCouldServeWebContent(Boolean sfiCouldServeWebContent) {
        this.sfiCouldServeWebContent = sfiCouldServeWebContent;
    }

    public Boolean getSfiCouldServeWebinar() {
        return sfiCouldServeWebinar;
    }

    public void setSfiCouldServeWebinar(Boolean sfiCouldServeWebinar) {
        this.sfiCouldServeWebinar = sfiCouldServeWebinar;
    }

    public Boolean getShareReport() {
        return shareReport;
    }

    public void setShareReport(Boolean shareReport) {
        this.shareReport = shareReport;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSfiEducationDetail() {
        return sfiEducationDetail;
    }

    public void setSfiEducationDetail(String sfiEducationDetail) {
        this.sfiEducationDetail = sfiEducationDetail;
    }

    public String getSfiInformationDetail() {
        return sfiInformationDetail;
    }

    public void setSfiInformationDetail(String sfiInformationDetail) {
        this.sfiInformationDetail = sfiInformationDetail;
    }

    public String getSfiMarketingDetail() {
        return sfiMarketingDetail;
    }

    public void setSfiMarketingDetail(String sfiMarketingDetail) {
        this.sfiMarketingDetail = sfiMarketingDetail;
    }

    public String getSfiOtherDetail() {
        return sfiOtherDetail;
    }

    public void setSfiOtherDetail(String sfiOtherDetail) {
        this.sfiOtherDetail = sfiOtherDetail;
    }

    public String getSfiWebContentDetail() {
        return sfiWebContentDetail;
    }

    public void setSfiWebContentDetail(String sfiWebContentDetail) {
        this.sfiWebContentDetail = sfiWebContentDetail;
    }

    public String getSfiWebinarDetail() {
        return sfiWebinarDetail;
    }

    public void setSfiWebinarDetail(String sfiWebinarDetail) {
        this.sfiWebinarDetail = sfiWebinarDetail;
    }
}
