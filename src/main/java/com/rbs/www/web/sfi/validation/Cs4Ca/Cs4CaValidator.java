package com.rbs.www.web.sfi.validation.Cs4Ca;

import com.rbs.www.common.modules.validator.ValidationHelper;
import com.rbs.www.web.sfi.models.viewmodels.Cs4ViewModel;
import com.rbs.www.web.sfi.models.viewmodels.UsaCaSelectorViewModel;
import com.rbs.www.web.sfi.services.FormService;
import com.rbs.www.web.sfi.validation.Cs4Usa.Cs4Usa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Cs4CaValidator implements ConstraintValidator<Cs4Ca, Cs4ViewModel> {

    @Autowired
    private FormService formService;

    @Override
    public void initialize(Cs4Ca constraint) {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    @Override
    public boolean isValid(Cs4ViewModel model, ConstraintValidatorContext context) {
        return !applyIf(formService.getUsaCaSelectorViewModel(model.getId())) || evaluate(model);
    }

    private boolean applyIf(UsaCaSelectorViewModel model) {
        return ValidationHelper.isTruthy(model.getOwnsMngLands(), model.getOwnsMngLandsInCA())
                || ValidationHelper.isTruthy(model.getHasPrimaryOperMillsYards(), model.getHasPrimaryOperMillsYardsInCA());
    }

    private boolean evaluate(Cs4ViewModel model) {
        return model.getCaTotalHervArea() != null &&
                model.getCaAvgHervArea() != null &&
                model.getCaSeedTreeShelterWoodArea() != null &&
                model.getCaSanitationArea() != null &&
                model.getCaSelectionMethodArea() != null &&
                model.getCaPlantingOneYr() != null &&
                model.getCaPlantingTwoYr() != null &&
                model.getCaPlantingTwoPlusYr() != null &&
                model.getCaSeedingOneYr() != null &&
                model.getCaSeedingTwoYr() != null &&
                model.getCaSeedingTwoPlusYr() != null &&
                model.getCaNatRegen2014() != null &&
                model.getCaRegenPerc5Yr() != null &&
                model.getCaGovRegulationExp() != null &&
                model.getCaDiseaseInsectsExp() != null &&
                model.getCaFireSalvageExp() != null &&
                model.getCaWindthrowExp() != null &&
                model.getCaHurricaneExp() != null &&
                model.getCaIceStormExp() != null &&
                model.getCaOthersExp() != null &&
                model.getCaGovRegulation() != null &&
                model.getCaDisResDiseaseInsects() != null &&
                model.getCaDisResFireSalvage() != null &&
                model.getCaDisResWindthrow() != null &&
                model.getCaDisResHurricane() != null &&
                model.getCaDisResIceStorm() != null &&
                model.getCaOthersApply() != null;
    }
}
