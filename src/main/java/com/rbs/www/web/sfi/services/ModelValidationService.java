package com.rbs.www.web.sfi.services;

import com.rbs.www.common.models.BaseViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class ModelValidationService {
    private Validator validator;

    public ModelValidationService() {
        this.validator = Validation.buildDefaultValidatorFactory()
                                   .getValidator();
    }

    private Map<String, String> generateMapModel(Set<ConstraintViolation<BaseViewModel>> errors) {
        Map<String, String> mapModel = new HashMap<String, String>();

        for (ConstraintViolation<BaseViewModel> error : errors) {
            mapModel.put(error.getPropertyPath().toString(), error.getMessage());
        }

        return mapModel;
    }

    public Map<String, String> validate(BaseViewModel model) {
        return this.generateMapModel(validator.validate(model));
    }
}
