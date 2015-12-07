package com.rbs.sfi.common.services;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ReflectionHelperService {
    public boolean isGetter(String methodName) {
        return (methodName.startsWith("get")
                || methodName.startsWith("is"));
    }

    public String getterToSetter(String methodName) {
        String partial = null;
        if (methodName.startsWith("get")) partial = methodName.substring(3);
        if (methodName.startsWith("is")) partial = methodName.substring(2);

        return "set" + partial;
    }

    public boolean methodExists(Object o, String methodName) {
        if (o == null) return false;
        Method[] methods = o.getClass().getMethods();

        for (Method method : methods) {
            if (methodName.equals(method.getName()))
                return true;
        }

        return false;
    }

    public Map<String, Method> getMethodMap(Object o) {
        if (o == null) return null;

        Method[] methods = o.getClass().getMethods();
        Map<String, Method> methodMap = new HashMap<String, Method>();

        for (Method method : methods) {
            methodMap.put(method.getName(), method);
        }

        return methodMap;
    }

    public List<Method> getGetterMethods(Method[] methods) {
        List<Method> getterMethods = new ArrayList<Method>();

        for (Method method : methods) {
            String methodName = method.getName();
            if (!isGetter(methodName)) continue;

            getterMethods.add(method);
        }

        return getterMethods;
    }
}
