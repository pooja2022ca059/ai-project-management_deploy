package com.aipm.ai_project_management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Optional;

@Configuration
@EnableJpaRepositories(basePackages = "com.company.aiprojectmanagement")
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
@EnableTransactionManagement
public class JpaConfig {
    
    @Bean
    public AuditorAware<String> auditorProvider() {
        return new SpringSecurityAuditorAware();
    }
    
    public static class SpringSecurityAuditorAware implements AuditorAware<String> {
        
        @Override
        public Optional<String> getCurrentAuditor() {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            
            if (authentication == null || !authentication.isAuthenticated() || 
                authentication.getPrincipal().equals("anonymousUser")) {
                return Optional.of("system");
            }
            
            return Optional.of(authentication.getName());
        }
    }
}

