package com.rbs.www.web.sfi.validation.Cs2Other;

import com.rbs.www.common.modules.validator.ValidationHelper;
import com.rbs.www.web.sfi.models.viewmodels.Cs2ViewModel;
import com.rbs.www.web.sfi.models.viewmodels.UsaCaSelectorViewModel;
import com.rbs.www.web.sfi.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Cs2OtherValidator implements ConstraintValidator<Cs2Other, Cs2ViewModel> {

    @Autowired
    private FormService formService;

    @Override
    public void initialize(Cs2Other constraint) {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    @Override
    public boolean isValid(Cs2ViewModel model, ConstraintValidatorContext context) {
        return !applyIf(formService.getUsaCaSelectorViewModel(model.getId())) || !evaluate(model);
    }

    private boolean applyIf(UsaCaSelectorViewModel model) {
        return ValidationHelper.isTruthy(model.getOwnsMngLands(), model.getOwnsMngLandsInOther());
    }

    private boolean evaluate(Cs2ViewModel model) {
        return ValidationHelper.isEmptyCollection(model.getOutsideCountries());
    }
}
