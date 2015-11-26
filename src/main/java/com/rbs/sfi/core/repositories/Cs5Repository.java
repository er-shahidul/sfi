package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.entities.Cs5;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("cs5Repository")
public class Cs5Repository extends AbstractRepository<Integer, Cs5> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public Cs5 findById(int id) {
        return (Cs5)sessionFactory.getCurrentSession().get(Cs5.class,id);
    }

    public void save(Cs5 cs5) {
        persist(cs5);
    }
}
