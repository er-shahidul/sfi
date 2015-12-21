package com.rbs.sfi.web.sfi.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;

import java.util.Set;

public class Cs7ViewModel extends BaseViewModel {
    private Integer id;
    private Boolean emerIssuBioe;
    private Boolean emerIssuCarb;
    private Boolean emerIssuWate;
    private Boolean emerIssuClim;
    private Boolean emerIssuEcos;
    private Boolean emerIssuOther;
    private String emerIssuOtherSpec;
    private Boolean investResIfInve;
    private Float investRespercCurrSupply;
    private Boolean planInvestResIfPlan;
    private String planInvestResYear;
    private Boolean planCommPlantIfPlanGE;
    private String planCommPlantYear;
    private Float planCommPlantPerc;
    private Set<SfiPpFormAllCountryViewModel> investResCountries;
    private Set<SfiPpFormAllCountryViewModel> planInvestResCountries;
    private Set<SfiPpFormAllCountryViewModel> planCommPlantCountries;

    private Boolean emerIssuEurop;
    private Boolean emerIssuBioConsrv;
    private String comments;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getInvestResIfInve() {
        return investResIfInve;
    }

    public void setInvestResIfInve(Boolean investResIfInve) {
        this.investResIfInve = investResIfInve;
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

    public String getPlanCommPlantYear() {
        return planCommPlantYear;
    }

    public void setPlanCommPlantYear(String planCommPlantYear) {
        this.planCommPlantYear = planCommPlantYear;
    }

    public Float getPlanCommPlantPerc() {
        return planCommPlantPerc;
    }

    public void setPlanCommPlantPerc(Float planCommPlantPerc) {
        this.planCommPlantPerc = planCommPlantPerc;
    }

    public Set<SfiPpFormAllCountryViewModel> getInvestResCountries() {
        return investResCountries;
    }

    public void setInvestResCountries(Set<SfiPpFormAllCountryViewModel> investResCountries) {
        this.investResCountries = investResCountries;
    }

    public Set<SfiPpFormAllCountryViewModel> getPlanInvestResCountries() {
        return planInvestResCountries;
    }

    public void setPlanInvestResCountries(Set<SfiPpFormAllCountryViewModel> planInvestResCountries) {
        this.planInvestResCountries = planInvestResCountries;
    }

    public Set<SfiPpFormAllCountryViewModel> getPlanCommPlantCountries() {
        return planCommPlantCountries;
    }

    public void setPlanCommPlantCountries(Set<SfiPpFormAllCountryViewModel> planCommPlantCountries) {
        this.planCommPlantCountries = planCommPlantCountries;
    }
}