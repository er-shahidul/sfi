package com.rbs.www.web.common.controllers;

import com.rbs.www.common.services.BlobStoreHelper;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.common.models.datamodels.BlobNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class FileUploadController {

    private final String[] validExtensions = { "pdf", "doc", "xls", "xlsx", "docx", "png","jpg" };
    private final String[] validExtensionsSic = { "pdf", "doc", "xls", "xlsx", "docx" };

    @Autowired
    private BlobStoreHelper blobStoreHelper;

    @RequestMapping(value = "/files/upload/{form}", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<String> fileUpload(@PathVariable String form,
                                                           @RequestParam("file") MultipartFile file,
                                                           HttpServletRequest request) {
        BlobNames fileNames = null;
        if (Objects.equals(form, "sic")){
            String originalPath = request.getSession().getServletContext().getRealPath("/")+"uploads/sic/";

            if (file != null && blobStoreHelper.isTypeOf(file.getOriginalFilename(), validExtensionsSic))
                fileNames = blobStoreHelper.store(file, form, originalPath);

        }else {
            String originalPath = request.getSession().getServletContext().getRealPath("/")+"uploads/sfi/";

            if (file != null && blobStoreHelper.isTypeOf(file.getOriginalFilename(), validExtensions))
                fileNames = blobStoreHelper.store(file, form, originalPath);
        }

        HttpStatus responseStatus = fileNames == null ? HttpStatus.BAD_REQUEST : HttpStatus.OK;
        String responseMessage = fileNames == null ? "Invalid File Type" : Util.getAsString(fileNames);

        return new ResponseEntity<String>(responseMessage, responseStatus);
    }
}
