package com.rbs.sfi.web.services;

import com.rbs.sfi.admin.entities.User;
import com.rbs.sfi.admin.services.UserService;
import com.rbs.sfi.admin.util.Util;
import com.rbs.sfi.web.models.entities.SfiPpFormData;
import com.rbs.sfi.web.repositories.SfiPpFormDataRepository;
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
}
