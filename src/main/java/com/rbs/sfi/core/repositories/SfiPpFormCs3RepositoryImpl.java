package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.entities.SfiPpFormCs3;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("sfiPpFormCs3Repository")
public class SfiPpFormCs3RepositoryImpl extends AbstractRepository<Integer, SfiPpFormCs3> implements SfiPpFormCs3Repository {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public SfiPpFormCs3 findById(int id) {
        return (SfiPpFormCs3)sessionFactory.getCurrentSession().get(SfiPpFormCs3.class,id);
    }

    @Transactional
    public List<SfiPpFormCs3> list() {
        @SuppressWarnings("unchecked")
        List<SfiPpFormCs3> sfiPpFormCs3 = sessionFactory.getCurrentSession().createQuery("from SfiPpFormCs3").list();
        return sfiPpFormCs3;
    }

}
