package com.rbs.www.web.sfi.validation.SfiPpFormCs3OrgList;

import com.rbs.www.common.modules.validator.ValidationHelper;
import com.rbs.www.web.sfi.models.viewmodels.SfiPpFormCs3ViewModel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SfiPpFormCs3OrgListValidator implements ConstraintValidator<SfiPpFormCs3OrgList, SfiPpFormCs3ViewModel> {

    @Override
    public void initialize(SfiPpFormCs3OrgList constraint) {
    }

    @Override
    public boolean isValid(SfiPpFormCs3ViewModel model, ConstraintValidatorContext context) {
        return !ValidationHelper.isEmptyCollection(model.getOrganizationListAcademic()) ||
                !ValidationHelper.isEmptyCollection(model.getOrganizationListResearch()) ||
                !ValidationHelper.isEmptyCollection(model.getOrganizationListConservation()) ||
                !ValidationHelper.isEmptyCollection(model.getOrganizationListGovernment()) ||
                !ValidationHelper.isEmptyCollection(model.getOrganizationListCommunity()) ||
                !ValidationHelper.isEmptyCollection(model.getOrganizationListOther());
    }
}
