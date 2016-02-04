package com.rbs.www.web.sfi.validation.Cs5OrgList;

import com.rbs.www.common.modules.validator.ValidationHelper;
import com.rbs.www.web.sfi.models.viewmodels.Cs5ViewModel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Cs5OrgListValidator implements ConstraintValidator<Cs5OrgList, Cs5ViewModel> {

    @Override
    public void initialize(Cs5OrgList constraint) {
    }

    @Override
    public boolean isValid(Cs5ViewModel model, ConstraintValidatorContext context) {
        return !ValidationHelper.isEmptyCollection(model.getOrganizationListAcademic()) ||
                !ValidationHelper.isEmptyCollection(model.getOrganizationListResearch()) ||
                !ValidationHelper.isEmptyCollection(model.getOrganizationListConservation()) ||
                !ValidationHelper.isEmptyCollection(model.getOrganizationListGovernment()) ||
                !ValidationHelper.isEmptyCollection(model.getOrganizationListCommunity()) ||
                !ValidationHelper.isEmptyCollection(model.getOrganizationListOther());
    }
}
