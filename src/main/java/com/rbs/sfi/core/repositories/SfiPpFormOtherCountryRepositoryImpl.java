package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.entities.SfiPpFormOtherCountry;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("sfiPpFormOtherCountryRepository")
public class SfiPpFormOtherCountryRepositoryImpl extends AbstractRepository<Integer, SfiPpFormOtherCountry> implements SfiPpFormOtherCountryRepository {

    @Autowired
    SessionFactory sessionFactory;

    public SfiPpFormOtherCountry findById(int id) {
        return (SfiPpFormOtherCountry)sessionFactory.getCurrentSession().get(SfiPpFormOtherCountry.class, id);
    }

}