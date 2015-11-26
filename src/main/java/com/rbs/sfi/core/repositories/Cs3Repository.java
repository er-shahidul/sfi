package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.entities.Cs3;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("cs3Repository")
public class Cs3Repository extends AbstractRepository<Integer, Cs3> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public Cs3 findById(int id) {
        return (Cs3)sessionFactory.getCurrentSession().get(Cs3.class,id);
    }

    public void save(Cs3 cs3) {
        persist(cs3);
    }
}
