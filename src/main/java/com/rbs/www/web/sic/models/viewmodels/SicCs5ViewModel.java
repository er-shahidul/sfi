package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.web.common.models.datamodels.DocNames;

import java.util.Set;

public class SicCs5ViewModel extends BaseViewModel {
    private Integer id;

    private String advertiseBillboards;
    private String advertiseOther;
    private String advertiseOtherSpecify;
    private String advertisePublications;
    private String advertiseWebsites;

    private Integer totalInquiriesReceived;
    private Integer totalInconsistentPractices;
    private Integer sfiStandardVersion;

    private Boolean receiveInquiryPhone;
    private Boolean receiveInquiryWebsite;
    private Boolean receiveInquiryLetter;
    private Boolean receiveInquiryOther;

    private Set<DocNames> mechanismDocs;
    private Set<Cs5ForestStandards2015ViewModel> forestStandards2015;
    private Set<Cs5FiberSourcing2015ViewModel> fiberSourcing2015;
    private Set<Cs5StandardObjectives2010ViewModel> standardObjectives2010;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdvertiseBillboards() {
        return advertiseBillboards;
    }

    public void setAdvertiseBillboards(String advertiseBillboards) {
        this.advertiseBillboards = advertiseBillboards;
    }

    public String getAdvertiseOther() {
        return advertiseOther;
    }

    public void setAdvertiseOther(String advertiseOther) {
        this.advertiseOther = advertiseOther;
    }

    public String getAdvertiseOtherSpecify() {
        return advertiseOtherSpecify;
    }

    public void setAdvertiseOtherSpecify(String advertiseOtherSpecify) {
        this.advertiseOtherSpecify = advertiseOtherSpecify;
    }

    public String getAdvertisePublications() {
        return advertisePublications;
    }

    public void setAdvertisePublications(String advertisePublications) {
        this.advertisePublications = advertisePublications;
    }

    public String getAdvertiseWebsites() {
        return advertiseWebsites;
    }

    public void setAdvertiseWebsites(String advertiseWebsites) {
        this.advertiseWebsites = advertiseWebsites;
    }

    public Integer getTotalInquiriesReceived() {
        return totalInquiriesReceived;
    }

    public void setTotalInquiriesReceived(Integer totalInquiriesReceived) {
        this.totalInquiriesReceived = totalInquiriesReceived;
    }

    public Integer getTotalInconsistentPractices() {
        return totalInconsistentPractices;
    }

    public void setTotalInconsistentPractices(Integer totalInconsistentPractices) {
        this.totalInconsistentPractices = totalInconsistentPractices;
    }

    public Integer getSfiStandardVersion() {
        return sfiStandardVersion;
    }

    public void setSfiStandardVersion(Integer sfiStandardVersion) {
        this.sfiStandardVersion = sfiStandardVersion;
    }

    public Set<DocNames> getMechanismDocs() {
        return mechanismDocs;
    }

    public void setMechanismDocs(Set<DocNames> mechanismDocs) {
        this.mechanismDocs = mechanismDocs;
    }

    public Set<Cs5ForestStandards2015ViewModel> getForestStandards2015() {
        return forestStandards2015;
    }

    public void setForestStandards2015(Set<Cs5ForestStandards2015ViewModel> forestStandards2015) {
        this.forestStandards2015 = forestStandards2015;
    }

    public Set<Cs5FiberSourcing2015ViewModel> getFiberSourcing2015() {
        return fiberSourcing2015;
    }

    public void setFiberSourcing2015(Set<Cs5FiberSourcing2015ViewModel> fiberSourcing2015) {
        this.fiberSourcing2015 = fiberSourcing2015;
    }

    public Set<Cs5StandardObjectives2010ViewModel> getStandardObjectives2010() {
        return standardObjectives2010;
    }

    public void setStandardObjectives2010(Set<Cs5StandardObjectives2010ViewModel> standardObjectives2010) {
        this.standardObjectives2010 = standardObjectives2010;
    }

    public Boolean getReceiveInquiryPhone() {
        return receiveInquiryPhone;
    }

    public void setReceiveInquiryPhone(Boolean receiveInquiryPhone) {
        this.receiveInquiryPhone = receiveInquiryPhone;
    }

    public Boolean getReceiveInquiryWebsite() {
        return receiveInquiryWebsite;
    }

    public void setReceiveInquiryWebsite(Boolean receiveInquiryWebsite) {
        this.receiveInquiryWebsite = receiveInquiryWebsite;
    }

    public Boolean getReceiveInquiryLetter() {
        return receiveInquiryLetter;
    }

    public void setReceiveInquiryLetter(Boolean receiveInquiryLetter) {
        this.receiveInquiryLetter = receiveInquiryLetter;
    }

    public Boolean getReceiveInquiryOther() {
        return receiveInquiryOther;
    }

    public void setReceiveInquiryOther(Boolean receiveInquiryOther) {
        this.receiveInquiryOther = receiveInquiryOther;
    }
}
