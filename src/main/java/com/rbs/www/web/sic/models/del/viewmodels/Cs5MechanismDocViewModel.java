package com.rbs.www.web.sic.models.del.viewmodels;

import com.rbs.www.common.models.BaseViewModel;

public class Cs5MechanismDocViewModel extends BaseViewModel {
    private Integer id;
    private Integer sicPpForm;
    private String originalDocumentName;
    private String uniqueDocumentName;

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
