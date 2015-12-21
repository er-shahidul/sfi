package com.rbs.www.web.sic.repositories;

import com.rbs.www.admin.entities.Company;
import com.rbs.www.common.repositories.BaseRepository;
import com.rbs.www.web.sic.models.entities.SicFormData;
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
