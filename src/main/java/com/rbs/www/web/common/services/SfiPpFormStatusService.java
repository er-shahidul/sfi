package com.rbs.www.web.common.services;

import com.rbs.www.web.common.models.entities.SfiPpFormStatus;
import com.rbs.www.web.common.repositories.SfiPpFormStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SfiPpFormStatusService {
    @Autowired
    SfiPpFormStatusRepository repository;

    public SfiPpFormStatus get(Integer id) {
        return repository.get(id);
    }

    public SfiPpFormStatus getByStatus(String status) {
        return repository.getByStatus(status);
    }
}
