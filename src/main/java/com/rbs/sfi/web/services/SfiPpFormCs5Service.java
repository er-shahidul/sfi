package com.rbs.sfi.web.services;

import com.rbs.sfi.web.models.entities.SfiPpFormCs5;
import com.rbs.sfi.web.repositories.SfiPpFormCs5Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SfiPpFormCs5Service {
    @Autowired
    SfiPpFormCs5Repository sfiPpFormCs5Repository;

    public List<SfiPpFormCs5> list() {
        return sfiPpFormCs5Repository.getAll();
    }
}