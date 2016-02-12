package com.rbs.www.web.sfi.repositories;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.common.repositories.BaseRepository;
import com.rbs.www.web.sfi.models.entities.SfiPpForm2014;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class SfiPpForm2014Repository extends BaseRepository<SfiPpForm2014> {
    public SfiPpForm2014 getByCompany(Company company) {
        return (SfiPpForm2014) getCriteria()
                .add(Restrictions.eq("company", company))
                .uniqueResult();
    }
}
