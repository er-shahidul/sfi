package com.rbs.www.web.sfi.repositories;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.common.repositories.BaseRepository;
import com.rbs.www.web.sfi.models.entities.SfiPpFormData;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class SfiPpFormDataRepository extends BaseRepository<SfiPpFormData> {
    public SfiPpFormData getByCompany(Company company) {
        return (SfiPpFormData) getCriteria()
                .add(Restrictions.eq("company", company))
                .uniqueResult();
    }

    public Date getUpdateAt(Integer id) {
        return (Date) getCriteria()
                .add(Restrictions.eq("id", id))
                .setProjection(Projections.property("updatedAt"))
                .uniqueResult();
    }
}
