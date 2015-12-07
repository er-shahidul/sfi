package com.rbs.sfi.web.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.web.models.entities.SfiPpFormOtherCountry;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("sfiPpFormOtherCountryRepository")
public class SfiPpFormOtherCountryRepository extends AbstractRepository<Integer, SfiPpFormOtherCountry> {

    @Autowired
    SessionFactory sessionFactory;

    public SfiPpFormOtherCountry findById(int id) {
        return (SfiPpFormOtherCountry) sessionFactory.getCurrentSession().get(SfiPpFormOtherCountry.class, id);
    }

}