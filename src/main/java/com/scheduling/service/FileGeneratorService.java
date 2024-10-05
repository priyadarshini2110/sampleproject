package com.scheduling.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class FileGeneratorService {

    private final String filePath = "src/main/resources/hello.txt"; // Path to the file

    // This method will run every minute
    @Scheduled(fixedRate = 60000) // Runs every 60 seconds
    public void generateFile() {
        String content = "Hello, World!"; // Content to write

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false))) {
            writer.write(content); // Write content to the file
            System.out.println("File generated with content: " + content); // Log file generation
        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions
        }
    }
}

	