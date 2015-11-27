package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.models.entities.SfiPpFormAllCountry;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("sfiPpFormAllCountryRepository")
public class SfiPpFormAllCountryRepository extends AbstractRepository<Integer, SfiPpFormAllCountry> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public List<SfiPpFormAllCountry> list() {
        @SuppressWarnings("unchecked")
        List<SfiPpFormAllCountry> sfiPpFormAllCountry = sessionFactory.getCurrentSession().createQuery("from SfiPpFormAllCountry").list();
        return sfiPpFormAllCountry;
    }

    public SfiPpFormAllCountry findById(int id) {
        return (SfiPpFormAllCountry)sessionFactory.getCurrentSession().get(SfiPpFormAllCountry.class, id);
    }

}