package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs9 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs9_acknowledge", nullable = true)
    private Boolean acknowledge;

    @Column(name = "cs9_conservationBiodiversity413Items", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> conservationBiodiversity413Items;

    @Column(name = "cs9_conservationBiodiversity414Items", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> conservationBiodiversity414Items;

    @Column(name = "cs9_indigenousPeoplesForestItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> indigenousPeoplesForestItems;

    @Column(name = "cs9_indigenousPeoplesPrivateItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> indigenousPeoplesPrivateItems;

    @Column(name = "cs9_indigenousPeoplesPublicItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> indigenousPeoplesPublicItems;

    @Column(name = "cs9_trainingEducationItems", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> trainingEducationItems;

    @OneToMany(targetEntity = SfiPpFormStory.class, fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SfiPpFormStory> stories;

    @Column(name = "cs9_protectionMaintenanceWaterResItems1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> protectionMaintenanceWaterResItems1;
    @Column(name = "cs9_protectionMaintenanceWaterResItems2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> protectionMaintenanceWaterResItems2;
    @Column(name = "cs9_conservationBiodiversity413Items1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> conservationBiodiversity413Items1;
    @Column(name = "cs9_conservationBiodiversity413Items2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> conservationBiodiversity413Items2;
    @Column(name = "cs9_conservationBiodiversity414Items1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> conservationBiodiversity414Items1;
    @Column(name = "cs9_conservationBiodiversity414Items2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> conservationBiodiversity414Items2;
    @Column(name = "cs9_indigenousPeoplesPublicItems1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> indigenousPeoplesPublicItems1;
    @Column(name = "cs9_indigenousPeoplesPublicItems2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> indigenousPeoplesPublicItems2;
    @Column(name = "cs9_indigenousPeoplesPrivateItems1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> indigenousPeoplesPrivateItems1;
    @Column(name = "cs9_indigenousPeoplesPrivateItems2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> indigenousPeoplesPrivateItems2;
    @Column(name = "cs9_indigenousPeoplesForestItems1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> indigenousPeoplesForestItems1;
    @Column(name = "cs9_indigenousPeoplesForestItems2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> indigenousPeoplesForestItems2;
    @Column(name = "cs9_trainingEducationItems1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> trainingEducationItems1;
    @Column(name = "cs9_trainingEducationItems2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> trainingEducationItems2;

    @Column(name = "cs9_conservation415Explain1_2", nullable = true)
    private String conservation415Explain1_2;

    @Column(name = "cs9_indigenousPrivateRationale", nullable = true)
    @Type(type="text")
    private String indigenousPrivateRationale;

    @Column(name = "cs9_conservation415Rationale", nullable = true)
    private String conservation415Rationale;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Integer> getIndigenousPeoplesPublicItems2() {
        return indigenousPeoplesPublicItems2;
    }

    public Set<Integer> getConservationBiodiversity413Items2() {
        return conservationBiodiversity413Items2;
    }

    public void setConservationBiodiversity413Items2(Set<Integer> conservationBiodiversity413Items2) {
        addAll(this.conservationBiodiversity413Items2, conservationBiodiversity413Items2);
    }

    public Set<Integer> getConservationBiodiversity414Items2() {
        return conservationBiodiversity414Items2;
    }

    public void setConservationBiodiversity414Items2(Set<Integer> conservationBiodiversity414Items2) {
        addAll(this.conservationBiodiversity414Items2, conservationBiodiversity414Items2);
    }

    public void setIndigenousPeoplesPublicItems2(Set<Integer> indigenousPeoplesPublicItems2) {
        addAll(this.indigenousPeoplesPublicItems2, indigenousPeoplesPublicItems2);
    }

    public Set<Integer> getIndigenousPeoplesForestItems2() {
        return indigenousPeoplesForestItems2;
    }

    public void setIndigenousPeoplesForestItems2(Set<Integer> indigenousPeoplesForestItems2) {
        addAll(this.indigenousPeoplesForestItems2, indigenousPeoplesForestItems2);
    }

    public Set<Integer> getTrainingEducationItems2() {
        return trainingEducationItems2;
    }

    public void setTrainingEducationItems2(Set<Integer> trainingEducationItems2) {
        addAll(this.trainingEducationItems2, trainingEducationItems2);
    }

    public Set<SfiPpFormStory> getStories() {
        return stories;
    }

    public void setStories(Set<SfiPpFormStory> stories) {
        addAll(this.stories, stories);
    }

    public Set<Integer> getProtectionMaintenanceWaterResItems1() {
        return protectionMaintenanceWaterResItems1;
    }

    public void setProtectionMaintenanceWaterResItems1(Set<Integer> protectionMaintenanceWaterResItems1) {
        addAll(this.protectionMaintenanceWaterResItems1, protectionMaintenanceWaterResItems1);
    }

    public Set<Integer> getProtectionMaintenanceWaterResItems2() {
        return protectionMaintenanceWaterResItems2;
    }

    public void setProtectionMaintenanceWaterResItems2(Set<Integer> protectionMaintenanceWaterResItems2) {
        addAll(this.protectionMaintenanceWaterResItems2, protectionMaintenanceWaterResItems2);
    }

    public Set<Integer> getConservationBiodiversity413Items1() {
        return conservationBiodiversity413Items1;
    }

    public void setConservationBiodiversity413Items1(Set<Integer> conservationBiodiversity413Items1) {
        addAll(this.conservationBiodiversity413Items1, conservationBiodiversity413Items1);
    }

    public Set<Integer> getConservationBiodiversity414Items1() {
        return conservationBiodiversity414Items1;
    }

    public void setConservationBiodiversity414Items1(Set<Integer> conservationBiodiversity414Items1) {
        addAll(this.conservationBiodiversity414Items1, conservationBiodiversity414Items1);
    }

    public Set<Integer> getIndigenousPeoplesPublicItems1() {
        return indigenousPeoplesPublicItems1;
    }

    public void setIndigenousPeoplesPublicItems1(Set<Integer> indigenousPeoplesPublicItems1) {
        addAll(this.indigenousPeoplesPublicItems1, indigenousPeoplesPublicItems1);
    }

    public Set<Integer> getIndigenousPeoplesPrivateItems1() {
        return indigenousPeoplesPrivateItems1;
    }

    public void setIndigenousPeoplesPrivateItems1(Set<Integer> indigenousPeoplesPrivateItems1) {
        addAll(this.indigenousPeoplesPrivateItems1, indigenousPeoplesPrivateItems1);
    }

    public Set<Integer> getIndigenousPeoplesPrivateItems2() {
        return indigenousPeoplesPrivateItems2;
    }

    public void setIndigenousPeoplesPrivateItems2(Set<Integer> indigenousPeoplesPrivateItems2) {
        addAll(this.indigenousPeoplesPrivateItems2, indigenousPeoplesPrivateItems2);
    }

    public Set<Integer> getIndigenousPeoplesForestItems1() {
        return indigenousPeoplesForestItems1;
    }

    public void setIndigenousPeoplesForestItems1(Set<Integer> indigenousPeoplesForestItems1) {
        addAll(this.indigenousPeoplesForestItems1, indigenousPeoplesForestItems1);
    }

    public Set<Integer> getTrainingEducationItems1() {
        return trainingEducationItems1;
    }

    public void setTrainingEducationItems1(Set<Integer> trainingEducationItems1) {
        addAll(this.trainingEducationItems1, trainingEducationItems1);
    }

    public String getConservation415Explain1_2() {
        return conservation415Explain1_2;
    }

    public void setConservation415Explain1_2(String conservation415Explain1_2) {
        this.conservation415Explain1_2 = conservation415Explain1_2;
    }

    public String getConservation415Rationale() {
        return conservation415Rationale;
    }

    public void setConservation415Rationale(String conservation415Rationale) {
        this.conservation415Rationale = conservation415Rationale;
    }

    public String getIndigenousPrivateRationale() {
        return indigenousPrivateRationale;
    }

    public void setIndigenousPrivateRationale(String indigenousPrivateRationale) {
        this.indigenousPrivateRationale = indigenousPrivateRationale;
    }

    public Boolean getAcknowledge() {
        return acknowledge;
    }

    public void setAcknowledge(Boolean acknowledge) {
        this.acknowledge = acknowledge;
    }

    public Set<Integer> getConservationBiodiversity413Items() {
        return conservationBiodiversity413Items;
    }

    public void setConservationBiodiversity413Items(Set<Integer> conservationBiodiversity413Items) {
        addAll(this.conservationBiodiversity413Items, conservationBiodiversity413Items);
    }

    public Set<Integer> getConservationBiodiversity414Items() {
        return conservationBiodiversity414Items;
    }

    public void setConservationBiodiversity414Items(Set<Integer> conservationBiodiversity414Items) {
        addAll(this.conservationBiodiversity414Items, conservationBiodiversity414Items);
    }

    public Set<Integer> getIndigenousPeoplesForestItems() {
        return indigenousPeoplesForestItems;
    }

    public void setIndigenousPeoplesForestItems(Set<Integer> indigenousPeoplesForestItems) {
        addAll(this.indigenousPeoplesForestItems, indigenousPeoplesForestItems);
    }

    public Set<Integer> getIndigenousPeoplesPrivateItems() {
        return indigenousPeoplesPrivateItems;
    }

    public void setIndigenousPeoplesPrivateItems(Set<Integer> indigenousPeoplesPrivateItems) {
        addAll(this.indigenousPeoplesPrivateItems, indigenousPeoplesPrivateItems);
    }

    public Set<Integer> getIndigenousPeoplesPublicItems() {
        return indigenousPeoplesPublicItems;
    }

    public void setIndigenousPeoplesPublicItems(Set<Integer> indigenousPeoplesPublicItems) {
        addAll(this.indigenousPeoplesPublicItems, indigenousPeoplesPublicItems);
    }

    public Set<Integer> getTrainingEducationItems() {
        return trainingEducationItems;
    }

    public void setTrainingEducationItems(Set<Integer> trainingEducationItems) {
        addAll(this.trainingEducationItems, trainingEducationItems);
    }
}
