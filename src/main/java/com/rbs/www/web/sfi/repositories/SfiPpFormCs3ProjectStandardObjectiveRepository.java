package com.rbs.www.web.sfi.repositories;

import com.rbs.www.common.repositories.BaseRepository;
import com.rbs.www.web.sfi.models.entities.SfiPpFormCs3ProjectStandardObjective;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SfiPpFormCs3ProjectStandardObjectiveRepository extends BaseRepository<SfiPpFormCs3ProjectStandardObjective> {
    @SuppressWarnings("unchecked")
    public List<SfiPpFormCs3ProjectStandardObjective> getAll() {
        return getCriteria().list();
    }
}