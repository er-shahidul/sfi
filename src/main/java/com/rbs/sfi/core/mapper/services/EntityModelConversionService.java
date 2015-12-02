package com.rbs.sfi.core.mapper.services;

import com.rbs.sfi.core.mapper.IViewModel;
import com.rbs.sfi.core.mapper.MapperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
@Transactional
public class EntityModelConversionService {
    @Autowired
    private ModelConversionHelperService helper;

    @Autowired
    private MapperRepository mapperRepository;

    private <T> T getInstance(Integer id, Class<T> tClass) {
        T t = null;

        if (id != null) t = mapperRepository.get(id, tClass);
        if (t == null) {
            try {
                t = tClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return t;
    }

    @SuppressWarnings("unchecked")
    private <T> T singleTypeResolver(Object o, Class<T> tClass) {
        T t = null;
        try {
            if (o instanceof IViewModel) {
                t = convertFromViewModel((IViewModel) o, tClass);
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
        Set<T> to = new HashSet<T>();
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

    public <T> T convertFromViewModel(IViewModel viewModel, Class<T> tClass) {
        if (viewModel == null) return null;
        T entityModel = getInstance(viewModel.getId(), tClass);

        Map<String, Method> entityModelMethodMap  = helper.getMethodMap(entityModel);
        List<Method> viewModelGetterMethods = helper.getGetterMethods(viewModel.getClass().getMethods());

        for (Method getterMethod : viewModelGetterMethods) {
            String getterMethodName = getterMethod.getName();
            String setterMethodName = helper.getterToSetter(getterMethodName);

            if (!entityModelMethodMap.containsKey(setterMethodName)) continue;
            Method setterMethod = entityModelMethodMap.get(setterMethodName);

            try {
                setterMethod.invoke(entityModel, typeResolver(getterMethod.invoke(viewModel), setterMethod));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return entityModel;
    }
}
