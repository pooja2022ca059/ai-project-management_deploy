package com.aipm.ai_project_management.modules.ai.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "risk_predictions")
public class RiskPrediction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "risk_type")
    private String riskType;

    @Column(name = "risk_level")
    private String riskLevel;

    @Column(name = "probability")
    private double probability;

    @Column(name = "impact")
    private String impact;

    @ElementCollection
    @CollectionTable(name = "risk_suggested_actions", joinColumns = @JoinColumn(name = "risk_id"))
    @Column(name = "action")
    private List<String> suggestedActions;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Getters and Setters
    // Add them here...
}
