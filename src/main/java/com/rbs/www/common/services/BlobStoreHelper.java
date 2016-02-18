package com.rbs.www.common.services;

import com.rbs.www.web.common.models.datamodels.BlobNames;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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

        Path path1 = Paths.get(path);
//        String originalPath = this.createDirectory(path, "uploads/" + folder);
        String originalPath = path1 + "/" + fileNames.getUniqueDocumentName() + "." + getFileExtension(file.getOriginalFilename());

        try {
            file.transferTo(new File(originalPath));
        } catch (IOException e) {
            return null;
        }

        return fileNames;
    }

    private static String getFileExtension(String fileName) {
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        return "";
    }

    public boolean isTypeOf(String fileName, String[] extensions) {
        for (String extension : extensions) {
            if (fileName.endsWith(extension))
                return true;
        }

        return false;
    }
}
