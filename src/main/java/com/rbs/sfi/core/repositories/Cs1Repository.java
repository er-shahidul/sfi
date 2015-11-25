package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.entities.Cs1;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("cs1Repository")
public class Cs1Repository extends AbstractRepository<Integer, Cs1> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public Cs1 findById(int id) {
        return (Cs1)sessionFactory.getCurrentSession().get(Cs1.class,id);
    }

    public void save(Cs1 cs1) {
        persist(cs1);
    }
}
