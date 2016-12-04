package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import java.util.Date;
import java.util.Set;

public class Cs10ViewModel extends BaseViewModel {
    private Integer id;
    private Boolean acknowledge;
    private Date createdAt;
    private Date submittedAt;
    private Date updatedAt;
    private Set<Integer> biodiversityItems1;
    private Set<Integer> biodiversityItems2;
    private Set<Integer> biodiversityManagementItems1;
    private Set<Integer> biodiversityManagementItems2;
    private Set<Integer> biodiversityNatureItems;
    private Set<Integer> biodiversityStateForestItems1;
    private Set<Integer> biodiversityStateForestItems2;
    private Set<Integer> biodiversityTrainingItems1;
    private Set<Integer> biodiversityTrainingItems2;
    private Set<Integer> legalComplianceOutsideItems;

    private String biodiversityTrainingNoDescribe;

    private Set<SfiPpFormStoryCs10ViewModel> stories;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<SfiPpFormStoryCs10ViewModel> getStories() {
        return stories;
    }

    public void setStories(Set<SfiPpFormStoryCs10ViewModel> stories) {
        this.stories = stories;
    }

    public Set<Integer> getBiodiversityItems1() {
        return biodiversityItems1;
    }

    public void setBiodiversityItems1(Set<Integer> biodiversityItems1) {
        this.biodiversityItems1 = biodiversityItems1;
    }

    public Set<Integer> getBiodiversityItems2() {
        return biodiversityItems2;
    }

    public void setBiodiversityItems2(Set<Integer> biodiversityItems2) {
        this.biodiversityItems2 = biodiversityItems2;
    }

    public Set<Integer> getBiodiversityManagementItems1() {
        return biodiversityManagementItems1;
    }

    public void setBiodiversityManagementItems1(Set<Integer> biodiversityManagementItems1) {
        this.biodiversityManagementItems1 = biodiversityManagementItems1;
    }

    public Set<Integer> getBiodiversityManagementItems2() {
        return biodiversityManagementItems2;
    }

    public void setBiodiversityManagementItems2(Set<Integer> biodiversityManagementItems2) {
        this.biodiversityManagementItems2 = biodiversityManagementItems2;
    }

    public Set<Integer> getBiodiversityStateForestItems1() {
        return biodiversityStateForestItems1;
    }

    public void setBiodiversityStateForestItems1(Set<Integer> biodiversityStateForestItems1) {
        this.biodiversityStateForestItems1 = biodiversityStateForestItems1;
    }

    public Set<Integer> getBiodiversityStateForestItems2() {
        return biodiversityStateForestItems2;
    }

    public void setBiodiversityStateForestItems2(Set<Integer> biodiversityStateForestItems2) {
        this.biodiversityStateForestItems2 = biodiversityStateForestItems2;
    }

    public Set<Integer> getBiodiversityTrainingItems1() {
        return biodiversityTrainingItems1;
    }

    public void setBiodiversityTrainingItems1(Set<Integer> biodiversityTrainingItems1) {
        this.biodiversityTrainingItems1 = biodiversityTrainingItems1;
    }

    public Set<Integer> getBiodiversityTrainingItems2() {
        return biodiversityTrainingItems2;
    }

    public void setBiodiversityTrainingItems2(Set<Integer> biodiversityTrainingItems2) {
        this.biodiversityTrainingItems2 = biodiversityTrainingItems2;
    }

    public Boolean getAcknowledge() {
        return acknowledge;
    }

    public void setAcknowledge(Boolean acknowledge) {
        this.acknowledge = acknowledge;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(Date submittedAt) {
        this.submittedAt = submittedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Set<Integer> getBiodiversityNatureItems() {
        return biodiversityNatureItems;
    }

    public void setBiodiversityNatureItems(Set<Integer> biodiversityNatureItems) {
        this.biodiversityNatureItems = biodiversityNatureItems;
    }

    public Set<Integer> getLegalComplianceOutsideItems() {
        return legalComplianceOutsideItems;
    }

    public void setLegalComplianceOutsideItems(Set<Integer> legalComplianceOutsideItems) {
        this.legalComplianceOutsideItems = legalComplianceOutsideItems;
    }

    public String getBiodiversityTrainingNoDescribe() {
        return biodiversityTrainingNoDescribe;
    }

    public void setBiodiversityTrainingNoDescribe(String biodiversityTrainingNoDescribe) {
        this.biodiversityTrainingNoDescribe = biodiversityTrainingNoDescribe;
    }
}
