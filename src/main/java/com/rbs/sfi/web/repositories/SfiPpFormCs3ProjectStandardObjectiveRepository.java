package com.rbs.sfi.web.repositories;

import com.rbs.sfi.common.repositories.BaseRepository;
import com.rbs.sfi.web.models.entities.SfiPpFormCs3ProjectStandardObjective;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SfiPpFormCs3ProjectStandardObjectiveRepository extends BaseRepository<SfiPpFormCs3ProjectStandardObjective> {
    @SuppressWarnings("unchecked")
    public List<SfiPpFormCs3ProjectStandardObjective> getAll() {
        return getCriteria().list();
    }

}