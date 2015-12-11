package com.rbs.sfi.web.services;

import com.rbs.sfi.web.models.entities.SfiPpFormCs3ProjectSupportDocs;
import com.rbs.sfi.web.repositories.SfiPpFormCs3ProjectSupportDocsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.Set;

@Service
@Transactional
public class SfiPpFormCs3ProjectSupportDocsService {
    @Autowired
    private SfiPpFormCs3ProjectSupportDocsRepository sfiPpFormCs3ProjectSupportDocsRepository;

    public String generateUniqueName() {
        return Long.toString(new Date().getTime());
    }

    public void setSupportDocs(Set<SfiPpFormCs3ProjectSupportDocs> supportDocs, Integer id) {
        for (SfiPpFormCs3ProjectSupportDocs supportDoc : supportDocs) {
            supportDoc.setSfiPpFormCs3(id);
//            sfiPpFormCs3ProjectSupportDocsRepository.update(supportDoc);
        }
    }
}
