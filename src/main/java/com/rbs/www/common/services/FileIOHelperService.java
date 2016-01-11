package com.rbs.www.common.services;

import com.rbs.www.web.common.models.datamodels.DocNames;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@Service
public class FileIOHelperService {
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

    private DocNames getFileNames(String fileName) {
        DocNames fileNames = new DocNames();
        fileNames.setOriginalDocumentName(fileName);
        fileNames.setUniqueDocumentName(this.generateUniqueName());

        return fileNames;
    }

    public DocNames saveFile(MultipartFile file, String folder, String path) {
        DocNames fileNames = getFileNames(file.getOriginalFilename());

        String originalPath = this.createDirectory(path, "uploads/" + folder);
        originalPath += "/" + fileNames.getUniqueDocumentName();

        try {
            file.transferTo(new File(originalPath));
        } catch (IOException e) {
            return null;
        }

        return fileNames;
    }
}
