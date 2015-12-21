package com.rbs.sfi.web.sfi.services;

import com.rbs.sfi.web.sfi.models.entities.SfiPpFormStatus;
import com.rbs.sfi.web.sfi.repositories.SfiPpFormStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SfiPpFormStatusService {
    @Autowired
    SfiPpFormStatusRepository repository;

    public SfiPpFormStatus getByStatus(String status) {
        return repository.getByStatus(status);
    }
}
