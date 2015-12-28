package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.SfiPpFormStory;
import com.rbs.www.web.sfi.repositories.SfiPpFormStoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SfiPpFormStoryService {
    @Autowired
    SfiPpFormStoryRepository repository;

    public SfiPpFormStory get(Integer id) {
        return repository.get(id);
    }
}