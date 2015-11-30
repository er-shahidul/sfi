package com.rbs.sfi.admin.repositories;

import com.rbs.sfi.admin.entities.Company;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("companyRepository")
public class CompanyRepository extends AbstractRepository<Integer, Company> {

    @Autowired
    SessionFactory sessionFactory;

//    @Transactional
//    public List<Company> list() {
//        @SuppressWarnings("unchecked")
//        List<Company> companies = sessionFactory.getCurrentSession().createQuery("from Company").list();
//        return companies;
//    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<Company> list() {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("isActive", true));
        return (List<Company>)criteria.list();
    }

    public void save(Company company) {
        persist(company);
    }

    public void update(Company company) {
        persist(company);
    }

    @Transactional
    public Company findById(int id) {
        return (Company)sessionFactory.getCurrentSession().get(Company.class,id);
    }
}
