package com.rbs.sfi.admin.repositories;

import com.rbs.sfi.admin.entities.AreaUnit;
import com.rbs.sfi.admin.entities.Group;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("areaUnitRepository")
public class AreaUnitRepository extends AbstractRepository<Integer, AreaUnit> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @SuppressWarnings("unchecked")
    public List<AreaUnit> list() {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("isActive", true));
        return (List<AreaUnit>)criteria.list();
    }

    @Transactional
    public AreaUnit findById(Integer id) {
        return (AreaUnit)sessionFactory.getCurrentSession().get(AreaUnit.class, id);
    }

    @Transactional
    public void save(AreaUnit areaUnit) {
        areaUnit.setIsActive(true);
        persist(areaUnit);
    }

    @Transactional
    public void softDelete(AreaUnit areaUnit) {
        AreaUnit entity = this.findById(areaUnit.getId());
        if(entity!=null){
            entity.setIsActive(false);
            persist(entity);
        }
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
