package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.common.services.TypeConversionUtils;
import com.rbs.www.web.common.models.datamodels.BlobNames;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.HashSet;
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

    @Column(name = "cs2_supportCurrency", nullable = true)
    private Integer supportCurrency;

    @Column(name = "cs2_committeeCurrency", nullable = true)
    private Integer committeeCurrency;

    @Column(name = "cs2_directCurrency", nullable = true)
    private Integer directCurrency;

    @Column(name = "cs2_activityOther1", nullable = true)
    private Boolean activityOther1;

    @Column(name = "cs2_activityOther2", nullable = true)
    private Boolean activityOther2;

    @Column(name = "cs2_activityOtherSpecify1", nullable = true)
    private String activityOtherSpecify1;

    @Column(name = "cs2_activityOtherSpecify2", nullable = true)
    private String activityOtherSpecify2;

    @Column(name = "cs2_inKindSupportText1", nullable = true)
    private String inKindSupportText1;

    @Column(name = "cs2_inKindSupportText2", nullable = true)
    private String inKindSupportText2;

    @Column(name = "cs2_inKindSupportText3", nullable = true)
    private String inKindSupportText3;

    @Column(name = "cs2_inKindSupportText4", nullable = true)
    private String inKindSupportText4;

    @Column(name = "cs2_inKindSupportText5", nullable = true)
    private String inKindSupportText5;

    @Column(name = "cs2_inKindSupportText6", nullable = true)
    private String inKindSupportText6;

    @Column(name = "cs2_inKindSupportText7", nullable = true)
    private String inKindSupportText7;

    @Column(name = "cs2_inKindSupportText8", nullable = true)
    private String inKindSupportText8;

    @Column(name = "cs2_inKindSupportText9", nullable = true)
    private String inKindSupportText9;

    @Column(name = "cs2_inKindSupportText10", nullable = true)
    private String inKindSupportText10;

    @Column(name = "cs2_inKindSupportText11", nullable = true)
    private String inKindSupportText11;

    @Column(name = "cs2_inKindSupportText12", nullable = true)
    private String inKindSupportText12;

    @Column(name = "cs2_inKindSupportText13", nullable = true)
    private String inKindSupportText13;

    @Lob
    @Column(name = "cs2_guideFiles", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] guideFilesAsByteArray;

    @Lob
    @Column(name = "cs2_guideFiles2", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] guideFilesAsByteArray2;

    @Lob
    @Column(name = "cs2_guideFiles3", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] guideFilesAsByteArray3;

    @Lob
    @Column(name = "cs2_guideFiles4", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] guideFilesAsByteArray4;

    @Lob
    @Column(name = "cs2_guideFiles5", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] guideFilesAsByteArray5;

    @Lob
    @Column(name = "cs2_guideFiles6", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] guideFilesAsByteArray6;

    @Lob
    @Column(name = "cs2_guideFiles7", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] guideFilesAsByteArray7;

    @Lob
    @Column(name = "cs2_guideFiles8", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] guideFilesAsByteArray8;

    @Lob
    @Column(name = "cs2_guideFiles9", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] guideFilesAsByteArray9;

    @Lob
    @Column(name = "cs2_guideFiles10", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] guideFilesAsByteArray10;

    @Lob
    @Column(name = "cs2_guideFiles11", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] guideFilesAsByteArray11;

    @Lob
    @Column(name = "cs2_guideFiles12", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] guideFilesAsByteArray12;

    @Lob
    @Column(name = "cs2_guideFiles13", length = Integer.MAX_VALUE - 1, nullable = true)
    private Byte[] guideFilesAsByteArray13;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInKindSupportText1() {
        return inKindSupportText1;
    }

    public void setInKindSupportText1(String inKindSupportText1) {
        this.inKindSupportText1 = inKindSupportText1;
    }

    public String getInKindSupportText2() {
        return inKindSupportText2;
    }

    public void setInKindSupportText2(String inKindSupportText2) {
        this.inKindSupportText2 = inKindSupportText2;
    }

    public String getInKindSupportText3() {
        return inKindSupportText3;
    }

    public void setInKindSupportText3(String inKindSupportText3) {
        this.inKindSupportText3 = inKindSupportText3;
    }

    public String getInKindSupportText4() {
        return inKindSupportText4;
    }

    public void setInKindSupportText4(String inKindSupportText4) {
        this.inKindSupportText4 = inKindSupportText4;
    }

    public String getInKindSupportText5() {
        return inKindSupportText5;
    }

    public void setInKindSupportText5(String inKindSupportText5) {
        this.inKindSupportText5 = inKindSupportText5;
    }

    public String getInKindSupportText6() {
        return inKindSupportText6;
    }

    public void setInKindSupportText6(String inKindSupportText6) {
        this.inKindSupportText6 = inKindSupportText6;
    }

    public String getInKindSupportText7() {
        return inKindSupportText7;
    }

    public void setInKindSupportText7(String inKindSupportText7) {
        this.inKindSupportText7 = inKindSupportText7;
    }

    public String getInKindSupportText8() {
        return inKindSupportText8;
    }

    public void setInKindSupportText8(String inKindSupportText8) {
        this.inKindSupportText8 = inKindSupportText8;
    }

    public String getInKindSupportText9() {
        return inKindSupportText9;
    }

    public void setInKindSupportText9(String inKindSupportText9) {
        this.inKindSupportText9 = inKindSupportText9;
    }

    public String getInKindSupportText10() {
        return inKindSupportText10;
    }

    public void setInKindSupportText10(String inKindSupportText10) {
        this.inKindSupportText10 = inKindSupportText10;
    }

    public String getInKindSupportText11() {
        return inKindSupportText11;
    }

    public void setInKindSupportText11(String inKindSupportText11) {
        this.inKindSupportText11 = inKindSupportText11;
    }

    public String getInKindSupportText12() {
        return inKindSupportText12;
    }

    public void setInKindSupportText12(String inKindSupportText12) {
        this.inKindSupportText12 = inKindSupportText12;
    }

    public String getInKindSupportText13() {
        return inKindSupportText13;
    }

    public void setInKindSupportText13(String inKindSupportText13) {
        this.inKindSupportText13 = inKindSupportText13;
    }

    public String getActivityOtherSpecify1() {
        return activityOtherSpecify1;
    }

    public void setActivityOtherSpecify1(String activityOtherSpecify1) {
        this.activityOtherSpecify1 = activityOtherSpecify1;
    }

    public String getActivityOtherSpecify2() {
        return activityOtherSpecify2;
    }

    public void setActivityOtherSpecify2(String activityOtherSpecify2) {
        this.activityOtherSpecify2 = activityOtherSpecify2;
    }

    public Boolean getActivityOther1() {
        return activityOther1;
    }

    public void setActivityOther1(Boolean activityOther1) {
        this.activityOther1 = activityOther1;
    }

    public Boolean getActivityOther2() {
        return activityOther2;
    }

    public void setActivityOther2(Boolean activityOther2) {
        this.activityOther2 = activityOther2;
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

    public Integer getSupportCurrency() {
        return supportCurrency;
    }

    public void setSupportCurrency(Integer supportCurrency) {
        this.supportCurrency = supportCurrency;
    }

    public Integer getCommitteeCurrency() {
        return committeeCurrency;
    }

    public void setCommitteeCurrency(Integer committeeCurrency) {
        this.committeeCurrency = committeeCurrency;
    }

    public Integer getDirectCurrency() {
        return directCurrency;
    }

    public void setDirectCurrency(Integer directCurrency) {
        this.directCurrency = directCurrency;
    }

    private Byte[] getGuideFilesAsByteArray() {
        return guideFilesAsByteArray;
    }

    private void setGuideFilesAsByteArray(Byte[] guideFilesAsByteArray) {
        this.guideFilesAsByteArray = guideFilesAsByteArray;
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getGuideFiles() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(guideFilesAsByteArray);
    }

    public void setGuideFiles(HashSet<BlobNames> guideFiles) {
        this.guideFilesAsByteArray = TypeConversionUtils.serialize(guideFiles);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getGuideFiles13() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(guideFilesAsByteArray13);
    }

    public void setGuideFiles13(HashSet<BlobNames> guideFiles13) {
        this.guideFilesAsByteArray13 = TypeConversionUtils.serialize(guideFiles13);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getGuideFiles12() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(guideFilesAsByteArray12);
    }

    public void setGuideFiles12(HashSet<BlobNames> guideFiles12) {
        this.guideFilesAsByteArray12 = TypeConversionUtils.serialize(guideFiles12);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getGuideFiles11() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(guideFilesAsByteArray11);
    }

    public void setGuideFiles11(HashSet<BlobNames> guideFiles11) {
        this.guideFilesAsByteArray11 = TypeConversionUtils.serialize(guideFiles11);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getGuideFiles10() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(guideFilesAsByteArray10);
    }

    public void setGuideFiles10(HashSet<BlobNames> guideFiles10) {
        this.guideFilesAsByteArray10 = TypeConversionUtils.serialize(guideFiles10);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getGuideFiles9() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(guideFilesAsByteArray9);
    }

    public void setGuideFiles9(HashSet<BlobNames> guideFiles9) {
        this.guideFilesAsByteArray9 = TypeConversionUtils.serialize(guideFiles9);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getGuideFiles8() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(guideFilesAsByteArray8);
    }

    public void setGuideFiles8(HashSet<BlobNames> guideFiles8) {
        this.guideFilesAsByteArray8 = TypeConversionUtils.serialize(guideFiles8);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getGuideFiles7() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(guideFilesAsByteArray7);
    }

    public void setGuideFiles7(HashSet<BlobNames> guideFiles7) {
        this.guideFilesAsByteArray7 = TypeConversionUtils.serialize(guideFiles7);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getGuideFiles6() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(guideFilesAsByteArray6);
    }

    public void setGuideFiles6(HashSet<BlobNames> guideFiles6) {
        this.guideFilesAsByteArray6 = TypeConversionUtils.serialize(guideFiles6);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getGuideFiles5() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(guideFilesAsByteArray5);
    }

    public void setGuideFiles5(HashSet<BlobNames> guideFiles5) {
        this.guideFilesAsByteArray5 = TypeConversionUtils.serialize(guideFiles5);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getGuideFiles4() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(guideFilesAsByteArray4);
    }

    public void setGuideFiles4(HashSet<BlobNames> guideFiles4) {
        this.guideFilesAsByteArray4 = TypeConversionUtils.serialize(guideFiles4);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getGuideFiles3() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(guideFilesAsByteArray3);
    }

    public void setGuideFiles3(HashSet<BlobNames> guideFiles3) {
        this.guideFilesAsByteArray3 = TypeConversionUtils.serialize(guideFiles3);
    }

    @Transient
    @SuppressWarnings("unchecked")
    public Set<BlobNames> getGuideFiles2() {
        return (Set<BlobNames>) TypeConversionUtils.deserialize(guideFilesAsByteArray2);
    }

    public void setGuideFiles2(HashSet<BlobNames> guideFiles2) {
        this.guideFilesAsByteArray2 = TypeConversionUtils.serialize(guideFiles2);
    }
}
