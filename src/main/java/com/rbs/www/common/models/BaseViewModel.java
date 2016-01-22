package com.rbs.www.common.models;

import java.util.Map;

public abstract class BaseViewModel implements IModel {
    Map<String, String> errors;

    @Override
    public abstract Integer getId();

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }
}
