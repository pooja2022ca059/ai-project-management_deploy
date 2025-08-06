package com.aipm.ai_project_management.modules.ai.dto;

import java.util.List;

public class AiDashboardResponse {

    private AiInsights aiInsights;
    private List<RiskPrediction> riskPredictions;
    private List<PerformanceForecast> performanceForecasts;
    private List<ResourceRecommendation> resourceRecommendations;
    private List<AutomationRule> automationRules;

    // Getters and Setters

    public AiInsights getAiInsights() {
        return aiInsights;
    }

    public void setAiInsights(AiInsights aiInsights) {
        this.aiInsights = aiInsights;
    }

    public List<RiskPrediction> getRiskPredictions() {
        return riskPredictions;
    }

    public void setRiskPredictions(List<RiskPrediction> riskPredictions) {
        this.riskPredictions = riskPredictions;
    }

    public List<PerformanceForecast> getPerformanceForecasts() {
        return performanceForecasts;
    }

    public void setPerformanceForecasts(List<PerformanceForecast> performanceForecasts) {
        this.performanceForecasts = performanceForecasts;
    }

    public List<ResourceRecommendation> getResourceRecommendations() {
        return resourceRecommendations;
    }

    public void setResourceRecommendations(List<ResourceRecommendation> resourceRecommendations) {
        this.resourceRecommendations = resourceRecommendations;
    }

    public List<AutomationRule> getAutomationRules() {
        return automationRules;
    }

    public void setAutomationRules(List<AutomationRule> automationRules) {
        this.automationRules = automationRules;
    }

    // Nested DTOs

    public static class AiInsights {
        private int totalPredictions;
        private double accuracyRate;
        private int activeAlerts;
        private int automationSaves;

        // Getters and Setters
        public int getTotalPredictions() {
            return totalPredictions;
        }

        public void setTotalPredictions(int totalPredictions) {
            this.totalPredictions = totalPredictions;
        }

        public double getAccuracyRate() {
            return accuracyRate;
        }

        public void setAccuracyRate(double accuracyRate) {
            this.accuracyRate = accuracyRate;
        }

        public int getActiveAlerts() {
            return activeAlerts;
        }

        public void setActiveAlerts(int activeAlerts) {
            this.activeAlerts = activeAlerts;
        }

        public int getAutomationSaves() {
            return automationSaves;
        }

        public void setAutomationSaves(int automationSaves) {
            this.automationSaves = automationSaves;
        }
    }

    public static class RiskPrediction {
        public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getProjectId() {
			return projectId;
		}
		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getRiskType() {
			return riskType;
		}
		public void setRiskType(String riskType) {
			this.riskType = riskType;
		}
		public String getRiskLevel() {
			return riskLevel;
		}
		public void setRiskLevel(String riskLevel) {
			this.riskLevel = riskLevel;
		}
		public double getProbability() {
			return probability;
		}
		public void setProbability(double probability) {
			this.probability = probability;
		}
		public String getImpact() {
			return impact;
		}
		public void setImpact(String impact) {
			this.impact = impact;
		}
		public List<String> getSuggestedActions() {
			return suggestedActions;
		}
		public void setSuggestedActions(List<String> suggestedActions) {
			this.suggestedActions = suggestedActions;
		}
		public String getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}
		private int id;
        private int projectId;
        private String projectName;
        private String riskType;
        private String riskLevel;
        private double probability;
        private String impact;
        private List<String> suggestedActions;
        private String createdAt;

        // Getters and Setters
        // Add them here...
    }

    public static class PerformanceForecast {
        public int getProjectId() {
			return projectId;
		}
		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}
		public String getMetric() {
			return metric;
		}
		public void setMetric(String metric) {
			this.metric = metric;
		}
		public String getPredictedValue() {
			return predictedValue;
		}
		public void setPredictedValue(String predictedValue) {
			this.predictedValue = predictedValue;
		}
		public double getConfidence() {
			return confidence;
		}
		public void setConfidence(double confidence) {
			this.confidence = confidence;
		}
		public List<String> getFactors() {
			return factors;
		}
		public void setFactors(List<String> factors) {
			this.factors = factors;
		}
		private int projectId;
        private String metric;
        private String predictedValue;
        private double confidence;
        private List<String> factors;

        // Getters and Setters
        // Add them here...
    }

    public static class ResourceRecommendation {
        private String type;
        public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getProjectId() {
			return projectId;
		}
		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getImpact() {
			return impact;
		}
		public void setImpact(String impact) {
			this.impact = impact;
		}
		public double getConfidence() {
			return confidence;
		}
		public void setConfidence(double confidence) {
			this.confidence = confidence;
		}
		private int projectId;
        private String message;
        private String impact;
        private double confidence;

        // Getters and Setters
        // Add them here...
    }

    public static class AutomationRule {
        private int id;
        public int getId() {
			return id;
		}
		public void setId(int id) {
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
		public String getTrigger() {
			return trigger;
		}
		public void setTrigger(String trigger) {
			this.trigger = trigger;
		}
		public String getAction() {
			return action;
		}
		public void setAction(String action) {
			this.action = action;
		}
		public int getExecutions() {
			return executions;
		}
		public void setExecutions(int executions) {
			this.executions = executions;
		}
		public int getSuccessRate() {
			return successRate;
		}
		public void setSuccessRate(int successRate) {
			this.successRate = successRate;
		}
		private String name;
        private String status;
        private String trigger;
        private String action;
        private int executions;
        private int successRate;

        // Getters and Setters
        // Add them here...
    }
}