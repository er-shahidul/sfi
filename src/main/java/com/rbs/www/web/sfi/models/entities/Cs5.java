package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs5 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs5_organization_list_academic", nullable = true)
    private String organizationListAcademic;

    @Column(name = "cs5_organization_list_research", nullable = true)
    private String organizationListResearch;

    @Column(name = "cs5_organization_list_conservation", nullable = true)
    private String organizationListConservation;

    @Column(name = "cs5_organization_list_government", nullable = true)
    private String organizationListGovernment;

    @Column(name = "cs5_organization_list_community", nullable = true)
    private String organizationListCommunity;

    @Column(name = "cs5_organization_list_other", nullable = true)
    private String organizationListOther;

    @Column(name = "cs5_other", nullable = true)
    private String other;

    @Column(name = "cs5_isInPartnership", nullable = true)
    private Boolean isInPartnership;

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

    public String getOrganizationListAcademic() {
        return organizationListAcademic;
    }

    public void setOrganizationListAcademic(String organizationListAcademic) {
        this.organizationListAcademic = organizationListAcademic;
    }

    public String getOrganizationListResearch() {
        return organizationListResearch;
    }

    public void setOrganizationListResearch(String organizationListResearch) {
        this.organizationListResearch = organizationListResearch;
    }

    public String getOrganizationListConservation() {
        return organizationListConservation;
    }

    public void setOrganizationListConservation(String organizationListConservation) {
        this.organizationListConservation = organizationListConservation;
    }

    public String getOrganizationListGovernment() {
        return organizationListGovernment;
    }

    public void setOrganizationListGovernment(String organizationListGovernment) {
        this.organizationListGovernment = organizationListGovernment;
    }

    public String getOrganizationListCommunity() {
        return organizationListCommunity;
    }

    public void setOrganizationListCommunity(String organizationListCommunity) {
        this.organizationListCommunity = organizationListCommunity;
    }

    public String getOrganizationListOther() {
        return organizationListOther;
    }

    public void setOrganizationListOther(String organizationListOther) {
        this.organizationListOther = organizationListOther;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
