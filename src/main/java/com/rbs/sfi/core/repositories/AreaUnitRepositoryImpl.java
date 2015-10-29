package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.entities.AreaUnit;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("areaUnitRepository")
public class AreaUnitRepositoryImpl extends AbstractRepository<Integer, AreaUnit> implements AreaUnitRepository {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public List<AreaUnit> list() {
        @SuppressWarnings("unchecked")
        List<AreaUnit> areaUnities = sessionFactory.getCurrentSession().createQuery("from AreaUnit").list();
        return areaUnities;
    }

    @Transactional
    public AreaUnit findById(int id) {
        return (AreaUnit)sessionFactory.getCurrentSession().get(AreaUnit.class,id);
    }

    public void save(AreaUnit areaUnit) {
        persist(areaUnit);
    }

    public void update(AreaUnit areaUnit) {
        persist(areaUnit);
    }
}
