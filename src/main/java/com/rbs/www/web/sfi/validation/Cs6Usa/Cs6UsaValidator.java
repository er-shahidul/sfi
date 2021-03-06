package com.rbs.www.web.sfi.validation.Cs6Usa;

import com.rbs.www.common.modules.validator.ValidationHelper;
import com.rbs.www.web.sfi.models.viewmodels.Cs6ViewModel;
import com.rbs.www.web.sfi.models.viewmodels.UsaCaSelectorViewModel;
import com.rbs.www.web.sfi.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Cs6UsaValidator implements ConstraintValidator<Cs6Usa, Cs6ViewModel> {

    @Autowired
    private FormService formService;

    @Override
    public void initialize(Cs6Usa constraint) {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    @Override
    public boolean isValid(Cs6ViewModel model, ConstraintValidatorContext context) {
        return !applyIf(formService.getUsaCaSelectorViewModel(model.getId())) || evaluate(model);
    }

    private boolean applyIf(UsaCaSelectorViewModel model) {
        return ValidationHelper.isTruthy(model.getHasPrimaryOperMillsYards(), model.getHasPrimaryOperMillsYardsInUSA());
    }

    private boolean evaluate(Cs6ViewModel model) {
         return model.getNumPrivateForeOwersUs() != null;
    }
}
