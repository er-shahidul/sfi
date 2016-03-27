package com.rbs.www.web.sfi.repositories;

import com.rbs.www.common.repositories.BaseRepository;
import com.rbs.www.web.sfi.models.entities.SfiPpFormCs3ProjectStandardObjective2015;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SfiPpFormCs3ProjectStandardObjective2015Repository extends BaseRepository<SfiPpFormCs3ProjectStandardObjective2015> {
    @SuppressWarnings("unchecked")
    public List<SfiPpFormCs3ProjectStandardObjective2015> getAll() {
        return getCriteria()
                .add(Restrictions
                        .and(Restrictions.isNotNull("sfiStandardObjDesc"),
                                Restrictions.ne("sfiStandardObjDesc", "")))
                .list();
    }
}