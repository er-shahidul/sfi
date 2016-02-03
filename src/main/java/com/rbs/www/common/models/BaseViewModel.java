package com.rbs.www.common.models;

import java.util.List;

public abstract class BaseViewModel implements IModel {
    List<String> errors;

    @Override
    public abstract Integer getId();

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
