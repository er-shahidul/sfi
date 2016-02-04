package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.web.common.models.entities.SfiPpFormAllCountry;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs8PartialB extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs8_fscCocComplexity1", nullable = true)
    private Boolean fscCocComplexity1;

    @Column(name = "cs8_fscCocComplexity2", nullable = true)
    private Boolean fscCocComplexity2;

    @Column(name = "cs8_fscCocCost1", nullable = true)
    private Boolean fscCocCost1;

    @Column(name = "cs8_fscCocCost2", nullable = true)
    private Boolean fscCocCost2;

    @Column(name = "cs8_fscCocInconsistent1", nullable = true)
    private Boolean fscCocInconsistent1;

    @Column(name = "cs8_fscCocInconsistent2", nullable = true)
    private Boolean fscCocInconsistent2;

    @Column(name = "cs8_fscCocLackOfResponse1", nullable = true)
    private Boolean fscCocLackOfResponse1;

    @Column(name = "cs8_fscCocLackOfResponse2", nullable = true)
    private Boolean fscCocLackOfResponse2;

    @Column(name = "cs8_fscCocLackOfSupply1", nullable = true)
    private Boolean fscCocLackOfSupply1;

    @Column(name = "cs8_fscCocLackOfSupply2", nullable = true)
    private Boolean fscCocLackOfSupply2;

    @Column(name = "cs8_fscCocNoMarkerDemand1", nullable = true)
    private Boolean fscCocNoMarkerDemand1;

    @Column(name = "cs8_fscCocNoMarkerDemand2", nullable = true)
    private Boolean fscCocNoMarkerDemand2;

    @Column(name = "cs8_fscCocOther1", nullable = true)
    private Boolean fscCocOther1;

    @Column(name = "cs8_fscCocOther2", nullable = true)
    private Boolean fscCocOther2;

    @Column(name = "cs8_fscCocOtherExplain", nullable = true)
    private Boolean fscCocOtherExplain;

    @Column(name = "cs8_fscCocUncertainty1", nullable = true)
    private Boolean fscCocUncertainty1;

    @Column(name = "cs8_fscCocUncertainty2", nullable = true)
    private Boolean fscCocUncertainty2;

    @Column(name = "cs8_fscComplexity1", nullable = true)
    private Boolean fscComplexity1;

    @Column(name = "cs8_fscComplexity2", nullable = true)
    private Boolean fscComplexity2;

    @Column(name = "cs8_fscCost1", nullable = true)
    private Boolean fscCost1;

    @Column(name = "cs8_fscCost2", nullable = true)
    private Boolean fscCost2;

    @Column(name = "cs8_fscInconsistent1", nullable = true)
    private Boolean fscInconsistent1;

    @Column(name = "cs8_fscInconsistent2", nullable = true)
    private Boolean fscInconsistent2;

    @Column(name = "cs8_fscLackOfResponse1", nullable = true)
    private Boolean fscLackOfResponse1;

    @Column(name = "cs8_fscLackOfResponse2", nullable = true)
    private Boolean fscLackOfResponse2;

    @Column(name = "cs8_fscLackOfSupply1", nullable = true)
    private Boolean fscLackOfSupply1;

    @Column(name = "cs8_fscLackOfSupply2", nullable = true)
    private Boolean fscLackOfSupply2;

    @Column(name = "cs8_fscNoMarkerDemand1", nullable = true)
    private Boolean fscNoMarkerDemand1;

    @Column(name = "cs8_fscNoMarkerDemand2", nullable = true)
    private Boolean fscNoMarkerDemand2;

    @Column(name = "cs8_fscOther1", nullable = true)
    private Boolean fscOther1;

    @Column(name = "cs8_fscOther2", nullable = true)
    private Boolean fscOther2;

    @Column(name = "cs8_fscOtherExplain", nullable = true)
    private Boolean fscOtherExplain;

    @Column(name = "cs8_fscUncertainty1", nullable = true)
    private Boolean fscUncertainty1;

    @Column(name = "cs8_fscUncertainty2", nullable = true)
    private Boolean fscUncertainty2;

    @Column(name = "cs8_fscOtherSpecify1", nullable = true)
    @Type(type = "text")
    private String fscOtherSpecify1;

    @Column(name = "cs8_fscOtherSpecify2", nullable = true)
    @Type(type = "text")
    private String fscOtherSpecify2;

    @Column(name = "cs8_fscCocOtherSpecify1", nullable = true)
    @Type(type = "text")
    private String fscCocOtherSpecify1;

    @Column(name = "cs8_fscCocOtherSpecify2", nullable = true)
    @Type(type = "text")
    private String fscCocOtherSpecify2;

    @Column(name = "cs8_FSCLandCertification", nullable = true)
    private Integer FSCLandCertification;

    @Column(name = "cs8_ChainOfCustody_FSCCertification", nullable = true)
    private Integer ChainOfCustody_FSCCertification;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_1",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_1;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_10",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_10;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_11",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_11;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_12",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_12;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_13",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_13;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_2",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_2;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_3",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_3;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_4",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_4;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_5",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_5;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_6",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_6;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_7",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_7;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_8",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_8;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainFSC_Country_9",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_9;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_1",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_1;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_10",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_10;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_11",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_11;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_12",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_12;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_13",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_13;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_2",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_2;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs8_sfiLabelProductGroupContainPEFC_Country_3",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_3;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFSCLandCertification() {
        return FSCLandCertification;
    }

    public void setFSCLandCertification(Integer FSCLandCertification) {
        this.FSCLandCertification = FSCLandCertification;
    }

    public Integer getChainOfCustody_FSCCertification() {
        return ChainOfCustody_FSCCertification;
    }

    public void setChainOfCustody_FSCCertification(Integer chainOfCustody_FSCCertification) {
        ChainOfCustody_FSCCertification = chainOfCustody_FSCCertification;
    }

    public String getFscCocOtherSpecify2() {
        return fscCocOtherSpecify2;
    }

    public void setFscCocOtherSpecify2(String fscCocOtherSpecify2) {
        this.fscCocOtherSpecify2 = fscCocOtherSpecify2;
    }

    public Boolean getFscCocComplexity1() {
        return fscCocComplexity1;
    }

    public void setFscCocComplexity1(Boolean fscCocComplexity1) {
        this.fscCocComplexity1 = fscCocComplexity1;
    }

    public Boolean getFscCocComplexity2() {
        return fscCocComplexity2;
    }

    public void setFscCocComplexity2(Boolean fscCocComplexity2) {
        this.fscCocComplexity2 = fscCocComplexity2;
    }

    public Boolean getFscCocCost1() {
        return fscCocCost1;
    }

    public void setFscCocCost1(Boolean fscCocCost1) {
        this.fscCocCost1 = fscCocCost1;
    }

    public Boolean getFscCocCost2() {
        return fscCocCost2;
    }

    public void setFscCocCost2(Boolean fscCocCost2) {
        this.fscCocCost2 = fscCocCost2;
    }

    public Boolean getFscCocInconsistent1() {
        return fscCocInconsistent1;
    }

    public void setFscCocInconsistent1(Boolean fscCocInconsistent1) {
        this.fscCocInconsistent1 = fscCocInconsistent1;
    }

    public Boolean getFscCocInconsistent2() {
        return fscCocInconsistent2;
    }

    public void setFscCocInconsistent2(Boolean fscCocInconsistent2) {
        this.fscCocInconsistent2 = fscCocInconsistent2;
    }

    public Boolean getFscCocLackOfResponse1() {
        return fscCocLackOfResponse1;
    }

    public void setFscCocLackOfResponse1(Boolean fscCocLackOfResponse1) {
        this.fscCocLackOfResponse1 = fscCocLackOfResponse1;
    }

    public Boolean getFscCocLackOfResponse2() {
        return fscCocLackOfResponse2;
    }

    public void setFscCocLackOfResponse2(Boolean fscCocLackOfResponse2) {
        this.fscCocLackOfResponse2 = fscCocLackOfResponse2;
    }

    public Boolean getFscCocLackOfSupply1() {
        return fscCocLackOfSupply1;
    }

    public void setFscCocLackOfSupply1(Boolean fscCocLackOfSupply1) {
        this.fscCocLackOfSupply1 = fscCocLackOfSupply1;
    }

    public Boolean getFscCocLackOfSupply2() {
        return fscCocLackOfSupply2;
    }

    public void setFscCocLackOfSupply2(Boolean fscCocLackOfSupply2) {
        this.fscCocLackOfSupply2 = fscCocLackOfSupply2;
    }

    public Boolean getFscCocNoMarkerDemand1() {
        return fscCocNoMarkerDemand1;
    }

    public void setFscCocNoMarkerDemand1(Boolean fscCocNoMarkerDemand1) {
        this.fscCocNoMarkerDemand1 = fscCocNoMarkerDemand1;
    }

    public Boolean getFscCocNoMarkerDemand2() {
        return fscCocNoMarkerDemand2;
    }

    public void setFscCocNoMarkerDemand2(Boolean fscCocNoMarkerDemand2) {
        this.fscCocNoMarkerDemand2 = fscCocNoMarkerDemand2;
    }

    public Boolean getFscCocOther1() {
        return fscCocOther1;
    }

    public void setFscCocOther1(Boolean fscCocOther1) {
        this.fscCocOther1 = fscCocOther1;
    }

    public Boolean getFscCocOther2() {
        return fscCocOther2;
    }

    public void setFscCocOther2(Boolean fscCocOther2) {
        this.fscCocOther2 = fscCocOther2;
    }

    public Boolean getFscCocOtherExplain() {
        return fscCocOtherExplain;
    }

    public void setFscCocOtherExplain(Boolean fscCocOtherExplain) {
        this.fscCocOtherExplain = fscCocOtherExplain;
    }

    public Boolean getFscCocUncertainty1() {
        return fscCocUncertainty1;
    }

    public void setFscCocUncertainty1(Boolean fscCocUncertainty1) {
        this.fscCocUncertainty1 = fscCocUncertainty1;
    }

    public Boolean getFscCocUncertainty2() {
        return fscCocUncertainty2;
    }

    public void setFscCocUncertainty2(Boolean fscCocUncertainty2) {
        this.fscCocUncertainty2 = fscCocUncertainty2;
    }

    public Boolean getFscComplexity1() {
        return fscComplexity1;
    }

    public void setFscComplexity1(Boolean fscComplexity1) {
        this.fscComplexity1 = fscComplexity1;
    }

    public Boolean getFscComplexity2() {
        return fscComplexity2;
    }

    public void setFscComplexity2(Boolean fscComplexity2) {
        this.fscComplexity2 = fscComplexity2;
    }

    public Boolean getFscCost1() {
        return fscCost1;
    }

    public void setFscCost1(Boolean fscCost1) {
        this.fscCost1 = fscCost1;
    }

    public Boolean getFscCost2() {
        return fscCost2;
    }

    public void setFscCost2(Boolean fscCost2) {
        this.fscCost2 = fscCost2;
    }

    public Boolean getFscInconsistent1() {
        return fscInconsistent1;
    }

    public void setFscInconsistent1(Boolean fscInconsistent1) {
        this.fscInconsistent1 = fscInconsistent1;
    }

    public Boolean getFscInconsistent2() {
        return fscInconsistent2;
    }

    public void setFscInconsistent2(Boolean fscInconsistent2) {
        this.fscInconsistent2 = fscInconsistent2;
    }

    public Boolean getFscLackOfResponse1() {
        return fscLackOfResponse1;
    }

    public void setFscLackOfResponse1(Boolean fscLackOfResponse1) {
        this.fscLackOfResponse1 = fscLackOfResponse1;
    }

    public Boolean getFscLackOfResponse2() {
        return fscLackOfResponse2;
    }

    public void setFscLackOfResponse2(Boolean fscLackOfResponse2) {
        this.fscLackOfResponse2 = fscLackOfResponse2;
    }

    public Boolean getFscLackOfSupply1() {
        return fscLackOfSupply1;
    }

    public void setFscLackOfSupply1(Boolean fscLackOfSupply1) {
        this.fscLackOfSupply1 = fscLackOfSupply1;
    }

    public Boolean getFscLackOfSupply2() {
        return fscLackOfSupply2;
    }

    public void setFscLackOfSupply2(Boolean fscLackOfSupply2) {
        this.fscLackOfSupply2 = fscLackOfSupply2;
    }

    public Boolean getFscNoMarkerDemand1() {
        return fscNoMarkerDemand1;
    }

    public void setFscNoMarkerDemand1(Boolean fscNoMarkerDemand1) {
        this.fscNoMarkerDemand1 = fscNoMarkerDemand1;
    }

    public Boolean getFscNoMarkerDemand2() {
        return fscNoMarkerDemand2;
    }

    public void setFscNoMarkerDemand2(Boolean fscNoMarkerDemand2) {
        this.fscNoMarkerDemand2 = fscNoMarkerDemand2;
    }

    public Boolean getFscOther1() {
        return fscOther1;
    }

    public void setFscOther1(Boolean fscOther1) {
        this.fscOther1 = fscOther1;
    }

    public Boolean getFscOther2() {
        return fscOther2;
    }

    public void setFscOther2(Boolean fscOther2) {
        this.fscOther2 = fscOther2;
    }

    public Boolean getFscOtherExplain() {
        return fscOtherExplain;
    }

    public void setFscOtherExplain(Boolean fscOtherExplain) {
        this.fscOtherExplain = fscOtherExplain;
    }

    public Boolean getFscUncertainty1() {
        return fscUncertainty1;
    }

    public void setFscUncertainty1(Boolean fscUncertainty1) {
        this.fscUncertainty1 = fscUncertainty1;
    }

    public Boolean getFscUncertainty2() {
        return fscUncertainty2;
    }

    public void setFscUncertainty2(Boolean fscUncertainty2) {
        this.fscUncertainty2 = fscUncertainty2;
    }

    public String getFscOtherSpecify1() {
        return fscOtherSpecify1;
    }

    public void setFscOtherSpecify1(String fscOtherSpecify1) {
        this.fscOtherSpecify1 = fscOtherSpecify1;
    }

    public String getFscOtherSpecify2() {
        return fscOtherSpecify2;
    }

    public void setFscOtherSpecify2(String fscOtherSpecify2) {
        this.fscOtherSpecify2 = fscOtherSpecify2;
    }

    public String getFscCocOtherSpecify1() {
        return fscCocOtherSpecify1;
    }

    public void setFscCocOtherSpecify1(String fscCocOtherSpecify1) {
        this.fscCocOtherSpecify1 = fscCocOtherSpecify1;
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_1() {
        return sfiLabelProductGroupContainFSC_Country_1;
    }

    public void setSfiLabelProductGroupContainFSC_Country_1(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_1) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_1, sfiLabelProductGroupContainFSC_Country_1);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_10() {
        return sfiLabelProductGroupContainFSC_Country_10;
    }

    public void setSfiLabelProductGroupContainFSC_Country_10(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_10) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_10, sfiLabelProductGroupContainFSC_Country_10);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_11() {
        return sfiLabelProductGroupContainFSC_Country_11;
    }

    public void setSfiLabelProductGroupContainFSC_Country_11(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_11) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_11, sfiLabelProductGroupContainFSC_Country_11);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_12() {
        return sfiLabelProductGroupContainFSC_Country_12;
    }

    public void setSfiLabelProductGroupContainFSC_Country_12(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_12) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_12, sfiLabelProductGroupContainFSC_Country_12);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_13() {
        return sfiLabelProductGroupContainFSC_Country_13;
    }

    public void setSfiLabelProductGroupContainFSC_Country_13(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_13) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_13, sfiLabelProductGroupContainFSC_Country_13);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_2() {
        return sfiLabelProductGroupContainFSC_Country_2;
    }

    public void setSfiLabelProductGroupContainFSC_Country_2(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_2) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_2, sfiLabelProductGroupContainFSC_Country_2);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_3() {
        return sfiLabelProductGroupContainFSC_Country_3;
    }

    public void setSfiLabelProductGroupContainFSC_Country_3(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_3) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_3, sfiLabelProductGroupContainFSC_Country_3);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_4() {
        return sfiLabelProductGroupContainFSC_Country_4;
    }

    public void setSfiLabelProductGroupContainFSC_Country_4(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_4) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_4, sfiLabelProductGroupContainFSC_Country_4);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_5() {
        return sfiLabelProductGroupContainFSC_Country_5;
    }

    public void setSfiLabelProductGroupContainFSC_Country_5(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_5) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_5, sfiLabelProductGroupContainFSC_Country_5);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_6() {
        return sfiLabelProductGroupContainFSC_Country_6;
    }

    public void setSfiLabelProductGroupContainFSC_Country_6(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_6) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_6, sfiLabelProductGroupContainFSC_Country_6);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_7() {
        return sfiLabelProductGroupContainFSC_Country_7;
    }

    public void setSfiLabelProductGroupContainFSC_Country_7(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_7) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_7, sfiLabelProductGroupContainFSC_Country_7);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_8() {
        return sfiLabelProductGroupContainFSC_Country_8;
    }

    public void setSfiLabelProductGroupContainFSC_Country_8(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_8) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_8, sfiLabelProductGroupContainFSC_Country_8);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainFSC_Country_9() {
        return sfiLabelProductGroupContainFSC_Country_9;
    }

    public void setSfiLabelProductGroupContainFSC_Country_9(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainFSC_Country_9) {
        addAll(this.sfiLabelProductGroupContainFSC_Country_9, sfiLabelProductGroupContainFSC_Country_9);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_1() {
        return sfiLabelProductGroupContainPEFC_Country_1;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_1(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_1) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_1, sfiLabelProductGroupContainPEFC_Country_1);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_10() {
        return sfiLabelProductGroupContainPEFC_Country_10;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_10(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_10) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_10, sfiLabelProductGroupContainPEFC_Country_10);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_11() {
        return sfiLabelProductGroupContainPEFC_Country_11;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_11(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_11) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_11, sfiLabelProductGroupContainPEFC_Country_11);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_12() {
        return sfiLabelProductGroupContainPEFC_Country_12;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_12(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_12) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_12, sfiLabelProductGroupContainPEFC_Country_12);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_13() {
        return sfiLabelProductGroupContainPEFC_Country_13;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_13(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_13) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_13, sfiLabelProductGroupContainPEFC_Country_13);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_2() {
        return sfiLabelProductGroupContainPEFC_Country_2;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_2(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_2) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_2, sfiLabelProductGroupContainPEFC_Country_2);
    }

    public Set<SfiPpFormAllCountry> getSfiLabelProductGroupContainPEFC_Country_3() {
        return sfiLabelProductGroupContainPEFC_Country_3;
    }

    public void setSfiLabelProductGroupContainPEFC_Country_3(Set<SfiPpFormAllCountry> sfiLabelProductGroupContainPEFC_Country_3) {
        addAll(this.sfiLabelProductGroupContainPEFC_Country_3, sfiLabelProductGroupContainPEFC_Country_3);
    }
}
