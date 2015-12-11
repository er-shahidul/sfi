package com.rbs.sfi.web.services;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
@Transactional
public class SfiPpFormCs3ProjectSupportDocsService {
    public String generateUniqueName() {
        return Long.toString(new Date().getTime());
    }
}
