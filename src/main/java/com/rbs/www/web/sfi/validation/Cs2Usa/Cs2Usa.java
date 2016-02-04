package com.rbs.www.web.sfi.validation.Cs2Usa;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = Cs2UsaValidator.class)
public @interface Cs2Usa {
    String message() default "Validation Unsuccessful";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
