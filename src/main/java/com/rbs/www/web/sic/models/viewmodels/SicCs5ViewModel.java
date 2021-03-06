package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.SpELAssert;
import com.rbs.www.web.common.models.datamodels.BlobNames;

//import javax.validation.constraints.NotNull;
import java.util.Set;

@SpELAssert.List({
        @SpELAssert(
                value = "receiveInquiryOtherSpecify != null && !receiveInquiryOtherSpecify.isEmpty()",
                applyIf = "receiveInquiryOther != null && receiveInquiryOther",
                message = "{sic.cs5.receiveInquiryOtherSpecify}"
        ),
        @SpELAssert(
                value = "advertiseOtherSpecify != null && !advertiseOtherSpecify.isEmpty()",
                applyIf = "advertiseOther != null && advertiseOther",
                message = "{sic.cs5.advertiseOtherSpecify}"
        )
})
public class SicCs5ViewModel extends BaseViewModel {
    private Integer id;

    private Boolean advertiseBillboards;
    private Boolean advertiseOther;
    private Boolean advertisePublications;
    private Boolean advertiseWebsites;

    private String receiveInquiryOtherSpecify;
    private String advertiseOtherSpecify;

    private Integer totalInquiriesReceived;
    private Integer totalInconsistentPractices;
    private Integer sfiStandardVersion;

//    @NotNull(message = "{sic.cs5.receiveInquiryPhone}")
    private Boolean receiveInquiryPhone;
    private Boolean receiveInquiryWebsite;
//    @NotNull(message = "{sic.cs5.receiveInquiryLetter}")
    private Boolean receiveInquiryLetter;
    private Boolean receiveInquiryOther;

    private BlobNames mechanismDoc;
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

    public String getReceiveInquiryOtherSpecify() {
        return receiveInquiryOtherSpecify;
    }

    public void setReceiveInquiryOtherSpecify(String receiveInquiryOtherSpecify) {
        this.receiveInquiryOtherSpecify = receiveInquiryOtherSpecify;
    }

    public String getAdvertiseOtherSpecify() {
        return advertiseOtherSpecify;
    }

    public void setAdvertiseOtherSpecify(String advertiseOtherSpecify) {
        this.advertiseOtherSpecify = advertiseOtherSpecify;
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

    public BlobNames getMechanismDoc() {
        return mechanismDoc;
    }

    public void setMechanismDoc(BlobNames mechanismDoc) {
        this.mechanismDoc = mechanismDoc;
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

    public Boolean getAdvertiseBillboards() {
        return advertiseBillboards;
    }

    public void setAdvertiseBillboards(Boolean advertiseBillboards) {
        this.advertiseBillboards = advertiseBillboards;
    }

    public Boolean getAdvertiseOther() {
        return advertiseOther;
    }

    public void setAdvertiseOther(Boolean advertiseOther) {
        this.advertiseOther = advertiseOther;
    }

    public Boolean getAdvertisePublications() {
        return advertisePublications;
    }

    public void setAdvertisePublications(Boolean advertisePublications) {
        this.advertisePublications = advertisePublications;
    }

    public Boolean getAdvertiseWebsites() {
        return advertiseWebsites;
    }

    public void setAdvertiseWebsites(Boolean advertiseWebsites) {
        this.advertiseWebsites = advertiseWebsites;
    }
}
