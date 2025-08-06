package com.aipm.ai_project_management.modules.ai.controller;

import com.aipm.ai_project_management.modules.ai.dto.*;
import com.aipm.ai_project_management.modules.ai.service.AiInsightsService;
import com.aipm.ai_project_management.modules.ai.service.AiAutomationService;
import com.aipm.ai_project_management.modules.ai.service.AiPredictionService;
import com.aipm.ai_project_management.modules.ai.service.ChatService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/ai-console")
public class AiConsoleController {

    private final AiInsightsService aiInsightsService;
    private final AiAutomationService aiAutomationService;
    private final AiPredictionService aiPredictionService;
    private final ChatService chatService;

    public AiConsoleController(AiInsightsService aiInsightsService,
                                AiAutomationService aiAutomationService,
                                AiPredictionService aiPredictionService,ChatService chatService) {
        this.aiInsightsService = aiInsightsService;
        this.aiAutomationService = aiAutomationService;
        this.aiPredictionService = aiPredictionService;
        this.chatService =chatService;
		
    }

    

   

    @GetMapping("/dashboard")
    public Map<String, Object> getDashboardData() {
        AiDashboardResponse dashboardData = aiInsightsService.getDashboardData();

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("data", dashboardData);

        Map<String, Object> finalResponse = new HashMap<>();
        finalResponse.put("response", response);

        return finalResponse;
    }

    @PostMapping("/chat")
    public ResponseEntity<ChatResponse> chatWithAssistant(@RequestBody ChatRequest request) {
        ChatResponse response = chatService.getChatResponse(request);
        return ResponseEntity.ok(response);
    }
    
    
    @GetMapping("/predictions")
    public List<AiPredictionResponse> getPredictions(
            @RequestParam String type,
            @RequestParam Long projectId,
            @RequestParam String startDate,
            @RequestParam String endDate) {
        return aiPredictionService.getPredictions(type, projectId, startDate, endDate);
    }

    @PostMapping("/automation-rules")
    public ResponseEntity<AiAutomationRuleResponse> createAutomationRule(@RequestBody AiAutomationRuleRequest request) {
        AiAutomationRuleResponse response = aiAutomationService.createAutomationRule(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/automation-rules")
    public ResponseEntity<List<AiAutomationRuleResponse>> getAutomationRules() {
        List<AiAutomationRuleResponse> rules = aiAutomationService.getAutomationRules();
        return ResponseEntity.ok(rules);
    }
}
