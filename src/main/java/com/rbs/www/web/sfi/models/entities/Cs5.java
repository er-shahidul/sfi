package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs5 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs5_organization_list_academic", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic;

    @Column(name = "cs5_organization_list_research", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch;

    @Column(name = "cs5_organization_list_conservation", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation;

    @Column(name = "cs5_organization_list_government", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment;

    @Column(name = "cs5_organization_list_community", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity;

    @Column(name = "cs5_organization_list_other", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther;

    @Column(name = "cs5_other", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other;

    @Column(name = "cs5_isInPartnership", nullable = true)
    private Boolean isInPartnership;

    @Column(name = "cs5_isOtherEnabled", nullable = true)
    private Boolean isOtherEnabled;

    @Column(name = "cs5_otherText", nullable = true)
    private String otherText;

    @OneToMany(targetEntity = SfiPpFormCs3.class, mappedBy = "sfiPpForm", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SfiPpFormCs3> projects;

    @Column(name = "cs5_fundSFIActiv_stateProvi_ca", nullable = true)
    private Integer fundSFIActivStateProviCa;

    @Column(name = "cs5_fundSFIActiv_stateProvi_us", nullable = true)
    private Integer fundSFIActivStateProviUs;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsOtherEnabled() {
        return isOtherEnabled;
    }

    public void setIsOtherEnabled(Boolean isOtherEnabled) {
        this.isOtherEnabled = isOtherEnabled;
    }

    public String getOtherText() {
        return otherText;
    }

    public void setOtherText(String otherText) {
        this.otherText = otherText;
    }

    public Integer getFundSFIActivStateProviCa() {
        return fundSFIActivStateProviCa;
    }

    public void setFundSFIActivStateProviCa(Integer fundSFIActivStateProviCa) {
        this.fundSFIActivStateProviCa = fundSFIActivStateProviCa;
    }

    public Integer getFundSFIActivStateProviUs() {
        return fundSFIActivStateProviUs;
    }

    public void setFundSFIActivStateProviUs(Integer fundSFIActivStateProviUs) {
        this.fundSFIActivStateProviUs = fundSFIActivStateProviUs;
    }

    public Boolean getIsInPartnership() {
        return isInPartnership;
    }

    public void setIsInPartnership(Boolean isInPartnership) {
        this.isInPartnership = isInPartnership;
    }

    public Set<SfiPpFormCs3> getProjects() {
        return projects;
    }

    public void setProjects(Set<SfiPpFormCs3> projects) {
        addAll(this.projects, projects);
    }

    public Set<String> getOrganizationListAcademic() {
        return organizationListAcademic;
    }

    public void setOrganizationListAcademic(Set<String> organizationListAcademic) {
        addAll(this.organizationListAcademic, organizationListAcademic);
    }

    public Set<String> getOrganizationListResearch() {
        return organizationListResearch;
    }

    public void setOrganizationListResearch(Set<String> organizationListResearch) {
        addAll(this.organizationListResearch, organizationListResearch);
    }

    public Set<String> getOrganizationListConservation() {
        return organizationListConservation;
    }

    public void setOrganizationListConservation(Set<String> organizationListConservation) {
        addAll(this.organizationListConservation, organizationListConservation);
    }

    public Set<String> getOrganizationListGovernment() {
        return organizationListGovernment;
    }

    public void setOrganizationListGovernment(Set<String> organizationListGovernment) {
        addAll(this.organizationListGovernment, organizationListGovernment);
    }

    public Set<String> getOrganizationListCommunity() {
        return organizationListCommunity;
    }

    public void setOrganizationListCommunity(Set<String> organizationListCommunity) {
        addAll(this.organizationListCommunity, organizationListCommunity);
    }

    public Set<String> getOrganizationListOther() {
        return organizationListOther;
    }

    public void setOrganizationListOther(Set<String> organizationListOther) {
        addAll(this.organizationListOther, organizationListOther);
    }

    public Set<String> getOther() {
        return other;
    }

    public void setOther(Set<String> other) {
        addAll(this.other, other);
    }
}
