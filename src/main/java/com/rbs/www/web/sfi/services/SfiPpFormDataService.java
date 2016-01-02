package com.rbs.www.web.sfi.services;

import com.rbs.www.admin.models.entities.User;
import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.common.services.SfiPpFormStatusService;
import com.rbs.www.web.sfi.models.entities.SfiPpFormData;
import com.rbs.www.web.sfi.repositories.SfiPpFormDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SfiPpFormDataService {
    @Autowired
    private SfiPpFormDataRepository repository;

    @Autowired
    private SfiPpFormStatusService sfiPpFormStatusService;

    @Autowired
    private UserService userService;

    public SfiPpFormData get(int id) {
        return repository.get(id);
    }

    public void setAuditInfo(int id, String status) {
        SfiPpFormData entity = repository.get(id);
        User user = userService.findByUsername(Util.getCurrentUsername());
        entity.setStatus(sfiPpFormStatusService.getByStatus(status));
        entity.setUpdatedAt(Util.getCurrentDate());
        entity.setUpdatedBy(user);
    }

    public List<SfiPpFormData> getAll() {
        return repository.getAll();
    }

    private SfiPpFormData create(User user) {
        SfiPpFormData entity = new SfiPpFormData();
        entity.setCreatedBy(user);
        entity.setUpdatedBy(user);
        entity.setCompany(user.getCompany());

        entity.setStatus(sfiPpFormStatusService.getByStatus("none"));

        entity.setCreatedAt(Util.getCurrentDate());
        entity.setUpdatedAt(Util.getCurrentDate());

        repository.create(entity);
        return entity;
    }

    public SfiPpFormData createOrGetByCurrentUsersCompany() {
        User user = userService.findByUsername(Util.getCurrentUsername());
        SfiPpFormData entity = repository.getByCompany(user.getCompany());
        if (entity == null) entity = create(user);
        return entity;
    }

    public SfiPpFormData getPpForm() {
        User user = userService.findByUsername(Util.getCurrentUsername());
        SfiPpFormData entity = repository.getByCompany(user.getCompany());
        return entity;
    }
}
