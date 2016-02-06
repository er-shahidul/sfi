package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.SpELAssert;
import com.rbs.www.web.common.models.datamodels.BlobNames;

import javax.validation.constraints.NotNull;
import java.util.Set;

@SpELAssert.List({
        @SpELAssert(
                value = "sicRecruitSfiComments != null && !sicRecruitSfiComments.isEmpty()",
                applyIf = "sicRecruitSfi != null && sicRecruitSfi",
                message = "{sic.cs1.sicRecruitSfiComments}"
        ),
        @SpELAssert(
                value = "sicRecruitmentOrgs != null && !sicRecruitmentOrgs.isEmpty()",
                applyIf = "sicPlanRecruitment != null && sicPlanRecruitment",
                message = "{sic.cs1.sicRecruitmentOrgs}"
        )
})
public class SicCs1ViewModel extends BaseViewModel {
    private Integer id;

    @NotNull(message = "{sic.cs1.membersConservationSFI}")
    private Integer membersConservationSFI;

    @NotNull(message = "{sic.cs1.membersGovernmentAgency}")
    private Integer membersGovernmentAgency;

    @NotNull(message = "{sic.cs1.membersIndustrySFI}")
    private Integer membersIndustrySFI;
    private Integer membersOtherSFIParticipant;

    @NotNull(message = "{sic.cs1.membersSFIOrganization}")
    private Integer membersSFIOrganization;

    @NotNull(message = "{sic.cs1.membersUniversitySFI}")
    private Integer membersUniversitySFI;

    @NotNull(message = "{sic.cs1.supporterConservationOrg}")
    private Integer supporterConservationOrg;

    @NotNull(message = "{sic.cs1.supporterConsultant}")
    private Integer supporterConsultant;

    @NotNull(message = "{sic.cs1.supporterFamForestOwner}")
    private Integer supporterFamForestOwner;

    @NotNull(message = "{sic.cs1.supporterForestryAssoc}")
    private Integer supporterForestryAssoc;

    @NotNull(message = "{sic.cs1.supporterGovAgency}")
    private Integer supporterGovAgency;

    @NotNull(message = "{sic.cs1.supporterLogger}")
    private Integer supporterLogger;
    private Integer supporterOther;

    @NotNull(message = "{sic.cs1.supporterOtherLocal}")
    private Integer supporterOtherLocal;
    private Boolean orgDocAttached;
    private Boolean sicRecruitSfi;
    private Boolean sicRepresentSfi;
    private Boolean sicPlanRecruitment;
    private String orgDocAttachedWhy;
    private String sicWebsite;
    private String membersOtherSFISpecify;

    @NotNull(message = "{sic.cs1.sicChairCity}")
    private String sicChairCity;

    @NotNull(message = "{sic.cs1.sicChairCompany}")
    private String sicChairCompany;

    @NotNull(message = "{sic.cs1.sicChairEmail}")
    private String sicChairEmail;

    @NotNull(message = "{sic.cs1.sicChairName}")
    private String sicChairName;

    @NotNull(message = "{sic.cs1.sicChairPhone}")
    private String sicChairPhone;

    @NotNull(message = "{sic.cs1.sicChairState}")
    private String sicChairState;

    @NotNull(message = "{sic.cs1.sicChairStreet}")
    private String sicChairStreet;

    @NotNull(message = "{sic.cs1.sicChairZip}")
    private String sicChairZip;

    private String sicCoordinatorCity;
    private String sicCoordinatorCompany;
    private String sicCoordinatorEmail;
    private String sicCoordinatorName;
    private String sicCoordinatorPhone;
    private String sicCoordinatorState;
    private String sicCoordinatorStreet;
    private String sicCoordinatorZip;
    private String sicRecruitSfiComments;
    private String sicRepresentSfiComments;
    private String supporterOtherSpecify;
    private Set<SicPpFormCommitteeViewModel> subCommittees;
    private Set<SicPpFormMeetingViewModel> participatingMeetingList;
    private Set<SicPpFormMeetingTypeViewModel> meetingList;
    private Set<BlobNames> contactFiles;
    private Set<BlobNames> guideFiles;

    private String sicRecrOrgsSpecify1;
    private String sicRecrOrgsSpecify2;
    private String sicRecrOrgsSpecify3;
    private String sicRecrOrgsSpecify4;
    private String sicRecrOrgsSpecify5;
    private Set<Integer> sicRecruitmentOrgs;
    private Integer sicOrgDescription;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSicOrgDescription() {
        return sicOrgDescription;
    }

    public void setSicOrgDescription(Integer sicOrgDescription) {
        this.sicOrgDescription = sicOrgDescription;
    }

    public Integer getMembersConservationSFI() {
        return membersConservationSFI;
    }

    public void setMembersConservationSFI(Integer membersConservationSFI) {
        this.membersConservationSFI = membersConservationSFI;
    }

    public Integer getMembersGovernmentAgency() {
        return membersGovernmentAgency;
    }

    public void setMembersGovernmentAgency(Integer membersGovernmentAgency) {
        this.membersGovernmentAgency = membersGovernmentAgency;
    }

    public Integer getMembersIndustrySFI() {
        return membersIndustrySFI;
    }

    public void setMembersIndustrySFI(Integer membersIndustrySFI) {
        this.membersIndustrySFI = membersIndustrySFI;
    }

    public Integer getMembersOtherSFIParticipant() {
        return membersOtherSFIParticipant;
    }

    public void setMembersOtherSFIParticipant(Integer membersOtherSFIParticipant) {
        this.membersOtherSFIParticipant = membersOtherSFIParticipant;
    }

    public Integer getMembersSFIOrganization() {
        return membersSFIOrganization;
    }

    public void setMembersSFIOrganization(Integer membersSFIOrganization) {
        this.membersSFIOrganization = membersSFIOrganization;
    }

    public Integer getMembersUniversitySFI() {
        return membersUniversitySFI;
    }

    public void setMembersUniversitySFI(Integer membersUniversitySFI) {
        this.membersUniversitySFI = membersUniversitySFI;
    }

    public Integer getSupporterConservationOrg() {
        return supporterConservationOrg;
    }

    public void setSupporterConservationOrg(Integer supporterConservationOrg) {
        this.supporterConservationOrg = supporterConservationOrg;
    }

    public Integer getSupporterConsultant() {
        return supporterConsultant;
    }

    public void setSupporterConsultant(Integer supporterConsultant) {
        this.supporterConsultant = supporterConsultant;
    }

    public Integer getSupporterFamForestOwner() {
        return supporterFamForestOwner;
    }

    public void setSupporterFamForestOwner(Integer supporterFamForestOwner) {
        this.supporterFamForestOwner = supporterFamForestOwner;
    }

    public Integer getSupporterForestryAssoc() {
        return supporterForestryAssoc;
    }

    public void setSupporterForestryAssoc(Integer supporterForestryAssoc) {
        this.supporterForestryAssoc = supporterForestryAssoc;
    }

    public Integer getSupporterGovAgency() {
        return supporterGovAgency;
    }

    public void setSupporterGovAgency(Integer supporterGovAgency) {
        this.supporterGovAgency = supporterGovAgency;
    }

    public Integer getSupporterLogger() {
        return supporterLogger;
    }

    public void setSupporterLogger(Integer supporterLogger) {
        this.supporterLogger = supporterLogger;
    }

    public Integer getSupporterOther() {
        return supporterOther;
    }

    public void setSupporterOther(Integer supporterOther) {
        this.supporterOther = supporterOther;
    }

    public Integer getSupporterOtherLocal() {
        return supporterOtherLocal;
    }

    public void setSupporterOtherLocal(Integer supporterOtherLocal) {
        this.supporterOtherLocal = supporterOtherLocal;
    }

    public Boolean getSicRecruitSfi() {
        return sicRecruitSfi;
    }

    public void setSicRecruitSfi(Boolean sicRecruitSfi) {
        this.sicRecruitSfi = sicRecruitSfi;
    }

    public Boolean getSicRepresentSfi() {
        return sicRepresentSfi;
    }

    public void setSicRepresentSfi(Boolean sicRepresentSfi) {
        this.sicRepresentSfi = sicRepresentSfi;
    }

    public Boolean getSicPlanRecruitment() {
        return sicPlanRecruitment;
    }

    public void setSicPlanRecruitment(Boolean sicPlanRecruitment) {
        this.sicPlanRecruitment = sicPlanRecruitment;
    }

    public String getOrgDocAttachedWhy() {
        return orgDocAttachedWhy;
    }

    public void setOrgDocAttachedWhy(String orgDocAttachedWhy) {
        this.orgDocAttachedWhy = orgDocAttachedWhy;
    }

    public String getMembersOtherSFISpecify() {
        return membersOtherSFISpecify;
    }

    public void setMembersOtherSFISpecify(String membersOtherSFISpecify) {
        this.membersOtherSFISpecify = membersOtherSFISpecify;
    }

    public String getSicChairCity() {
        return sicChairCity;
    }

    public void setSicChairCity(String sicChairCity) {
        this.sicChairCity = sicChairCity;
    }

    public String getSicChairCompany() {
        return sicChairCompany;
    }

    public void setSicChairCompany(String sicChairCompany) {
        this.sicChairCompany = sicChairCompany;
    }

    public String getSicChairEmail() {
        return sicChairEmail;
    }

    public void setSicChairEmail(String sicChairEmail) {
        this.sicChairEmail = sicChairEmail;
    }

    public String getSicChairName() {
        return sicChairName;
    }

    public void setSicChairName(String sicChairName) {
        this.sicChairName = sicChairName;
    }

    public String getSicChairPhone() {
        return sicChairPhone;
    }

    public void setSicChairPhone(String sicChairPhone) {
        this.sicChairPhone = sicChairPhone;
    }

    public String getSicChairState() {
        return sicChairState;
    }

    public void setSicChairState(String sicChairState) {
        this.sicChairState = sicChairState;
    }

    public String getSicChairStreet() {
        return sicChairStreet;
    }

    public void setSicChairStreet(String sicChairStreet) {
        this.sicChairStreet = sicChairStreet;
    }

    public String getSicChairZip() {
        return sicChairZip;
    }

    public void setSicChairZip(String sicChairZip) {
        this.sicChairZip = sicChairZip;
    }

    public String getSicCoordinatorCity() {
        return sicCoordinatorCity;
    }

    public void setSicCoordinatorCity(String sicCoordinatorCity) {
        this.sicCoordinatorCity = sicCoordinatorCity;
    }

    public String getSicCoordinatorCompany() {
        return sicCoordinatorCompany;
    }

    public void setSicCoordinatorCompany(String sicCoordinatorCompany) {
        this.sicCoordinatorCompany = sicCoordinatorCompany;
    }

    public String getSicCoordinatorEmail() {
        return sicCoordinatorEmail;
    }

    public void setSicCoordinatorEmail(String sicCoordinatorEmail) {
        this.sicCoordinatorEmail = sicCoordinatorEmail;
    }

    public String getSicCoordinatorName() {
        return sicCoordinatorName;
    }

    public void setSicCoordinatorName(String sicCoordinatorName) {
        this.sicCoordinatorName = sicCoordinatorName;
    }

    public String getSicCoordinatorPhone() {
        return sicCoordinatorPhone;
    }

    public void setSicCoordinatorPhone(String sicCoordinatorPhone) {
        this.sicCoordinatorPhone = sicCoordinatorPhone;
    }

    public String getSicCoordinatorState() {
        return sicCoordinatorState;
    }

    public void setSicCoordinatorState(String sicCoordinatorState) {
        this.sicCoordinatorState = sicCoordinatorState;
    }

    public String getSicCoordinatorStreet() {
        return sicCoordinatorStreet;
    }

    public void setSicCoordinatorStreet(String sicCoordinatorStreet) {
        this.sicCoordinatorStreet = sicCoordinatorStreet;
    }

    public String getSicCoordinatorZip() {
        return sicCoordinatorZip;
    }

    public void setSicCoordinatorZip(String sicCoordinatorZip) {
        this.sicCoordinatorZip = sicCoordinatorZip;
    }

    public String getSicRecruitSfiComments() {
        return sicRecruitSfiComments;
    }

    public void setSicRecruitSfiComments(String sicRecruitSfiComments) {
        this.sicRecruitSfiComments = sicRecruitSfiComments;
    }

    public String getSicRepresentSfiComments() {
        return sicRepresentSfiComments;
    }

    public void setSicRepresentSfiComments(String sicRepresentSfiComments) {
        this.sicRepresentSfiComments = sicRepresentSfiComments;
    }

    public String getSupporterOtherSpecify() {
        return supporterOtherSpecify;
    }

    public void setSupporterOtherSpecify(String supporterOtherSpecify) {
        this.supporterOtherSpecify = supporterOtherSpecify;
    }

    public Set<SicPpFormCommitteeViewModel> getSubCommittees() {
        return subCommittees;
    }

    public void setSubCommittees(Set<SicPpFormCommitteeViewModel> subCommittees) {
        this.subCommittees = subCommittees;
    }

    public Set<SicPpFormMeetingViewModel> getParticipatingMeetingList() {
        return participatingMeetingList;
    }

    public void setParticipatingMeetingList(Set<SicPpFormMeetingViewModel> participatingMeetingList) {
        this.participatingMeetingList = participatingMeetingList;
    }

    public Set<SicPpFormMeetingTypeViewModel> getMeetingList() {
        return meetingList;
    }

    public void setMeetingList(Set<SicPpFormMeetingTypeViewModel> meetingList) {
        this.meetingList = meetingList;
    }

    public Boolean getOrgDocAttached() {
        return orgDocAttached;
    }

    public void setOrgDocAttached(Boolean orgDocAttached) {
        this.orgDocAttached = orgDocAttached;
    }

    public String getSicWebsite() {
        return sicWebsite;
    }

    public void setSicWebsite(String sicWebsite) {
        this.sicWebsite = sicWebsite;
    }

    public Set<BlobNames> getContactFiles() {
        return contactFiles;
    }

    public void setContactFiles(Set<BlobNames> contactFiles) {
        this.contactFiles = contactFiles;
    }

    public Set<BlobNames> getGuideFiles() {
        return guideFiles;
    }

    public void setGuideFiles(Set<BlobNames> guideFiles) {
        this.guideFiles = guideFiles;
    }

    public String getSicRecrOrgsSpecify1() {
        return sicRecrOrgsSpecify1;
    }

    public void setSicRecrOrgsSpecify1(String sicRecrOrgsSpecify1) {
        this.sicRecrOrgsSpecify1 = sicRecrOrgsSpecify1;
    }

    public String getSicRecrOrgsSpecify2() {
        return sicRecrOrgsSpecify2;
    }

    public void setSicRecrOrgsSpecify2(String sicRecrOrgsSpecify2) {
        this.sicRecrOrgsSpecify2 = sicRecrOrgsSpecify2;
    }

    public String getSicRecrOrgsSpecify3() {
        return sicRecrOrgsSpecify3;
    }

    public void setSicRecrOrgsSpecify3(String sicRecrOrgsSpecify3) {
        this.sicRecrOrgsSpecify3 = sicRecrOrgsSpecify3;
    }

    public String getSicRecrOrgsSpecify4() {
        return sicRecrOrgsSpecify4;
    }

    public void setSicRecrOrgsSpecify4(String sicRecrOrgsSpecify4) {
        this.sicRecrOrgsSpecify4 = sicRecrOrgsSpecify4;
    }

    public String getSicRecrOrgsSpecify5() {
        return sicRecrOrgsSpecify5;
    }

    public void setSicRecrOrgsSpecify5(String sicRecrOrgsSpecify5) {
        this.sicRecrOrgsSpecify5 = sicRecrOrgsSpecify5;
    }

    public Set<Integer> getSicRecruitmentOrgs() {
        return sicRecruitmentOrgs;
    }

    public void setSicRecruitmentOrgs(Set<Integer> sicRecruitmentOrgs) {
        this.sicRecruitmentOrgs = sicRecruitmentOrgs;
    }
}
