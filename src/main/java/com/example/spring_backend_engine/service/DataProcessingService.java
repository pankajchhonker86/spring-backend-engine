package com.example.spring_backend_engine.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class DataProcessingService {
    private static final Logger log = LoggerFactory.getLogger(DataProcessingService.class);

    public DataProcessingService() {
        log.info("[Lifecycle Step 1] Bean Constructor Called.");
    }

    @PostConstruct
    public void init() {
        log.info("[Lifecycle Step 2] @PostConstruct Executed: Pre-warming cache registers.");
    }

    public String processingPipeline(String data) {
        return "Processed Engine payload: " + data.toUpperCase();
    }

    @PreDestroy
    public void cleanup() {
        log.info("[Lifecycle Step 3] @PreDestroy Executed: Closing connection threads cleanly.");
    }
}