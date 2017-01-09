package com.rbs.www.web.sic.repositories;

import com.rbs.www.admin.models.entities.Company;
import com.rbs.www.common.repositories.BaseRepository;
import com.rbs.www.web.sic.models.entities.SicFormOld;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class SicFormOldRepository extends BaseRepository<SicFormOld> {
    public SicFormOld getByCompany(Company company) {
        return (SicFormOld) getCriteria()
                .add(Restrictions.eq("company", company))
                .uniqueResult();
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<SicFormOld> getAllSicFormOld(){
        return (List<SicFormOld>) getCriteria().list();
    }
}
