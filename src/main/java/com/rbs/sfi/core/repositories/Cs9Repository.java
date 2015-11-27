package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.models.entities.Cs9;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("cs9Repository")
public class Cs9Repository extends AbstractRepository<Integer, Cs9> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public Cs9 findById(int id) {
        return (Cs9)sessionFactory.getCurrentSession().get(Cs9.class,id);
    }

    public void save(Cs9 cs9) {
        persist(cs9);
    }
}
