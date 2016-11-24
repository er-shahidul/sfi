package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.SpELAssert;

import java.util.Set;

@SpELAssert.List({
        @SpELAssert(
                value = "protectionMaintenanceWaterResItems1 != null && !protectionMaintenanceWaterResItems1.isEmpty()",
                applyIf = "protectionMaintenanceWaterRes != null && protectionMaintenanceWaterRes.equals('1')",
                message = "{cs9.protectionMaintenanceWaterResItems1}"
        ),
        @SpELAssert(
                value = "protectionMaintenanceWaterResItems2 != null && !protectionMaintenanceWaterResItems2.isEmpty()",
                applyIf = "protectionMaintenanceWaterRes != null && protectionMaintenanceWaterRes.equals('2')",
                message = "{cs9.protectionMaintenanceWaterResItems2}"
        ),
        @SpELAssert(
                value = "protectionMaintenanceRationale != null && !protectionMaintenanceRationale.isEmpty()",
                applyIf = "protectionMaintenanceWaterRes != null && protectionMaintenanceWaterRes.equals('3')",
                message = "{cs9.protectionMaintenanceRationale}"
        ),
        @SpELAssert(
                value = "conservationBiodiversity413Items1 != null && !conservationBiodiversity413Items1.isEmpty()",
                applyIf = "conservationBiodiversity413 != null && conservationBiodiversity413.equals('1')",
                message = "{cs9.conservationBiodiversity413Items1}"
        ),
        @SpELAssert(
                value = "conservationBiodiversity413Items2 != null && !conservationBiodiversity413Items2.isEmpty()",
                applyIf = "conservationBiodiversity413 != null && conservationBiodiversity413.equals('2')",
                message = "{cs9.conservationBiodiversity413Items2}"
        ),
        @SpELAssert(
                value = "conservation413Rationale != null && !conservation413Rationale.isEmpty()",
                applyIf = "conservationBiodiversity413 != null && conservationBiodiversity413.equals('3')",
                message = "{cs9.conservation413Rationale}"
        ),
        @SpELAssert(
                value = "conservationBiodiversity414Items1 != null && !conservationBiodiversity414Items1.isEmpty()",
                applyIf = "conservationBiodiversity414 != null && conservationBiodiversity414.equals('1')",
                message = "{cs9.conservationBiodiversity414Items1}"
        ),
        @SpELAssert(
                value = "conservationBiodiversity414Items2 != null && !conservationBiodiversity414Items2.isEmpty()",
                applyIf = "conservationBiodiversity414 != null && conservationBiodiversity414.equals('2')",
                message = "{cs9.conservationBiodiversity414Items2}"
        ),
        @SpELAssert(
                value = "conservation414Rationale != null && !conservation414Rationale.isEmpty()",
                applyIf = "conservationBiodiversity414 != null && conservationBiodiversity414.equals('3')",
                message = "{cs9.conservation414Rationale}"
        ),
        @SpELAssert(
                value = "trainingEducationItems1 != null && !trainingEducationItems1.isEmpty()",
                applyIf = "trainingEducation != null && trainingEducation.equals('1')",
                message = "{cs9.trainingEducationItems1}"
        ),
        @SpELAssert(
                value = "trainingEduRationale != null && !trainingEduRationale.isEmpty()",
                applyIf = "trainingEducation != null && trainingEducation.equals('3')",
                message = "{cs9.trainingEduRationale}"
        )
})
public class Cs9ViewModel extends BaseViewModel {
    private Integer id;
    private Boolean acknowledge;
    private Set<Integer> conservationBiodiversity413Items;
    private Set<Integer> conservationBiodiversity414Items;
    private Set<Integer> indigenousPeoplesForestItems;
    private Set<Integer> indigenousPeoplesPrivateItems;
    private Set<Integer> indigenousPeoplesPublicItems;
    private Set<Integer> trainingEducationItems;
    private Set<SfiPpFormStoryViewModel> stories;
    private String conservationBiodiversity413;
    private String conservationBiodiversity414;
    private String conservationBiodiversity415;
    private String indigenousPeoplesForest;
    private String indigenousPeoplesPrivate;
    private String indigenousPeoplesPublic;
    private String protectionMaintenanceWaterRes;

    private String trainingEducation;

    private Set<Integer> protectionMaintenanceWaterResItems1;
    private Set<Integer> protectionMaintenanceWaterResItems2;
    private Set<Integer> conservationBiodiversity413Items1;
    private Set<Integer> conservationBiodiversity413Items2;
    private Set<Integer> conservationBiodiversity414Items1;
    private Set<Integer> conservationBiodiversity414Items2;
    private Set<Integer> indigenousPeoplesPublicItems1;
    private Set<Integer> indigenousPeoplesPublicItems2;
    private Set<Integer> indigenousPeoplesPrivateItems1;
    private Set<Integer> indigenousPeoplesPrivateItems2;
    private Set<Integer> indigenousPeoplesForestItems1;
    private Set<Integer> indigenousPeoplesForestItems2;
    private Set<Integer> trainingEducationItems1;
    private Set<Integer> trainingEducationItems2;

    private String conservation413DataSource1_2;
    private String conservation413DataSource1_4;
    private String conservation413DataSource2_2;
    private String conservation413DataSource2_4;
    private String conservation414Explain1_1;
    private String conservation414Explain1_2;
    private String conservation414Explain1_5;
    private String conservation414Explain1_6;
    private String conservation414Explain2_1;
    private String conservation414Explain2_2;
    private String conservation414Explain2_5;
    private String conservation414Explain2_6;
    private String conservation415Explain1_1;
    private String conservation415Explain1_2;
    private String protectionMaintenanceRationale;
    private String conservation413Rationale;
    private String conservation414Rationale;
    private String conservation415Rationale;
    private String indigenousPublicRationale;
    private String indigenousPrivateRationale;
    private String indigenousForestPractice;
    private String trainingEduRationale;

    private String conservationBiodiversity415Exp;
    private String trainingEduRationaleAnother;
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

    public void setIndigenousPeoplesPublicItems2(Set<Integer> indigenousPeoplesPublicItems2) {
        this.indigenousPeoplesPublicItems2 = indigenousPeoplesPublicItems2;
    }

    public Set<Integer> getIndigenousPeoplesForestItems2() {
        return indigenousPeoplesForestItems2;
    }

    public void setIndigenousPeoplesForestItems2(Set<Integer> indigenousPeoplesForestItems2) {
        this.indigenousPeoplesForestItems2 = indigenousPeoplesForestItems2;
    }

    public Set<Integer> getTrainingEducationItems2() {
        return trainingEducationItems2;
    }

    public void setTrainingEducationItems2(Set<Integer> trainingEducationItems2) {
        this.trainingEducationItems2 = trainingEducationItems2;
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

    public Set<Integer> getProtectionMaintenanceWaterResItems1() {
        return protectionMaintenanceWaterResItems1;
    }

    public void setProtectionMaintenanceWaterResItems1(Set<Integer> protectionMaintenanceWaterResItems1) {
        this.protectionMaintenanceWaterResItems1 = protectionMaintenanceWaterResItems1;
    }

    public Set<Integer> getProtectionMaintenanceWaterResItems2() {
        return protectionMaintenanceWaterResItems2;
    }

    public void setProtectionMaintenanceWaterResItems2(Set<Integer> protectionMaintenanceWaterResItems2) {
        this.protectionMaintenanceWaterResItems2 = protectionMaintenanceWaterResItems2;
    }

    public Set<Integer> getConservationBiodiversity413Items1() {
        return conservationBiodiversity413Items1;
    }

    public void setConservationBiodiversity413Items1(Set<Integer> conservationBiodiversity413Items1) {
        this.conservationBiodiversity413Items1 = conservationBiodiversity413Items1;
    }

    public Set<Integer> getConservationBiodiversity414Items1() {
        return conservationBiodiversity414Items1;
    }

    public void setConservationBiodiversity414Items1(Set<Integer> conservationBiodiversity414Items1) {
        this.conservationBiodiversity414Items1 = conservationBiodiversity414Items1;
    }

    public Set<Integer> getIndigenousPeoplesPublicItems1() {
        return indigenousPeoplesPublicItems1;
    }

    public void setIndigenousPeoplesPublicItems1(Set<Integer> indigenousPeoplesPublicItems1) {
        this.indigenousPeoplesPublicItems1 = indigenousPeoplesPublicItems1;
    }

    public Set<Integer> getIndigenousPeoplesPrivateItems1() {
        return indigenousPeoplesPrivateItems1;
    }

    public void setIndigenousPeoplesPrivateItems1(Set<Integer> indigenousPeoplesPrivateItems1) {
        this.indigenousPeoplesPrivateItems1 = indigenousPeoplesPrivateItems1;
    }

    public Set<Integer> getIndigenousPeoplesPrivateItems2() {
        return indigenousPeoplesPrivateItems2;
    }

    public void setIndigenousPeoplesPrivateItems2(Set<Integer> indigenousPeoplesPrivateItems2) {
        this.indigenousPeoplesPrivateItems2 = indigenousPeoplesPrivateItems2;
    }

    public Set<Integer> getIndigenousPeoplesForestItems1() {
        return indigenousPeoplesForestItems1;
    }

    public void setIndigenousPeoplesForestItems1(Set<Integer> indigenousPeoplesForestItems1) {
        this.indigenousPeoplesForestItems1 = indigenousPeoplesForestItems1;
    }

    public Set<Integer> getTrainingEducationItems1() {
        return trainingEducationItems1;
    }

    public void setTrainingEducationItems1(Set<Integer> trainingEducationItems1) {
        this.trainingEducationItems1 = trainingEducationItems1;
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
        this.conservationBiodiversity413Items = conservationBiodiversity413Items;
    }

    public Set<Integer> getConservationBiodiversity414Items() {
        return conservationBiodiversity414Items;
    }

    public void setConservationBiodiversity414Items(Set<Integer> conservationBiodiversity414Items) {
        this.conservationBiodiversity414Items = conservationBiodiversity414Items;
    }

    public Set<Integer> getIndigenousPeoplesForestItems() {
        return indigenousPeoplesForestItems;
    }

    public void setIndigenousPeoplesForestItems(Set<Integer> indigenousPeoplesForestItems) {
        this.indigenousPeoplesForestItems = indigenousPeoplesForestItems;
    }

    public Set<Integer> getIndigenousPeoplesPrivateItems() {
        return indigenousPeoplesPrivateItems;
    }

    public void setIndigenousPeoplesPrivateItems(Set<Integer> indigenousPeoplesPrivateItems) {
        this.indigenousPeoplesPrivateItems = indigenousPeoplesPrivateItems;
    }

    public Set<Integer> getIndigenousPeoplesPublicItems() {
        return indigenousPeoplesPublicItems;
    }

    public void setIndigenousPeoplesPublicItems(Set<Integer> indigenousPeoplesPublicItems) {
        this.indigenousPeoplesPublicItems = indigenousPeoplesPublicItems;
    }

    public Set<Integer> getTrainingEducationItems() {
        return trainingEducationItems;
    }

    public void setTrainingEducationItems(Set<Integer> trainingEducationItems) {
        this.trainingEducationItems = trainingEducationItems;
    }

    public Set<SfiPpFormStoryViewModel> getStories() {
        return stories;
    }

    public void setStories(Set<SfiPpFormStoryViewModel> stories) {
        this.stories = stories;
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

    public Set<Integer> getConservationBiodiversity413Items2() {
        return conservationBiodiversity413Items2;
    }

    public void setConservationBiodiversity413Items2(Set<Integer> conservationBiodiversity413Items2) {
        this.conservationBiodiversity413Items2 = conservationBiodiversity413Items2;
    }

    public Set<Integer> getConservationBiodiversity414Items2() {
        return conservationBiodiversity414Items2;
    }

    public void setConservationBiodiversity414Items2(Set<Integer> conservationBiodiversity414Items2) {
        this.conservationBiodiversity414Items2 = conservationBiodiversity414Items2;
    }
}
