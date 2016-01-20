package com.rbs.www.common.modules.validator;

import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

abstract class ReflectionUtils {

    public static List<Method> extractStaticMethods(Class<?> clazz) {
        Method[] allMethods = clazz.getMethods();
        List<Method> staticMethods = new ArrayList<>(allMethods.length);

        for (Method method : allMethods) {
            if (Modifier.isStatic(method.getModifiers())) {
                staticMethods.add(method);
            }
        }
        return staticMethods;
    }

    public static <T extends Annotation> T extractFieldLevelAnnotation(Class<?> cls, String fieldName,
                                                                       Class<T> annotationClass) {
        return FieldUtils.getDeclaredField(cls, fieldName, true)
                         .getDeclaredAnnotation(annotationClass);
    }
}
