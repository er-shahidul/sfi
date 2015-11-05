package com.rbs.sfi.core.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.core.entities.SfiPpFormRegion;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("sfiPpFormRegionRepository")
public class SfiPpFormRegionRepositoryImpl extends AbstractRepository<Integer, SfiPpFormRegion> implements SfiPpFormRegionRepository {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public List<SfiPpFormRegion> list() {
        @SuppressWarnings("unchecked")
        List<SfiPpFormRegion> sfiPpFormRegion = sessionFactory.getCurrentSession().createQuery("from SfiPpFormRegion").list();
        return sfiPpFormRegion;
    }

}