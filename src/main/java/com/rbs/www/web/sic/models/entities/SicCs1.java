package com.rbs.www.web.sic.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.web.common.models.datamodels.DocNames;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sic_forms")
public class SicCs1 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs1_membersConservationSFI", nullable = true)
    private Integer membersConservationSFI;

    @Column(name = "cs1_membersGovernmentAgency", nullable = true)
    private Integer membersGovernmentAgency;

    @Column(name = "cs1_membersIndustrySFI", nullable = true)
    private Integer membersIndustrySFI;

    @Column(name = "cs1_membersOtherSFIParticipant", nullable = true)
    private Integer membersOtherSFIParticipant;

    @Column(name = "cs1_membersSFIOrganization", nullable = true)
    private Integer membersSFIOrganization;

    @Column(name = "cs1_membersUniversitySFI", nullable = true)
    private Integer membersUniversitySFI;

    @Column(name = "cs1_supporterConservationOrg", nullable = true)
    private Integer supporterConservationOrg;

    @Column(name = "cs1_supporterConsultant", nullable = true)
    private Integer supporterConsultant;

    @Column(name = "cs1_supporterFamForestOwner", nullable = true)
    private Integer supporterFamForestOwner;

    @Column(name = "cs1_supporterForestryAssoc", nullable = true)
    private Integer supporterForestryAssoc;

    @Column(name = "cs1_supporterGovAgency", nullable = true)
    private Integer supporterGovAgency;

    @Column(name = "cs1_supporterLogger", nullable = true)
    private Integer supporterLogger;

    @Column(name = "cs1_supporterOther", nullable = true)
    private Integer supporterOther;

    @Column(name = "cs1_supporterOtherLocal", nullable = true)
    private Integer supporterOtherLocal;

    @Column(name = "cs1_orgDocAttached", nullable = true)
    private Boolean orgDocAttached;

    @Column(name = "cs1_sicRecruitSfi", nullable = true)
    private Boolean sicRecruitSfi;

    @Column(name = "cs1_sicRepresentSfi", nullable = true)
    private Boolean sicRepresentSfi;

    @Column(name = "cs1_sicPlanRecruitment", nullable = true)
    private Boolean sicPlanRecruitment;

    @Column(name = "cs1_orgDocAttachedWhy", nullable = true)
    private String orgDocAttachedWhy;

    @Column(name = "cs1_sicWebsite", nullable = true)
    private String sicWebsite;

    @Column(name = "cs1_membersOtherSFISpecify", nullable = true)
    private String membersOtherSFISpecify;

    @Column(name = "cs1_sicChairCity", nullable = true)
    private String sicChairCity;

    @Column(name = "cs1_sicChairCompany", nullable = true)
    private String sicChairCompany;

    @Column(name = "cs1_sicChairEmail", nullable = true)
    private String sicChairEmail;

    @Column(name = "cs1_sicChairName", nullable = true)
    private String sicChairName;

    @Column(name = "cs1_sicChairPhone", nullable = true)
    private String sicChairPhone;

    @Column(name = "cs1_sicChairState", nullable = true)
    private String sicChairState;

    @Column(name = "cs1_sicChairStreet", nullable = true)
    private String sicChairStreet;

    @Column(name = "cs1_sicChairZip", nullable = true)
    private String sicChairZip;

    @Column(name = "cs1_sicCoordinatorCity", nullable = true)
    private String sicCoordinatorCity;

    @Column(name = "cs1_sicCoordinatorCompany", nullable = true)
    private String sicCoordinatorCompany;

    @Column(name = "cs1_sicCoordinatorEmail", nullable = true)
    private String sicCoordinatorEmail;

    @Column(name = "cs1_sicCoordinatorName", nullable = true)
    private String sicCoordinatorName;

    @Column(name = "cs1_sicCoordinatorPhone", nullable = true)
    private String sicCoordinatorPhone;

    @Column(name = "cs1_sicCoordinatorState", nullable = true)
    private String sicCoordinatorState;

    @Column(name = "cs1_sicCoordinatorStreet", nullable = true)
    private String sicCoordinatorStreet;

    @Column(name = "cs1_sicCoordinatorZip", nullable = true)
    private String sicCoordinatorZip;

    @Column(name = "cs1_sicRecruitSfiComments", nullable = true)
    private String sicRecruitSfiComments;

    @Column(name = "cs1_sicRepresentSfiComments", nullable = true)
    private String sicRepresentSfiComments;

    @Column(name = "cs1_supporterOtherSpecify", nullable = true)
    private String supporterOtherSpecify;

    @OneToMany(targetEntity = SicPpFormCommittee.class, mappedBy = "sicPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SicPpFormCommittee> subCommittees;

    @OneToMany(targetEntity = SicPpFormMeeting.class, mappedBy = "sicPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SicPpFormMeeting> participatingMeetingList;

    @OneToMany(targetEntity = SicPpFormMeetingType.class, mappedBy = "sicPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SicPpFormMeetingType> meetingList;

    @Column(name = "cs1_contactFiles", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<DocNames> contactFiles;

    @Column(name = "cs1_guideFiles", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
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

    public Boolean getOrgDocAttached() {
        return orgDocAttached;
    }

    public void setOrgDocAttached(Boolean orgDocAttached) {
        this.orgDocAttached = orgDocAttached;
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

    public String getSicWebsite() {
        return sicWebsite;
    }

    public void setSicWebsite(String sicWebsite) {
        this.sicWebsite = sicWebsite;
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

    public Set<SicPpFormCommittee> getSubCommittees() {
        return subCommittees;
    }

    public void setSubCommittees(Set<SicPpFormCommittee> subCommittees) {
        addAll(this.subCommittees, subCommittees);
    }

    public Set<SicPpFormMeeting> getParticipatingMeetingList() {
        return participatingMeetingList;
    }

    public void setParticipatingMeetingList(Set<SicPpFormMeeting> participatingMeetingList) {
        addAll(this.participatingMeetingList, participatingMeetingList);
    }

    public Set<SicPpFormMeetingType> getMeetingList() {
        return meetingList;
    }

    public void setMeetingList(Set<SicPpFormMeetingType> meetingList) {
        addAll(this.meetingList, meetingList);
    }

    public Set<DocNames> getContactFiles() {
        return contactFiles;
    }

    public void setContactFiles(Set<DocNames> contactFiles) {
        addAll(this.contactFiles, contactFiles);
    }

    public Set<DocNames> getGuideFiles() {
        return guideFiles;
    }

    public void setGuideFiles(Set<DocNames> guideFiles) {
        addAll(this.guideFiles, guideFiles);
    }
}
