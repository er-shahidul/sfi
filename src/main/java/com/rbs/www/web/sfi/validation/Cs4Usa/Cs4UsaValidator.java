package com.rbs.www.web.sfi.validation.Cs4Usa;

import com.rbs.www.common.modules.validator.ValidationHelper;
import com.rbs.www.web.sfi.models.viewmodels.Cs4ViewModel;
import com.rbs.www.web.sfi.models.viewmodels.UsaCaSelectorViewModel;
import com.rbs.www.web.sfi.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Cs4UsaValidator implements ConstraintValidator<Cs4Usa, Cs4ViewModel> {

    @Autowired
    private FormService formService;

    @Override
    public void initialize(Cs4Usa constraint) {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    @Override
    public boolean isValid(Cs4ViewModel model, ConstraintValidatorContext context) {
        return !applyIf(formService.getUsaCaSelectorViewModel(model.getId())) || evaluate(model);
    }

    private boolean applyIf(UsaCaSelectorViewModel model) {
        return ValidationHelper.isTruthy(model.getOwnsMngLands(), model.getOwnsMngLandsInUSA())
                || ValidationHelper.isTruthy(model.getHasPrimaryOperMillsYards(), model.getHasPrimaryOperMillsYardsInUSA());
    }

    private boolean evaluate(Cs4ViewModel model) {
        return model.getUsaTotalHervArea() != null &&
                model.getUsaAvgHervArea() != null &&
                model.getUsaSeedTreeShelterWoodArea() != null &&
                model.getUsaSelectionMethodArea() != null &&
                model.getUsaSanitationArea() != null &&
                model.getUsaPlantingOneYr() != null &&
                model.getUsaPlantingTwoYr() != null &&
                model.getUsaPlantingTwoPlusYr() != null &&
                model.getUsaSeedingOneYr() != null &&
                model.getUsaSeedingTwoYr() != null &&
                model.getUsaSeedingTwoPlusYr() != null &&
                model.getUsaNatRegen2014() != null &&
                model.getUsaRegenPerc5Yr() != null &&
                model.getUsaGovRegulationExp() != null &&
                model.getUsaDiseaseInsectsExp() != null &&
                model.getUsaFireSalvageExp() != null &&
                model.getUsaWindthrowExp() != null &&
                model.getUsaHurricaneExp() != null &&
                model.getUsaIceStormExp() != null &&
                model.getUsaOthersExp() != null &&
                model.getUsaGovRegulation() != null &&
                model.getUsaDisResDiseaseInsects() != null &&
                model.getUsaDisResFireSalvage() != null &&
                model.getUsaDisResWindthrow() != null &&
                model.getUsaDisResHurricane() != null &&
                model.getUsaDisResIceStorm() != null &&
                model.getUsaOthersApply() != null;
    }
}
