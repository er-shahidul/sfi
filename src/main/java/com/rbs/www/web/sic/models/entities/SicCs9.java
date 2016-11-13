package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.web.common.models.datamodels.BlobNames;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sic_forms")
public class SicCs9 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs9_currentYrDetailsAdvPrinted", nullable = true)
    @Type(type="text")
    private String currentYrDetailsAdvPrinted;

    @Column(name = "cs9_currentYrDetailsAdvTV", nullable = true)
    @Type(type="text")
    private String currentYrDetailsAdvTV;

    @Column(name = "cs9_currentYrDetailsEventSponsor", nullable = true)
    @Type(type="text")
    private String currentYrDetailsEventSponsor;

    @Column(name = "cs9_currentYrDetailsPrinted", nullable = true)
    @Type(type="text")
    private String currentYrDetailsPrinted;

    @Column(name = "cs9_currentYrDetailsSocialMedia", nullable = true)
    @Type(type="text")
    private String currentYrDetailsSocialMedia;

    @Column(name = "cs9_currentYrDetailsTradeshow", nullable = true)
    @Type(type="text")
    private String currentYrDetailsTradeshow;

    @Column(name = "cs9_currentYrDetailsYrOther", nullable = true)
    @Type(type="text")
    private String currentYrDetailsYrOther;

    @Column(name = "cs9_currentYrDetailsYrVideo", nullable = true)
    @Type(type="text")
    private String currentYrDetailsYrVideo;

    @Column(name = "cs9_lastYrDetailsAdvPrinted", nullable = true)
    @Type(type="text")
    private String lastYrDetailsAdvPrinted;

    @Column(name = "cs9_lastYrDetailsAdvTV", nullable = true)
    @Type(type="text")
    private String lastYrDetailsAdvTV;

    @Column(name = "cs9_lastYrDetailsEventSponsor", nullable = true)
    @Type(type="text")
    private String lastYrDetailsEventSponsor;

    @Column(name = "cs9_lastYrDetailsPrinted", nullable = true)
    @Type(type="text")
    private String lastYrDetailsPrinted;

    @Column(name = "cs9_lastYrDetailsSocialMedia", nullable = true)
    @Type(type="text")
    private String lastYrDetailsSocialMedia;

    @Column(name = "cs9_lastYrDetailsTradeshow", nullable = true)
    @Type(type="text")
    private String lastYrDetailsTradeshow;

    @Column(name = "cs9_lastYrDetailsYrOther", nullable = true)
    @Type(type="text")
    private String lastYrDetailsYrOther;

    @Column(name = "cs9_lastYrDetailsYrVideo", nullable = true)
    @Type(type="text")
    private String lastYrDetailsYrVideo;

    @Column(name = "cs9_sfiProgramOutlets", nullable = true)
    @Type(type="text")
    private String sfiProgramOutlets;

    @Column(name = "cs9_activityCurrentYrAdvPrinted", nullable = true)
    private Boolean activityCurrentYrAdvPrinted;

    @Column(name = "cs9_activityCurrentYrAdvTV", nullable = true)
    private Boolean activityCurrentYrAdvTV;

    @Column(name = "cs9_activityCurrentYrEventSponsor", nullable = true)
    private Boolean activityCurrentYrEventSponsor;

    @Column(name = "cs9_activityCurrentYrOther", nullable = true)
    private Boolean activityCurrentYrOther;

    @Column(name = "cs9_activityCurrentYrPrinted", nullable = true)
    private Boolean activityCurrentYrPrinted;

    @Column(name = "cs9_activityCurrentYrSocialMedia", nullable = true)
    private Boolean activityCurrentYrSocialMedia;

    @Column(name = "cs9_activityCurrentYrTradeshow", nullable = true)
    private Boolean activityCurrentYrTradeshow;

    @Column(name = "cs9_activityCurrentYrVideo", nullable = true)
    private Boolean activityCurrentYrVideo;

    @Column(name = "cs9_activityLastYrAdvPrinted", nullable = true)
    private Boolean activityLastYrAdvPrinted;

    @Column(name = "cs9_activityLastYrAdvTV", nullable = true)
    private Boolean activityLastYrAdvTV;

    @Column(name = "cs9_activityLastYrEventSponsor", nullable = true)
    private Boolean activityLastYrEventSponsor;

    @Column(name = "cs9_activityLastYrOther", nullable = true)
    private Boolean activityLastYrOther;

    @Column(name = "cs9_activityLastYrPrinted", nullable = true)
    private Boolean activityLastYrPrinted;

    @Column(name = "cs9_activityLastYrSocialMedia", nullable = true)
    private Boolean activityLastYrSocialMedia;

    @Column(name = "cs9_activityLastYrTradeshow", nullable = true)
    private Boolean activityLastYrTradeshow;

    @Column(name = "cs9_activityLastYrVideo", nullable = true)
    private Boolean activityLastYrVideo;

    @Column(name = "cs9_promoteSFI", nullable = true)
    private Boolean promoteSFI;

    @Lob
    @Column(name = "cs9_supportDocCurrentYrAdvPrinted", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] supportDocCurrentYrAdvPrintedAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocCurrentYrAdvTV", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] supportDocCurrentYrAdvTVAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocCurrentYrEventSponsor", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] supportDocCurrentYrEventSponsorAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocCurrentYrOther", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] supportDocCurrentYrOtherAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocCurrentYrPrinted", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] supportDocCurrentYrPrintedAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocCurrentYrSocialMedia", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] supportDocCurrentYrSocialMediaAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocCurrentYrTradeshow", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] supportDocCurrentYrTradeshowAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocCurrentYrVideo", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] supportDocCurrentYrVideoAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocLastYrAdvPrinted", length = 1000, nullable = true)
    private Byte[] supportDocLastYrAdvPrintedAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocLastYrAdvTV", length = 1000, nullable = true)
    private Byte[] supportDocLastYrAdvTVAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocLastYrEventSponsor", length = 1000, nullable = true)
    private Byte[] supportDocLastYrEventSponsorAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocLastYrOther", length = 1000, nullable = true)
    private Byte[] supportDocLastYrOtherAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocLastYrPrinted", length = 1000, nullable = true)
    private Byte[] supportDocLastYrPrintedAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocLastYrSocialMedia", length = 1000, nullable = true)
    private Byte[] supportDocLastYrSocialMediaAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocLastYrTradeshow", length = 1000, nullable = true)
    private Byte[] supportDocLastYrTradeshowAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocLastYrVideo", length = 1000, nullable = true)
    private Byte[] supportDocLastYrVideoAsByteArray;

    @Lob
    @Column(name = "cs9_supportDocPrinted", length = 1000, nullable = true)
    private Byte[] supportDocPrintedAsByteArray;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurrentYrDetailsAdvPrinted() {
        return currentYrDetailsAdvPrinted;
    }

    public void setCurrentYrDetailsAdvPrinted(String currentYrDetailsAdvPrinted) {
        this.currentYrDetailsAdvPrinted = currentYrDetailsAdvPrinted;
    }

    public String getCurrentYrDetailsAdvTV() {
        return currentYrDetailsAdvTV;
    }

    public void setCurrentYrDetailsAdvTV(String currentYrDetailsAdvTV) {
        this.currentYrDetailsAdvTV = currentYrDetailsAdvTV;
    }

    public String getCurrentYrDetailsEventSponsor() {
        return currentYrDetailsEventSponsor;
    }

    public void setCurrentYrDetailsEventSponsor(String currentYrDetailsEventSponsor) {
        this.currentYrDetailsEventSponsor = currentYrDetailsEventSponsor;
    }

    public String getCurrentYrDetailsPrinted() {
        return currentYrDetailsPrinted;
    }

    public void setCurrentYrDetailsPrinted(String currentYrDetailsPrinted) {
        this.currentYrDetailsPrinted = currentYrDetailsPrinted;
    }

    public String getCurrentYrDetailsSocialMedia() {
        return currentYrDetailsSocialMedia;
    }

    public void setCurrentYrDetailsSocialMedia(String currentYrDetailsSocialMedia) {
        this.currentYrDetailsSocialMedia = currentYrDetailsSocialMedia;
    }

    public String getCurrentYrDetailsTradeshow() {
        return currentYrDetailsTradeshow;
    }

    public void setCurrentYrDetailsTradeshow(String currentYrDetailsTradeshow) {
        this.currentYrDetailsTradeshow = currentYrDetailsTradeshow;
    }

    public String getCurrentYrDetailsYrOther() {
        return currentYrDetailsYrOther;
    }

    public void setCurrentYrDetailsYrOther(String currentYrDetailsYrOther) {
        this.currentYrDetailsYrOther = currentYrDetailsYrOther;
    }

    public String getCurrentYrDetailsYrVideo() {
        return currentYrDetailsYrVideo;
    }

    public void setCurrentYrDetailsYrVideo(String currentYrDetailsYrVideo) {
        this.currentYrDetailsYrVideo = currentYrDetailsYrVideo;
    }

    public String getLastYrDetailsAdvPrinted() {
        return lastYrDetailsAdvPrinted;
    }

    public void setLastYrDetailsAdvPrinted(String lastYrDetailsAdvPrinted) {
        this.lastYrDetailsAdvPrinted = lastYrDetailsAdvPrinted;
    }

    public String getLastYrDetailsAdvTV() {
        return lastYrDetailsAdvTV;
    }

    public void setLastYrDetailsAdvTV(String lastYrDetailsAdvTV) {
        this.lastYrDetailsAdvTV = lastYrDetailsAdvTV;
    }

    public String getLastYrDetailsEventSponsor() {
        return lastYrDetailsEventSponsor;
    }

    public void setLastYrDetailsEventSponsor(String lastYrDetailsEventSponsor) {
        this.lastYrDetailsEventSponsor = lastYrDetailsEventSponsor;
    }

    public String getLastYrDetailsPrinted() {
        return lastYrDetailsPrinted;
    }

    public void setLastYrDetailsPrinted(String lastYrDetailsPrinted) {
        this.lastYrDetailsPrinted = lastYrDetailsPrinted;
    }

    public String getLastYrDetailsSocialMedia() {
        return lastYrDetailsSocialMedia;
    }

    public void setLastYrDetailsSocialMedia(String lastYrDetailsSocialMedia) {
        this.lastYrDetailsSocialMedia = lastYrDetailsSocialMedia;
    }

    public String getLastYrDetailsTradeshow() {
        return lastYrDetailsTradeshow;
    }

    public void setLastYrDetailsTradeshow(String lastYrDetailsTradeshow) {
        this.lastYrDetailsTradeshow = lastYrDetailsTradeshow;
    }

    public String getLastYrDetailsYrOther() {
        return lastYrDetailsYrOther;
    }

    public void setLastYrDetailsYrOther(String lastYrDetailsYrOther) {
        this.lastYrDetailsYrOther = lastYrDetailsYrOther;
    }

    public String getLastYrDetailsYrVideo() {
        return lastYrDetailsYrVideo;
    }

    public void setLastYrDetailsYrVideo(String lastYrDetailsYrVideo) {
        this.lastYrDetailsYrVideo = lastYrDetailsYrVideo;
    }

    public String getSfiProgramOutlets() {
        return sfiProgramOutlets;
    }

    public void setSfiProgramOutlets(String sfiProgramOutlets) {
        this.sfiProgramOutlets = sfiProgramOutlets;
    }

    public Boolean getActivityCurrentYrAdvPrinted() {
        return activityCurrentYrAdvPrinted;
    }

    public void setActivityCurrentYrAdvPrinted(Boolean activityCurrentYrAdvPrinted) {
        this.activityCurrentYrAdvPrinted = activityCurrentYrAdvPrinted;
    }

    public Boolean getActivityCurrentYrAdvTV() {
        return activityCurrentYrAdvTV;
    }

    public void setActivityCurrentYrAdvTV(Boolean activityCurrentYrAdvTV) {
        this.activityCurrentYrAdvTV = activityCurrentYrAdvTV;
    }

    public Boolean getActivityCurrentYrEventSponsor() {
        return activityCurrentYrEventSponsor;
    }

    public void setActivityCurrentYrEventSponsor(Boolean activityCurrentYrEventSponsor) {
        this.activityCurrentYrEventSponsor = activityCurrentYrEventSponsor;
    }

    public Boolean getActivityCurrentYrOther() {
        return activityCurrentYrOther;
    }

    public void setActivityCurrentYrOther(Boolean activityCurrentYrOther) {
        this.activityCurrentYrOther = activityCurrentYrOther;
    }

    public Boolean getActivityCurrentYrPrinted() {
        return activityCurrentYrPrinted;
    }

    public void setActivityCurrentYrPrinted(Boolean activityCurrentYrPrinted) {
        this.activityCurrentYrPrinted = activityCurrentYrPrinted;
    }

    public Boolean getActivityCurrentYrSocialMedia() {
        return activityCurrentYrSocialMedia;
    }

    public void setActivityCurrentYrSocialMedia(Boolean activityCurrentYrSocialMedia) {
        this.activityCurrentYrSocialMedia = activityCurrentYrSocialMedia;
    }

    public Boolean getActivityCurrentYrTradeshow() {
        return activityCurrentYrTradeshow;
    }

    public void setActivityCurrentYrTradeshow(Boolean activityCurrentYrTradeshow) {
        this.activityCurrentYrTradeshow = activityCurrentYrTradeshow;
    }

    public Boolean getActivityCurrentYrVideo() {
        return activityCurrentYrVideo;
    }

    public void setActivityCurrentYrVideo(Boolean activityCurrentYrVideo) {
        this.activityCurrentYrVideo = activityCurrentYrVideo;
    }

    public Boolean getActivityLastYrAdvPrinted() {
        return activityLastYrAdvPrinted;
    }

    public void setActivityLastYrAdvPrinted(Boolean activityLastYrAdvPrinted) {
        this.activityLastYrAdvPrinted = activityLastYrAdvPrinted;
    }

    public Boolean getActivityLastYrAdvTV() {
        return activityLastYrAdvTV;
    }

    public void setActivityLastYrAdvTV(Boolean activityLastYrAdvTV) {
        this.activityLastYrAdvTV = activityLastYrAdvTV;
    }

    public Boolean getActivityLastYrEventSponsor() {
        return activityLastYrEventSponsor;
    }

    public void setActivityLastYrEventSponsor(Boolean activityLastYrEventSponsor) {
        this.activityLastYrEventSponsor = activityLastYrEventSponsor;
    }

    public Boolean getActivityLastYrOther() {
        return activityLastYrOther;
    }

    public void setActivityLastYrOther(Boolean activityLastYrOther) {
        this.activityLastYrOther = activityLastYrOther;
    }

    public Boolean getActivityLastYrPrinted() {
        return activityLastYrPrinted;
    }

    public void setActivityLastYrPrinted(Boolean activityLastYrPrinted) {
        this.activityLastYrPrinted = activityLastYrPrinted;
    }

    public Boolean getActivityLastYrSocialMedia() {
        return activityLastYrSocialMedia;
    }

    public void setActivityLastYrSocialMedia(Boolean activityLastYrSocialMedia) {
        this.activityLastYrSocialMedia = activityLastYrSocialMedia;
    }

    public Boolean getActivityLastYrTradeshow() {
        return activityLastYrTradeshow;
    }

    public void setActivityLastYrTradeshow(Boolean activityLastYrTradeshow) {
        this.activityLastYrTradeshow = activityLastYrTradeshow;
    }

    public Boolean getActivityLastYrVideo() {
        return activityLastYrVideo;
    }

    public void setActivityLastYrVideo(Boolean activityLastYrVideo) {
        this.activityLastYrVideo = activityLastYrVideo;
    }

    public Boolean getPromoteSFI() {
        return promoteSFI;
    }

    public void setPromoteSFI(Boolean promoteSFI) {
        this.promoteSFI = promoteSFI;
    }

    private Byte[] getSupportDocCurrentYrAdvPrintedAsByteArray() {
        return supportDocCurrentYrAdvPrintedAsByteArray;
    }

    private void setSupportDocCurrentYrAdvPrintedAsByteArray(Byte[] supportDocCurrentYrAdvPrintedAsByteArray) {
        this.supportDocCurrentYrAdvPrintedAsByteArray = supportDocCurrentYrAdvPrintedAsByteArray;
    }

    private Byte[] getSupportDocCurrentYrAdvTVAsByteArray() {
        return supportDocCurrentYrAdvTVAsByteArray;
    }

    private void setSupportDocCurrentYrAdvTVAsByteArray(Byte[] supportDocCurrentYrAdvTVAsByteArray) {
        this.supportDocCurrentYrAdvTVAsByteArray = supportDocCurrentYrAdvTVAsByteArray;
    }

    private Byte[] getSupportDocCurrentYrEventSponsorAsByteArray() {
        return supportDocCurrentYrEventSponsorAsByteArray;
    }

    private void setSupportDocCurrentYrEventSponsorAsByteArray(Byte[] supportDocCurrentYrEventSponsorAsByteArray) {
        this.supportDocCurrentYrEventSponsorAsByteArray = supportDocCurrentYrEventSponsorAsByteArray;
    }

    private Byte[] getSupportDocCurrentYrOtherAsByteArray() {
        return supportDocCurrentYrOtherAsByteArray;
    }

    private void setSupportDocCurrentYrOtherAsByteArray(Byte[] supportDocCurrentYrOtherAsByteArray) {
        this.supportDocCurrentYrOtherAsByteArray = supportDocCurrentYrOtherAsByteArray;
    }

    private Byte[] getSupportDocCurrentYrPrintedAsByteArray() {
        return supportDocCurrentYrPrintedAsByteArray;
    }

    private void setSupportDocCurrentYrPrintedAsByteArray(Byte[] supportDocCurrentYrPrintedAsByteArray) {
        this.supportDocCurrentYrPrintedAsByteArray = supportDocCurrentYrPrintedAsByteArray;
    }

    private Byte[] getSupportDocCurrentYrSocialMediaAsByteArray() {
        return supportDocCurrentYrSocialMediaAsByteArray;
    }

    private void setSupportDocCurrentYrSocialMediaAsByteArray(Byte[] supportDocCurrentYrSocialMediaAsByteArray) {
        this.supportDocCurrentYrSocialMediaAsByteArray = supportDocCurrentYrSocialMediaAsByteArray;
    }

    private Byte[] getSupportDocCurrentYrTradeshowAsByteArray() {
        return supportDocCurrentYrTradeshowAsByteArray;
    }

    private void setSupportDocCurrentYrTradeshowAsByteArray(Byte[] supportDocCurrentYrTradeshowAsByteArray) {
        this.supportDocCurrentYrTradeshowAsByteArray = supportDocCurrentYrTradeshowAsByteArray;
    }

    private Byte[] getSupportDocCurrentYrVideoAsByteArray() {
        return supportDocCurrentYrVideoAsByteArray;
    }

    private void setSupportDocCurrentYrVideoAsByteArray(Byte[] supportDocCurrentYrVideoAsByteArray) {
        this.supportDocCurrentYrVideoAsByteArray = supportDocCurrentYrVideoAsByteArray;
    }

    private Byte[] getSupportDocLastYrAdvPrintedAsByteArray() {
        return supportDocLastYrAdvPrintedAsByteArray;
    }

    private void setSupportDocLastYrAdvPrintedAsByteArray(Byte[] supportDocLastYrAdvPrintedAsByteArray) {
        this.supportDocLastYrAdvPrintedAsByteArray = supportDocLastYrAdvPrintedAsByteArray;
    }

    private Byte[] getSupportDocLastYrAdvTVAsByteArray() {
        return supportDocLastYrAdvTVAsByteArray;
    }

    private void setSupportDocLastYrAdvTVAsByteArray(Byte[] supportDocLastYrAdvTVAsByteArray) {
        this.supportDocLastYrAdvTVAsByteArray = supportDocLastYrAdvTVAsByteArray;
    }

    private Byte[] getSupportDocLastYrEventSponsorAsByteArray() {
        return supportDocLastYrEventSponsorAsByteArray;
    }

    private void setSupportDocLastYrEventSponsorAsByteArray(Byte[] supportDocLastYrEventSponsorAsByteArray) {
        this.supportDocLastYrEventSponsorAsByteArray = supportDocLastYrEventSponsorAsByteArray;
    }

    private Byte[] getSupportDocLastYrOtherAsByteArray() {
        return supportDocLastYrOtherAsByteArray;
    }

    private void setSupportDocLastYrOtherAsByteArray(Byte[] supportDocLastYrOtherAsByteArray) {
        this.supportDocLastYrOtherAsByteArray = supportDocLastYrOtherAsByteArray;
    }

    private Byte[] getSupportDocLastYrPrintedAsByteArray() {
        return supportDocLastYrPrintedAsByteArray;
    }

    private void setSupportDocLastYrPrintedAsByteArray(Byte[] supportDocLastYrPrintedAsByteArray) {
        this.supportDocLastYrPrintedAsByteArray = supportDocLastYrPrintedAsByteArray;
    }

    private Byte[] getSupportDocLastYrSocialMediaAsByteArray() {
        return supportDocLastYrSocialMediaAsByteArray;
    }

    private void setSupportDocLastYrSocialMediaAsByteArray(Byte[] supportDocLastYrSocialMediaAsByteArray) {
        this.supportDocLastYrSocialMediaAsByteArray = supportDocLastYrSocialMediaAsByteArray;
    }

    private Byte[] getSupportDocLastYrTradeshowAsByteArray() {
        return supportDocLastYrTradeshowAsByteArray;
    }

    private void setSupportDocLastYrTradeshowAsByteArray(Byte[] supportDocLastYrTradeshowAsByteArray) {
        this.supportDocLastYrTradeshowAsByteArray = supportDocLastYrTradeshowAsByteArray;
    }

    private Byte[] getSupportDocLastYrVideoAsByteArray() {
        return supportDocLastYrVideoAsByteArray;
    }

    private void setSupportDocLastYrVideoAsByteArray(Byte[] supportDocLastYrVideoAsByteArray) {
        this.supportDocLastYrVideoAsByteArray = supportDocLastYrVideoAsByteArray;
    }

    private Byte[] getSupportDocPrintedAsByteArray() {
        return supportDocPrintedAsByteArray;
    }

    private void setSupportDocPrintedAsByteArray(Byte[] supportDocPrintedAsByteArray) {
        this.supportDocPrintedAsByteArray = supportDocPrintedAsByteArray;
    }


    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocCurrentYrAdvPrinted() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocCurrentYrAdvPrintedAsByteArray);
    }

    public void setSupportDocCurrentYrAdvPrinted(HashSet<BlobNames> supportDocCurrentYrAdvPrinted) {
        this.supportDocCurrentYrAdvPrintedAsByteArray = TypeConversionUtils.serialize(supportDocCurrentYrAdvPrinted);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocCurrentYrAdvTV() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocCurrentYrAdvTVAsByteArray);
    }

    public void setSupportDocCurrentYrAdvTV(HashSet<BlobNames> supportDocCurrentYrAdvTV) {
        if (supportDocCurrentYrAdvTV == null) return;
        this.supportDocCurrentYrAdvTVAsByteArray = TypeConversionUtils.serialize(supportDocCurrentYrAdvTV);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocCurrentYrEventSponsor() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocCurrentYrEventSponsorAsByteArray);
    }

    public void setSupportDocCurrentYrEventSponsor(HashSet<BlobNames> supportDocCurrentYrEventSponsor) {
        this.supportDocCurrentYrEventSponsorAsByteArray = TypeConversionUtils.serialize(supportDocCurrentYrEventSponsor);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocCurrentYrOther() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocCurrentYrOtherAsByteArray);
    }

    public void setSupportDocCurrentYrOther(HashSet<BlobNames> supportDocCurrentYrOther) {
        this.supportDocCurrentYrOtherAsByteArray = TypeConversionUtils.serialize(supportDocCurrentYrOther);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocCurrentYrPrinted() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocCurrentYrPrintedAsByteArray);
    }

    public void setSupportDocCurrentYrPrinted(HashSet<BlobNames> supportDocCurrentYrPrinted) {
        this.supportDocCurrentYrPrintedAsByteArray = TypeConversionUtils.serialize(supportDocCurrentYrPrinted);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocCurrentYrSocialMedia() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocCurrentYrSocialMediaAsByteArray);
    }

    public void setSupportDocCurrentYrSocialMedia(HashSet<BlobNames> supportDocCurrentYrSocialMedia) {
        this.supportDocCurrentYrSocialMediaAsByteArray = TypeConversionUtils.serialize(supportDocCurrentYrSocialMedia);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocCurrentYrTradeshow() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocCurrentYrTradeshowAsByteArray);
    }

    public void setSupportDocCurrentYrTradeshow(HashSet<BlobNames> supportDocCurrentYrTradeshow) {
        this.supportDocCurrentYrTradeshowAsByteArray = TypeConversionUtils.serialize(supportDocCurrentYrTradeshow);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocCurrentYrVideo() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocCurrentYrVideoAsByteArray);
    }

    public void setSupportDocCurrentYrVideo(HashSet<BlobNames> supportDocCurrentYrVideo) {
        this.supportDocCurrentYrVideoAsByteArray = TypeConversionUtils.serialize(supportDocCurrentYrVideo);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocLastYrAdvPrinted() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocLastYrAdvPrintedAsByteArray);
    }

    public void setSupportDocLastYrAdvPrinted(HashSet<BlobNames> supportDocLastYrAdvPrinted) {
        this.supportDocLastYrAdvPrintedAsByteArray = TypeConversionUtils.serialize(supportDocLastYrAdvPrinted);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocLastYrAdvTV() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocLastYrAdvTVAsByteArray);
    }

    public void setSupportDocLastYrAdvTV(HashSet<BlobNames> supportDocLastYrAdvTV) {
        this.supportDocLastYrAdvTVAsByteArray = TypeConversionUtils.serialize(supportDocLastYrAdvTV);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocLastYrEventSponsor() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocLastYrEventSponsorAsByteArray);
    }

    public void setSupportDocLastYrEventSponsor(HashSet<BlobNames> supportDocLastYrEventSponsor) {
        this.supportDocLastYrEventSponsorAsByteArray = TypeConversionUtils.serialize(supportDocLastYrEventSponsor);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocLastYrOther() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocLastYrOtherAsByteArray);
    }

    public void setSupportDocLastYrOther(HashSet<BlobNames> supportDocLastYrOther) {
        this.supportDocLastYrOtherAsByteArray = TypeConversionUtils.serialize(supportDocLastYrOther);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocLastYrPrinted() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocLastYrPrintedAsByteArray);
    }

    public void setSupportDocLastYrPrinted(HashSet<BlobNames> supportDocLastYrPrinted) {
        this.supportDocLastYrPrintedAsByteArray = TypeConversionUtils.serialize(supportDocLastYrPrinted);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocLastYrSocialMedia() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocLastYrSocialMediaAsByteArray);
    }

    public void setSupportDocLastYrSocialMedia(HashSet<BlobNames> supportDocLastYrSocialMedia) {
        this.supportDocLastYrSocialMediaAsByteArray = TypeConversionUtils.serialize(supportDocLastYrSocialMedia);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocLastYrTradeshow() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocLastYrTradeshowAsByteArray);
    }

    public void setSupportDocLastYrTradeshow(HashSet<BlobNames> supportDocLastYrTradeshow) {
        this.supportDocLastYrTradeshowAsByteArray = TypeConversionUtils.serialize(supportDocLastYrTradeshow);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getSupportDocLastYrVideo() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(supportDocLastYrVideoAsByteArray);
    }

    public void setSupportDocLastYrVideo(HashSet<BlobNames> supportDocLastYrVideo) {
        this.supportDocLastYrVideoAsByteArray = TypeConversionUtils.serialize(supportDocLastYrVideo);
    }

    @Transient
    public BlobNames getSupportDocPrinted() {
        return (BlobNames) TypeConversionUtils.deserialize(supportDocPrintedAsByteArray);
    }

    public void setSupportDocPrinted(BlobNames supportDocPrinted) {
        this.supportDocPrintedAsByteArray = TypeConversionUtils.serialize(supportDocPrinted);
    }
}
