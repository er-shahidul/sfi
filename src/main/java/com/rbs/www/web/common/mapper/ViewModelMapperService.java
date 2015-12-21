package com.rbs.www.web.common.mapper;

import com.rbs.www.common.models.BaseEntityModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ViewModelMapperService extends BaseMapperService<BaseEntityModel> {
    @Override
    protected <T> T getInstance(Integer id, Class<T> tClass) {
        T t = null;
        try {
            t = tClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
}
