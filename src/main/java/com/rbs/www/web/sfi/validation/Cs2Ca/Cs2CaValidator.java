package com.rbs.www.web.sfi.validation.Cs2Ca;

import com.rbs.www.common.modules.validator.ValidationHelper;
import com.rbs.www.web.sfi.models.viewmodels.Cs2ViewModel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Cs2CaValidator implements ConstraintValidator<Cs2Ca, Cs2ViewModel> {
    public void initialize(Cs2Ca constraint) {
    }

    public boolean isValid(Cs2ViewModel model, ConstraintValidatorContext context) {
        return !applyIf(model) || evaluate(model);
    }

    private boolean applyIf(Cs2ViewModel model) {
        return !ValidationHelper.isTruthy(model.getOwnsMngLands(), model.getOwnsMngLandsInCA())
                && !ValidationHelper.isTruthy(model.getHasPrimaryOperMillsYards(), model.getHasPrimaryOperMillsYardsInCA());
    }

    private boolean evaluate(Cs2ViewModel model) {
        return model.getCaCrownForestlandOwnMng() == null &&
                model.getCaPrivateForestlandOwnMng() == null &&
                model.getCaCrownTotalAreaOwnOrManage() == null &&
                model.getCaCrownTotalAreaCertified() == null &&
                model.getCaCrownAreaManagedForPublic() == null &&
                model.getCaCrownAreaCertifiedForPublic() == null &&
                model.getCaPrivateTotalAreaOwnOrManage() == null &&
                model.getCaPrivateTotalAreaCertified() == null &&
                model.getCaPrivateAreaManagedForPublic() == null &&
                model.getCaPrivateAreaCertifiedForPublic() == null &&
                model.getCaCrownForestlandOwnMngOther() == null &&
                model.getCaPrivateForestlandOwnMngOther() == null;
    }
}
