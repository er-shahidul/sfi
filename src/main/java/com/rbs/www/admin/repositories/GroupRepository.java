package com.rbs.www.admin.repositories;

import com.rbs.www.admin.models.entities.Group;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("groupRepository")
public class GroupRepository extends AbstractRepository<Integer, Group> {

    @Autowired
    SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<Group> list() {
        Criteria criteria = createEntityCriteria();
        criteria.addOrder(Order.asc("role"));
        return (List<Group>)criteria.list();
    }

    public Integer delete(Integer id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Group group = (Group) session.load(Group.class, id);
        session.delete(group);
        tx.commit();
        Serializable ids = session.getIdentifier(group);
        session.close();
        return (Integer) ids;
    }

    @SuppressWarnings("unchecked")
    public List<Group> findAll(){
        Criteria criteria = createEntityCriteria();
        criteria.addOrder(Order.asc("role"));
        return (List<Group>)criteria.list();
    }

    public Group findById(Integer id) {
        return getByKey(id);
    }

    public Group findByType(String type) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("role", type));
        return (Group) criteria.uniqueResult();
    }

    public Group findByRole(String role) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("role", role));
        return (Group) criteria.uniqueResult();
    }

    public void save(Group group) {
        persist(group);
    }
}
