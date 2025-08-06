package com.aipm.ai_project_management.modules.ai.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "resource_recommendations")
public class ResourceRecommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "message")
    private String message;

    @Column(name = "impact")
    private String impact;

    @Column(name = "confidence")
    private double confidence;

    // Getters and Setters
    // Add them here...
}