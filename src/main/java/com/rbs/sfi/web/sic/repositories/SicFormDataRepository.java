package com.rbs.sfi.web.sic.repositories;

import com.rbs.sfi.admin.entities.Company;
import com.rbs.sfi.common.repositories.BaseRepository;
import com.rbs.sfi.web.sic.models.entities.SicFormData;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class SicFormDataRepository extends BaseRepository<SicFormData> {
    public SicFormData getByCompany(Company company) {
        return (SicFormData) getCriteria()
                .add(Restrictions.eq("company", company))
                .uniqueResult();
    }
}
