package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.entities.Cs2;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("cs2Repository")
public class Cs2Repository extends AbstractRepository<Integer, Cs2> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public Cs2 findById(int id) {
        return (Cs2)sessionFactory.getCurrentSession().get(Cs2.class,id);
    }

    public void save(Cs2 cs2) {
        persist(cs2);
    }
}
