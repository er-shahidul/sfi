package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.web.common.models.datamodels.BlobNames;

import javax.validation.constraints.NotNull;
import java.util.Set;

public class SicCs9ViewModel extends BaseViewModel {
    private Integer id;
    private String currentYrDetailsAdvPrinted;
    private String currentYrDetailsAdvTV;
    private String currentYrDetailsEventSponsor;
    private String currentYrDetailsPrinted;
    private String currentYrDetailsSocialMedia;
    private String currentYrDetailsTradeshow;
    private String currentYrDetailsYrOther;
    private String currentYrDetailsYrVideo;
    private String lastYrDetailsAdvPrinted;
    private String lastYrDetailsAdvTV;
    private String lastYrDetailsEventSponsor;
    private String lastYrDetailsPrinted;
    private String lastYrDetailsSocialMedia;
    private String lastYrDetailsTradeshow;
    private String lastYrDetailsYrOther;
    private String lastYrDetailsYrVideo;
    private String sfiProgramOutlets;
    private Boolean activityCurrentYrAdvPrinted;
    private Boolean activityCurrentYrAdvTV;
    private Boolean activityCurrentYrEventSponsor;
    private Boolean activityCurrentYrOther;
    private Boolean activityCurrentYrPrinted;
    private Boolean activityCurrentYrSocialMedia;
    private Boolean activityCurrentYrTradeshow;
    private Boolean activityCurrentYrVideo;
    private Boolean activityLastYrAdvPrinted;
    private Boolean activityLastYrAdvTV;
    private Boolean activityLastYrEventSponsor;
    private Boolean activityLastYrOther;
    private Boolean activityLastYrPrinted;
    private Boolean activityLastYrSocialMedia;
    private Boolean activityLastYrTradeshow;
    private Boolean activityLastYrVideo;
    @NotNull(message = "{sic.cs9.promoteSFI}")
    private Boolean promoteSFI;
    private Set<BlobNames> supportDocCurrentYrAdvPrinted;
    private Set<BlobNames> supportDocCurrentYrAdvTV;
    private Set<BlobNames> supportDocCurrentYrEventSponsor;
    private Set<BlobNames> supportDocCurrentYrOther;
    private Set<BlobNames> supportDocCurrentYrPrinted;
    private Set<BlobNames> supportDocCurrentYrSocialMedia;
    private Set<BlobNames> supportDocCurrentYrTradeshow;
    private Set<BlobNames> supportDocCurrentYrVideo;
    private Set<BlobNames> supportDocLastYrAdvPrinted;
    private Set<BlobNames> supportDocLastYrAdvTV;
    private Set<BlobNames> supportDocLastYrEventSponsor;
    private Set<BlobNames> supportDocLastYrOther;
    private Set<BlobNames> supportDocLastYrPrinted;
    private Set<BlobNames> supportDocLastYrSocialMedia;
    private Set<BlobNames> supportDocLastYrTradeshow;
    private Set<BlobNames> supportDocLastYrVideo;
    private BlobNames supportDocPrinted;

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

    public Set<BlobNames> getSupportDocCurrentYrAdvPrinted() {
        return supportDocCurrentYrAdvPrinted;
    }

    public void setSupportDocCurrentYrAdvPrinted(Set<BlobNames> supportDocCurrentYrAdvPrinted) {
        this.supportDocCurrentYrAdvPrinted = supportDocCurrentYrAdvPrinted;
    }

    public Set<BlobNames> getSupportDocCurrentYrAdvTV() {
        return supportDocCurrentYrAdvTV;
    }

    public void setSupportDocCurrentYrAdvTV(Set<BlobNames> supportDocCurrentYrAdvTV) {
        this.supportDocCurrentYrAdvTV = supportDocCurrentYrAdvTV;
    }

    public Set<BlobNames> getSupportDocCurrentYrEventSponsor() {
        return supportDocCurrentYrEventSponsor;
    }

    public void setSupportDocCurrentYrEventSponsor(Set<BlobNames> supportDocCurrentYrEventSponsor) {
        this.supportDocCurrentYrEventSponsor = supportDocCurrentYrEventSponsor;
    }

    public Set<BlobNames> getSupportDocCurrentYrOther() {
        return supportDocCurrentYrOther;
    }

    public void setSupportDocCurrentYrOther(Set<BlobNames> supportDocCurrentYrOther) {
        this.supportDocCurrentYrOther = supportDocCurrentYrOther;
    }

    public Set<BlobNames> getSupportDocCurrentYrPrinted() {
        return supportDocCurrentYrPrinted;
    }

    public void setSupportDocCurrentYrPrinted(Set<BlobNames> supportDocCurrentYrPrinted) {
        this.supportDocCurrentYrPrinted = supportDocCurrentYrPrinted;
    }

    public Set<BlobNames> getSupportDocCurrentYrSocialMedia() {
        return supportDocCurrentYrSocialMedia;
    }

    public void setSupportDocCurrentYrSocialMedia(Set<BlobNames> supportDocCurrentYrSocialMedia) {
        this.supportDocCurrentYrSocialMedia = supportDocCurrentYrSocialMedia;
    }

    public Set<BlobNames> getSupportDocCurrentYrTradeshow() {
        return supportDocCurrentYrTradeshow;
    }

    public void setSupportDocCurrentYrTradeshow(Set<BlobNames> supportDocCurrentYrTradeshow) {
        this.supportDocCurrentYrTradeshow = supportDocCurrentYrTradeshow;
    }

    public Set<BlobNames> getSupportDocCurrentYrVideo() {
        return supportDocCurrentYrVideo;
    }

    public void setSupportDocCurrentYrVideo(Set<BlobNames> supportDocCurrentYrVideo) {
        this.supportDocCurrentYrVideo = supportDocCurrentYrVideo;
    }

    public Set<BlobNames> getSupportDocLastYrAdvPrinted() {
        return supportDocLastYrAdvPrinted;
    }

    public void setSupportDocLastYrAdvPrinted(Set<BlobNames> supportDocLastYrAdvPrinted) {
        this.supportDocLastYrAdvPrinted = supportDocLastYrAdvPrinted;
    }

    public Set<BlobNames> getSupportDocLastYrAdvTV() {
        return supportDocLastYrAdvTV;
    }

    public void setSupportDocLastYrAdvTV(Set<BlobNames> supportDocLastYrAdvTV) {
        this.supportDocLastYrAdvTV = supportDocLastYrAdvTV;
    }

    public Set<BlobNames> getSupportDocLastYrEventSponsor() {
        return supportDocLastYrEventSponsor;
    }

    public void setSupportDocLastYrEventSponsor(Set<BlobNames> supportDocLastYrEventSponsor) {
        this.supportDocLastYrEventSponsor = supportDocLastYrEventSponsor;
    }

    public Set<BlobNames> getSupportDocLastYrOther() {
        return supportDocLastYrOther;
    }

    public void setSupportDocLastYrOther(Set<BlobNames> supportDocLastYrOther) {
        this.supportDocLastYrOther = supportDocLastYrOther;
    }

    public Set<BlobNames> getSupportDocLastYrPrinted() {
        return supportDocLastYrPrinted;
    }

    public void setSupportDocLastYrPrinted(Set<BlobNames> supportDocLastYrPrinted) {
        this.supportDocLastYrPrinted = supportDocLastYrPrinted;
    }

    public Set<BlobNames> getSupportDocLastYrSocialMedia() {
        return supportDocLastYrSocialMedia;
    }

    public void setSupportDocLastYrSocialMedia(Set<BlobNames> supportDocLastYrSocialMedia) {
        this.supportDocLastYrSocialMedia = supportDocLastYrSocialMedia;
    }

    public Set<BlobNames> getSupportDocLastYrTradeshow() {
        return supportDocLastYrTradeshow;
    }

    public void setSupportDocLastYrTradeshow(Set<BlobNames> supportDocLastYrTradeshow) {
        this.supportDocLastYrTradeshow = supportDocLastYrTradeshow;
    }

    public Set<BlobNames> getSupportDocLastYrVideo() {
        return supportDocLastYrVideo;
    }

    public void setSupportDocLastYrVideo(Set<BlobNames> supportDocLastYrVideo) {
        this.supportDocLastYrVideo = supportDocLastYrVideo;
    }

    public BlobNames getSupportDocPrinted() {
        return supportDocPrinted;
    }

    public void setSupportDocPrinted(BlobNames supportDocPrinted) {
        this.supportDocPrinted = supportDocPrinted;
    }
}
