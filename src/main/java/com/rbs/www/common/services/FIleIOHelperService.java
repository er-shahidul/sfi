package com.rbs.www.common.services;

import com.rbs.www.web.sfi.models.viewmodels.FileNames;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@Service
public class FIleIOHelperService {
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

    private FileNames getFileNames(String fileName) {
        FileNames fileNames = new FileNames();
        fileNames.setOriginalName(fileName);
        fileNames.setUniqueName(this.generateUniqueName());

        return fileNames;
    }

    public FileNames saveFile(MultipartFile file, String path) {
        FileNames fileNames = getFileNames(file.getOriginalFilename());

        String originalPath = this.createDirectory(path, "uploads/sfi");
        originalPath += "/" + fileNames.getUniqueName();

        try {
            file.transferTo(new File(originalPath));
        } catch (IOException e) {
            return null;
        }

        return fileNames;
    }
}
