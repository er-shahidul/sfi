package com.rbs.www.common.modules.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({METHOD, FIELD, TYPE})
@Constraint(validatedBy = SpELAssertValidator.class)
public @interface SpELAssert {

    String message() default "Validation Unsuccessful";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String value();
    String applyIf() default "";
    String property() default "";
    Class<?>[] helpers() default {};

    @Retention(RUNTIME)
    @Target({METHOD, FIELD, TYPE})
    @interface List {
        SpELAssert[] value();
    }
}
