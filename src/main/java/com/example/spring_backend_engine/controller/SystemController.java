package com.example.spring_backend_engine.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_backend_engine.annotation.LogExecutionTime;
import com.example.spring_backend_engine.service.DataProcessingService;

@RestController
@RequestMapping("/api/v1/engine")
public class SystemController {

    private final DataProcessingService processingService;

    public SystemController(DataProcessingService processingService) {
        this.processingService = processingService;
    }

    @PostMapping("/process")
    @LogExecutionTime 
    public ResponseEntity<String> executeProcess(@RequestBody String rawInput) {
        String result = processingService.processingPipeline(rawInput);
        return ResponseEntity.ok(result);
    }
}