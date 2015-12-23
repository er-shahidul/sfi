package com.rbs.www.web.sfi.repositories;

import com.rbs.www.common.repositories.BaseRepository;
import com.rbs.www.web.sfi.models.entities.SfiPpFormCs5;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class SfiPpFormCs5Repository extends BaseRepository<SfiPpFormCs5> {
    public SfiPpFormCs5 getByFormAndResearchType(Integer form, Integer researchType) {
        return (SfiPpFormCs5) getCriteria()
                .add(Restrictions.eq("form", form))
                .add(Restrictions.eq("researchType.id", researchType))
                .uniqueResult();
    }
}
