package com.rbs.sfi.web.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.web.models.entities.SfiPpFormCs3ProjectStandardObjective;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class SfiPpFormCs3ProjectStandardObjectiveRepository extends AbstractRepository<Integer, SfiPpFormCs3ProjectStandardObjective> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public List<SfiPpFormCs3ProjectStandardObjective> list() {
        @SuppressWarnings("unchecked")
        List<SfiPpFormCs3ProjectStandardObjective> sfiPpFormCs3ProjectStandardObjectives = sessionFactory.getCurrentSession().createQuery("from SfiPpFormCs3ProjectStandardObjective").list();
        return sfiPpFormCs3ProjectStandardObjectives;
    }

}