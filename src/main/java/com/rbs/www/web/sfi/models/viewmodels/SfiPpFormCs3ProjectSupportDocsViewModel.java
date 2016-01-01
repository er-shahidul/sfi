package com.rbs.www.web.sfi.models.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class SfiPpFormCs3ProjectSupportDocsViewModel extends BaseViewModel {
    private Integer id;

    private String projectOriginalDocumentName;
    private String projectUniqueDocumentName;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
