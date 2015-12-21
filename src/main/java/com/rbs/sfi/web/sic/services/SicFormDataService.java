package com.rbs.sfi.web.sic.services;

import com.rbs.sfi.admin.entities.User;
import com.rbs.sfi.admin.services.UserService;
import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.web.sfi.services.SfiPpFormStatusService;
import com.rbs.sfi.web.sic.models.entities.SicFormData;
import com.rbs.sfi.web.sic.repositories.SicFormDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SicFormDataService {

    @Autowired
    private UserService userService;

    @Autowired
    private SicFormDataRepository repository;

    @Autowired
    private SfiPpFormStatusService sfiPpFormStatusService;

    public SicFormData createOrGetByCurrentUsersCompany() {
        User user = userService.findByUsername(Util.getCurrentUsername());
        SicFormData entity = repository.getByCompany(user.getCompany());
        if (entity == null) entity = create(user);
        return entity;
    }

    private SicFormData create(User user) {
        SicFormData entity = new SicFormData();
        entity.setCreatedBy(user);
        entity.setUpdatedBy(user);
        entity.setCompany(user.getCompany());

        entity.setStatus(sfiPpFormStatusService.getByStatus("none"));

        entity.setCreatedAt(Util.getCurrentDate());
        entity.setUpdatedAt(Util.getCurrentDate());

        repository.create(entity);
        return entity;
    }
}