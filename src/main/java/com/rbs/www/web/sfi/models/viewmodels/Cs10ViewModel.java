package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

import java.util.Date;
import java.util.Set;

public class Cs10ViewModel extends BaseViewModel {
    private Integer id;
    private Boolean acknowledge;
    private Boolean legalComplianceOutside;
    private Boolean legalComplianceUsCanada;
    private Date createdAt;
    private Date submittedAt;
    private Date updatedAt;
    private Set<Integer>biodiversityItems;
    private Set<Integer>biodiversityManagementItems;
    private Set<Integer>biodiversityNatureItems;
    private Set<Integer>biodiversityStateForestItems;
    private Set<Integer>biodiversityTrainingItems;
    private Set<Integer> legalComplianceOutsideItems;
    private String biodiversityFiberSourcing;
    private String biodiversityManagement;
    private String biodiversityTraining;
    private String legalComplianceOutsideOtherExplain;
    private String trainedWoodProducersChanged;

    private String biodiversityManagementMechanismDescribe;
    private String biodiversityTrainingMechanismDescribe;
    private String biodiversityTrainingNoDescribe;
    private String biodiversityManagementNoDescribe;
    private String biodiversityMechanismDescribe;
    private String biodiversityNoDescribe;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Set<Integer> getBiodiversityItems() {
        return biodiversityItems;
    }

    public void setBiodiversityItems(Set<Integer> biodiversityItems) {
        this.biodiversityItems = biodiversityItems;
    }

    public Set<Integer> getBiodiversityManagementItems() {
        return biodiversityManagementItems;
    }

    public void setBiodiversityManagementItems(Set<Integer> biodiversityManagementItems) {
        this.biodiversityManagementItems = biodiversityManagementItems;
    }

    public Set<Integer> getBiodiversityNatureItems() {
        return biodiversityNatureItems;
    }

    public void setBiodiversityNatureItems(Set<Integer> biodiversityNatureItems) {
        this.biodiversityNatureItems = biodiversityNatureItems;
    }

    public Set<Integer> getBiodiversityStateForestItems() {
        return biodiversityStateForestItems;
    }

    public void setBiodiversityStateForestItems(Set<Integer> biodiversityStateForestItems) {
        this.biodiversityStateForestItems = biodiversityStateForestItems;
    }

    public Set<Integer> getBiodiversityTrainingItems() {
        return biodiversityTrainingItems;
    }

    public void setBiodiversityTrainingItems(Set<Integer> biodiversityTrainingItems) {
        this.biodiversityTrainingItems = biodiversityTrainingItems;
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
