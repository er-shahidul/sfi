package com.rbs.sfi.core.mapper.services;

import com.rbs.sfi.core.mapper.BaseViewModel;
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
public class EntityModelMapperService extends BaseMapperService<BaseViewModel> {
    @Autowired
    private MapperRepository mapperRepository;

    protected  <T> T getInstance(Integer id, Class<T> tClass) {
        T t = null;
        if (id != null) t = mapperRepository.get(id, tClass);
        if (t == null) t = super.getInstance(id, tClass);

        return t;
    }
}
