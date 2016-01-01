package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.SfiPpFormCs3;
import com.rbs.www.web.sfi.models.viewmodels.Cs5ViewModel;
import com.rbs.www.web.sfi.models.viewmodels.SfiPpFormCs3ViewModel;
import com.rbs.www.web.sfi.repositories.SfiPpFormCs3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class SfiPpFormCs3Service {
    @Autowired
    private SfiPpFormCs3Repository repository;

    @Autowired
    private SfiPpFormCs3ProjectSupportDocsService sfiPpFormCs3ProjectSupportDocsService;

    public SfiPpFormCs3 get(Integer id) {
        return repository.get(id);
    }
}
