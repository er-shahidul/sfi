package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.web.common.models.datamodels.BlobNames;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sic_forms")
public class SicCs5 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs5_advertiseBillboards", nullable = true)
    private Boolean advertiseBillboards;

    @Column(name = "cs5_receiveInquiryPhone", nullable = true)
    private Boolean receiveInquiryPhone;

    @Column(name = "cs5_receiveInquiryWebsite", nullable = true)
    private Boolean receiveInquiryWebsite;

    @Column(name = "cs5_receiveInquiryLetter", nullable = true)
    private Boolean receiveInquiryLetter;

    @Column(name = "cs5_receiveInquiryOther", nullable = true)
    private Boolean receiveInquiryOther;

    @Column(name = "cs5_advertiseOther", nullable = true)
    private Boolean advertiseOther;

    @Column(name = "cs5_advertiseOtherSpecify", nullable = true)
    private String advertiseOtherSpecify;

    @Column(name = "cs5_advertisePublications", nullable = true)
    private Boolean advertisePublications;

    @Column(name = "cs5_advertiseWebsites", nullable = true)
    private Boolean advertiseWebsites;

    @Column(name = "cs5_receiveInquiryOtherSpecify", nullable = true)
    private String receiveInquiryOtherSpecify;

    @Column(name = "cs5_totalInquiriesReceived", nullable = true)
    private Integer totalInquiriesReceived;

    @Column(name = "cs5_totalInconsistentPractices", nullable = true)
    private Integer totalInconsistentPractices = 0;

    @Column(name = "cs5_sfiStandardVersion", nullable = true)
    private Integer sfiStandardVersion;

    @Lob
    @Column(name = "mechanismDoc", length = 1000, nullable = true)
    private Byte[] mechanismDocAsByteArray;

    @OneToMany(targetEntity = Cs5ForestStandards2015.class, mappedBy = "sicPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Cs5ForestStandards2015> forestStandards2015;

    @OneToMany(targetEntity = Cs5FiberSourcing2015.class, mappedBy = "sicPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Cs5FiberSourcing2015> fiberSourcing2015;

    @OneToMany(targetEntity = Cs5StandardObjectives2010.class, mappedBy = "sicPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Cs5StandardObjectives2010> standardObjectives2010;

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

    public Set<Cs5ForestStandards2015> getForestStandards2015() {
        return forestStandards2015;
    }

    public void setForestStandards2015(Set<Cs5ForestStandards2015> forestStandards2015) {
        addAll(this.forestStandards2015, forestStandards2015);
    }

    public Set<Cs5FiberSourcing2015> getFiberSourcing2015() {
        return fiberSourcing2015;
    }

    public void setFiberSourcing2015(Set<Cs5FiberSourcing2015> fiberSourcing2015) {
        addAll(this.fiberSourcing2015, fiberSourcing2015);
    }

    public Set<Cs5StandardObjectives2010> getStandardObjectives2010() {
        return standardObjectives2010;
    }

    public void setStandardObjectives2010(Set<Cs5StandardObjectives2010> standardObjectives2010) {
        addAll(this.standardObjectives2010, standardObjectives2010);
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

    public Byte[] getMechanismDocAsByteArray() {
        return mechanismDocAsByteArray;
    }

    public void setMechanismDocAsByteArray(Byte[] mechanismDocAsByteArray) {
        this.mechanismDocAsByteArray = mechanismDocAsByteArray;
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

    @Transient
    @SuppressWarnings("unchecked")
    public BlobNames getMechanismDoc() {
        return (BlobNames) TypeConversionUtils.deserialize(mechanismDocAsByteArray);
    }

    public void setMechanismDoc(BlobNames mechanismDoc) {
        this.mechanismDocAsByteArray = TypeConversionUtils.serialize(mechanismDoc);
    }
}
