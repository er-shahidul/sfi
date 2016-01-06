package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sic_forms")
public class SicCs2 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs2_freesProgramApplicants", nullable = true)
    private Boolean freesProgramApplicants;

    @Column(name = "cs2_inKindSupport1", nullable = true)
    private Boolean inKindSupport1;

    @Column(name = "cs2_inKindSupport2", nullable = true)
    private Boolean inKindSupport2;

    @Column(name = "cs2_inKindSupport3", nullable = true)
    private Boolean inKindSupport3;

    @Column(name = "cs2_inKindSupport4", nullable = true)
    private Boolean inKindSupport4;

    @Column(name = "cs2_inKindSupport5", nullable = true)
    private Boolean inKindSupport5;

    @Column(name = "cs2_inKindSupport6", nullable = true)
    private Boolean inKindSupport6;

    @Column(name = "cs2_inKindSupport7", nullable = true)
    private Boolean inKindSupport7;

    @Column(name = "cs2_inKindSupport8", nullable = true)
    private Boolean inKindSupport8;

    @Column(name = "cs2_inKindSupport9", nullable = true)
    private Boolean inKindSupport9;

    @Column(name = "cs2_inKindSupport10", nullable = true)
    private Boolean inKindSupport10;

    @Column(name = "cs2_inKindSupport11", nullable = true)
    private Boolean inKindSupport11;

    @Column(name = "cs2_inKindSupport12", nullable = true)
    private Boolean inKindSupport12;

    @Column(name = "cs2_inKindSupport13", nullable = true)
    private Boolean inKindSupport13;

    @Column(name = "cs2_isSicNeighborEvents", nullable = true)
    private Boolean isSicNeighborEvents;

    @Column(name = "directSpending1", nullable = true)
    private Integer directSpending1;

    @Column(name = "directSpending2", nullable = true)
    private Integer directSpending2;

    @Column(name = "directSpending3", nullable = true)
    private Integer directSpending3;

    @Column(name = "directSpending4", nullable = true)
    private Integer directSpending4;

    @Column(name = "directSpending5", nullable = true)
    private Integer directSpending5;

    @Column(name = "directSpending6", nullable = true)
    private Integer directSpending6;

    @Column(name = "directSpending7", nullable = true)
    private Integer directSpending7;

    @Column(name = "directSpending8", nullable = true)
    private Integer directSpending8;

    @Column(name = "directSpending9", nullable = true)
    private Integer directSpending9;

    @Column(name = "directSpending10", nullable = true)
    private Integer directSpending10;

    @Column(name = "directSpending11", nullable = true)
    private Integer directSpending11;

    @Column(name = "directSpending12", nullable = true)
    private Integer directSpending12;

    @Column(name = "directSpending13", nullable = true)
    private Integer directSpending13;

    @Column(name = "spentBySicSupporters", nullable = true)
    private Integer spentBySicSupporters;

    @Column(name = "spentByYourCommittee", nullable = true)
    private Integer spentByYourCommittee;

    @Column(name = "spendActivityDetails1", nullable = true)
    private String spendActivityDetails1;

    @Column(name = "spendActivityDetails2", nullable = true)
    private String spendActivityDetails2;

    @Column(name = "spendActivityDetails3", nullable = true)
    private String spendActivityDetails3;

    @Column(name = "spendActivityDetails4", nullable = true)
    private String spendActivityDetails4;

    @Column(name = "spendActivityDetails5", nullable = true)
    private String spendActivityDetails5;

    @Column(name = "spendActivityDetails6", nullable = true)
    private String spendActivityDetails6;

    @Column(name = "spendActivityDetails7", nullable = true)
    private String spendActivityDetails7;

    @Column(name = "spendActivityDetails8", nullable = true)
    private String spendActivityDetails8;

    @Column(name = "spendActivityDetails9", nullable = true)
    private String spendActivityDetails9;

    @Column(name = "spendActivityDetails10", nullable = true)
    private String spendActivityDetails10;

    @Column(name = "spendActivityDetails11", nullable = true)
    private String spendActivityDetails11;

    @Column(name = "spendActivityDetails12", nullable = true)
    private String spendActivityDetails12;

    @Column(name = "spendActivityDetails13", nullable = true)
    private String spendActivityDetails13;

    @Column(name = "cs2_committeeFeeSpecify1", nullable = true)
    private String committeeFeeSpecify1;

    @Column(name = "cs2_committeeFeeSpecify2", nullable = true)
    private String committeeFeeSpecify2;

    @Column(name = "cs2_committeeFeeSpecify3", nullable = true)
    private String committeeFeeSpecify3;

    @Column(name = "cs2_committeeFeeSpecify4", nullable = true)
    private String committeeFeeSpecify4;

    @Column(name = "cs2_committeeFeeSpecify5", nullable = true)
    private String committeeFeeSpecify5;

    @Column(name = "cs2_committeeFeeSpecify6", nullable = true)
    private String committeeFeeSpecify6;

    @Column(name = "cs2_committeeFeeStructure", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> committeeFeeStructure;

    @OneToMany(targetEntity = SicPpFormNeighborEvent.class, mappedBy = "sicPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SicPpFormNeighborEvent> sicNeighborEvents;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getFreesProgramApplicants() {
        return freesProgramApplicants;
    }

    public void setFreesProgramApplicants(Boolean freesProgramApplicants) {
        this.freesProgramApplicants = freesProgramApplicants;
    }

    public Boolean getInKindSupport1() {
        return inKindSupport1;
    }

    public void setInKindSupport1(Boolean inKindSupport1) {
        this.inKindSupport1 = inKindSupport1;
    }

    public Boolean getInKindSupport2() {
        return inKindSupport2;
    }

    public void setInKindSupport2(Boolean inKindSupport2) {
        this.inKindSupport2 = inKindSupport2;
    }

    public Boolean getInKindSupport3() {
        return inKindSupport3;
    }

    public void setInKindSupport3(Boolean inKindSupport3) {
        this.inKindSupport3 = inKindSupport3;
    }

    public Boolean getInKindSupport4() {
        return inKindSupport4;
    }

    public void setInKindSupport4(Boolean inKindSupport4) {
        this.inKindSupport4 = inKindSupport4;
    }

    public Boolean getInKindSupport5() {
        return inKindSupport5;
    }

    public void setInKindSupport5(Boolean inKindSupport5) {
        this.inKindSupport5 = inKindSupport5;
    }

    public Boolean getInKindSupport6() {
        return inKindSupport6;
    }

    public void setInKindSupport6(Boolean inKindSupport6) {
        this.inKindSupport6 = inKindSupport6;
    }

    public Boolean getInKindSupport7() {
        return inKindSupport7;
    }

    public void setInKindSupport7(Boolean inKindSupport7) {
        this.inKindSupport7 = inKindSupport7;
    }

    public Boolean getInKindSupport8() {
        return inKindSupport8;
    }

    public void setInKindSupport8(Boolean inKindSupport8) {
        this.inKindSupport8 = inKindSupport8;
    }

    public Boolean getInKindSupport9() {
        return inKindSupport9;
    }

    public void setInKindSupport9(Boolean inKindSupport9) {
        this.inKindSupport9 = inKindSupport9;
    }

    public Boolean getInKindSupport10() {
        return inKindSupport10;
    }

    public void setInKindSupport10(Boolean inKindSupport10) {
        this.inKindSupport10 = inKindSupport10;
    }

    public Boolean getInKindSupport11() {
        return inKindSupport11;
    }

    public void setInKindSupport11(Boolean inKindSupport11) {
        this.inKindSupport11 = inKindSupport11;
    }

    public Boolean getInKindSupport12() {
        return inKindSupport12;
    }

    public void setInKindSupport12(Boolean inKindSupport12) {
        this.inKindSupport12 = inKindSupport12;
    }

    public Boolean getInKindSupport13() {
        return inKindSupport13;
    }

    public void setInKindSupport13(Boolean inKindSupport13) {
        this.inKindSupport13 = inKindSupport13;
    }

    public Boolean getIsSicNeighborEvents() {
        return isSicNeighborEvents;
    }

    public void setIsSicNeighborEvents(Boolean isSicNeighborEvents) {
       this.isSicNeighborEvents = isSicNeighborEvents;
    }

    public Set<SicPpFormNeighborEvent> getSicNeighborEvents() {
        return sicNeighborEvents;
    }

    public void setSicNeighborEvents(Set<SicPpFormNeighborEvent> sicNeighborEvents) {
        addAll(this.sicNeighborEvents, sicNeighborEvents);
    }

    public Integer getDirectSpending1() {
        return directSpending1;
    }

    public void setDirectSpending1(Integer directSpending1) {
        this.directSpending1 = directSpending1;
    }

    public Integer getDirectSpending2() {
        return directSpending2;
    }

    public void setDirectSpending2(Integer directSpending2) {
        this.directSpending2 = directSpending2;
    }

    public Integer getDirectSpending3() {
        return directSpending3;
    }

    public void setDirectSpending3(Integer directSpending3) {
        this.directSpending3 = directSpending3;
    }

    public Integer getDirectSpending4() {
        return directSpending4;
    }

    public void setDirectSpending4(Integer directSpending4) {
        this.directSpending4 = directSpending4;
    }

    public Integer getDirectSpending5() {
        return directSpending5;
    }

    public void setDirectSpending5(Integer directSpending5) {
        this.directSpending5 = directSpending5;
    }

    public Integer getDirectSpending6() {
        return directSpending6;
    }

    public void setDirectSpending6(Integer directSpending6) {
        this.directSpending6 = directSpending6;
    }

    public Integer getDirectSpending7() {
        return directSpending7;
    }

    public void setDirectSpending7(Integer directSpending7) {
        this.directSpending7 = directSpending7;
    }

    public Integer getDirectSpending8() {
        return directSpending8;
    }

    public void setDirectSpending8(Integer directSpending8) {
        this.directSpending8 = directSpending8;
    }

    public Integer getDirectSpending9() {
        return directSpending9;
    }

    public void setDirectSpending9(Integer directSpending9) {
        this.directSpending9 = directSpending9;
    }

    public Integer getDirectSpending10() {
        return directSpending10;
    }

    public void setDirectSpending10(Integer directSpending10) {
        this.directSpending10 = directSpending10;
    }

    public Integer getDirectSpending11() {
        return directSpending11;
    }

    public void setDirectSpending11(Integer directSpending11) {
        this.directSpending11 = directSpending11;
    }

    public Integer getDirectSpending12() {
        return directSpending12;
    }

    public void setDirectSpending12(Integer directSpending12) {
        this.directSpending12 = directSpending12;
    }

    public Integer getDirectSpending13() {
        return directSpending13;
    }

    public void setDirectSpending13(Integer directSpending13) {
        this.directSpending13 = directSpending13;
    }

    public Integer getSpentBySicSupporters() {
        return spentBySicSupporters;
    }

    public void setSpentBySicSupporters(Integer spentBySicSupporters) {
        this.spentBySicSupporters = spentBySicSupporters;
    }

    public Integer getSpentByYourCommittee() {
        return spentByYourCommittee;
    }

    public void setSpentByYourCommittee(Integer spentByYourCommittee) {
        this.spentByYourCommittee = spentByYourCommittee;
    }

    public String getSpendActivityDetails1() {
        return spendActivityDetails1;
    }

    public void setSpendActivityDetails1(String spendActivityDetails1) {
        this.spendActivityDetails1 = spendActivityDetails1;
    }

    public String getSpendActivityDetails2() {
        return spendActivityDetails2;
    }

    public void setSpendActivityDetails2(String spendActivityDetails2) {
        this.spendActivityDetails2 = spendActivityDetails2;
    }

    public String getSpendActivityDetails3() {
        return spendActivityDetails3;
    }

    public void setSpendActivityDetails3(String spendActivityDetails3) {
        this.spendActivityDetails3 = spendActivityDetails3;
    }

    public String getSpendActivityDetails4() {
        return spendActivityDetails4;
    }

    public void setSpendActivityDetails4(String spendActivityDetails4) {
        this.spendActivityDetails4 = spendActivityDetails4;
    }

    public String getSpendActivityDetails5() {
        return spendActivityDetails5;
    }

    public void setSpendActivityDetails5(String spendActivityDetails5) {
        this.spendActivityDetails5 = spendActivityDetails5;
    }

    public String getSpendActivityDetails6() {
        return spendActivityDetails6;
    }

    public void setSpendActivityDetails6(String spendActivityDetails6) {
        this.spendActivityDetails6 = spendActivityDetails6;
    }

    public String getSpendActivityDetails7() {
        return spendActivityDetails7;
    }

    public void setSpendActivityDetails7(String spendActivityDetails7) {
        this.spendActivityDetails7 = spendActivityDetails7;
    }

    public String getSpendActivityDetails8() {
        return spendActivityDetails8;
    }

    public void setSpendActivityDetails8(String spendActivityDetails8) {
        this.spendActivityDetails8 = spendActivityDetails8;
    }

    public String getSpendActivityDetails9() {
        return spendActivityDetails9;
    }

    public void setSpendActivityDetails9(String spendActivityDetails9) {
        this.spendActivityDetails9 = spendActivityDetails9;
    }

    public String getSpendActivityDetails10() {
        return spendActivityDetails10;
    }

    public void setSpendActivityDetails10(String spendActivityDetails10) {
        this.spendActivityDetails10 = spendActivityDetails10;
    }

    public String getSpendActivityDetails11() {
        return spendActivityDetails11;
    }

    public void setSpendActivityDetails11(String spendActivityDetails11) {
        this.spendActivityDetails11 = spendActivityDetails11;
    }

    public String getSpendActivityDetails12() {
        return spendActivityDetails12;
    }

    public void setSpendActivityDetails12(String spendActivityDetails12) {
        this.spendActivityDetails12 = spendActivityDetails12;
    }

    public String getSpendActivityDetails13() {
        return spendActivityDetails13;
    }

    public void setSpendActivityDetails13(String spendActivityDetails13) {
        this.spendActivityDetails13 = spendActivityDetails13;
    }

    public String getCommitteeFeeSpecify1() {
        return committeeFeeSpecify1;
    }

    public void setCommitteeFeeSpecify1(String committeeFeeSpecify1) {
        this.committeeFeeSpecify1 = committeeFeeSpecify1;
    }

    public String getCommitteeFeeSpecify2() {
        return committeeFeeSpecify2;
    }

    public void setCommitteeFeeSpecify2(String committeeFeeSpecify2) {
        this.committeeFeeSpecify2 = committeeFeeSpecify2;
    }

    public String getCommitteeFeeSpecify3() {
        return committeeFeeSpecify3;
    }

    public void setCommitteeFeeSpecify3(String committeeFeeSpecify3) {
        this.committeeFeeSpecify3 = committeeFeeSpecify3;
    }

    public String getCommitteeFeeSpecify4() {
        return committeeFeeSpecify4;
    }

    public void setCommitteeFeeSpecify4(String committeeFeeSpecify4) {
        this.committeeFeeSpecify4 = committeeFeeSpecify4;
    }

    public String getCommitteeFeeSpecify5() {
        return committeeFeeSpecify5;
    }

    public void setCommitteeFeeSpecify5(String committeeFeeSpecify5) {
        this.committeeFeeSpecify5 = committeeFeeSpecify5;
    }

    public String getCommitteeFeeSpecify6() {
        return committeeFeeSpecify6;
    }

    public void setCommitteeFeeSpecify6(String committeeFeeSpecify6) {
        this.committeeFeeSpecify6 = committeeFeeSpecify6;
    }

    public Set<Integer> getCommitteeFeeStructure() {
        return committeeFeeStructure;
    }

    public void setCommitteeFeeStructure(Set<Integer> committeeFeeStructure) {
        addAll(this.committeeFeeStructure, committeeFeeStructure);
    }
}
