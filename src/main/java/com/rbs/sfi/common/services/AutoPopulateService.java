package com.rbs.sfi.common.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.lang.*;
import java.lang.reflect.*;

@Service
@Transactional
public class AutoPopulateService {
    private boolean isGetter(String methodName) {
        if (methodName.startsWith("get")
            || methodName.startsWith("is")) return true;
        return false;
    }

    private Map<String, Method> getMethodMap(Object o) {
        if (o == null) return null;

        Method[] methods = o.getClass().getMethods();
        Map<String, Method> methodMap = new HashMap<String, Method>();

        for (Method method : methods) {
            methodMap.put(method.getName(), method);
        }

        return methodMap;
    }

    private String getterToSetter(String methodName) {
        String partial = null;
        if (methodName.startsWith("get")) partial = methodName.substring(3);
        if (methodName.startsWith("is")) partial = methodName.substring(2);

        return "set" + partial;
    }

    public void populate(Object src, Object dest) {
        if (src == null || dest == null) return;

        Map<String, Method> destMethodMap  = getMethodMap(dest);
        Method[] srcMethods = src.getClass().getMethods();

        for (Method getterMethod : srcMethods) {
            String getterMethodName = getterMethod.getName();
            try {
                if (!isGetter(getterMethodName)
                    || getterMethod.invoke(src) == null) continue;

                String setterMethodName = getterToSetter(getterMethodName);
                if (!destMethodMap.containsKey(setterMethodName)) continue;

                destMethodMap.get(setterMethodName).invoke(dest, getterMethod.invoke(src));
                getterMethod.invoke(src);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
