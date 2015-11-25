package com.rbs.sfi.admin.repositories;

import com.rbs.sfi.admin.entities.AreaUnit;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("areaUnitRepository")
public class AreaUnitRepository extends AbstractRepository<Integer, AreaUnit> {

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

    @Transactional
    public void save(AreaUnit areaUnit) {
        persist(areaUnit);
    }

    @Transactional
    public void update(AreaUnit areaUnit) {
        AreaUnit entity = this.findById(areaUnit.getId());
        if(entity!=null){
            entity.setShortCode(areaUnit.getShortCode());
            entity.setUnitDescription(areaUnit.getUnitDescription());
            this.save(entity);
        }
    }
}
