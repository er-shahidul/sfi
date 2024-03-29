package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.SpELAssert;
import com.rbs.www.web.common.models.datamodels.BlobNames;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.Set;

@SpELAssert.List({
        @SpELAssert(
                value = "committeeFeeSpecify1 != null && !committeeFeeSpecify1.isEmpty()",
                applyIf = "committeeFeeStructure != null && committeeFeeStructure.contains(1)",
                message = "{sic.cs2.committeeFeeSpecify1}"
        ),
        @SpELAssert(
                value = "committeeFeeSpecify2 != null && !committeeFeeSpecify2.isEmpty()",
                applyIf = "committeeFeeStructure != null && committeeFeeStructure.contains(2)",
                message = "{sic.cs2.committeeFeeSpecify2}"
        ),
        @SpELAssert(
                value = "committeeFeeSpecify3 != null && !committeeFeeSpecify3.isEmpty()",
                applyIf = "committeeFeeStructure != null && committeeFeeStructure.contains(3)",
                message = "{sic.cs2.committeeFeeSpecify3}"
        ),
        @SpELAssert(
                value = "committeeFeeSpecify4 != null && !committeeFeeSpecify4.isEmpty()",
                applyIf = "committeeFeeStructure != null && committeeFeeStructure.contains(4)",
                message = "{sic.cs2.committeeFeeSpecify4}"
        ),
        @SpELAssert(
                value = "committeeFeeSpecify5 != null && !committeeFeeSpecify5.isEmpty()",
                applyIf = "committeeFeeStructure != null && committeeFeeStructure.contains(5)",
                message = "{sic.cs2.committeeFeeSpecify5}"
        ),
        @SpELAssert(
                value = "committeeFeeSpecify6 != null && !committeeFeeSpecify6.isEmpty()",
                applyIf = "committeeFeeStructure != null && committeeFeeStructure.contains(6)",
                message = "{sic.cs2.committeeFeeSpecify6}"
        )
})
public class SicCs2ViewModel extends BaseViewModel {
    private Integer id;

    @NotNull(message = "{sic.cs2.freesProgramApplicants}")
    private Boolean freesProgramApplicants;
    private Boolean inKindSupport1;
    private Boolean inKindSupport2;
    private Boolean inKindSupport3;
    private Boolean inKindSupport4;
    private Boolean inKindSupport5;
    private Boolean inKindSupport6;
    private Boolean inKindSupport7;
    private Boolean inKindSupport8;
    private Boolean inKindSupport9;
    private Boolean inKindSupport10;
    private Boolean inKindSupport11;
    private Boolean inKindSupport12;
    private Boolean inKindSupport13;

    @NotNull(message = "{sic.cs2.isSicNeighborEvents}")
    private Boolean isSicNeighborEvents;
    private Integer directSpending1;
    private Integer directSpending2;
    private Integer directSpending3;
    private Integer directSpending4;
    private Integer directSpending5;
    private Integer directSpending6;
    private Integer directSpending7;
    private Integer directSpending8;
    private Integer directSpending9;
    private Integer directSpending10;
    private Integer directSpending11;
    private Integer directSpending12;
    private Integer directSpending13;

    @NotNull(message = "{sic.cs2.spentBySicSupporters}")
    private Integer spentBySicSupporters;

    @NotNull(message = "{sic.cs2.spentByYourCommittee}")
    private Integer spentByYourCommittee;

    private String spendActivityDetails1;
    private String spendActivityDetails2;
    private String spendActivityDetails3;
    private String spendActivityDetails4;
    private String spendActivityDetails5;
    private String spendActivityDetails6;
    private String spendActivityDetails7;
    private String spendActivityDetails8;
    private String spendActivityDetails9;
    private String spendActivityDetails10;
    private String spendActivityDetails11;
    private String spendActivityDetails12;
    private String spendActivityDetails13;
    private String committeeFeeSpecify1;
    private String committeeFeeSpecify2;
    private String committeeFeeSpecify3;
    private String committeeFeeSpecify4;
    private String committeeFeeSpecify5;
    private String committeeFeeSpecify6;
    private Set<SicPpFormNeighborEventViewModel> sicNeighborEvents;
    private Set<Integer> committeeFeeStructure;
    private Integer supportCurrency;
    private Integer committeeCurrency;
    private Integer directCurrency;

    private Boolean activityOther1;
    private Boolean activityOther2;

    private String activityOtherSpecify1;
    private String activityOtherSpecify2;

    private String inKindSupportText1;
    private String inKindSupportText2;
    private String inKindSupportText3;
    private String inKindSupportText4;
    private String inKindSupportText5;
    private String inKindSupportText6;
    private String inKindSupportText7;
    private String inKindSupportText8;
    private String inKindSupportText9;
    private String inKindSupportText10;
    private String inKindSupportText11;
    private String inKindSupportText12;
    private String inKindSupportText13;

    private Set<BlobNames> guideFiles;
    private Set<BlobNames> guideFiles2;
    private Set<BlobNames> guideFiles3;
    private Set<BlobNames> guideFiles4;
    private Set<BlobNames> guideFiles5;
    private Set<BlobNames> guideFiles6;
    private Set<BlobNames> guideFiles7;
    private Set<BlobNames> guideFiles8;
    private Set<BlobNames> guideFiles9;
    private Set<BlobNames> guideFiles10;
    private Set<BlobNames> guideFiles11;
    private Set<BlobNames> guideFiles12;
    private Set<BlobNames> guideFiles13;

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

    public Set<SicPpFormNeighborEventViewModel> getSicNeighborEvents() {
        return sicNeighborEvents;
    }

    public void setSicNeighborEvents(Set<SicPpFormNeighborEventViewModel> sicNeighborEvents) {
        this.sicNeighborEvents = sicNeighborEvents;
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
        this.committeeFeeStructure = committeeFeeStructure;
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

    public Set<BlobNames> getGuideFiles() {
        return guideFiles;
    }

    public void setGuideFiles(Set<BlobNames> guideFiles) {
        this.guideFiles = guideFiles;
    }

    public Set<BlobNames> getGuideFiles13() {
        return guideFiles13;
    }

    public void setGuideFiles13(Set<BlobNames> guideFiles13) {
        this.guideFiles13 = guideFiles13;
    }

    public Set<BlobNames> getGuideFiles12() {
        return guideFiles12;
    }

    public void setGuideFiles12(Set<BlobNames> guideFiles12) {
        this.guideFiles12 = guideFiles12;
    }

    public Set<BlobNames> getGuideFiles11() {
        return guideFiles11;
    }

    public void setGuideFiles11(Set<BlobNames> guideFiles11) {
        this.guideFiles11 = guideFiles11;
    }

    public Set<BlobNames> getGuideFiles10() {
        return guideFiles10;
    }

    public void setGuideFiles10(Set<BlobNames> guideFiles10) {
        this.guideFiles10 = guideFiles10;
    }

    public Set<BlobNames> getGuideFiles9() {
        return guideFiles9;
    }

    public void setGuideFiles9(Set<BlobNames> guideFiles9) {
        this.guideFiles9 = guideFiles9;
    }

    public Set<BlobNames> getGuideFiles8() {
        return guideFiles8;
    }

    public void setGuideFiles8(Set<BlobNames> guideFiles8) {
        this.guideFiles8 = guideFiles8;
    }

    public Set<BlobNames> getGuideFiles7() {
        return guideFiles7;
    }

    public void setGuideFiles7(Set<BlobNames> guideFiles7) {
        this.guideFiles7 = guideFiles7;
    }

    public Set<BlobNames> getGuideFiles6() {
        return guideFiles6;
    }

    public void setGuideFiles6(Set<BlobNames> guideFiles6) {
        this.guideFiles6 = guideFiles6;
    }

    public Set<BlobNames> getGuideFiles5() {
        return guideFiles5;
    }

    public void setGuideFiles5(Set<BlobNames> guideFiles5) {
        this.guideFiles5 = guideFiles5;
    }

    public Set<BlobNames> getGuideFiles4() {
        return guideFiles4;
    }

    public void setGuideFiles4(Set<BlobNames> guideFiles4) {
        this.guideFiles4 = guideFiles4;
    }

    public Set<BlobNames> getGuideFiles3() {
        return guideFiles3;
    }

    public void setGuideFiles3(Set<BlobNames> guideFiles3) {
        this.guideFiles3 = guideFiles3;
    }

    public Set<BlobNames> getGuideFiles2() {
        return guideFiles2;
    }

    public void setGuideFiles2(Set<BlobNames> guideFiles2) {
        this.guideFiles2 = guideFiles2;
    }
}
