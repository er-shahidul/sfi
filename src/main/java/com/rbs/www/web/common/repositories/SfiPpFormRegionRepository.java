package com.rbs.www.web.common.repositories;

import com.rbs.www.common.repositories.BaseRepository;
import com.rbs.www.web.common.models.entities.SfiPpFormRegion;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SfiPpFormRegionRepository extends BaseRepository<SfiPpFormRegion> {

    @SuppressWarnings("unchecked")
    public List<SfiPpFormRegion> getList() {
        return (List<SfiPpFormRegion>) getCriteria()
                .setProjection(Projections.alias(Projections.groupProperty("name"), "name"))
                .addOrder(Order.asc("id"))
                .setResultTransformer(Transformers.aliasToBean(SfiPpFormRegion.class))
                .list();
    }
}