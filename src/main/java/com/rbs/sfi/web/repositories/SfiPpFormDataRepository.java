package com.rbs.sfi.web.repositories;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.common.repositories.BaseRepository;
import com.rbs.sfi.web.models.entities.SfiPpFormData;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class SfiPpFormDataRepository extends BaseRepository<SfiPpFormData> {
    public SfiPpFormData getByCompany(Company company) {
        return (SfiPpFormData) getCriteria()
                .add(Restrictions.eq("company", company))
                .uniqueResult();
    }
}
