package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.OrgContact;
import com.rbs.www.web.sfi.repositories.OrgContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrgContactService {
    @Autowired
    OrgContactRepository repository;

    public OrgContact get(Integer id) {
        return repository.get(id);
    }
}