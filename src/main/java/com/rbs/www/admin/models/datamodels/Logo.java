package com.rbs.www.admin.models.datamodels;

import org.springframework.web.multipart.MultipartFile;

public class Logo {
    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
