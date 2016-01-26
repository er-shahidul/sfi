package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.web.common.models.entities.SfiPpFormAllCountry;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs1 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs1_companyWebsite", nullable = true)
    private String companyWebsite;

    @Column(name = "cs1_numberEmployees_USA", nullable = false, columnDefinition = "Integer default 0")
    private Integer numberEmployeesUSA;

    @Column(name = "cs1_numberEmployees_CA", nullable = false, columnDefinition = "Integer default 0")
    private Integer numberEmployeesCA;

    @Column(name = "cs1_numberEmployees_Other", nullable = false, columnDefinition = "Integer default 0")
    private Integer numberEmployeesOther;

    @Column(name = "cs1_companyDescr", nullable = true)
    @Type(type="text")
    private String companyDesc;

    @Column(name = "cs1_ownsMngLands", nullable = false, columnDefinition = "Boolean default false")
    private Boolean ownsMngLands;

    @Column(name = "cs1_ownsMngLands_inUSA", nullable = false, columnDefinition = "Boolean default false")
    private Boolean ownsMngLandsInUSA;

    @Column(name = "cs1_ownsMngLands_inCA", nullable = false, columnDefinition = "Boolean default false")
    private Boolean ownsMngLandsInCA;

    @Column(name = "cs1_ownsMngLands_inOther", nullable = false, columnDefinition = "Boolean default false")
    private Boolean ownsMngLandsInOther;

    @Column(name = "cs1_hasPrimaryOperMillsYards", nullable = false, columnDefinition = "Boolean default false")
    private Boolean hasPrimaryOperMillsYards;
    @Column(name = "cs1_hasPrimaryOperMillsYards_inUSA", nullable = false, columnDefinition = "Boolean default false")
    private Boolean hasPrimaryOperMillsYardsInUSA;
    @Column(name = "cs1_hasPrimaryOperMillsYards_inCA", nullable = false, columnDefinition = "Boolean default false")
    private Boolean hasPrimaryOperMillsYardsInCA;
    @Column(name = "cs1_hasPrimaryOperMillsYards_inOther", nullable = false, columnDefinition = "Boolean default false")
    private Boolean hasPrimaryOperMillsYardsInOther;

    @Column(name = "cs1_hasSecondaryOperMillsYards", nullable = false, columnDefinition = "Boolean default false")
    private Boolean hasSecondaryOperMillsYards;
    @Column(name = "cs1_hasSecondaryOperMillsYards_inUSA", nullable = false, columnDefinition = "Boolean default false")
    private Boolean hasSecondaryOperMillsYardsInUSA;
    @Column(name = "cs1_hasSecondaryOperMillsYards_inCA", nullable = false, columnDefinition = "Boolean default false")
    private Boolean hasSecondaryOperMillsYardsInCA;
    @Column(name = "cs1_hasSecondaryOperMillsYards_inOther", nullable = false, columnDefinition = "Boolean default false")
    private Boolean hasSecondaryOperMillsYardsInOther;


    @ManyToMany(targetEntity = SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs1_ownsMngLands_other_countries",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormOtherCountry> ownsMngLandsOtherCountries;

    @ManyToMany(targetEntity = SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs1_primaryOperMillsYards_other_countries",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormOtherCountry> primaryOperMillsYardsOtherCountries;

    @ManyToMany(targetEntity = SfiPpFormOtherCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs1_secondaryOperMillsYards_other_countries",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormOtherCountry> secondaryOperMillsYardsOtherCountries;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs1_sells_countries",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> sellsCountries;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public Integer getNumberEmployeesUSA() {
        return numberEmployeesUSA;
    }

    public void setNumberEmployeesUSA(Integer numberEmployeesUSA) {
        this.numberEmployeesUSA = numberEmployeesUSA;
    }

    public Integer getNumberEmployeesCA() {
        return numberEmployeesCA;
    }

    public void setNumberEmployeesCA(Integer numberEmployeesCA) {
        this.numberEmployeesCA = numberEmployeesCA;
    }

    public Integer getNumberEmployeesOther() {
        return numberEmployeesOther;
    }

    public void setNumberEmployeesOther(Integer numberEmployeesOther) {
        this.numberEmployeesOther = numberEmployeesOther;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    public Boolean isOwnsMngLands() {
        return ownsMngLands;
    }

    public void setOwnsMngLands(Boolean ownsMngLands) {
        this.ownsMngLands = ownsMngLands;
    }

    public Boolean isOwnsMngLandsInUSA() {
        return ownsMngLandsInUSA;
    }

    public void setOwnsMngLandsInUSA(Boolean ownsMngLandsInUSA) {
        this.ownsMngLandsInUSA = ownsMngLandsInUSA;
    }

    public Boolean isOwnsMngLandsInCA() {
        return ownsMngLandsInCA;
    }

    public void setOwnsMngLandsInCA(Boolean ownsMngLandsInCA) {
        this.ownsMngLandsInCA = ownsMngLandsInCA;
    }

    public Boolean isOwnsMngLandsInOther() {
        return ownsMngLandsInOther;
    }

    public void setOwnsMngLandsInOther(Boolean ownsMngLandsInOther) {
        this.ownsMngLandsInOther = ownsMngLandsInOther;
    }

    public Boolean isHasPrimaryOperMillsYards() {
        return hasPrimaryOperMillsYards;
    }

    public void setHasPrimaryOperMillsYards(Boolean hasPrimaryOperMillsYards) {
        this.hasPrimaryOperMillsYards = hasPrimaryOperMillsYards;
    }

    public Boolean isHasPrimaryOperMillsYardsInUSA() {
        return hasPrimaryOperMillsYardsInUSA;
    }

    public void setHasPrimaryOperMillsYardsInUSA(Boolean hasPrimaryOperMillsYardsInUSA) {
        this.hasPrimaryOperMillsYardsInUSA = hasPrimaryOperMillsYardsInUSA;
    }

    public Boolean isHasPrimaryOperMillsYardsInCA() {
        return hasPrimaryOperMillsYardsInCA;
    }

    public void setHasPrimaryOperMillsYardsInCA(Boolean hasPrimaryOperMillsYardsInCA) {
        this.hasPrimaryOperMillsYardsInCA = hasPrimaryOperMillsYardsInCA;
    }

    public Boolean isHasPrimaryOperMillsYardsInOther() {
        return hasPrimaryOperMillsYardsInOther;
    }

    public void setHasPrimaryOperMillsYardsInOther(Boolean hasPrimaryOperMillsYardsInOther) {
        this.hasPrimaryOperMillsYardsInOther = hasPrimaryOperMillsYardsInOther;
    }

    public Boolean isHasSecondaryOperMillsYards() {
        return hasSecondaryOperMillsYards;
    }

    public void setHasSecondaryOperMillsYards(Boolean hasSecondaryOperMillsYards) {
        this.hasSecondaryOperMillsYards = hasSecondaryOperMillsYards;
    }

    public Boolean isHasSecondaryOperMillsYardsInUSA() {
        return hasSecondaryOperMillsYardsInUSA;
    }

    public void setHasSecondaryOperMillsYardsInUSA(Boolean hasSecondaryOperMillsYardsInUSA) {
        this.hasSecondaryOperMillsYardsInUSA = hasSecondaryOperMillsYardsInUSA;
    }

    public Boolean isHasSecondaryOperMillsYardsInCA() {
        return hasSecondaryOperMillsYardsInCA;
    }

    public void setHasSecondaryOperMillsYardsInCA(Boolean hasSecondaryOperMillsYardsInCA) {
        this.hasSecondaryOperMillsYardsInCA = hasSecondaryOperMillsYardsInCA;
    }

    public Boolean isHasSecondaryOperMillsYardsInOther() {
        return hasSecondaryOperMillsYardsInOther;
    }

    public void setHasSecondaryOperMillsYardsInOther(Boolean hasSecondaryOperMillsYardsInOther) {
        this.hasSecondaryOperMillsYardsInOther = hasSecondaryOperMillsYardsInOther;
    }

    public Set<SfiPpFormOtherCountry> getOwnsMngLandsOtherCountries() {
        return ownsMngLandsOtherCountries;
    }

    public void setOwnsMngLandsOtherCountries(Set<SfiPpFormOtherCountry> ownsMngLandsOtherCountries) {
        addAll(this.ownsMngLandsOtherCountries, ownsMngLandsOtherCountries);
    }

    public Set<SfiPpFormOtherCountry> getPrimaryOperMillsYardsOtherCountries() {
        return primaryOperMillsYardsOtherCountries;
    }

    public void setPrimaryOperMillsYardsOtherCountries(Set<SfiPpFormOtherCountry> primaryOperMillsYardsOtherCountries) {
        addAll(this.primaryOperMillsYardsOtherCountries, primaryOperMillsYardsOtherCountries);
    }

    public Set<SfiPpFormOtherCountry> getSecondaryOperMillsYardsOtherCountries() {
        return secondaryOperMillsYardsOtherCountries;
    }

    public void setSecondaryOperMillsYardsOtherCountries(Set<SfiPpFormOtherCountry> secondaryOperMillsYardsOtherCountries) {
        addAll(this.secondaryOperMillsYardsOtherCountries, secondaryOperMillsYardsOtherCountries);
    }

    public Set<SfiPpFormAllCountry> getSellsCountries() {
        return sellsCountries;
    }

    public void setSellsCountries(Set<SfiPpFormAllCountry> sellsCountries) {
        addAll(this.sellsCountries, sellsCountries);
    }
}
