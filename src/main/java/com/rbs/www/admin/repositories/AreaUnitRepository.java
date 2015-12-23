package com.rbs.www.admin.repositories;

import com.rbs.www.admin.models.entities.AreaUnit;
import com.rbs.www.admin.models.viewmodels.AreaUnitViewModel;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class AreaUnitRepository extends AbstractRepository<Integer, AreaUnit> {
    @SuppressWarnings("unchecked")
    public List<AreaUnitViewModel> list() {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("isActive", true));
        return (List<AreaUnitViewModel>)criteria.list();
    }
}
