package com.rbs.www.web.sfi.validation.Cs2Ca;

import com.rbs.www.common.modules.validator.ValidationHelper;
import com.rbs.www.web.sfi.models.viewmodels.Cs2ViewModel;
import com.rbs.www.web.sfi.models.viewmodels.UsaCaSelectorViewModel;
import com.rbs.www.web.sfi.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Cs2CaValidator implements ConstraintValidator<Cs2Ca, Cs2ViewModel> {

    @Autowired
    private FormService formService;

    @Override
    public void initialize(Cs2Ca constraint) {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    @Override
    public boolean isValid(Cs2ViewModel model, ConstraintValidatorContext context) {
        return !applyIf(formService.getUsaCaSelectorViewModel(model.getId())) || evaluate(model);
    }

    private boolean applyIf(UsaCaSelectorViewModel model) {
        return ValidationHelper.isTruthy(model.getOwnsMngLands(), model.getOwnsMngLandsInCA());
    }

    private boolean evaluate(Cs2ViewModel model) {
        return model.getCaCrownForestlandOwnMng() != null &&
                model.getCaPrivateForestlandOwnMng() != null &&
                model.getCaCrownTotalAreaOwnOrManage() != null &&
                model.getCaCrownTotalAreaCertified() != null &&
                model.getCaCrownAreaManagedForPublic() != null &&
                model.getCaCrownAreaCertifiedForPublic() != null &&
                model.getCaPrivateTotalAreaOwnOrManage() != null &&
                model.getCaPrivateTotalAreaCertified() != null &&
                model.getCaPrivateAreaManagedForPublic() != null &&
                model.getCaPrivateAreaCertifiedForPublic() != null;
    }
}
