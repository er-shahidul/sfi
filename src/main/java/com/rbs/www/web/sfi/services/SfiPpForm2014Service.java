package com.rbs.www.web.sfi.services;

import com.rbs.www.admin.models.entities.User;
import com.rbs.www.admin.services.CompanyService;
import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.sfi.models.entities.SfiPpForm2014;
import com.rbs.www.web.sfi.repositories.SfiPpForm2014Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SfiPpForm2014Service {
    @Autowired
    private SfiPpForm2014Repository repository;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private UserService userService;

    public SfiPpForm2014 get(int id) {
        return repository.get(id);
    }

    public List<SfiPpForm2014> getAllActiveForms() {
        return repository.getAllActiveForms();
    }

    public List<SfiPpForm2014> getAll() {
        return repository.getAllSfiPpForm2014();
    }

    public SfiPpForm2014 createOrGetByCurrentUsersCompany() {
        User user = userService.findByUsername(Util.getCurrentUsername());
        return repository.getByCompany(user.getCompany());
    }

    public void update(SfiPpForm2014 sfiPpForm2014) {
         repository.update(sfiPpForm2014);
    }
}
