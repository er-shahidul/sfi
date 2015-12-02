package com.rbs.sfi.core.mapper.services;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.lang.reflect.Method;
import java.util.*;

@Service
@Transactional
class ModelConversionHelperService {
    boolean isGetter(String methodName) {
        return (methodName.startsWith("get")
                || methodName.startsWith("is"));
    }

    String getterToSetter(String methodName) {
        String partial = null;
        if (methodName.startsWith("get")) partial = methodName.substring(3);
        if (methodName.startsWith("is")) partial = methodName.substring(2);

        return "set" + partial;
    }

    boolean methodExists(Object o, String methodName) {
        if (o == null) return false;
        Method[] methods = o.getClass().getMethods();

        for (Method method : methods) {
            if (methodName.equals(method.getName()))
                return true;
        }

        return false;
    }

    Map<String, Method> getMethodMap(Object o) {
        if (o == null) return null;

        Method[] methods = o.getClass().getMethods();
        Map<String, Method> methodMap = new HashMap<String, Method>();

        for (Method method : methods) {
            methodMap.put(method.getName(), method);
        }

        return methodMap;
    }

    List<Method> getGetterMethods(Method[] methods) {
        List<Method> getterMethods = new ArrayList<Method>();

        for (Method method : methods) {
            String methodName = method.getName();
            if (!isGetter(methodName)) continue;

            getterMethods.add(method);
        }

        return getterMethods;
    }
}
