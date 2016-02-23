package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.SpELAssert;
import com.rbs.www.web.common.models.viewmodels.SfiPpFormAllCountryViewModel;

import javax.validation.constraints.NotNull;
import java.util.Set;

@SpELAssert.List({
        @SpELAssert(
                value = "emerIssuOtherSpec != null",
                applyIf = "emerIssuOther != null && emerIssuOther",
                message = "{cs7.otherIssuesOfInterest}"
        ),
        @SpELAssert(
                value = "intMarketCountries != null && !intMarketCountries.isEmpty()",
                applyIf = "emerIssuIntMarket != null && emerIssuIntMarket",
                message = "{cs7.otherInternationalMarkets}"
        ),
        @SpELAssert(
                value = "investResCountries != null && !investResCountries.isEmpty()",
                applyIf = "investResIfInve != null && investResIfInve",
                message = "{cs7.planCountries}"
        ),
        @SpELAssert(
                value = "planInvestRes_year != null && !planInvestRes_year.isEmpty()",
                applyIf = "investResIfInve != null && investResIfInve",
                message = "{cs7.planYear}"
        ),
        @SpELAssert(
                value = "planInvestResCountries != null && !planInvestResCountries.isEmpty()",
                applyIf = "planInvestResIfPlan != null && planInvestResIfPlan",
                message = "{cs7.investCountries}"
        ),
        @SpELAssert(
                value = "investResperc_currSupply != null",
                applyIf = "planInvestResIfPlan != null && planInvestResIfPlan",
                message = "{cs7.investPercent}"
        ),
        @SpELAssert(
                value = "planCommPlantCountries != null && !planCommPlantCountries.isEmpty()",
                applyIf = "planCommPlantIfPlanGE != null && planCommPlantIfPlanGE",
                message = "{cs7.legalPlantCountries}"
        ),
        @SpELAssert(
                value = "planCommPlant_year != null && !planCommPlant_year.isEmpty()",
                applyIf = "planCommPlantIfPlanGE != null && planCommPlantIfPlanGE",
                message = "{cs7.legalPlantYar}"
        ),
        @SpELAssert(
                value = "planCommPlantPerc != null && !planCommPlantPerc.isEmpty()",
                applyIf = "planCommPlantIfPlanGE != null && planCommPlantIfPlanGE",
                message = "{cs7.legalPlantPlan}"
        )
})
public class Cs7ViewModel extends BaseViewModel {
    private Integer id;
//    @NotNull(message = "{cs7.emerIssuBioe}")
    private Boolean emerIssuBioe;
//    @NotNull(message = "{cs7.emerIssuCarb}")
    private Boolean emerIssuCarb;
//    @NotNull(message = "{cs7.emerIssuWate}")
    private Boolean emerIssuWate;
//    @NotNull(message = "{cs7.emerIssuClim}")
    private Boolean emerIssuClim;
//    @NotNull(message = "{cs7.emerIssuEcos}")
    private Boolean emerIssuEcos;
    private Boolean emerIssuOther;
    private String emerIssuOtherSpec;
    private Float investRespercCurrSupply;
    private Boolean planInvestResIfPlan;
    private String planInvestResYear;
    private Boolean planCommPlantIfPlanGE;
    private Set<SfiPpFormAllCountryViewModel> investResCountries;
    private Set<SfiPpFormAllCountryViewModel> planCommPlantCountries;
    private Set<SfiPpFormAllCountryViewModel> planInvestResCountries;
    private Integer investResperc_currSupply;
    private String investRes_ifInve;
    private String planCommPlantPerc;
    private String planCommPlant_ifPlanGE;
    private String planCommPlant_year;
    private String planInvestRes_ifPlan;
    private String planInvestRes_year;

//    @NotNull(message = "{cs7.emerIssuEurop}")
    private Boolean emerIssuEurop;
//    @NotNull(message = "{cs7.emerIssuBioConsrv}")
    private Boolean emerIssuBioConsrv;
    private String comments;

//    @NotNull(message = "{cs7.emerIssuIntMarket}")
    private Boolean emerIssuIntMarket;
    private Set<Integer> intMarketCountries;
    private String intMarketCountryOther;

    private Boolean investResIfInve;
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
        this.intMarketCountries = intMarketCountries;
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

    public Set<SfiPpFormAllCountryViewModel> getInvestResCountries() {
        return investResCountries;
    }

    public void setInvestResCountries(Set<SfiPpFormAllCountryViewModel> investResCountries) {
        this.investResCountries = investResCountries;
    }

    public Set<SfiPpFormAllCountryViewModel> getPlanCommPlantCountries() {
        return planCommPlantCountries;
    }

    public void setPlanCommPlantCountries(Set<SfiPpFormAllCountryViewModel> planCommPlantCountries) {
        this.planCommPlantCountries = planCommPlantCountries;
    }

    public Set<SfiPpFormAllCountryViewModel> getPlanInvestResCountries() {
        return planInvestResCountries;
    }

    public void setPlanInvestResCountries(Set<SfiPpFormAllCountryViewModel> planInvestResCountries) {
        this.planInvestResCountries = planInvestResCountries;
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
