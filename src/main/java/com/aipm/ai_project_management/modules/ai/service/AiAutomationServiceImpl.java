package com.aipm.ai_project_management.modules.ai.service;

import com.aipm.ai_project_management.modules.ai.dto.AiAutomationRuleRequest;
import com.aipm.ai_project_management.modules.ai.dto.AiAutomationRuleResponse;
import com.aipm.ai_project_management.modules.ai.entity.AiAutomationRule;
import com.aipm.ai_project_management.modules.ai.repository.AiAutomationRuleRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AiAutomationServiceImpl implements AiAutomationService {

    private final AiAutomationRuleRepository aiAutomationRuleRepository;
    private final ObjectMapper objectMapper;

    public AiAutomationServiceImpl(AiAutomationRuleRepository aiAutomationRuleRepository, ObjectMapper objectMapper) {
        this.aiAutomationRuleRepository = aiAutomationRuleRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public AiAutomationRuleResponse createAutomationRule(AiAutomationRuleRequest request) {
        AiAutomationRule rule = new AiAutomationRule();
        rule.setName(request.getName());
        rule.setDescription(request.getDescription());
        rule.setTriggerType(request.getTrigger().getType());

        // Convert trigger conditions to JSON string
        try {
            String triggerConditionsJson = objectMapper.writeValueAsString(request.getTrigger().getConditions());
            rule.setTriggerConditions(triggerConditionsJson);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert trigger conditions to JSON", e);
        }

        // Convert actions to JSON string
        try {
            String actionsJson = objectMapper.writeValueAsString(request.getActions());
            rule.setActions(actionsJson);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert actions to JSON", e);
        }

        // Set status using the enum
        rule.setStatus(AiAutomationRule.RuleStatus.ACTIVE);

        // Save the rule in the repository
        aiAutomationRuleRepository.save(rule);

        return new AiAutomationRuleResponse(rule);
    }

    @Override
    public List<AiAutomationRuleResponse> getAutomationRules() {
        return aiAutomationRuleRepository.findAll().stream()
                .map(AiAutomationRuleResponse::new)
                .collect(Collectors.toList());
    }
}