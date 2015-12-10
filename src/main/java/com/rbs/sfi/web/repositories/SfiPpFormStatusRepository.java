package com.rbs.sfi.web.repositories;

import com.rbs.sfi.common.repositories.BaseRepository;
import com.rbs.sfi.web.models.entities.SfiPpFormStatus;
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
