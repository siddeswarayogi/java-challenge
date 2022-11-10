package com.techvista.dms.pdf.file.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.logging.Logger;

@RestController
public class FileUploadController {

    @PostMapping(value = "/example1/upload/file", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> uploadFile(MultipartFile file) {

        // Add your processing logic here
        return ResponseEntity.ok("Success");
    }
}
