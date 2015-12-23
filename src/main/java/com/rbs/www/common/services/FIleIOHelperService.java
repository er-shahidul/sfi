package com.rbs.www.common.services;

import org.springframework.stereotype.Service;

import java.io.File;

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
}
