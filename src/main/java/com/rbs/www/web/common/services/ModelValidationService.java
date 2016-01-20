package com.rbs.www.web.common.services;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.CustomTraversableResolver;
import org.hibernate.validator.HibernateValidator;
import org.springframework.stereotype.Service;

import javax.validation.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class ModelValidationService {
    private Validator validator;

    public ModelValidationService() {
        Configuration<?> configuration = Validation
                .byProvider(HibernateValidator.class)
                .configure();

        ValidatorFactory factory = configuration
                .traversableResolver(new CustomTraversableResolver())
                .buildValidatorFactory();

        this.validator = factory.getValidator();
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