package com.rbs.www.web.sfi.validation.Cs6Ca;

import com.rbs.www.common.modules.validator.ValidationHelper;
import com.rbs.www.web.sfi.models.viewmodels.Cs6ViewModel;
import com.rbs.www.web.sfi.models.viewmodels.UsaCaSelectorViewModel;
import com.rbs.www.web.sfi.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Cs6CaValidator implements ConstraintValidator<Cs6Ca, Cs6ViewModel> {

    @Autowired
    private FormService formService;

    @Override
    public void initialize(Cs6Ca constraint) {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    @Override
    public boolean isValid(Cs6ViewModel model, ConstraintValidatorContext context) {
        return !applyIf(formService.getUsaCaSelectorViewModel(model.getId())) || evaluate(model);
    }

    private boolean applyIf(UsaCaSelectorViewModel model) {
        return ValidationHelper.isTruthy(model.getOwnsMngLands(), model.getOwnsMngLandsInCA())
                || ValidationHelper.isTruthy(model.getHasPrimaryOperMillsYards(), model.getHasPrimaryOperMillsYardsInCA());
    }

    private boolean evaluate(Cs6ViewModel model) {
         return model.getNumPrivateForeOwersCa() != null;
    }
}
