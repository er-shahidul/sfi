package com.rbs.sfi.web.services;

import com.rbs.sfi.web.models.entities.SfiPpFormCs3ProjectStandardObjective;
import com.rbs.sfi.web.repositories.SfiPpFormCs3ProjectStandardObjectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SfiPpFormCs3ProjectStandardObjectiveService {
    @Autowired
    SfiPpFormCs3ProjectStandardObjectiveRepository repository;

    public List<SfiPpFormCs3ProjectStandardObjective> getAll() {
        return repository.getAll();
    }
}
