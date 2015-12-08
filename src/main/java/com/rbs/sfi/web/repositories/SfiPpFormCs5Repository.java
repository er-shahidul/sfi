package com.rbs.sfi.web.repositories;

import com.rbs.sfi.common.repositories.BaseRepository;
import com.rbs.sfi.web.models.entities.SfiPpFormCs5;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SfiPpFormCs5Repository extends BaseRepository<SfiPpFormCs5> {
    public SfiPpFormCs5 getByFormAndResearchType(Integer form, Integer researchType) {
        return (SfiPpFormCs5) getCriteria()
                .add(Restrictions.eq("form", form))
                .add(Restrictions.eq("researchType.id", researchType))
                .uniqueResult();
    }
}
