package com.rbs.www.admin.repositories;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.admin.models.viewmodels.CompanyViewModel;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class CompanyRepository extends AbstractRepository<Integer, Company> {
    @SuppressWarnings("unchecked")
    public List<CompanyViewModel> list() {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("isActive", true));
        return (List<CompanyViewModel>)criteria.list();
    }
}
