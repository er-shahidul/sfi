package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.SfiPpFormCs3ProjectStandardObjective;
import com.rbs.www.web.sfi.models.entities.SfiPpFormCs3ProjectStandardObjective2015;
import com.rbs.www.web.sfi.repositories.SfiPpFormCs3ProjectStandardObjective2015Repository;
import com.rbs.www.web.sfi.repositories.SfiPpFormCs3ProjectStandardObjectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional
public class SfiPpFormCs3ProjectStandardObjective2015Service {
    @Autowired
    SfiPpFormCs3ProjectStandardObjective2015Repository repository;

    public SfiPpFormCs3ProjectStandardObjective2015 get(Integer id) {
        return repository.get(id);
    }

    public List<SfiPpFormCs3ProjectStandardObjective2015> getAll() {
        return repository.getAll();
    }

    public String getSfiStandardObjDesc(Serializable id) {
        return repository.get(id).getSfiStandardObjDesc();
    }
}
