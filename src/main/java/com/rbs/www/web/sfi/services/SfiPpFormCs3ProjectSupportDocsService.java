package com.rbs.www.web.sfi.services;

import com.rbs.www.web.sfi.models.entities.SfiPpFormCs3ProjectSupportDocs;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.Set;

@Service
@Transactional
public class SfiPpFormCs3ProjectSupportDocsService {
    public String generateUniqueName() {
        return Long.toString(new Date().getTime());
    }

    public void setSupportDocs(Set<SfiPpFormCs3ProjectSupportDocs> supportDocs, Integer id) {
        for (SfiPpFormCs3ProjectSupportDocs supportDoc : supportDocs) {
            supportDoc.setSfiPpFormCs3(id);
        }
    }
}
