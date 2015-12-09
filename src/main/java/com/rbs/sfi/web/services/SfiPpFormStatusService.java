package com.rbs.sfi.web.services;

import com.rbs.sfi.web.models.entities.SfiPpFormStatus;
import com.rbs.sfi.web.repositories.SfiPpFormStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SfiPpFormStatusService {
    @Autowired
    SfiPpFormStatusRepository sfiPpFormStatusRepository;

    public SfiPpFormStatus findById(int id) {
        return sfiPpFormStatusRepository.findById(id);
    }
}
