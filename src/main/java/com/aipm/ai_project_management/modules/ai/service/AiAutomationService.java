package com.aipm.ai_project_management.modules.ai.service;

import com.aipm.ai_project_management.modules.ai.dto.AiAutomationRuleRequest;
import com.aipm.ai_project_management.modules.ai.dto.AiAutomationRuleResponse;

import java.util.List;

public interface AiAutomationService {
    AiAutomationRuleResponse createAutomationRule(AiAutomationRuleRequest request);

    List<AiAutomationRuleResponse> getAutomationRules();
}