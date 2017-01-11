package com.rbs.www.admin.repositories;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.admin.models.viewmodels.CompanyViewModel;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
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
        criteria.addOrder(Order.asc("name"));
        return (List<CompanyViewModel>)criteria.list();
    }

    public Company findByName(String name) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("name", name));
        Company company = (Company)criteria.uniqueResult();
        if(company!=null){
            Hibernate.initialize(company.getId());
        }
        return company;
    }
}
