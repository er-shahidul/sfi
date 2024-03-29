package com.rbs.www.web.common.repositories;

import com.rbs.www.common.repositories.BaseRepository;
import com.rbs.www.web.common.models.entities.SfiPpFormStatus;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class SfiPpFormStatusRepository extends BaseRepository<SfiPpFormStatus> {
    public SfiPpFormStatus getByStatus(String status) {
        return (SfiPpFormStatus) getCriteria()
                .add(Restrictions.eq("status", status))
                .uniqueResult();
    }
}
