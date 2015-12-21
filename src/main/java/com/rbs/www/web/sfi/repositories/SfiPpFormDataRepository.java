package com.rbs.www.web.sfi.repositories;

import com.rbs.www.admin.entities.Company;
import com.rbs.www.common.repositories.BaseRepository;
import com.rbs.www.web.sfi.models.entities.SfiPpFormData;
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
