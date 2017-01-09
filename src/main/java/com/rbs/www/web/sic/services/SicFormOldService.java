package com.rbs.www.web.sic.services;

import com.rbs.www.admin.models.entities.User;
import com.rbs.www.admin.services.CompanyService;
import com.rbs.www.admin.services.UserService;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.sic.models.entities.SicFormOld;
import com.rbs.www.web.sic.repositories.SicFormOldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SicFormOldService {
    @Autowired
    private SicFormOldRepository repository;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private UserService userService;

    public SicFormOld get(int id) {
        return repository.get(id);
    }

    public List<SicFormOld> getAllActiveForms() {
        return repository.getAllActiveForms();
    }

    public List<SicFormOld> getAll() {
        return repository.getAllSicFormOld();
    }

    public SicFormOld createOrGetByCurrentUsersCompany() {
        User user = userService.findByUsername(Util.getCurrentUsername());
        return repository.getByCompany(user.getCompany());
    }

    public void update(SicFormOld sicFormOldRepository) {
         repository.update(sicFormOldRepository);
    }
}
