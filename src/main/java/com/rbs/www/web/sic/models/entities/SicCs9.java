package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.web.common.models.datamodels.DocNames;
import org.apache.commons.lang3.SerializationUtils;

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
    private String currentYrDetailsAdvPrinted;

    @Column(name = "cs9_currentYrDetailsAdvTV", nullable = true)
    private String currentYrDetailsAdvTV;

    @Column(name = "cs9_currentYrDetailsEventSponsor", nullable = true)
    private String currentYrDetailsEventSponsor;

    @Column(name = "cs9_currentYrDetailsPrinted", nullable = true)
    private String currentYrDetailsPrinted;

    @Column(name = "cs9_currentYrDetailsSocialMedia", nullable = true)
    private String currentYrDetailsSocialMedia;

    @Column(name = "cs9_currentYrDetailsTradeshow", nullable = true)
    private String currentYrDetailsTradeshow;

    @Column(name = "cs9_currentYrDetailsYrOther", nullable = true)
    private String currentYrDetailsYrOther;

    @Column(name = "cs9_currentYrDetailsYrVideo", nullable = true)
    private String currentYrDetailsYrVideo;

    @Column(name = "cs9_lastYrDetailsAdvPrinted", nullable = true)
    private String lastYrDetailsAdvPrinted;

    @Column(name = "cs9_lastYrDetailsAdvTV", nullable = true)
    private String lastYrDetailsAdvTV;

    @Column(name = "cs9_lastYrDetailsEventSponsor", nullable = true)
    private String lastYrDetailsEventSponsor;

    @Column(name = "cs9_lastYrDetailsPrinted", nullable = true)
    private String lastYrDetailsPrinted;

    @Column(name = "cs9_lastYrDetailsSocialMedia", nullable = true)
    private String lastYrDetailsSocialMedia;

    @Column(name = "cs9_lastYrDetailsTradeshow", nullable = true)
    private String lastYrDetailsTradeshow;

    @Column(name = "cs9_lastYrDetailsYrOther", nullable = true)
    private String lastYrDetailsYrOther;

    @Column(name = "cs9_lastYrDetailsYrVideo", nullable = true)
    private String lastYrDetailsYrVideo;

    @Column(name = "cs9_sfiProgramOutlets", nullable = true)
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
    public Set<DocNames> getSupportDocCurrentYrAdvPrinted() {
        if (supportDocCurrentYrAdvPrintedAsByteArray == null) return null;
        return (Set<DocNames>) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocCurrentYrAdvPrintedAsByteArray));
    }

    public void setSupportDocCurrentYrAdvPrinted(HashSet<DocNames> supportDocCurrentYrAdvPrinted) {
        if (supportDocCurrentYrAdvPrinted == null) return;
        this.supportDocCurrentYrAdvPrintedAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocCurrentYrAdvPrinted));
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<DocNames> getSupportDocCurrentYrAdvTV() {
        if (supportDocCurrentYrAdvTVAsByteArray == null) return null;
        return (Set<DocNames>) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocCurrentYrAdvTVAsByteArray));
    }

    public void setSupportDocCurrentYrAdvTV(HashSet<DocNames> supportDocCurrentYrAdvTV) {
        if (supportDocCurrentYrAdvTV == null) return;
        this.supportDocCurrentYrAdvTVAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocCurrentYrAdvTV));
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<DocNames> getSupportDocCurrentYrEventSponsor() {
        if (supportDocCurrentYrEventSponsorAsByteArray == null) return null;
        return (Set<DocNames>) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocCurrentYrEventSponsorAsByteArray));
    }

    public void setSupportDocCurrentYrEventSponsor(HashSet<DocNames> supportDocCurrentYrEventSponsor) {
        if (supportDocCurrentYrEventSponsor == null) return;
        this.supportDocCurrentYrEventSponsorAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocCurrentYrEventSponsor));
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<DocNames> getSupportDocCurrentYrOther() {
        if (supportDocCurrentYrOtherAsByteArray == null) return null;
        return (Set<DocNames>) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocCurrentYrOtherAsByteArray));
    }

    public void setSupportDocCurrentYrOther(HashSet<DocNames> supportDocCurrentYrOther) {
        if (supportDocCurrentYrOther == null) return;
        this.supportDocCurrentYrOtherAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocCurrentYrOther));
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<DocNames> getSupportDocCurrentYrPrinted() {
        if (supportDocCurrentYrPrintedAsByteArray == null) return null;
        return (Set<DocNames>) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocCurrentYrPrintedAsByteArray));
    }

    public void setSupportDocCurrentYrPrinted(HashSet<DocNames> supportDocCurrentYrPrinted) {
        if (supportDocCurrentYrPrinted == null) return;
        this.supportDocCurrentYrPrintedAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocCurrentYrPrinted));
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<DocNames> getSupportDocCurrentYrSocialMedia() {
        if (supportDocCurrentYrSocialMediaAsByteArray == null) return null;
        return (Set<DocNames>) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocCurrentYrSocialMediaAsByteArray));
    }

    public void setSupportDocCurrentYrSocialMedia(HashSet<DocNames> supportDocCurrentYrSocialMedia) {
        if (supportDocCurrentYrSocialMedia == null) return;
        this.supportDocCurrentYrSocialMediaAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocCurrentYrSocialMedia));
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<DocNames> getSupportDocCurrentYrTradeshow() {
        if (supportDocCurrentYrTradeshowAsByteArray == null) return null;
        return (Set<DocNames>) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocCurrentYrTradeshowAsByteArray));
    }

    public void setSupportDocCurrentYrTradeshow(HashSet<DocNames> supportDocCurrentYrTradeshow) {
        if (supportDocCurrentYrTradeshow == null) return;
        this.supportDocCurrentYrTradeshowAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocCurrentYrTradeshow));
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<DocNames> getSupportDocCurrentYrVideo() {
        if (supportDocCurrentYrVideoAsByteArray == null) return null;
        return (Set<DocNames>) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocCurrentYrVideoAsByteArray));
    }

    public void setSupportDocCurrentYrVideo(HashSet<DocNames> supportDocCurrentYrVideo) {
        if (supportDocCurrentYrVideo == null) return;
        this.supportDocCurrentYrVideoAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocCurrentYrVideo));
    }

    @Transient
    public DocNames getSupportDocLastYrAdvPrinted() {
        if (supportDocLastYrAdvPrintedAsByteArray == null) return null;
        return (DocNames) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocLastYrAdvPrintedAsByteArray));
    }

    public void setSupportDocLastYrAdvPrinted(DocNames supportDocLastYrAdvPrinted) {
        if (supportDocLastYrAdvPrinted == null) return;
        this.supportDocLastYrAdvPrintedAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocLastYrAdvPrinted));
    }

    @Transient
    public DocNames getSupportDocLastYrAdvTV() {
        if (supportDocLastYrAdvTVAsByteArray == null) return null;
        return (DocNames) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocLastYrAdvTVAsByteArray));
    }

    public void setSupportDocLastYrAdvTV(DocNames supportDocLastYrAdvTV) {
        if (supportDocLastYrAdvTV == null) return;
        this.supportDocLastYrAdvTVAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocLastYrAdvTV));
    }

    @Transient
    public DocNames getSupportDocLastYrEventSponsor() {
        if (supportDocLastYrEventSponsorAsByteArray == null) return null;
        return (DocNames) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocLastYrEventSponsorAsByteArray));
    }

    public void setSupportDocLastYrEventSponsor(DocNames supportDocLastYrEventSponsor) {
        if (supportDocLastYrEventSponsor == null) return;
        this.supportDocLastYrEventSponsorAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocLastYrEventSponsor));
    }

    @Transient
    public DocNames getSupportDocLastYrOther() {
        if (supportDocLastYrOtherAsByteArray == null) return null;
        return (DocNames) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocLastYrOtherAsByteArray));
    }

    public void setSupportDocLastYrOther(DocNames supportDocLastYrOther) {
        if (supportDocLastYrOther == null) return;
        this.supportDocLastYrOtherAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocLastYrOther));
    }

    @Transient
    public DocNames getSupportDocLastYrPrinted() {
        if (supportDocLastYrPrintedAsByteArray == null) return null;
        return (DocNames) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocLastYrPrintedAsByteArray));
    }

    public void setSupportDocLastYrPrinted(DocNames supportDocLastYrPrinted) {
        if (supportDocLastYrPrinted == null) return;
        this.supportDocLastYrPrintedAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocLastYrPrinted));
    }

    @Transient
    public DocNames getSupportDocLastYrSocialMedia() {
        if (supportDocLastYrSocialMediaAsByteArray == null) return null;
        return (DocNames) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocLastYrSocialMediaAsByteArray));
    }

    public void setSupportDocLastYrSocialMedia(DocNames supportDocLastYrSocialMedia) {
        if (supportDocLastYrSocialMedia == null) return;
        this.supportDocLastYrSocialMediaAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocLastYrSocialMedia));
    }

    @Transient
    public DocNames getSupportDocLastYrTradeshow() {
        if (supportDocLastYrTradeshowAsByteArray == null) return null;
        return (DocNames) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocLastYrTradeshowAsByteArray));
    }

    public void setSupportDocLastYrTradeshow(DocNames supportDocLastYrTradeshow) {
        if (supportDocLastYrTradeshow == null) return;
        this.supportDocLastYrTradeshowAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocLastYrTradeshow));
    }

    @Transient
    public DocNames getSupportDocLastYrVideo() {
        if (supportDocLastYrVideoAsByteArray == null) return null;
        return (DocNames) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocLastYrVideoAsByteArray));
    }

    public void setSupportDocLastYrVideo(DocNames supportDocLastYrVideo) {
        if (supportDocLastYrVideo == null) return;
        this.supportDocLastYrVideoAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocLastYrVideo));
    }

    @Transient
    public DocNames getSupportDocPrinted() {
        if (supportDocPrintedAsByteArray == null) return null;
        return (DocNames) SerializationUtils
                .deserialize(TypeConversionUtils
                        .toPrimitiveType(supportDocPrintedAsByteArray));
    }

    public void setSupportDocPrinted(DocNames supportDocPrinted) {
        if (supportDocPrinted == null) return;
        this.supportDocPrintedAsByteArray = TypeConversionUtils
                .toObjectType(SerializationUtils.serialize(supportDocPrinted));
    }
}
