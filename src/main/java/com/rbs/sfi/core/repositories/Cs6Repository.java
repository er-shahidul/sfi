package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.entities.Cs6;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("cs6Repository")
public class Cs6Repository extends AbstractRepository<Integer, Cs6> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public Cs6 findById(int id) {
        return (Cs6)sessionFactory.getCurrentSession().get(Cs6.class,id);
    }

    public void save(Cs6 cs6) {
        persist(cs6);
    }
}
