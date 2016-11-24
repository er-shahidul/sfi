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

    @Column(name = "cs9_conservationBiodiversity415Exp", nullable = true)
    @Type(type="text")
    private String conservationBiodiversity415Exp;

    @Column(name = "cs9_conservationBiodiversity413", nullable = true)
    private String conservationBiodiversity413;

    @Column(name = "cs9_conservationBiodiversity414", nullable = true)
    private String conservationBiodiversity414;

    @Column(name = "cs9_conservationBiodiversity415", nullable = true)
    private String conservationBiodiversity415;

    @Column(name = "cs9_indigenousPeoplesForest", nullable = true)
    private String indigenousPeoplesForest;

    @Column(name = "cs9_indigenousPeoplesPrivate", nullable = true)
    private String indigenousPeoplesPrivate;

    @Column(name = "cs9_indigenousPeoplesPublic", nullable = true)
    private String indigenousPeoplesPublic;

    @Column(name = "cs9_protectionMaintenanceWaterRes", nullable = true)
    private String protectionMaintenanceWaterRes;

    @Column(name = "cs9_trainingEducation", nullable = true)
    private String trainingEducation;

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

    @Column(name = "cs9_conservation413DataSource1_2", nullable = true)
    @Type(type="text")
    private String conservation413DataSource1_2;

    @Column(name = "cs9_conservation413DataSource1_4", nullable = true)
    @Type(type="text")
    private String conservation413DataSource1_4;

    @Column(name = "cs9_conservation413DataSource2_2", nullable = true)
    private String conservation413DataSource2_2;
    @Column(name = "cs9_conservation413DataSource2_4", nullable = true)
    private String conservation413DataSource2_4;

    @Column(name = "cs9_conservation414Explain1_1", nullable = true)
    @Type(type="text")
    private String conservation414Explain1_1;

    @Column(name = "cs9_conservation414Explain1_2", nullable = true)
    @Type(type="text")
    private String conservation414Explain1_2;

    @Column(name = "cs9_conservation414Explain1_5", nullable = true)
    @Type(type="text")
    private String conservation414Explain1_5;

    @Column(name = "cs9_conservation414Explain1_6", nullable = true)
    @Type(type="text")
    private String conservation414Explain1_6;

    @Column(name = "cs9_conservation414Explain2_1", nullable = true)
    private String conservation414Explain2_1;
    @Column(name = "cs9_conservation414Explain2_2", nullable = true)
    private String conservation414Explain2_2;
    @Column(name = "cs9_conservation414Explain2_5", nullable = true)
    private String conservation414Explain2_5;
    @Column(name = "cs9_conservation414Explain2_6", nullable = true)
    private String conservation414Explain2_6;
    @Column(name = "cs9_conservation415Explain1_1", nullable = true)
    private String conservation415Explain1_1;
    @Column(name = "cs9_conservation415Explain1_2", nullable = true)
    private String conservation415Explain1_2;

    @Column(name = "cs9_protectionMaintenanceRationale", nullable = true)
    @Type(type="text")
    private String protectionMaintenanceRationale;
    @Column(name = "cs9_conservation413Rationale", nullable = true)
    @Type(type="text")
    private String conservation413Rationale;

    @Column(name = "cs9_conservation414Rationale", nullable = true)
    @Type(type="text")
    private String conservation414Rationale;
    @Column(name = "cs9_indigenousPublicRationale", nullable = true)
    @Type(type="text")
    private String indigenousPublicRationale;
    @Column(name = "cs9_indigenousPrivateRationale", nullable = true)
    @Type(type="text")
    private String indigenousPrivateRationale;
    @Column(name = "cs9_indigenousForestPractice", nullable = true)
    @Type(type="text")
    private String indigenousForestPractice;

    @Column(name = "cs9_conservation415Rationale", nullable = true)
    private String conservation415Rationale;
    @Column(name = "cs9_trainingEduRationale", nullable = true)
    @Type(type="text")
    private String trainingEduRationale;
    @Column(name = "cs9_trainingEduRationaleAnother", nullable = true)
    @Type(type="text")
    private String trainingEduRationaleAnother;
    @Column(name = "cs9_conservationBiodiversity415Rationale", nullable = true)
    @Type(type="text")
    private String conservationBiodiversity415Rationale;

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

    public String getTrainingEduRationaleAnother() {
        return trainingEduRationaleAnother;
    }

    public void setTrainingEduRationaleAnother(String trainingEduRationaleAnother) {
        this.trainingEduRationaleAnother = trainingEduRationaleAnother;
    }

    public String getConservationBiodiversity415Rationale() {
        return conservationBiodiversity415Rationale;
    }

    public void setConservationBiodiversity415Rationale(String conservationBiodiversity415Rationale) {
        this.conservationBiodiversity415Rationale = conservationBiodiversity415Rationale;
    }

    public String getConservationBiodiversity415Exp() {
        return conservationBiodiversity415Exp;
    }

    public void setConservationBiodiversity415Exp(String conservationBiodiversity415Exp) {
        this.conservationBiodiversity415Exp = conservationBiodiversity415Exp;
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

    public String getConservation413DataSource1_2() {
        return conservation413DataSource1_2;
    }

    public void setConservation413DataSource1_2(String conservation413DataSource1_2) {
        this.conservation413DataSource1_2 = conservation413DataSource1_2;
    }

    public String getConservation413DataSource1_4() {
        return conservation413DataSource1_4;
    }

    public void setConservation413DataSource1_4(String conservation413DataSource1_4) {
        this.conservation413DataSource1_4 = conservation413DataSource1_4;
    }

    public String getConservation413DataSource2_2() {
        return conservation413DataSource2_2;
    }

    public void setConservation413DataSource2_2(String conservation413DataSource2_2) {
        this.conservation413DataSource2_2 = conservation413DataSource2_2;
    }

    public String getConservation413DataSource2_4() {
        return conservation413DataSource2_4;
    }

    public void setConservation413DataSource2_4(String conservation413DataSource2_4) {
        this.conservation413DataSource2_4 = conservation413DataSource2_4;
    }

    public String getConservation414Explain1_1() {
        return conservation414Explain1_1;
    }

    public void setConservation414Explain1_1(String conservation414Explain1_1) {
        this.conservation414Explain1_1 = conservation414Explain1_1;
    }

    public String getConservation414Explain1_2() {
        return conservation414Explain1_2;
    }

    public void setConservation414Explain1_2(String conservation414Explain1_2) {
        this.conservation414Explain1_2 = conservation414Explain1_2;
    }

    public String getConservation414Explain1_5() {
        return conservation414Explain1_5;
    }

    public void setConservation414Explain1_5(String conservation414Explain1_5) {
        this.conservation414Explain1_5 = conservation414Explain1_5;
    }

    public String getConservation414Explain1_6() {
        return conservation414Explain1_6;
    }

    public void setConservation414Explain1_6(String conservation414Explain1_6) {
        this.conservation414Explain1_6 = conservation414Explain1_6;
    }

    public String getConservation414Explain2_1() {
        return conservation414Explain2_1;
    }

    public void setConservation414Explain2_1(String conservation414Explain2_1) {
        this.conservation414Explain2_1 = conservation414Explain2_1;
    }

    public String getConservation414Explain2_2() {
        return conservation414Explain2_2;
    }

    public void setConservation414Explain2_2(String conservation414Explain2_2) {
        this.conservation414Explain2_2 = conservation414Explain2_2;
    }

    public String getConservation414Explain2_5() {
        return conservation414Explain2_5;
    }

    public void setConservation414Explain2_5(String conservation414Explain2_5) {
        this.conservation414Explain2_5 = conservation414Explain2_5;
    }

    public String getConservation414Explain2_6() {
        return conservation414Explain2_6;
    }

    public void setConservation414Explain2_6(String conservation414Explain2_6) {
        this.conservation414Explain2_6 = conservation414Explain2_6;
    }

    public String getConservation415Explain1_1() {
        return conservation415Explain1_1;
    }

    public void setConservation415Explain1_1(String conservation415Explain1_1) {
        this.conservation415Explain1_1 = conservation415Explain1_1;
    }

    public String getConservation415Explain1_2() {
        return conservation415Explain1_2;
    }

    public void setConservation415Explain1_2(String conservation415Explain1_2) {
        this.conservation415Explain1_2 = conservation415Explain1_2;
    }

    public String getProtectionMaintenanceRationale() {
        return protectionMaintenanceRationale;
    }

    public void setProtectionMaintenanceRationale(String protectionMaintenanceRationale) {
        this.protectionMaintenanceRationale = protectionMaintenanceRationale;
    }

    public String getConservation413Rationale() {
        return conservation413Rationale;
    }

    public void setConservation413Rationale(String conservation413Rationale) {
        this.conservation413Rationale = conservation413Rationale;
    }

    public String getConservation414Rationale() {
        return conservation414Rationale;
    }

    public void setConservation414Rationale(String conservation414Rationale) {
        this.conservation414Rationale = conservation414Rationale;
    }

    public String getConservation415Rationale() {
        return conservation415Rationale;
    }

    public void setConservation415Rationale(String conservation415Rationale) {
        this.conservation415Rationale = conservation415Rationale;
    }

    public String getIndigenousPublicRationale() {
        return indigenousPublicRationale;
    }

    public void setIndigenousPublicRationale(String indigenousPublicRationale) {
        this.indigenousPublicRationale = indigenousPublicRationale;
    }

    public String getIndigenousPrivateRationale() {
        return indigenousPrivateRationale;
    }

    public void setIndigenousPrivateRationale(String indigenousPrivateRationale) {
        this.indigenousPrivateRationale = indigenousPrivateRationale;
    }

    public String getIndigenousForestPractice() {
        return indigenousForestPractice;
    }

    public void setIndigenousForestPractice(String indigenousForestPractice) {
        this.indigenousForestPractice = indigenousForestPractice;
    }

    public String getTrainingEduRationale() {
        return trainingEduRationale;
    }

    public void setTrainingEduRationale(String trainingEduRationale) {
        this.trainingEduRationale = trainingEduRationale;
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

    public String getConservationBiodiversity413() {
        return conservationBiodiversity413;
    }

    public void setConservationBiodiversity413(String conservationBiodiversity413) {
        this.conservationBiodiversity413 = conservationBiodiversity413;
    }

    public String getConservationBiodiversity414() {
        return conservationBiodiversity414;
    }

    public void setConservationBiodiversity414(String conservationBiodiversity414) {
        this.conservationBiodiversity414 = conservationBiodiversity414;
    }

    public String getConservationBiodiversity415() {
        return conservationBiodiversity415;
    }

    public void setConservationBiodiversity415(String conservationBiodiversity415) {
        this.conservationBiodiversity415 = conservationBiodiversity415;
    }

    public String getIndigenousPeoplesForest() {
        return indigenousPeoplesForest;
    }

    public void setIndigenousPeoplesForest(String indigenousPeoplesForest) {
        this.indigenousPeoplesForest = indigenousPeoplesForest;
    }

    public String getIndigenousPeoplesPrivate() {
        return indigenousPeoplesPrivate;
    }

    public void setIndigenousPeoplesPrivate(String indigenousPeoplesPrivate) {
        this.indigenousPeoplesPrivate = indigenousPeoplesPrivate;
    }

    public String getIndigenousPeoplesPublic() {
        return indigenousPeoplesPublic;
    }

    public void setIndigenousPeoplesPublic(String indigenousPeoplesPublic) {
        this.indigenousPeoplesPublic = indigenousPeoplesPublic;
    }

    public String getProtectionMaintenanceWaterRes() {
        return protectionMaintenanceWaterRes;
    }

    public void setProtectionMaintenanceWaterRes(String protectionMaintenanceWaterRes) {
        this.protectionMaintenanceWaterRes = protectionMaintenanceWaterRes;
    }

    public String getTrainingEducation() {
        return trainingEducation;
    }

    public void setTrainingEducation(String trainingEducation) {
        this.trainingEducation = trainingEducation;
    }
}
