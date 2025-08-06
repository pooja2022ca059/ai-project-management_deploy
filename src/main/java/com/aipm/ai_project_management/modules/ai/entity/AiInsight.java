package com.aipm.ai_project_management.modules.ai.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ai_insights")
public class AiInsight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_predictions")
    private int totalPredictions;

    @Column(name = "accuracy_rate")
    private double accuracyRate;

    @Column(name = "active_alerts")
    private int activeAlerts;

    @Column(name = "automation_saves")
    private int automationSaves;
    
    @Column(name = "confidence_score") // Ensure this matches the database column name
    private Double confidenceScore;

    // Other fields...
    @Column(name = "created_at", nullable = false, updatable = false) // Ensure this matches the database column name
    private LocalDateTime createdAt;

    // Other fields...

    // Getters and Setters
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    // Getters and Setters
    public Double getConfidenceScore() {
        return confidenceScore;
    }

    public void setConfidenceScore(Double confidenceScore) {
        this.confidenceScore = confidenceScore;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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