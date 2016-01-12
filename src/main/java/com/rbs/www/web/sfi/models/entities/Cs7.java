package com.rbs.www.web.sfi.models.entities;

import com.rbs.www.common.models.BaseEntityModel;
import com.rbs.www.web.common.models.entities.SfiPpFormAllCountry;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sfi_pp_forms")
public class Cs7 extends BaseEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cs7_emerIssu_bioe", nullable = true)
    private Boolean emerIssuBioe;

    @Column(name = "cs7_emerIssu_carb", nullable = true)
    private Boolean emerIssuCarb;

    @Column(name = "cs7_emerIssu_wate", nullable = true)
    private Boolean emerIssuWate;

    @Column(name = "cs7_emerIssu_clim", nullable = true)
    private Boolean emerIssuClim;

    @Column(name = "cs7_emerIssu_ecos", nullable = true)
    private Boolean emerIssuEcos;

    @Column(name = "cs7_emerIssu_other", nullable = true)
    private Boolean emerIssuOther;

    @Column(name = "cs7_emerIssu_otherSpec", nullable = true)
    private String emerIssuOtherSpec;

    @Column(name = "cs7_investResperc_currSupply", nullable = true)
    private Float investRespercCurrSupply;

    @Column(name = "cs7_planInvestRes_ifPlan", nullable = true)
    private Boolean planInvestResIfPlan;

    @Column(name = "cs7_planInvestRes_year", nullable = true)
    private String planInvestResYear;

    @Column(name = "cs7_planCommPlant_ifPlanGE", nullable = true)
    private Boolean planCommPlantIfPlanGE;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs7_invest_res_countries",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> investResCountries;

    @Column(name = "cs7_emerIssuEurop", nullable = true)
    private Boolean emerIssuEurop;

    @Column(name = "cs7_emerIssuBioConsrv", nullable = true)
    private Boolean emerIssuBioConsrv;

    @Column(name = "cs7_emerIssuIntMarket", nullable = true)
    private Boolean emerIssuIntMarket;

    @Column(name = "cs7_intMarketCountries", nullable = true)
    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Integer> intMarketCountries;

    @Column(name = "cs7_intMarketCountryOther", nullable = true)
    private String intMarketCountryOther;

    @Column(name = "cs7_comments", nullable = true)
    private String comments;

    @Column(name = "cs7_investResIfInve", nullable = true)
    private Boolean investResIfInve;

    @Column(name = "cs7_planCommPlantYear", nullable = true)
    private String planCommPlantYear;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getInvestResIfInve() {
        return investResIfInve;
    }

    public void setInvestResIfInve(Boolean investResIfInve) {
        this.investResIfInve = investResIfInve;
    }

    public String getPlanCommPlantYear() {
        return planCommPlantYear;
    }

    public void setPlanCommPlantYear(String planCommPlantYear) {
        this.planCommPlantYear = planCommPlantYear;
    }

    public Boolean getEmerIssuIntMarket() {
        return emerIssuIntMarket;
    }

    public void setEmerIssuIntMarket(Boolean emerIssuIntMarket) {
        this.emerIssuIntMarket = emerIssuIntMarket;
    }

    public Set<Integer> getIntMarketCountries() {
        return intMarketCountries;
    }

    public void setIntMarketCountries(Set<Integer> intMarketCountries) {
        addAll(this.intMarketCountries, intMarketCountries);
    }

    public String getIntMarketCountryOther() {
        return intMarketCountryOther;
    }

    public void setIntMarketCountryOther(String intMarketCountryOther) {
        this.intMarketCountryOther = intMarketCountryOther;
    }

    public Boolean getEmerIssuEurop() {
        return emerIssuEurop;
    }

    public void setEmerIssuEurop(Boolean emerIssuEurop) {
        this.emerIssuEurop = emerIssuEurop;
    }

    public Boolean getEmerIssuBioConsrv() {
        return emerIssuBioConsrv;
    }

    public void setEmerIssuBioConsrv(Boolean emerIssuBioConsrv) {
        this.emerIssuBioConsrv = emerIssuBioConsrv;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getEmerIssuBioe() {
        return emerIssuBioe;
    }

    public void setEmerIssuBioe(Boolean emerIssuBioe) {
        this.emerIssuBioe = emerIssuBioe;
    }

    public Boolean getEmerIssuCarb() {
        return emerIssuCarb;
    }

    public void setEmerIssuCarb(Boolean emerIssuCarb) {
        this.emerIssuCarb = emerIssuCarb;
    }

    public Boolean getEmerIssuWate() {
        return emerIssuWate;
    }

    public void setEmerIssuWate(Boolean emerIssuWate) {
        this.emerIssuWate = emerIssuWate;
    }

    public Boolean getEmerIssuClim() {
        return emerIssuClim;
    }

    public void setEmerIssuClim(Boolean emerIssuClim) {
        this.emerIssuClim = emerIssuClim;
    }

    public Boolean getEmerIssuEcos() {
        return emerIssuEcos;
    }

    public void setEmerIssuEcos(Boolean emerIssuEcos) {
        this.emerIssuEcos = emerIssuEcos;
    }

    public Boolean getEmerIssuOther() {
        return emerIssuOther;
    }

    public void setEmerIssuOther(Boolean emerIssuOther) {
        this.emerIssuOther = emerIssuOther;
    }

    public String getEmerIssuOtherSpec() {
        return emerIssuOtherSpec;
    }

    public void setEmerIssuOtherSpec(String emerIssuOtherSpec) {
        this.emerIssuOtherSpec = emerIssuOtherSpec;
    }

    public Float getInvestRespercCurrSupply() {
        return investRespercCurrSupply;
    }

    public void setInvestRespercCurrSupply(Float investRespercCurrSupply) {
        this.investRespercCurrSupply = investRespercCurrSupply;
    }

    public Boolean getPlanInvestResIfPlan() {
        return planInvestResIfPlan;
    }

    public void setPlanInvestResIfPlan(Boolean planInvestResIfPlan) {
        this.planInvestResIfPlan = planInvestResIfPlan;
    }

    public String getPlanInvestResYear() {
        return planInvestResYear;
    }

    public void setPlanInvestResYear(String planInvestResYear) {
        this.planInvestResYear = planInvestResYear;
    }

    public Boolean getPlanCommPlantIfPlanGE() {
        return planCommPlantIfPlanGE;
    }

    public void setPlanCommPlantIfPlanGE(Boolean planCommPlantIfPlanGE) {
        this.planCommPlantIfPlanGE = planCommPlantIfPlanGE;
    }

    public Set<SfiPpFormAllCountry> getInvestResCountries() {
        return investResCountries;
    }

    public void setInvestResCountries(Set<SfiPpFormAllCountry> investResCountries) {
        addAll(this.investResCountries, investResCountries);
    }
}
