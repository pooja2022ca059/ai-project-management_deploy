package com.aipm.ai_project_management.modules.ai.dto;

import java.util.List;

public class AiChatResponse {

    private boolean success;
    private String response;
    private List<SuggestedAction> suggestedActions;
    private double confidence;
    private List<String> sources;

    // Getters and Setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public List<SuggestedAction> getSuggestedActions() {
        return suggestedActions;
    }

    public void setSuggestedActions(List<SuggestedAction> suggestedActions) {
        this.suggestedActions = suggestedActions;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public static class SuggestedAction {
        private String type;
        private String description;
        private String impact;

        // Getters and Setters
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImpact() {
            return impact;
        }

        public void setImpact(String impact) {
            this.impact = impact;
        }
    }
}
