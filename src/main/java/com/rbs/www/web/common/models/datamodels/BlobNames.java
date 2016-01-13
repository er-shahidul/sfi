package com.rbs.www.web.common.models.datamodels;

import java.io.Serializable;

public class BlobNames implements Cloneable, Serializable {
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
    public BlobNames clone() throws CloneNotSupportedException {
        BlobNames blobNames = (BlobNames) super.clone();
        blobNames.setOriginalDocumentName(this.getOriginalDocumentName());
        blobNames.setUniqueDocumentName(this.getUniqueDocumentName());

        return blobNames;
    }
}