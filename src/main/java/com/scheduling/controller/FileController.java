package com.scheduling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scheduling.service.FileGeneratorService;

@RestController
@RequestMapping("/api")
public class FileController {

    @Autowired
    private FileGeneratorService fileGeneratorService;

    // Endpoint to trigger file generation
    @GetMapping("/generate")
    public String generateFile() {
        fileGeneratorService.generateFile();
        return "File generation triggered!";
    }
}
