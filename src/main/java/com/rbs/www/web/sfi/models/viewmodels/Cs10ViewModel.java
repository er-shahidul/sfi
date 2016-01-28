package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.SpELAssert;

import java.util.Date;
import java.util.Set;

@SpELAssert.List({
        @SpELAssert(value = "biodiversityNoDescribe == null", applyIf = "biodiversityFiberSourcing == 3", message = "biodiversityNoDescribe Should not be null", property = "biodiversityNoDescribe"),
})
public class Cs10ViewModel extends BaseViewModel {
    private Integer id;
    private Boolean acknowledge;
    @SpELAssert(value = "#this == null", message = "legalComplianceOutside Should not be null")
    private Boolean legalComplianceOutside;
    private Boolean legalComplianceUsCanada;
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
    private String biodiversityFiberSourcing;
    private String biodiversityManagement;
    private String biodiversityTraining;
    private String legalComplianceOutsideOtherExplain;
    @SpELAssert(value = "#this == null", message = "trainedWoodProducersChanged Should not be null")
    private String trainedWoodProducersChanged;

    private String biodiversityManagementMechanismDescribe;
    private String biodiversityTrainingMechanismDescribe;
    private String biodiversityTrainingNoDescribe;
    private String biodiversityManagementNoDescribe;
    private String biodiversityMechanismDescribe;
    private String biodiversityNoDescribe;

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

    public Boolean getLegalComplianceOutside() {
        return legalComplianceOutside;
    }

    public void setLegalComplianceOutside(Boolean legalComplianceOutside) {
        this.legalComplianceOutside = legalComplianceOutside;
    }

    public Boolean getLegalComplianceUsCanada() {
        return legalComplianceUsCanada;
    }

    public void setLegalComplianceUsCanada(Boolean legalComplianceUsCanada) {
        this.legalComplianceUsCanada = legalComplianceUsCanada;
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

    public String getBiodiversityFiberSourcing() {
        return biodiversityFiberSourcing;
    }

    public void setBiodiversityFiberSourcing(String biodiversityFiberSourcing) {
        this.biodiversityFiberSourcing = biodiversityFiberSourcing;
    }

    public String getBiodiversityManagement() {
        return biodiversityManagement;
    }

    public void setBiodiversityManagement(String biodiversityManagement) {
        this.biodiversityManagement = biodiversityManagement;
    }

    public String getBiodiversityTraining() {
        return biodiversityTraining;
    }

    public void setBiodiversityTraining(String biodiversityTraining) {
        this.biodiversityTraining = biodiversityTraining;
    }

    public String getLegalComplianceOutsideOtherExplain() {
        return legalComplianceOutsideOtherExplain;
    }

    public void setLegalComplianceOutsideOtherExplain(String legalComplianceOutsideOtherExplain) {
        this.legalComplianceOutsideOtherExplain = legalComplianceOutsideOtherExplain;
    }

    public String getTrainedWoodProducersChanged() {
        return trainedWoodProducersChanged;
    }

    public void setTrainedWoodProducersChanged(String trainedWoodProducersChanged) {
        this.trainedWoodProducersChanged = trainedWoodProducersChanged;
    }

    public String getBiodiversityManagementMechanismDescribe() {
        return biodiversityManagementMechanismDescribe;
    }

    public void setBiodiversityManagementMechanismDescribe(String biodiversityManagementMechanismDescribe) {
        this.biodiversityManagementMechanismDescribe = biodiversityManagementMechanismDescribe;
    }

    public String getBiodiversityTrainingMechanismDescribe() {
        return biodiversityTrainingMechanismDescribe;
    }

    public void setBiodiversityTrainingMechanismDescribe(String biodiversityTrainingMechanismDescribe) {
        this.biodiversityTrainingMechanismDescribe = biodiversityTrainingMechanismDescribe;
    }

    public String getBiodiversityTrainingNoDescribe() {
        return biodiversityTrainingNoDescribe;
    }

    public void setBiodiversityTrainingNoDescribe(String biodiversityTrainingNoDescribe) {
        this.biodiversityTrainingNoDescribe = biodiversityTrainingNoDescribe;
    }

    public String getBiodiversityManagementNoDescribe() {
        return biodiversityManagementNoDescribe;
    }

    public void setBiodiversityManagementNoDescribe(String biodiversityManagementNoDescribe) {
        this.biodiversityManagementNoDescribe = biodiversityManagementNoDescribe;
    }

    public String getBiodiversityMechanismDescribe() {
        return biodiversityMechanismDescribe;
    }

    public void setBiodiversityMechanismDescribe(String biodiversityMechanismDescribe) {
        this.biodiversityMechanismDescribe = biodiversityMechanismDescribe;
    }

    public String getBiodiversityNoDescribe() {
        return biodiversityNoDescribe;
    }

    public void setBiodiversityNoDescribe(String biodiversityNoDescribe) {
        this.biodiversityNoDescribe = biodiversityNoDescribe;
    }
}
