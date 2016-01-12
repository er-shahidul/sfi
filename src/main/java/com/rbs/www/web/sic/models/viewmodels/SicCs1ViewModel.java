package com.rbs.www.web.sic.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.web.common.models.datamodels.DocNames;

import java.util.Set;

public class SicCs1ViewModel extends BaseViewModel {
    private Integer id;
    private Integer membersConservationSFI;
    private Integer membersGovernmentAgency;
    private Integer membersIndustrySFI;
    private Integer membersOtherSFIParticipant;
    private Integer membersSFIOrganization;
    private Integer membersUniversitySFI;
    private Integer supporterConservationOrg;
    private Integer supporterConsultant;
    private Integer supporterFamForestOwner;
    private Integer supporterForestryAssoc;
    private Integer supporterGovAgency;
    private Integer supporterLogger;
    private Integer supporterOther;
    private Integer supporterOtherLocal;
    private Boolean orgDocAttached;
    private Boolean sicRecruitSfi;
    private Boolean sicRepresentSfi;
    private Boolean sicPlanRecruitment;
    private String orgDocAttachedWhy;
    private String sicWebsite;
    private String membersOtherSFISpecify;
    private String sicChairCity;
    private String sicChairCompany;
    private String sicChairEmail;
    private String sicChairName;
    private String sicChairPhone;
    private String sicChairState;
    private String sicChairStreet;
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
    private Set<DocNames> contactFiles;
    private Set<DocNames> guideFiles;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Set<DocNames> getContactFiles() {
        return contactFiles;
    }

    public void setContactFiles(Set<DocNames> contactFiles) {
        this.contactFiles = contactFiles;
    }

    public Set<DocNames> getGuideFiles() {
        return guideFiles;
    }

    public void setGuideFiles(Set<DocNames> guideFiles) {
        this.guideFiles = guideFiles;
    }
}
