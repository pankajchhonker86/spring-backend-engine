package com.example.spring_backend_engine.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityProfileConfig {
    private static final Logger log = LoggerFactory.getLogger(SecurityProfileConfig.class);

    @Bean
    @ConditionalOnProperty(name = "engine.security.strict", havingValue = "true", matchIfMissing = false)
    public String strictSecurityValidation() {
        log.info("[Conditional Injection] STRICT Security profile successfully instantiated.");
        return "STRICT_MODE_ACTIVE";
    }
}