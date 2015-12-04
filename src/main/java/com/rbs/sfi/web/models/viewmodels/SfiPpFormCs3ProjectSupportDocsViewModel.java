package com.rbs.sfi.web.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;

public class SfiPpFormCs3ProjectSupportDocsViewModel extends BaseViewModel {
    private Integer id;

    private String projectOriginalDocumentName;
    private String projectUniqueDocumentName;

    private SfiPpFormCs3ViewModel sfiPpFormCs3;

    @Override
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public SfiPpFormCs3ViewModel getSfiPpFormCs3() {
        return sfiPpFormCs3;
    }
    public void setSfiPpFormCs3(SfiPpFormCs3ViewModel sfiPpFormCs3) {
        this.sfiPpFormCs3 = sfiPpFormCs3;
    }

    public String getProjectOriginalDocumentName() {
        return projectOriginalDocumentName;
    }

    public void setProjectOriginalDocumentName(String projectOriginalDocumentName) {
        this.projectOriginalDocumentName = projectOriginalDocumentName;
    }

    public String getProjectUniqueDocumentName() {
        return projectUniqueDocumentName;
    }

    public void setProjectUniqueDocumentName(String projectUniqueDocumentName) {
        this.projectUniqueDocumentName = projectUniqueDocumentName;
    }
}
