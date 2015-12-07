package com.rbs.sfi.web.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.web.models.entities.Cs7;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("cs7Repository")
public class Cs7Repository extends AbstractRepository<Integer, Cs7> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public Cs7 findById(int id) {
        return (Cs7) sessionFactory.getCurrentSession().get(Cs7.class, id);
    }

    public void save(Cs7 cs7) {
        persist(cs7);
    }
}
