package com.rbs.www.web.sfi.validation.Cs2Usa;

import com.rbs.www.common.modules.validator.ValidationHelper;
import com.rbs.www.web.sfi.models.viewmodels.Cs2ViewModel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Cs2UsaValidator implements ConstraintValidator<Cs2Usa, Cs2ViewModel> {
    public void initialize(Cs2Usa constraint) {
    }

    public boolean isValid(Cs2ViewModel model, ConstraintValidatorContext context) {
        return !applyIf(model) || evaluate(model);
    }

    private boolean applyIf(Cs2ViewModel model) {
        return !ValidationHelper.isTruthy(model.getOwnsMngLands(), model.getOwnsMngLandsInUSA())
                && !ValidationHelper.isTruthy(model.getHasPrimaryOperMillsYards(), model.getHasPrimaryOperMillsYardsInUSA());
    }

    private boolean evaluate(Cs2ViewModel model) {
        return model.getUsaPublicForestlandOwnMng() == null &&
                model.getUsaPrivateForestlandOwnMng() == null &&
                model.getUsaPrivateTotalAreaOwnOrManage() == null &&
                model.getUsaPrivateTotalAreaCertified() == null &&
                model.getUsaPrivateAreaManagedForPublic() == null &&
                model.getUsaPrivateAreaCertifiedForPublic() == null &&
                model.getUsaPublicTotalAreaOwnOrManage() == null &&
                model.getUsaPublicTotalAreaCertified() == null &&
                model.getUsaPublicAreaManagedForPublic() == null &&
                model.getUsaPublicAreaCertifiedForPublic() == null &&
                model.getUsaPrivateForestlandOwnMngOther() == null &&
                model.getUsaPublicForestlandOwnMngOther() == null;
    }
}
