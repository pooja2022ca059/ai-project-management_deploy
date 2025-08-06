package com.aipm.ai_project_management.modules.ai.dto;

import java.time.LocalDateTime;

public class AiPredictionResponse {

    private Long id;
    private String predictionType;
    private String predictedValue;
    private String actualValue;
    private Double confidenceScore;
    private LocalDateTime createdAt;

    // Constructor
    public AiPredictionResponse(Long id, String predictionType, String predictedValue, String actualValue,
                                 Double confidenceScore, LocalDateTime createdAt) {
        this.id = id;
        this.predictionType = predictionType;
        this.predictedValue = predictedValue;
        this.actualValue = actualValue;
        this.confidenceScore = confidenceScore;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPredictionType() {
        return predictionType;
    }

    public void setPredictionType(String predictionType) {
        this.predictionType = predictionType;
    }

    public String getPredictedValue() {
        return predictedValue;
    }

    public void setPredictedValue(String predictedValue) {
        this.predictedValue = predictedValue;
    }

    public String getActualValue() {
        return actualValue;
    }

    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }

    public Double getConfidenceScore() {
        return confidenceScore;
    }

    public void setConfidenceScore(Double confidenceScore) {
        this.confidenceScore = confidenceScore;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}