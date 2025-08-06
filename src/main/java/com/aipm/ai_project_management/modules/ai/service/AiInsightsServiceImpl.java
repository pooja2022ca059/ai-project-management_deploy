package com.aipm.ai_project_management.modules.ai.service;

import com.aipm.ai_project_management.modules.ai.dto.AiChatRequest;
import com.aipm.ai_project_management.modules.ai.dto.AiChatResponse;
import com.aipm.ai_project_management.modules.ai.dto.AiDashboardResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;

@Service
public class AiInsightsServiceImpl implements AiInsightsService {

    @Override
    public AiDashboardResponse getDashboardData() {
        AiDashboardResponse response = new AiDashboardResponse();

        // Set AI Insights
        AiDashboardResponse.AiInsights aiInsights = new AiDashboardResponse.AiInsights();
        aiInsights.setTotalPredictions(1247);
        aiInsights.setAccuracyRate(87.5);
        aiInsights.setActiveAlerts(12);
        aiInsights.setAutomationSaves(142);
        response.setAiInsights(aiInsights);

        // Set Risk Predictions
        AiDashboardResponse.RiskPrediction riskPrediction = new AiDashboardResponse.RiskPrediction();
        riskPrediction.setId(1);
        riskPrediction.setProjectId(10);
        riskPrediction.setProjectName("E-commerce Platform");
        riskPrediction.setRiskType("timeline");
        riskPrediction.setRiskLevel("high");
        riskPrediction.setProbability(0.85);
        riskPrediction.setImpact("Project may be delayed by 2 weeks");
        riskPrediction.setSuggestedActions(Arrays.asList("Add additional developer", "Reduce scope for MVP", "Extend deadline"));
        riskPrediction.setCreatedAt("2024-07-08T10:00:00Z");
        response.setRiskPredictions(Collections.singletonList(riskPrediction));

        // Set Performance Forecasts
        AiDashboardResponse.PerformanceForecast performanceForecast = new AiDashboardResponse.PerformanceForecast();
        performanceForecast.setProjectId(10);
        performanceForecast.setMetric("completion_date");
        performanceForecast.setPredictedValue("2024-09-05");
        performanceForecast.setConfidence(0.78);
        performanceForecast.setFactors(Arrays.asList("team_velocity", "scope_changes", "dependencies"));
        response.setPerformanceForecasts(Collections.singletonList(performanceForecast));

        // Set Resource Recommendations
        AiDashboardResponse.ResourceRecommendation resourceRecommendation = new AiDashboardResponse.ResourceRecommendation();
        resourceRecommendation.setType("team_allocation");
        resourceRecommendation.setProjectId(10);
        resourceRecommendation.setMessage("Consider assigning Sarah Wilson to frontend tasks");
        resourceRecommendation.setImpact("Could improve delivery by 1 week");
        resourceRecommendation.setConfidence(0.72);
        response.setResourceRecommendations(Collections.singletonList(resourceRecommendation));

        // Set Automation Rules
        AiDashboardResponse.AutomationRule automationRule = new AiDashboardResponse.AutomationRule();
        automationRule.setId(1);
        automationRule.setName("Auto-assign code reviews");
        automationRule.setStatus("active");
        automationRule.setTrigger("pull_request_created");
        automationRule.setAction("assign_reviewer");
        automationRule.setExecutions(45);
        automationRule.setSuccessRate(98);
        response.setAutomationRules(Collections.singletonList(automationRule));

        return response;
    }

	@Override
	public AiChatResponse chatWithAi(AiChatRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
}