package com.rbs.sfi.core.mapper.services;

import com.rbs.sfi.core.mapper.IModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class BaseMapperService<E extends IModel> {
    @Autowired
    private ReflectionHelperService helper;

    private Class<E> typeClass;

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
    private <T> T singleTypeResolver(Object o, Class<T> tClass) {
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

    private <T, F> Set<T> setTypeResolver(Set<F> from, Class<T> tClass) {
        Set<T> to = new HashSet<>();
        for (F f : from) {
            if (f == null) continue;
            to.add(singleTypeResolver(f, tClass));
        }
        return to;
    }

    @SuppressWarnings("unchecked")
    private <T> T typeResolver(Object source, Method method) {
        if (source == null) return null;

        String paramType = method.getParameterTypes()[0].toString();
        String genericParamType = method.getGenericParameterTypes()[0].toString();

        T t = null;
        if (paramType.equals(genericParamType)) {
            t = (T) singleTypeResolver(source, method.getParameterTypes()[0]);
        } else {
            try {
                Class<?> clazz = Class.forName(genericParamType.split("[<>]")[1]);
                t = (T) setTypeResolver((Set) source, clazz);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return t;
    }

    public <T> T convert(E source, Class<T> tClass) {
        if (source == null) return null;
        T dest = getInstance(source.getId(), tClass);

        Map<String, Method> destMethodMap  = helper.getMethodMap(dest);
        List<Method> sourceMethods = helper.getGetterMethods(source.getClass().getMethods());

        for (Method getterMethod : sourceMethods) {
            String getterMethodName = getterMethod.getName();
            String setterMethodName = helper.getterToSetter(getterMethodName);

            if (!destMethodMap.containsKey(setterMethodName)) continue;
            Method setterMethod = destMethodMap.get(setterMethodName);

            try {
                setterMethod.invoke(dest, typeResolver(getterMethod.invoke(source), setterMethod));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return dest;
    }
}
