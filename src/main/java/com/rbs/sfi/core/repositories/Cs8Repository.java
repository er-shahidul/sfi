package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.models.entities.Cs8;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("cs8Repository")
public class Cs8Repository extends AbstractRepository<Integer, Cs8> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public Cs8 findById(int id) {
        return (Cs8)sessionFactory.getCurrentSession().get(Cs8.class,id);
    }

    public void save(Cs8 cs8) {
        persist(cs8);
    }
}
