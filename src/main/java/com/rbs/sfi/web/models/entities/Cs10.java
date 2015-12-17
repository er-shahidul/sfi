package com.rbs.sfi.web.models.entities;

import com.rbs.sfi.common.models.BaseEntityModel;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs10 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs10_acknowledge", nullable = true)
    private Boolean acknowledge;

    @Column(name = "cs10_legalComplianceOutside", nullable = true)
    private Boolean legalComplianceOutside;

    @Column(name = "cs10_legalComplianceUsCanada", nullable = true)
    private Boolean legalComplianceUsCanada;

    @Column(name = "created_at", nullable = true)
    private Date createdAt;

    @Column(name = "submitted_at", nullable = true)
    private Date submittedAt;

    @Column(name = "updated_at", nullable = true)
    private Date updatedAt;

    @Column(name = "cs10_biodiversityItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer>biodiversityItems;

    @Column(name = "cs10_biodiversityManagementItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer>biodiversityManagementItems;

    @Column(name = "cs10_biodiversityNatureItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer>biodiversityNatureItems;

    @Column(name = "cs10_biodiversityStateForestItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer>biodiversityStateForestItems;

    @Column(name = "cs10_biodiversityTrainingItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer>biodiversityTrainingItems;

    @Column(name = "cs10_legalComplianceOutsideItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> legalComplianceOutsideItems;

    @Column(name = "cs10_biodiversityFiberSourcing", nullable = true)
    private String biodiversityFiberSourcing;

    @Column(name = "cs10_biodiversityManagement", nullable = true)
    private String biodiversityManagement;

    @Column(name = "cs10_biodiversityTraining", nullable = true)
    private String biodiversityTraining;

    @Column(name = "cs10_legalComplianceOutsideOtherExplain", nullable = true)
    private String legalComplianceOutsideOtherExplain;

    @Column(name = "cs10_trainedWoodProducersChanged", nullable = true)
    private String trainedWoodProducersChanged;

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
        addAll(this.biodiversityItems, biodiversityItems);
    }

    public Set<Integer> getBiodiversityManagementItems() {
        return biodiversityManagementItems;
    }

    public void setBiodiversityManagementItems(Set<Integer> biodiversityManagementItems) {
        addAll(this.biodiversityManagementItems, biodiversityManagementItems);
    }

    public Set<Integer> getBiodiversityNatureItems() {
        return biodiversityNatureItems;
    }

    public void setBiodiversityNatureItems(Set<Integer> biodiversityNatureItems) {
        addAll(this.biodiversityNatureItems, biodiversityNatureItems);
    }

    public Set<Integer> getBiodiversityStateForestItems() {
        return biodiversityStateForestItems;
    }

    public void setBiodiversityStateForestItems(Set<Integer> biodiversityStateForestItems) {
        addAll(this.biodiversityStateForestItems, biodiversityStateForestItems);
    }

    public Set<Integer> getBiodiversityTrainingItems() {
        return biodiversityTrainingItems;
    }

    public void setBiodiversityTrainingItems(Set<Integer> biodiversityTrainingItems) {
        addAll(this.biodiversityTrainingItems, biodiversityTrainingItems);
    }

    public Set<Integer> getLegalComplianceOutsideItems() {
        return legalComplianceOutsideItems;
    }

    public void setLegalComplianceOutsideItems(Set<Integer> legalComplianceOutsideItems) {
        addAll(this.legalComplianceOutsideItems, legalComplianceOutsideItems);
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
}
