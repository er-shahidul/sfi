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

    @Column(name = "cs5_organization_list_academic1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic1;

    @Column(name = "cs5_organization_list_research1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch1;

    @Column(name = "cs5_organization_list_conservation1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation1;

    @Column(name = "cs5_organization_list_government1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment1;

    @Column(name = "cs5_organization_list_community1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity1;

    @Column(name = "cs5_organization_list_other1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther1;

    @Column(name = "cs5_other1", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other1;



    @Column(name = "cs5_organization_list_academic2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic2;

    @Column(name = "cs5_organization_list_research2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch2;

    @Column(name = "cs5_organization_list_conservation2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation2;

    @Column(name = "cs5_organization_list_government2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment2;

    @Column(name = "cs5_organization_list_community2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity2;

    @Column(name = "cs5_organization_list_other2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther2;

    @Column(name = "cs5_other2", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other2;



    @Column(name = "cs5_organization_list_academic3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic3;

    @Column(name = "cs5_organization_list_research3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch3;

    @Column(name = "cs5_organization_list_conservation3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation3;

    @Column(name = "cs5_organization_list_government3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment3;

    @Column(name = "cs5_organization_list_community3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity3;

    @Column(name = "cs5_organization_list_other3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther3;

    @Column(name = "cs5_other3", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other3;



    @Column(name = "cs5_organization_list_academic4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic4;

    @Column(name = "cs5_organization_list_research4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch4;

    @Column(name = "cs5_organization_list_conservation4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation4;

    @Column(name = "cs5_organization_list_government4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment4;

    @Column(name = "cs5_organization_list_community4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity4;

    @Column(name = "cs5_organization_list_other4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther4;

    @Column(name = "cs5_other4", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other4;



    @Column(name = "cs5_organization_list_academic5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic5;

    @Column(name = "cs5_organization_list_research5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch5;

    @Column(name = "cs5_organization_list_conservation5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation5;

    @Column(name = "cs5_organization_list_government5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment5;

    @Column(name = "cs5_organization_list_community5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity5;

    @Column(name = "cs5_organization_list_other5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther5;

    @Column(name = "cs5_other5", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other5;




    @Column(name = "cs5_organization_list_academic6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic6;

    @Column(name = "cs5_organization_list_research6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch6;

    @Column(name = "cs5_organization_list_conservation6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation6;

    @Column(name = "cs5_organization_list_government6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment6;

    @Column(name = "cs5_organization_list_community6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity6;

    @Column(name = "cs5_organization_list_other6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther6;

    @Column(name = "cs5_other6", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other6;




    @Column(name = "cs5_organization_list_academic7", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic7;

    @Column(name = "cs5_organization_list_research7", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch7;

    @Column(name = "cs5_organization_list_conservation7", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation7;

    @Column(name = "cs5_organization_list_government7", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment7;

    @Column(name = "cs5_organization_list_community7", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity7;

    @Column(name = "cs5_organization_list_other7", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther7;

    @Column(name = "cs5_other7", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other7;




    @Column(name = "cs5_organization_list_academic8", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic8;

    @Column(name = "cs5_organization_list_research8", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch8;

    @Column(name = "cs5_organization_list_conservation8", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation8;

    @Column(name = "cs5_organization_list_government8", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment8;

    @Column(name = "cs5_organization_list_community8", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity8;

    @Column(name = "cs5_organization_list_other8", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther8;

    @Column(name = "cs5_other8", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other8;




    @Column(name = "cs5_organization_list_academic9", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic9;

    @Column(name = "cs5_organization_list_research9", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch9;

    @Column(name = "cs5_organization_list_conservation9", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation9;

    @Column(name = "cs5_organization_list_government9", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment9;

    @Column(name = "cs5_organization_list_community9", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity9;

    @Column(name = "cs5_organization_list_other9", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther9;

    @Column(name = "cs5_other9", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other9;




    @Column(name = "cs5_organization_list_academic10", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic10;

    @Column(name = "cs5_organization_list_research10", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch10;

    @Column(name = "cs5_organization_list_conservation10", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation10;

    @Column(name = "cs5_organization_list_government10", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment10;

    @Column(name = "cs5_organization_list_community10", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity10;

    @Column(name = "cs5_organization_list_other10", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther10;

    @Column(name = "cs5_other10", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other10;




    @Column(name = "cs5_organization_list_academic11", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic11;

    @Column(name = "cs5_organization_list_research11", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch11;

    @Column(name = "cs5_organization_list_conservation11", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation11;

    @Column(name = "cs5_organization_list_government11", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment11;

    @Column(name = "cs5_organization_list_community11", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity11;

    @Column(name = "cs5_organization_list_other11", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther11;

    @Column(name = "cs5_other11", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other11;




    @Column(name = "cs5_organization_list_academic12", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic12;

    @Column(name = "cs5_organization_list_research12", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch12;

    @Column(name = "cs5_organization_list_conservation12", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation12;

    @Column(name = "cs5_organization_list_government12", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment12;

    @Column(name = "cs5_organization_list_community12", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity12;

    @Column(name = "cs5_organization_list_other12", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther12;

    @Column(name = "cs5_other12", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other12;




    @Column(name = "cs5_organization_list_academic13", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListAcademic13;

    @Column(name = "cs5_organization_list_research13", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListResearch13;

    @Column(name = "cs5_organization_list_conservation13", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListConservation13;

    @Column(name = "cs5_organization_list_government13", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListGovernment13;

    @Column(name = "cs5_organization_list_community13", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListCommunity13;

    @Column(name = "cs5_organization_list_other13", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> organizationListOther13;

    @Column(name = "cs5_other13", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<String> other13;



    @Column(name = "cs5_isInPartnership", nullable = true)
    private Boolean isInPartnership = false;

    @Column(name = "cs5_isInPartnershipNoExp", nullable = true)
    private String isInPartnershipNoExp;

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

    public Set<String> getOrganizationListAcademic1() {
        return organizationListAcademic1;
    }

    public void setOrganizationListAcademic1(Set<String> organizationListAcademic1) {
        this.organizationListAcademic1 = organizationListAcademic1;
    }

    public Set<String> getOrganizationListResearch1() {
        return organizationListResearch1;
    }

    public void setOrganizationListResearch1(Set<String> organizationListResearch1) {
        this.organizationListResearch1 = organizationListResearch1;
    }

    public Set<String> getOrganizationListConservation1() {
        return organizationListConservation1;
    }

    public void setOrganizationListConservation1(Set<String> organizationListConservation1) {
        this.organizationListConservation1 = organizationListConservation1;
    }

    public Set<String> getOrganizationListGovernment1() {
        return organizationListGovernment1;
    }

    public void setOrganizationListGovernment1(Set<String> organizationListGovernment1) {
        this.organizationListGovernment1 = organizationListGovernment1;
    }

    public Set<String> getOrganizationListCommunity1() {
        return organizationListCommunity1;
    }

    public void setOrganizationListCommunity1(Set<String> organizationListCommunity1) {
        this.organizationListCommunity1 = organizationListCommunity1;
    }

    public Set<String> getOrganizationListOther1() {
        return organizationListOther1;
    }

    public void setOrganizationListOther1(Set<String> organizationListOther1) {
        this.organizationListOther1 = organizationListOther1;
    }

    public Set<String> getOther1() {
        return other1;
    }

    public void setOther1(Set<String> other1) {
        this.other1 = other1;
    }

    public Set<String> getOrganizationListAcademic2() {
        return organizationListAcademic2;
    }

    public void setOrganizationListAcademic2(Set<String> organizationListAcademic2) {
        this.organizationListAcademic2 = organizationListAcademic2;
    }

    public Set<String> getOrganizationListResearch2() {
        return organizationListResearch2;
    }

    public void setOrganizationListResearch2(Set<String> organizationListResearch2) {
        this.organizationListResearch2 = organizationListResearch2;
    }

    public Set<String> getOrganizationListConservation2() {
        return organizationListConservation2;
    }

    public void setOrganizationListConservation2(Set<String> organizationListConservation2) {
        this.organizationListConservation2 = organizationListConservation2;
    }

    public Set<String> getOrganizationListGovernment2() {
        return organizationListGovernment2;
    }

    public void setOrganizationListGovernment2(Set<String> organizationListGovernment2) {
        this.organizationListGovernment2 = organizationListGovernment2;
    }

    public Set<String> getOrganizationListCommunity2() {
        return organizationListCommunity2;
    }

    public void setOrganizationListCommunity2(Set<String> organizationListCommunity2) {
        this.organizationListCommunity2 = organizationListCommunity2;
    }

    public Set<String> getOrganizationListOther2() {
        return organizationListOther2;
    }

    public void setOrganizationListOther2(Set<String> organizationListOther2) {
        this.organizationListOther2 = organizationListOther2;
    }

    public Set<String> getOther2() {
        return other2;
    }

    public void setOther2(Set<String> other2) {
        this.other2 = other2;
    }

    public Set<String> getOrganizationListAcademic3() {
        return organizationListAcademic3;
    }

    public void setOrganizationListAcademic3(Set<String> organizationListAcademic3) {
        this.organizationListAcademic3 = organizationListAcademic3;
    }

    public Set<String> getOrganizationListResearch3() {
        return organizationListResearch3;
    }

    public void setOrganizationListResearch3(Set<String> organizationListResearch3) {
        this.organizationListResearch3 = organizationListResearch3;
    }

    public Set<String> getOrganizationListConservation3() {
        return organizationListConservation3;
    }

    public void setOrganizationListConservation3(Set<String> organizationListConservation3) {
        this.organizationListConservation3 = organizationListConservation3;
    }

    public Set<String> getOrganizationListGovernment3() {
        return organizationListGovernment3;
    }

    public void setOrganizationListGovernment3(Set<String> organizationListGovernment3) {
        this.organizationListGovernment3 = organizationListGovernment3;
    }

    public Set<String> getOrganizationListCommunity3() {
        return organizationListCommunity3;
    }

    public void setOrganizationListCommunity3(Set<String> organizationListCommunity3) {
        this.organizationListCommunity3 = organizationListCommunity3;
    }

    public Set<String> getOrganizationListOther3() {
        return organizationListOther3;
    }

    public void setOrganizationListOther3(Set<String> organizationListOther3) {
        this.organizationListOther3 = organizationListOther3;
    }

    public Set<String> getOther3() {
        return other3;
    }

    public void setOther3(Set<String> other3) {
        this.other3 = other3;
    }

    public Set<String> getOrganizationListAcademic4() {
        return organizationListAcademic4;
    }

    public void setOrganizationListAcademic4(Set<String> organizationListAcademic4) {
        this.organizationListAcademic4 = organizationListAcademic4;
    }

    public Set<String> getOrganizationListResearch4() {
        return organizationListResearch4;
    }

    public void setOrganizationListResearch4(Set<String> organizationListResearch4) {
        this.organizationListResearch4 = organizationListResearch4;
    }

    public Set<String> getOrganizationListConservation4() {
        return organizationListConservation4;
    }

    public void setOrganizationListConservation4(Set<String> organizationListConservation4) {
        this.organizationListConservation4 = organizationListConservation4;
    }

    public Set<String> getOrganizationListGovernment4() {
        return organizationListGovernment4;
    }

    public void setOrganizationListGovernment4(Set<String> organizationListGovernment4) {
        this.organizationListGovernment4 = organizationListGovernment4;
    }

    public Set<String> getOrganizationListCommunity4() {
        return organizationListCommunity4;
    }

    public void setOrganizationListCommunity4(Set<String> organizationListCommunity4) {
        this.organizationListCommunity4 = organizationListCommunity4;
    }

    public Set<String> getOrganizationListOther4() {
        return organizationListOther4;
    }

    public void setOrganizationListOther4(Set<String> organizationListOther4) {
        this.organizationListOther4 = organizationListOther4;
    }

    public Set<String> getOther4() {
        return other4;
    }

    public void setOther4(Set<String> other4) {
        this.other4 = other4;
    }

    public Set<String> getOrganizationListAcademic5() {
        return organizationListAcademic5;
    }

    public void setOrganizationListAcademic5(Set<String> organizationListAcademic5) {
        this.organizationListAcademic5 = organizationListAcademic5;
    }

    public Set<String> getOrganizationListResearch5() {
        return organizationListResearch5;
    }

    public void setOrganizationListResearch5(Set<String> organizationListResearch5) {
        this.organizationListResearch5 = organizationListResearch5;
    }

    public Set<String> getOrganizationListConservation5() {
        return organizationListConservation5;
    }

    public void setOrganizationListConservation5(Set<String> organizationListConservation5) {
        this.organizationListConservation5 = organizationListConservation5;
    }

    public Set<String> getOrganizationListGovernment5() {
        return organizationListGovernment5;
    }

    public void setOrganizationListGovernment5(Set<String> organizationListGovernment5) {
        this.organizationListGovernment5 = organizationListGovernment5;
    }

    public Set<String> getOrganizationListCommunity5() {
        return organizationListCommunity5;
    }

    public void setOrganizationListCommunity5(Set<String> organizationListCommunity5) {
        this.organizationListCommunity5 = organizationListCommunity5;
    }

    public Set<String> getOrganizationListOther5() {
        return organizationListOther5;
    }

    public void setOrganizationListOther5(Set<String> organizationListOther5) {
        this.organizationListOther5 = organizationListOther5;
    }

    public Set<String> getOther5() {
        return other5;
    }

    public void setOther5(Set<String> other5) {
        this.other5 = other5;
    }

    public Set<String> getOrganizationListAcademic6() {
        return organizationListAcademic6;
    }

    public void setOrganizationListAcademic6(Set<String> organizationListAcademic6) {
        this.organizationListAcademic6 = organizationListAcademic6;
    }

    public Set<String> getOrganizationListResearch6() {
        return organizationListResearch6;
    }

    public void setOrganizationListResearch6(Set<String> organizationListResearch6) {
        this.organizationListResearch6 = organizationListResearch6;
    }

    public Set<String> getOrganizationListConservation6() {
        return organizationListConservation6;
    }

    public void setOrganizationListConservation6(Set<String> organizationListConservation6) {
        this.organizationListConservation6 = organizationListConservation6;
    }

    public Set<String> getOrganizationListGovernment6() {
        return organizationListGovernment6;
    }

    public void setOrganizationListGovernment6(Set<String> organizationListGovernment6) {
        this.organizationListGovernment6 = organizationListGovernment6;
    }

    public Set<String> getOrganizationListCommunity6() {
        return organizationListCommunity6;
    }

    public void setOrganizationListCommunity6(Set<String> organizationListCommunity6) {
        this.organizationListCommunity6 = organizationListCommunity6;
    }

    public Set<String> getOrganizationListOther6() {
        return organizationListOther6;
    }

    public void setOrganizationListOther6(Set<String> organizationListOther6) {
        this.organizationListOther6 = organizationListOther6;
    }

    public Set<String> getOther6() {
        return other6;
    }

    public void setOther6(Set<String> other6) {
        this.other6 = other6;
    }

    public Set<String> getOrganizationListAcademic7() {
        return organizationListAcademic7;
    }

    public void setOrganizationListAcademic7(Set<String> organizationListAcademic7) {
        this.organizationListAcademic7 = organizationListAcademic7;
    }

    public Set<String> getOrganizationListResearch7() {
        return organizationListResearch7;
    }

    public void setOrganizationListResearch7(Set<String> organizationListResearch7) {
        this.organizationListResearch7 = organizationListResearch7;
    }

    public Set<String> getOrganizationListConservation7() {
        return organizationListConservation7;
    }

    public void setOrganizationListConservation7(Set<String> organizationListConservation7) {
        this.organizationListConservation7 = organizationListConservation7;
    }

    public Set<String> getOrganizationListGovernment7() {
        return organizationListGovernment7;
    }

    public void setOrganizationListGovernment7(Set<String> organizationListGovernment7) {
        this.organizationListGovernment7 = organizationListGovernment7;
    }

    public Set<String> getOrganizationListCommunity7() {
        return organizationListCommunity7;
    }

    public void setOrganizationListCommunity7(Set<String> organizationListCommunity7) {
        this.organizationListCommunity7 = organizationListCommunity7;
    }

    public Set<String> getOrganizationListOther7() {
        return organizationListOther7;
    }

    public void setOrganizationListOther7(Set<String> organizationListOther7) {
        this.organizationListOther7 = organizationListOther7;
    }

    public Set<String> getOther7() {
        return other7;
    }

    public void setOther7(Set<String> other7) {
        this.other7 = other7;
    }

    public Set<String> getOrganizationListAcademic8() {
        return organizationListAcademic8;
    }

    public void setOrganizationListAcademic8(Set<String> organizationListAcademic8) {
        this.organizationListAcademic8 = organizationListAcademic8;
    }

    public Set<String> getOrganizationListResearch8() {
        return organizationListResearch8;
    }

    public void setOrganizationListResearch8(Set<String> organizationListResearch8) {
        this.organizationListResearch8 = organizationListResearch8;
    }

    public Set<String> getOrganizationListConservation8() {
        return organizationListConservation8;
    }

    public void setOrganizationListConservation8(Set<String> organizationListConservation8) {
        this.organizationListConservation8 = organizationListConservation8;
    }

    public Set<String> getOrganizationListGovernment8() {
        return organizationListGovernment8;
    }

    public void setOrganizationListGovernment8(Set<String> organizationListGovernment8) {
        this.organizationListGovernment8 = organizationListGovernment8;
    }

    public Set<String> getOrganizationListCommunity8() {
        return organizationListCommunity8;
    }

    public void setOrganizationListCommunity8(Set<String> organizationListCommunity8) {
        this.organizationListCommunity8 = organizationListCommunity8;
    }

    public Set<String> getOrganizationListOther8() {
        return organizationListOther8;
    }

    public void setOrganizationListOther8(Set<String> organizationListOther8) {
        this.organizationListOther8 = organizationListOther8;
    }

    public Set<String> getOther8() {
        return other8;
    }

    public void setOther8(Set<String> other8) {
        this.other8 = other8;
    }

    public Set<String> getOrganizationListAcademic9() {
        return organizationListAcademic9;
    }

    public void setOrganizationListAcademic9(Set<String> organizationListAcademic9) {
        this.organizationListAcademic9 = organizationListAcademic9;
    }

    public Set<String> getOrganizationListResearch9() {
        return organizationListResearch9;
    }

    public void setOrganizationListResearch9(Set<String> organizationListResearch9) {
        this.organizationListResearch9 = organizationListResearch9;
    }

    public Set<String> getOrganizationListConservation9() {
        return organizationListConservation9;
    }

    public void setOrganizationListConservation9(Set<String> organizationListConservation9) {
        this.organizationListConservation9 = organizationListConservation9;
    }

    public Set<String> getOrganizationListGovernment9() {
        return organizationListGovernment9;
    }

    public void setOrganizationListGovernment9(Set<String> organizationListGovernment9) {
        this.organizationListGovernment9 = organizationListGovernment9;
    }

    public Set<String> getOrganizationListCommunity9() {
        return organizationListCommunity9;
    }

    public void setOrganizationListCommunity9(Set<String> organizationListCommunity9) {
        this.organizationListCommunity9 = organizationListCommunity9;
    }

    public Set<String> getOrganizationListOther9() {
        return organizationListOther9;
    }

    public void setOrganizationListOther9(Set<String> organizationListOther9) {
        this.organizationListOther9 = organizationListOther9;
    }

    public Set<String> getOther9() {
        return other9;
    }

    public void setOther9(Set<String> other9) {
        this.other9 = other9;
    }

    public Set<String> getOrganizationListAcademic10() {
        return organizationListAcademic10;
    }

    public void setOrganizationListAcademic10(Set<String> organizationListAcademic10) {
        this.organizationListAcademic10 = organizationListAcademic10;
    }

    public Set<String> getOrganizationListResearch10() {
        return organizationListResearch10;
    }

    public void setOrganizationListResearch10(Set<String> organizationListResearch10) {
        this.organizationListResearch10 = organizationListResearch10;
    }

    public Set<String> getOrganizationListConservation10() {
        return organizationListConservation10;
    }

    public void setOrganizationListConservation10(Set<String> organizationListConservation10) {
        this.organizationListConservation10 = organizationListConservation10;
    }

    public Set<String> getOrganizationListGovernment10() {
        return organizationListGovernment10;
    }

    public void setOrganizationListGovernment10(Set<String> organizationListGovernment10) {
        this.organizationListGovernment10 = organizationListGovernment10;
    }

    public Set<String> getOrganizationListCommunity10() {
        return organizationListCommunity10;
    }

    public void setOrganizationListCommunity10(Set<String> organizationListCommunity10) {
        this.organizationListCommunity10 = organizationListCommunity10;
    }

    public Set<String> getOrganizationListOther10() {
        return organizationListOther10;
    }

    public void setOrganizationListOther10(Set<String> organizationListOther10) {
        this.organizationListOther10 = organizationListOther10;
    }

    public Set<String> getOther10() {
        return other10;
    }

    public void setOther10(Set<String> other10) {
        this.other10 = other10;
    }

    public Set<String> getOrganizationListAcademic11() {
        return organizationListAcademic11;
    }

    public void setOrganizationListAcademic11(Set<String> organizationListAcademic11) {
        this.organizationListAcademic11 = organizationListAcademic11;
    }

    public Set<String> getOrganizationListResearch11() {
        return organizationListResearch11;
    }

    public void setOrganizationListResearch11(Set<String> organizationListResearch11) {
        this.organizationListResearch11 = organizationListResearch11;
    }

    public Set<String> getOrganizationListConservation11() {
        return organizationListConservation11;
    }

    public void setOrganizationListConservation11(Set<String> organizationListConservation11) {
        this.organizationListConservation11 = organizationListConservation11;
    }

    public Set<String> getOrganizationListGovernment11() {
        return organizationListGovernment11;
    }

    public void setOrganizationListGovernment11(Set<String> organizationListGovernment11) {
        this.organizationListGovernment11 = organizationListGovernment11;
    }

    public Set<String> getOrganizationListCommunity11() {
        return organizationListCommunity11;
    }

    public void setOrganizationListCommunity11(Set<String> organizationListCommunity11) {
        this.organizationListCommunity11 = organizationListCommunity11;
    }

    public Set<String> getOrganizationListOther11() {
        return organizationListOther11;
    }

    public void setOrganizationListOther11(Set<String> organizationListOther11) {
        this.organizationListOther11 = organizationListOther11;
    }

    public Set<String> getOther11() {
        return other11;
    }

    public void setOther11(Set<String> other11) {
        this.other11 = other11;
    }

    public Set<String> getOrganizationListAcademic12() {
        return organizationListAcademic12;
    }

    public void setOrganizationListAcademic12(Set<String> organizationListAcademic12) {
        this.organizationListAcademic12 = organizationListAcademic12;
    }

    public Set<String> getOrganizationListResearch12() {
        return organizationListResearch12;
    }

    public void setOrganizationListResearch12(Set<String> organizationListResearch12) {
        this.organizationListResearch12 = organizationListResearch12;
    }

    public Set<String> getOrganizationListConservation12() {
        return organizationListConservation12;
    }

    public void setOrganizationListConservation12(Set<String> organizationListConservation12) {
        this.organizationListConservation12 = organizationListConservation12;
    }

    public Set<String> getOrganizationListGovernment12() {
        return organizationListGovernment12;
    }

    public void setOrganizationListGovernment12(Set<String> organizationListGovernment12) {
        this.organizationListGovernment12 = organizationListGovernment12;
    }

    public Set<String> getOrganizationListCommunity12() {
        return organizationListCommunity12;
    }

    public void setOrganizationListCommunity12(Set<String> organizationListCommunity12) {
        this.organizationListCommunity12 = organizationListCommunity12;
    }

    public Set<String> getOrganizationListOther12() {
        return organizationListOther12;
    }

    public void setOrganizationListOther12(Set<String> organizationListOther12) {
        this.organizationListOther12 = organizationListOther12;
    }

    public Set<String> getOther12() {
        return other12;
    }

    public void setOther12(Set<String> other12) {
        this.other12 = other12;
    }

    public Set<String> getOrganizationListAcademic13() {
        return organizationListAcademic13;
    }

    public void setOrganizationListAcademic13(Set<String> organizationListAcademic13) {
        this.organizationListAcademic13 = organizationListAcademic13;
    }

    public Set<String> getOrganizationListResearch13() {
        return organizationListResearch13;
    }

    public void setOrganizationListResearch13(Set<String> organizationListResearch13) {
        this.organizationListResearch13 = organizationListResearch13;
    }

    public Set<String> getOrganizationListConservation13() {
        return organizationListConservation13;
    }

    public void setOrganizationListConservation13(Set<String> organizationListConservation13) {
        this.organizationListConservation13 = organizationListConservation13;
    }

    public Set<String> getOrganizationListGovernment13() {
        return organizationListGovernment13;
    }

    public void setOrganizationListGovernment13(Set<String> organizationListGovernment13) {
        this.organizationListGovernment13 = organizationListGovernment13;
    }

    public Set<String> getOrganizationListCommunity13() {
        return organizationListCommunity13;
    }

    public void setOrganizationListCommunity13(Set<String> organizationListCommunity13) {
        this.organizationListCommunity13 = organizationListCommunity13;
    }

    public Set<String> getOrganizationListOther13() {
        return organizationListOther13;
    }

    public void setOrganizationListOther13(Set<String> organizationListOther13) {
        this.organizationListOther13 = organizationListOther13;
    }

    public Set<String> getOther13() {
        return other13;
    }

    public void setOther13(Set<String> other13) {
        this.other13 = other13;
    }

    public String getIsInPartnershipNoExp() {
        return isInPartnershipNoExp;
    }

    public void setIsInPartnershipNoExp(String isInPartnershipNoExp) {
        this.isInPartnershipNoExp = isInPartnershipNoExp;
    }
}
