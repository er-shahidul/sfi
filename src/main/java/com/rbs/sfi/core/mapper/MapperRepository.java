package com.rbs.sfi.core.mapper;

import com.rbs.sfi.common.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class MapperRepository extends BaseRepository {
    @SuppressWarnings("unchecked")
    public <T> T get(Serializable id, Class<T> tClass) {
        return (T) getSession().get(tClass, id);
    }
}
