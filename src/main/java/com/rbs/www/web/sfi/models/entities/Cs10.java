package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;

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

    @Column(name = "created_at", nullable = true)
    private Date createdAt;

    @Column(name = "submitted_at", nullable = true)
    private Date submittedAt;

    @Column(name = "updated_at", nullable = true)
    private Date updatedAt;

    @Column(name = "cs10_biodiversityItems1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> biodiversityItems1;

    @Column(name = "cs10_biodiversityItems2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> biodiversityItems2;

    @Column(name = "cs10_biodiversityManagementItems1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> biodiversityManagementItems1;

    @Column(name = "cs10_biodiversityManagementItems2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> biodiversityManagementItems2;

    @Column(name = "cs10_biodiversityNatureItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> biodiversityNatureItems;

    @Column(name = "cs10_biodiversityStateForestItems1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> biodiversityStateForestItems1;

    @Column(name = "cs10_biodiversityStateForestItems2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> biodiversityStateForestItems2;

    @Column(name = "cs10_biodiversityTrainingItems1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> biodiversityTrainingItems1;

    @Column(name = "cs10_biodiversityTrainingItems2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> biodiversityTrainingItems2;

    @Column(name = "cs10_legalComplianceOutsideItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> legalComplianceOutsideItems;

    @Column(name = "cs10_biodiversityTrainingNoDescribe", nullable = true)
    @Type(type="text")
    private String biodiversityTrainingNoDescribe;

    @OneToMany(targetEntity = SfiPpFormStoryCs10.class, fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SfiPpFormStoryCs10> stories;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<SfiPpFormStoryCs10> getStories() {
        return stories;
    }

    public void setStories(Set<SfiPpFormStoryCs10> stories) {
        addAll(this.stories, stories);
    }

    public Set<Integer> getBiodiversityItems1() {
        return biodiversityItems1;
    }

    public void setBiodiversityItems1(Set<Integer> biodiversityItems1) {
        addAll(this.biodiversityItems1, biodiversityItems1);
    }

    public Set<Integer> getBiodiversityItems2() {
        return biodiversityItems2;
    }

    public void setBiodiversityItems2(Set<Integer> biodiversityItems2) {
        addAll(this.biodiversityItems2, biodiversityItems2);
    }

    public Set<Integer> getBiodiversityManagementItems1() {
        return biodiversityManagementItems1;
    }

    public void setBiodiversityManagementItems1(Set<Integer> biodiversityManagementItems1) {
        addAll(this.biodiversityManagementItems1, biodiversityManagementItems1);
    }

    public Set<Integer> getBiodiversityManagementItems2() {
        return biodiversityManagementItems2;
    }

    public void setBiodiversityManagementItems2(Set<Integer> biodiversityManagementItems2) {
        addAll(this.biodiversityManagementItems2, biodiversityManagementItems2);
    }

    public Set<Integer> getBiodiversityStateForestItems1() {
        return biodiversityStateForestItems1;
    }

    public void setBiodiversityStateForestItems1(Set<Integer> biodiversityStateForestItems1) {
        addAll(this.biodiversityStateForestItems1, biodiversityStateForestItems1);
    }

    public Set<Integer> getBiodiversityStateForestItems2() {
        return biodiversityStateForestItems2;
    }

    public void setBiodiversityStateForestItems2(Set<Integer> biodiversityStateForestItems2) {
        addAll(this.biodiversityStateForestItems2, biodiversityStateForestItems2);
    }

    public Set<Integer> getBiodiversityTrainingItems1() {
        return biodiversityTrainingItems1;
    }

    public void setBiodiversityTrainingItems1(Set<Integer> biodiversityTrainingItems1) {
        addAll(this.biodiversityTrainingItems1, biodiversityTrainingItems1);
    }

    public Set<Integer> getBiodiversityTrainingItems2() {
        return biodiversityTrainingItems2;
    }

    public void setBiodiversityTrainingItems2(Set<Integer> biodiversityTrainingItems2) {
        addAll(this.biodiversityTrainingItems2, biodiversityTrainingItems2);
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
        addAll(this.biodiversityNatureItems, biodiversityNatureItems);
    }

    public Set<Integer> getLegalComplianceOutsideItems() {
        return legalComplianceOutsideItems;
    }

    public void setLegalComplianceOutsideItems(Set<Integer> legalComplianceOutsideItems) {
        addAll(this.legalComplianceOutsideItems, legalComplianceOutsideItems);
    }

    public String getBiodiversityTrainingNoDescribe() {
        return biodiversityTrainingNoDescribe;
    }

    public void setBiodiversityTrainingNoDescribe(String biodiversityTrainingNoDescribe) {
        this.biodiversityTrainingNoDescribe = biodiversityTrainingNoDescribe;
    }
}
