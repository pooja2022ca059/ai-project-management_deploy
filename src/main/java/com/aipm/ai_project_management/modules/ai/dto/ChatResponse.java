package com.aipm.ai_project_management.modules.ai.dto;

import java.util.List;

public class ChatResponse {

    private boolean success;
    private ResponseData data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ResponseData getData() {
        return data;
    }

    public void setData(ResponseData data) {
        this.data = data;
    }

    public static class ResponseData {
        private String response;
        private List<SuggestedAction> suggestedActions;
        private double confidence;
        private List<String> sources;

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
    }

    public static class SuggestedAction {
        private String type;
        private String description;
        private String impact;

        public SuggestedAction(String type, String description, String impact) {
            this.type = type;
            this.description = description;
            this.impact = impact;
        }

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
