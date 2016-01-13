package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;

@Entity
@Table(name = "sic_forms")
public class SicCs10 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs10_confirmation", nullable = true)
    private Boolean confirmation;

    @Column(name = "cs10_sfiCouldServeEducation", nullable = true)
    private Boolean sfiCouldServeEducation;

    @Column(name = "cs10_sfiCouldServeInformation", nullable = true)
    private Boolean sfiCouldServeInformation;

    @Column(name = "cs10_sfiCouldServeMarketing", nullable = true)
    private Boolean sfiCouldServeMarketing;

    @Column(name = "cs10_sfiCouldServeOther", nullable = true)
    private Boolean sfiCouldServeOther;

    @Column(name = "cs10_sfiCouldServeWebContent", nullable = true)
    private Boolean sfiCouldServeWebContent;

    @Column(name = "cs10_sfiCouldServeWebinar", nullable = true)
    private Boolean sfiCouldServeWebinar;

    @Column(name = "cs10_shareReport", nullable = true)
    private Boolean shareReport;

    @Column(name = "cs10_fullName", nullable = true)
    private String fullName;

    @Column(name = "cs10_sfiEducationDetail", nullable = true)
    private String sfiEducationDetail;

    @Column(name = "cs10_sfiInformationDetail", nullable = true)
    private String sfiInformationDetail;

    @Column(name = "cs10_sfiMarketingDetail", nullable = true)
    private String sfiMarketingDetail;

    @Column(name = "cs10_sfiOtherDetail", nullable = true)
    private String sfiOtherDetail;

    @Column(name = "cs10_sfiWebContentDetail", nullable = true)
    private String sfiWebContentDetail;

    @Column(name = "cs10_sfiWebinarDetail", nullable = true)
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
