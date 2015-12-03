package com.rbs.sfi.web.models.viewmodels;

import com.rbs.sfi.common.models.BaseViewModel;

public class SfiPpFormCs3ProjectSupportDocsViewModel extends BaseViewModel {
    private Integer id;

    private String cs3ProjectOriginalDocumentName;
    private String cs3ProjectUniqueDocumentName;

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

    public String getCs3ProjectOriginalDocumentName() {
        return cs3ProjectOriginalDocumentName;
    }
    public void setCs3ProjectOriginalDocumentName(String cs3ProjectOriginalDocumentName) {
        this.cs3ProjectOriginalDocumentName = cs3ProjectOriginalDocumentName;
    }

    public String getCs3ProjectUniqueDocumentName() {
        return cs3ProjectUniqueDocumentName;
    }
    public void setCs3ProjectUniqueDocumentName(String cs3ProjectUniqueDocumentName) {
        this.cs3ProjectUniqueDocumentName = cs3ProjectUniqueDocumentName;
    }
}
