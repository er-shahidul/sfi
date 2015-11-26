package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.entities.Cs4;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("cs4Repository")
public class Cs4Repository extends AbstractRepository<Integer, Cs4> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public Cs4 findById(int id) {
        return (Cs4)sessionFactory.getCurrentSession().get(Cs4.class,id);
    }

    public void save(Cs4 cs4) {
        persist(cs4);
    }
}
