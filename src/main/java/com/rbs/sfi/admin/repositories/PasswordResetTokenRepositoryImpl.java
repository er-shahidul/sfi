package com.rbs.sfi.admin.repositories;

import com.rbs.sfi.admin.entities.PasswordResetToken;
import com.rbs.sfi.admin.entities.User;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("passwordResetTokenRepository")
public class PasswordResetTokenRepositoryImpl extends AbstractRepository<Integer, PasswordResetToken> implements PasswordResetTokenRepository {

    @Autowired
    SessionFactory sessionFactory;

    public void save(PasswordResetToken passwordResetToken) {
        persist(passwordResetToken);
    }

    public int findUserIdByToken(String token) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("token", token));
        PasswordResetToken passwordResetToken = (PasswordResetToken)criteria.uniqueResult();

        return passwordResetToken.getUser().getId();
    }

    public PasswordResetToken findPasswordResetToken(User user) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("user", user));
        PasswordResetToken passwordResetToken = (PasswordResetToken)criteria.uniqueResult();

        return passwordResetToken;
    }

    @Transactional
    public PasswordResetToken findPasswordTokenById(int id) {
        return (PasswordResetToken)sessionFactory.getCurrentSession().get(PasswordResetToken.class,id);
    }
}
