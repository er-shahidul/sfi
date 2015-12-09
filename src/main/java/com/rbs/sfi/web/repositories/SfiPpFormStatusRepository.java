package com.rbs.sfi.web.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.web.models.entities.SfiPpFormStatus;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SfiPpFormStatusRepository extends AbstractRepository<Integer, SfiPpFormStatus> {

    @Autowired
    SessionFactory sessionFactory;

    public SfiPpFormStatus findById(int id) {
        return (SfiPpFormStatus) sessionFactory.getCurrentSession().get(SfiPpFormStatus.class, id);
    }
}
