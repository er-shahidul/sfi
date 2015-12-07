package com.rbs.sfi.web.repositories;

import com.rbs.sfi.admin.repositories.AbstractRepository;
import com.rbs.sfi.web.models.entities.SfiPpFormCs2OutsideUsaCa;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class SfiPpFormCs2OutsideUsaCaRepository extends AbstractRepository<Integer, SfiPpFormCs2OutsideUsaCa> {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public List<SfiPpFormCs2OutsideUsaCa> list() {
        @SuppressWarnings("unchecked")
        List<SfiPpFormCs2OutsideUsaCa> sfiPpFormCs2OutsideUsaCas = sessionFactory.getCurrentSession().createQuery("from SfiPpFormCs2OutsideUsaCa").list();
        return sfiPpFormCs2OutsideUsaCas;
    }

    public SfiPpFormCs2OutsideUsaCa findById(int id) {
        return (SfiPpFormCs2OutsideUsaCa) sessionFactory.getCurrentSession().get(SfiPpFormCs2OutsideUsaCa.class, id);
    }

    public void save(SfiPpFormCs2OutsideUsaCa sfiPpFormCs2OutsideUsaCa) {
        persist(sfiPpFormCs2OutsideUsaCa);
    }

}