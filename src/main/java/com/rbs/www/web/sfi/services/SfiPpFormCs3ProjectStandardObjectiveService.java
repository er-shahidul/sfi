package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.SfiPpFormCs3ProjectStandardObjective;
import com.rbs.www.web.sfi.repositories.SfiPpFormCs3ProjectStandardObjectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional
public class SfiPpFormCs3ProjectStandardObjectiveService {
    @Autowired
    SfiPpFormCs3ProjectStandardObjectiveRepository repository;

    public SfiPpFormCs3ProjectStandardObjective get(Integer id) {
        return repository.get(id);
    }

    public List<SfiPpFormCs3ProjectStandardObjective> getAll() {
        return repository.getAll();
    }

    public String getSfiStandardObjDesc(Serializable id) {
        return repository.get(id).getSfiStandardObjDesc();
    }
}
