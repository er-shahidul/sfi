package com.rbs.www.web.sic.models.del.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class Cs7BmpReportDocViewModel extends BaseViewModel {
    protected Integer id;
    protected Integer sicPpForm;
    protected String originalDocumentName;
    protected String uniqueDocumentName;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSicPpForm() {
        return sicPpForm;
    }

    public void setSicPpForm(Integer sicPpForm) {
        this.sicPpForm = sicPpForm;
    }

    public String getOriginalDocumentName() {
        return originalDocumentName;
    }

    public void setOriginalDocumentName(String originalDocumentName) {
        this.originalDocumentName = originalDocumentName;
    }

    public String getUniqueDocumentName() {
        return uniqueDocumentName;
    }

    public void setUniqueDocumentName(String uniqueDocumentName) {
        this.uniqueDocumentName = uniqueDocumentName;
    }
}