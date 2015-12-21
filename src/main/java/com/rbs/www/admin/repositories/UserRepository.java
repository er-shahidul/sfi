package com.rbs.www.admin.repositories;

import com.rbs.www.admin.entities.User;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("userRepository")
public class UserRepository extends AbstractRepository<Integer, User> {

    @Autowired
    SessionFactory sessionFactory;

    public void save(User user) {
        persist(user);
    }

    public void update(User user) {
        persist(user);
    }

    @Transactional
    public User findByID(Integer id) {
        return (User)sessionFactory.getCurrentSession().get(User.class,id);
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<User> list() {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("isActive", true));
        return (List<User>)criteria.list();
    }

    @Transactional
    public void delete(Integer id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        User user = (User) session.load(User.class, id);
        session.delete(user);
        tx.commit();
        session.close();
    }

    public User findByUsername(String username) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("username", username));
        User user = (User)criteria.uniqueResult();
        if(user!=null){
            Hibernate.initialize(user.getGroup());
        }
        return user;
    }

    public User findByEmail(String email) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("email", email));
        User user = (User)criteria.uniqueResult();
        if(user!=null){
            Hibernate.initialize(user.getGroup());
        }
        return user;
    }

    public User findUserIdByToken(String userToken) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("userToken", userToken));
        User user = (User)criteria.uniqueResult();

        return user;
    }
}
