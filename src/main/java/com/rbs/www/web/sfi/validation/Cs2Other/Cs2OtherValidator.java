package com.rbs.www.web.sfi.validation.Cs2Other;

import com.rbs.www.common.modules.validator.ValidationHelper;
import com.rbs.www.web.sfi.models.viewmodels.Cs2ViewModel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Cs2OtherValidator implements ConstraintValidator<Cs2Other, Cs2ViewModel> {
    public void initialize(Cs2Other constraint) {
    }

    public boolean isValid(Cs2ViewModel model, ConstraintValidatorContext context) {
        return !applyIf(model) || evaluate(model);
    }

    private boolean applyIf(Cs2ViewModel model) {
        return !ValidationHelper.isTruthy(model.getOwnsMngLands(), model.getOwnsMngLandsInOther())
                && !ValidationHelper.isTruthy(model.getHasPrimaryOperMillsYards(), model.getHasPrimaryOperMillsYardsInOther());
    }

    private boolean evaluate(Cs2ViewModel model) {
        return ValidationHelper.isEmptyCollection(model.getOutsideCountries());
    }
}
