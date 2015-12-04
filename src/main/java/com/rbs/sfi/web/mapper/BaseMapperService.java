package com.rbs.sfi.web.mapper;

import com.rbs.sfi.common.models.IModel;
import com.rbs.sfi.common.services.ReflectionHelperService;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.*;

public abstract class BaseMapperService<E extends IModel> {
    @Autowired
    private ReflectionHelperService helper;

    private Class<E> typeClass;

    private final Map<Class, Object> callStack = new HashMap<Class, Object>();

    @SuppressWarnings("unchecked")
    private Class<E> getTypeClass() {
        if (typeClass == null) {
            ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
            this.typeClass = (Class<E>) thisType.getActualTypeArguments()[0];
        }
        return typeClass;
    }

    protected <T> T getInstance(Integer id, Class<T> tClass) {
        T t = null;
        try {
            t = tClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    @SuppressWarnings("unchecked")
    private <T> T singleTypeHandler(Object o, Class<T> tClass) {
        T t = null;
        try {
            if (getTypeClass().isInstance(o)) {
                t = convert((E) o, tClass);
            } else if (helper.methodExists(o, "clone")) {
                t = (T) tClass.getMethod("clone").invoke(o);
            } else {
                t = tClass.getConstructor(String.class).newInstance(o.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    private <T, F> Set<T> setTypeHandler(Set<F> from, Class<T> tClass) {
        Set<T> to = new HashSet<T>();
        for (F f : from) {
            if (f == null) continue;
            to.add(singleTypeHandler(f, tClass));
        }
        return to;
    }

    @SuppressWarnings("unchecked")
    private <T> T typeHandler(Object source, Method method) {
        if (source == null) return null;

        String paramType = method.getParameterTypes()[0].toString();
        String genericParamType = method.getGenericParameterTypes()[0].toString();

        T t = null;
        if (paramType.equals(genericParamType)) {
            t = (T) singleTypeHandler(source, method.getParameterTypes()[0]);
        } else {
            try {
                Class<?> clazz = Class.forName(genericParamType.split("[<>]")[1]);
                t = (T) setTypeHandler((Set) source, clazz);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return t;
    }

    public <T> T convert(E source, Class<T> tClass) {
        if (source == null) return null;
        if (callStack.get(tClass) != null) {
            return (T) callStack.get(tClass);
        }

        T dest = getInstance(source.getId(), tClass);
        callStack.put(tClass, dest);

        Map<String, Method> destMethodMap  = helper.getMethodMap(dest);
        List<Method> sourceMethods = helper.getGetterMethods(source.getClass().getMethods());

        for (Method getterMethod : sourceMethods) {
            String getterMethodName = getterMethod.getName();
            String setterMethodName = helper.getterToSetter(getterMethodName);

            if (!destMethodMap.containsKey(setterMethodName)) continue;
            Method setterMethod = destMethodMap.get(setterMethodName);

            try {
                setterMethod.invoke(dest, typeHandler(getterMethod.invoke(source), setterMethod));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        callStack.remove(tClass);
        return dest;
    }
}
