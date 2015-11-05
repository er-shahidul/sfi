package com.rbs.sfi.admin.repositories;

import com.rbs.sfi.admin.entities.VerificationToken;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("verificationTokenRepository")
public class VerificationTokenRepositoryImpl extends AbstractRepository<Integer, VerificationToken> implements VerificationTokenRepository {

    @Autowired
    SessionFactory sessionFactory;

    public void save(VerificationToken verificationToken) {
        persist(verificationToken);
    }

    public int findUserIdByToken(String token) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("token", token));
        VerificationToken verificationToken = (VerificationToken)criteria.uniqueResult();

        return verificationToken.getUser().getId();
    }
}
