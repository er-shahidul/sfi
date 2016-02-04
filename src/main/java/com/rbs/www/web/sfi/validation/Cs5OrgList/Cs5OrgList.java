package com.rbs.www.web.sfi.validation.Cs5OrgList;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = Cs5OrgListValidator.class)
public @interface Cs5OrgList {
    String message() default "Validation Unsuccessful";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
