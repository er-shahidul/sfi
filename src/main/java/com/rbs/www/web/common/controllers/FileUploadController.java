package com.rbs.www.web.common.controllers;

import com.rbs.www.common.services.FileIOHelperService;
import com.rbs.www.common.util.Util;
import com.rbs.www.web.common.models.datamodels.DocNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class FileUploadController {

    @Autowired
    private FileIOHelperService fileIOHelperService;

    @RequestMapping(value = "/files/upload/{form}", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<String> fileUpload(@PathVariable String form,
                                                           @RequestParam("file") MultipartFile file,
                                                           HttpServletRequest request, HttpServletResponse response) {
        DocNames fileNames = fileIOHelperService.saveFile(file, form, request.getSession()
                                                                             .getServletContext()
                                                                             .getRealPath("."));
        HttpStatus responseStatus = fileNames == null ? HttpStatus.BAD_REQUEST : HttpStatus.OK;

        return new ResponseEntity<String>(Util.getAsString(fileNames), responseStatus);
    }
}
