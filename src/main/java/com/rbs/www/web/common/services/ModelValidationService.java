package com.rbs.www.web.common.services;

import com.rbs.www.common.models.BaseViewModel;
import com.rbs.www.common.modules.validator.CustomTraversableResolver;
import org.hibernate.validator.HibernateValidator;
import org.springframework.stereotype.Service;

import javax.validation.*;
import java.util.ArrayList;
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

    public <T extends BaseViewModel> T validate(T model) {
        Set<ConstraintViolation<T>> errors = this.validator.validate(model);

        for (ConstraintViolation<T> error : errors) {
            BaseViewModel currentModel = (BaseViewModel) error.getLeafBean();
            if (currentModel.getErrors() == null) currentModel.setErrors(new ArrayList<String>());

            currentModel.getErrors().add(error.getMessage());
        }

        return model;
    }
}