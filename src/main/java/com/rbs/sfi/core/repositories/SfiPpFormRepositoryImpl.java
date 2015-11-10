package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.entities.SfiPpForm;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("sfiPpFormRepository")
public class SfiPpFormRepositoryImpl extends AbstractRepository<Integer, SfiPpForm> implements SfiPpFormRepository {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public SfiPpForm findById(int id) {
        return (SfiPpForm)sessionFactory.getCurrentSession().get(SfiPpForm.class,id);
    }

    @Transactional
    public SfiPpForm findByCompany(Company company) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("company", company));
        SfiPpForm sfiPpForm = (SfiPpForm)criteria.uniqueResult();

        return sfiPpForm;
    }

    @Transactional
    public List<SfiPpForm> list() {
        @SuppressWarnings("unchecked")
        List<SfiPpForm> sfiPpForms = sessionFactory.getCurrentSession().createQuery("from SfiPpForm").list();
        return sfiPpForms;
    }

    public void save(SfiPpForm sfiPpForm) {
        persist(sfiPpForm);
    }

}
