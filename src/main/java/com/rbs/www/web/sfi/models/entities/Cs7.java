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

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs7_iplan_comm_plant_countries",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> planCommPlantCountries;

    @ManyToMany(targetEntity = SfiPpFormAllCountry.class, cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "sfi_pp_form_cs7_plan_invest_res_countries",
            joinColumns = {@JoinColumn(name = "form_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id", referencedColumnName = "id")})
    private Set<SfiPpFormAllCountry> planInvestResCountries;

    @Column(name = "cs7_investResperc_currSupply", nullable = true)
    private Integer investResperc_currSupply;

    @Column(name = "cs7_investRes_ifInve", nullable = true)
    private String investRes_ifInve;

    @Column(name = "cs7_planCommPlantPerc", nullable = true)
    private String planCommPlantPerc;

    @Column(name = "cs7_planCommPlant_ifPlanGE", nullable = true)
    private String planCommPlant_ifPlanGE;

    @Column(name = "cs7_planCommPlant_year", nullable = true)
    private String planCommPlant_year;

    @Column(name = "cs7_planInvestRes_ifPlan", nullable = true)
    private String planInvestRes_ifPlan;

    @Column(name = "cs7_planInvestRes_year", nullable = true)
    private String planInvestRes_year;

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

    public Set<SfiPpFormAllCountry> getPlanCommPlantCountries() {
        return planCommPlantCountries;
    }

    public void setPlanCommPlantCountries(Set<SfiPpFormAllCountry> planCommPlantCountries) {
        addAll(this.planCommPlantCountries, planCommPlantCountries);
    }

    public Set<SfiPpFormAllCountry> getPlanInvestResCountries() {
        return planInvestResCountries;
    }

    public void setPlanInvestResCountries(Set<SfiPpFormAllCountry> planInvestResCountries) {
        addAll(this.planInvestResCountries, planInvestResCountries);
    }

    public Integer getInvestResperc_currSupply() {
        return investResperc_currSupply;
    }

    public void setInvestResperc_currSupply(Integer investResperc_currSupply) {
        this.investResperc_currSupply = investResperc_currSupply;
    }

    public String getInvestRes_ifInve() {
        return investRes_ifInve;
    }

    public void setInvestRes_ifInve(String investRes_ifInve) {
        this.investRes_ifInve = investRes_ifInve;
    }

    public String getPlanCommPlantPerc() {
        return planCommPlantPerc;
    }

    public void setPlanCommPlantPerc(String planCommPlantPerc) {
        this.planCommPlantPerc = planCommPlantPerc;
    }

    public String getPlanCommPlant_ifPlanGE() {
        return planCommPlant_ifPlanGE;
    }

    public void setPlanCommPlant_ifPlanGE(String planCommPlant_ifPlanGE) {
        this.planCommPlant_ifPlanGE = planCommPlant_ifPlanGE;
    }

    public String getPlanCommPlant_year() {
        return planCommPlant_year;
    }

    public void setPlanCommPlant_year(String planCommPlant_year) {
        this.planCommPlant_year = planCommPlant_year;
    }

    public String getPlanInvestRes_ifPlan() {
        return planInvestRes_ifPlan;
    }

    public void setPlanInvestRes_ifPlan(String planInvestRes_ifPlan) {
        this.planInvestRes_ifPlan = planInvestRes_ifPlan;
    }

    public String getPlanInvestRes_year() {
        return planInvestRes_year;
    }

    public void setPlanInvestRes_year(String planInvestRes_year) {
        this.planInvestRes_year = planInvestRes_year;
    }
}
