package com.aipm.ai_project_management.modules.ai.dto;

import com.aipm.ai_project_management.modules.ai.entity.AiAutomationRule;

public class AiAutomationRuleResponse {

    private Long id;
    private String name;
    private String status;
    private String createdAt;

    // Constructor
    public AiAutomationRuleResponse(AiAutomationRule rule) {
        this.id = rule.getId();
        this.name = rule.getName();
        this.status = rule.getStatus().name(); // Convert RuleStatus enum to String
        this.createdAt = rule.getCreatedAt().toString();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}