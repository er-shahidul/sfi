package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.SfiPpFormCs3ProjectSupportDocs;
import com.rbs.www.web.sfi.repositories.SfiPpFormCs3ProjectSupportDocsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SfiPpFormCs3ProjectSupportDocsService {
    @Autowired
    private SfiPpFormCs3ProjectSupportDocsRepository repository;

    public SfiPpFormCs3ProjectSupportDocs get(Integer id) {
        return repository.get(id);
    }
}
