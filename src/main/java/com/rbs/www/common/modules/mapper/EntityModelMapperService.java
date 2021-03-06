package com.rbs.www.common.modules.mapper;

import com.rbs.www.common.models.BaseViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EntityModelMapperService extends BaseMapperService<BaseViewModel> {
    @Autowired
    private MapperRepository mapperRepository;

    @Override
    @SuppressWarnings("unchecked")
    protected <T> T getInstance(Integer id, Class<T> tClass) {
        T t = null;
        if (id != null) t = mapperRepository.get(id, tClass);
        if (t == null) {
            try {
                t = tClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            mapperRepository.create(t);
        }

        return t;
    }
}
