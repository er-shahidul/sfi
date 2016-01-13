package com.rbs.www.web.common.models.datamodels;

import java.io.Serializable;

public class DocNames implements Cloneable, Serializable {
    private String originalDocumentName;
    private String uniqueDocumentName;

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

    @Override
    public DocNames clone() throws CloneNotSupportedException {
        DocNames docNames = (DocNames) super.clone();
        docNames.setOriginalDocumentName(this.getOriginalDocumentName());
        docNames.setUniqueDocumentName(this.getUniqueDocumentName());

        return docNames;
    }
}