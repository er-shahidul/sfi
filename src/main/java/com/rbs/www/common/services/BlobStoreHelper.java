package com.rbs.www.common.services;

import com.rbs.www.web.common.models.datamodels.BlobNames;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@Service
public class BlobStoreHelper {
    public String createDirectory(String rootPath, String subPath) {
        String currentPath = rootPath;
        for (String folderName : subPath.split("/")) {
            if (folderName.isEmpty()) continue;
            currentPath += "/" + folderName;

            File folder = new File(currentPath);
            if (!folder.exists()) folder.mkdir();
        }

        return currentPath;
    }

    private String generateUniqueName() {
        return Long.toString(new Date().getTime());
    }

    private BlobNames getNames(String fileName) {
        BlobNames fileNames = new BlobNames();
        fileNames.setOriginalDocumentName(fileName);
        fileNames.setUniqueDocumentName(this.generateUniqueName());

        return fileNames;
    }

    public BlobNames store(MultipartFile file, String folder, String path) {
        BlobNames fileNames = getNames(file.getOriginalFilename());

        String originalPath = this.createDirectory(path, "uploads/" + folder);
        originalPath += "/" + fileNames.getUniqueDocumentName();

        try {
            file.transferTo(new File(originalPath));
        } catch (IOException e) {
            return null;
        }

        return fileNames;
    }

    public boolean isTypeOf(String fileName, String[] extensions) {
        for (String extension : extensions) {
            if (fileName.endsWith(extension))
                return true;
        }

        return false;
    }
}
