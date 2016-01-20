package com.rbs.www.common.modules.validator;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({ METHOD, FIELD })
public @interface CascadeIf {
    String value();
}
