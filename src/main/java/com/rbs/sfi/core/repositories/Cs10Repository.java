package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.models.entities.Cs10;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("cs10Repository")
public class Cs10Repository extends AbstractRepository<Integer, Cs10> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public Cs10 findById(int id) {
        return (Cs10)sessionFactory.getCurrentSession().get(Cs10.class,id);
    }

    public void save(Cs10 cs10) {
        persist(cs10);
    }
}
