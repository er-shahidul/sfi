package com.rbs.www.web.sic.services;

import com.rbs.www.admin.models.entities.User;
import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.sfi.services.SfiPpFormStatusService;
import com.rbs.www.web.sic.models.entities.SicFormData;
import com.rbs.www.web.sic.repositories.SicFormDataRepository;
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