package com.rbs.sfi.core.mapper.services;

import com.rbs.sfi.core.mapper.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.lang.*;
import java.lang.reflect.*;

@Service
@Transactional
public class ViewModelConversionService {
    @Autowired
    private ModelConversionHelperService helper;

    private <T> T getInstance(Class<T> tClass) {
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
            if (o instanceof BaseEntity) {
                t = convertFromEntityModel((BaseEntity) o, tClass);
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
            to.add(singleTypeResolver(f, tClass));
        }
        return to;
    }

    @SuppressWarnings("unchecked")
    private <T> T typeResolver(Object src, Method method) {
        if (src == null) return null;

        String paramType = method.getParameterTypes()[0].toString();
        String genericParamType = method.getGenericParameterTypes()[0].toString();

        T t = null;
        if (paramType.equals(genericParamType)) {
            t = (T) singleTypeResolver(src, method.getParameterTypes()[0]);
        } else {
            try {
                Class<?> clazz = Class.forName(genericParamType.split("[<>]")[1]);
                t = (T) setTypeResolver((Set) src, clazz);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return t;
    }

    public <T> T convertFromEntityModel(BaseEntity entity, Class<T> tClass) {
        if (entity == null) return null;
        T viewModel = getInstance(tClass);

        Map<String, Method> viewModelMethodMap  = helper.getMethodMap(viewModel);
        List<Method> entityGetterMethods = helper.getGetterMethods(entity.getClass().getMethods());

        for (Method getterMethod : entityGetterMethods) {
            String getterMethodName = getterMethod.getName();
            String setterMethodName = helper.getterToSetter(getterMethodName);

            if (!viewModelMethodMap.containsKey(setterMethodName)) continue;
            Method setterMethod = viewModelMethodMap.get(setterMethodName);

            try {
                setterMethod.invoke(viewModel, typeResolver(getterMethod.invoke(entity), setterMethod));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return viewModel;
    }
}
