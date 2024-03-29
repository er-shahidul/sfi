package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.SpELAssert;
import com.rbs.www.web.common.models.viewmodels.SfiPpFormAllCountryViewModel;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Set;

@SpELAssert.List({
        @SpELAssert(
                value = "ownsMngLandsInUSA || ownsMngLandsInCA || ownsMngLandsInOther",
                applyIf = "ownsMngLands != null && ownsMngLands",
                message = "{cs1.ownsMngLands}"
        ),
        @SpELAssert(
                value = "ownsMngLandsOtherCountries != null && !ownsMngLandsOtherCountries.isEmpty()",
                applyIf = "ownsMngLandsInOther != null && ownsMngLandsInOther",
                message = "{cs1.ownsMngLandsOtherCountries}"
        ),

        @SpELAssert(
                value = "hasPrimaryOperMillsYardsInOther || hasPrimaryOperMillsYardsInCA || hasPrimaryOperMillsYardsInUSA",
                applyIf = "hasPrimaryOperMillsYards != null && hasPrimaryOperMillsYards",
                message = "{cs1.hasPrimaryOperMillsYards}"
        ),
        @SpELAssert(
                value = "primaryOperMillsYardsOtherCountries != null && !primaryOperMillsYardsOtherCountries.isEmpty()",
                applyIf = "hasPrimaryOperMillsYardsInOther != null && hasPrimaryOperMillsYardsInOther",
                message = "{cs1.primaryOperMillsYardsOtherCountries}"
        ),

        @SpELAssert(
                value = "hasSecondaryOperMillsYardsInOther || hasSecondaryOperMillsYardsInCA || hasSecondaryOperMillsYardsInUSA",
                applyIf = "hasSecondaryOperMillsYards != null && hasSecondaryOperMillsYards",
                message = "{cs1.hasSecondaryOperMillsYards}"
        ),
        @SpELAssert(
                value = "secondaryOperMillsYardsOtherCountries != null && !secondaryOperMillsYardsOtherCountries.isEmpty()",
                applyIf = "hasSecondaryOperMillsYardsInOther != null && hasSecondaryOperMillsYardsInOther",
                message = "{cs1.secondaryOperMillsYardsOtherCountries}"
        ),

        @SpELAssert(
                value = "sellsCountries != null && !sellsCountries.isEmpty()",
                message = "{cs1.sellsCountries}"
        )
})
public class Cs1ViewModel extends BaseViewModel {
    private Integer id;
    private Integer numberEmployeesUSA;
    private Integer numberEmployeesCA;
    private Integer numberEmployeesOther;

    @NotEmpty(message = "{cs1.companyWebsite}")
    private String companyWebsite;

    @Length(max = 40000, message = "{cs1.companyDesc}")
    private String companyDesc;

    private Boolean ownsMngLands;
    private Boolean ownsMngLandsInUSA;
    private Boolean ownsMngLandsInCA;
    private Boolean ownsMngLandsInOther;

    private Boolean hasPrimaryOperMillsYards;
    private Boolean hasPrimaryOperMillsYardsInUSA;
    private Boolean hasPrimaryOperMillsYardsInCA;
    private Boolean hasPrimaryOperMillsYardsInOther;

    private Boolean hasSecondaryOperMillsYards;
    private Boolean hasSecondaryOperMillsYardsInUSA;
    private Boolean hasSecondaryOperMillsYardsInCA;
    private Boolean hasSecondaryOperMillsYardsInOther;
    private Set<SfiPpFormOtherCountryViewModel> ownsMngLandsOtherCountries;
    private Set<SfiPpFormOtherCountryViewModel> primaryOperMillsYardsOtherCountries;
    private Set<SfiPpFormOtherCountryViewModel> secondaryOperMillsYardsOtherCountries;
    private Set<SfiPpFormAllCountryViewModel> sellsCountries;

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

    public Boolean getOwnsMngLands() {
        return ownsMngLands;
    }

    public void setOwnsMngLands(Boolean ownsMngLands) {
        this.ownsMngLands = ownsMngLands;
    }

    public Boolean getOwnsMngLandsInUSA() {
        return ownsMngLandsInUSA;
    }

    public void setOwnsMngLandsInUSA(Boolean ownsMngLandsInUSA) {
        this.ownsMngLandsInUSA = ownsMngLandsInUSA;
    }

    public Boolean getOwnsMngLandsInCA() {
        return ownsMngLandsInCA;
    }

    public void setOwnsMngLandsInCA(Boolean ownsMngLandsInCA) {
        this.ownsMngLandsInCA = ownsMngLandsInCA;
    }

    public Boolean getOwnsMngLandsInOther() {
        return ownsMngLandsInOther;
    }

    public void setOwnsMngLandsInOther(Boolean ownsMngLandsInOther) {
        this.ownsMngLandsInOther = ownsMngLandsInOther;
    }

    public Boolean getHasPrimaryOperMillsYards() {
        return hasPrimaryOperMillsYards;
    }

    public void setHasPrimaryOperMillsYards(Boolean hasPrimaryOperMillsYards) {
        this.hasPrimaryOperMillsYards = hasPrimaryOperMillsYards;
    }

    public Boolean getHasPrimaryOperMillsYardsInUSA() {
        return hasPrimaryOperMillsYardsInUSA;
    }

    public void setHasPrimaryOperMillsYardsInUSA(Boolean hasPrimaryOperMillsYardsInUSA) {
        this.hasPrimaryOperMillsYardsInUSA = hasPrimaryOperMillsYardsInUSA;
    }

    public Boolean getHasPrimaryOperMillsYardsInCA() {
        return hasPrimaryOperMillsYardsInCA;
    }

    public void setHasPrimaryOperMillsYardsInCA(Boolean hasPrimaryOperMillsYardsInCA) {
        this.hasPrimaryOperMillsYardsInCA = hasPrimaryOperMillsYardsInCA;
    }

    public Boolean getHasPrimaryOperMillsYardsInOther() {
        return hasPrimaryOperMillsYardsInOther;
    }

    public void setHasPrimaryOperMillsYardsInOther(Boolean hasPrimaryOperMillsYardsInOther) {
        this.hasPrimaryOperMillsYardsInOther = hasPrimaryOperMillsYardsInOther;
    }

    public Boolean getHasSecondaryOperMillsYards() {
        return hasSecondaryOperMillsYards;
    }

    public void setHasSecondaryOperMillsYards(Boolean hasSecondaryOperMillsYards) {
        this.hasSecondaryOperMillsYards = hasSecondaryOperMillsYards;
    }

    public Boolean getHasSecondaryOperMillsYardsInUSA() {
        return hasSecondaryOperMillsYardsInUSA;
    }

    public void setHasSecondaryOperMillsYardsInUSA(Boolean hasSecondaryOperMillsYardsInUSA) {
        this.hasSecondaryOperMillsYardsInUSA = hasSecondaryOperMillsYardsInUSA;
    }

    public Boolean getHasSecondaryOperMillsYardsInCA() {
        return hasSecondaryOperMillsYardsInCA;
    }

    public void setHasSecondaryOperMillsYardsInCA(Boolean hasSecondaryOperMillsYardsInCA) {
        this.hasSecondaryOperMillsYardsInCA = hasSecondaryOperMillsYardsInCA;
    }

    public Boolean getHasSecondaryOperMillsYardsInOther() {
        return hasSecondaryOperMillsYardsInOther;
    }

    public void setHasSecondaryOperMillsYardsInOther(Boolean hasSecondaryOperMillsYardsInOther) {
        this.hasSecondaryOperMillsYardsInOther = hasSecondaryOperMillsYardsInOther;
    }

    public Set<SfiPpFormOtherCountryViewModel> getOwnsMngLandsOtherCountries() {
        return ownsMngLandsOtherCountries;
    }

    public void setOwnsMngLandsOtherCountries(Set<SfiPpFormOtherCountryViewModel> ownsMngLandsOtherCountries) {
        this.ownsMngLandsOtherCountries = ownsMngLandsOtherCountries;
    }

    public Set<SfiPpFormOtherCountryViewModel> getPrimaryOperMillsYardsOtherCountries() {
        return primaryOperMillsYardsOtherCountries;
    }

    public void setPrimaryOperMillsYardsOtherCountries(
            Set<SfiPpFormOtherCountryViewModel> primaryOperMillsYardsOtherCountries) {
        this.primaryOperMillsYardsOtherCountries = primaryOperMillsYardsOtherCountries;
    }

    public Set<SfiPpFormOtherCountryViewModel> getSecondaryOperMillsYardsOtherCountries() {
        return secondaryOperMillsYardsOtherCountries;
    }

    public void setSecondaryOperMillsYardsOtherCountries(
            Set<SfiPpFormOtherCountryViewModel> secondaryOperMillsYardsOtherCountries) {
        this.secondaryOperMillsYardsOtherCountries = secondaryOperMillsYardsOtherCountries;
    }

    public Set<SfiPpFormAllCountryViewModel> getSellsCountries() {
        return sellsCountries;
    }

    public void setSellsCountries(Set<SfiPpFormAllCountryViewModel> sellsCountries) {
        this.sellsCountries = sellsCountries;
    }
}
