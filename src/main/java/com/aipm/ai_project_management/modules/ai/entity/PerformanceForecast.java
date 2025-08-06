package com.aipm.ai_project_management.modules.ai.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "performance_forecasts")
public class PerformanceForecast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "metric")
    private String metric;

    @Column(name = "predicted_value")
    private String predictedValue;

    @Column(name = "confidence")
    private double confidence;

    @ElementCollection
    @CollectionTable(name = "forecast_factors", joinColumns = @JoinColumn(name = "forecast_id"))
    @Column(name = "factor")
    private List<String> factors;

    // Getters and Setters
    // Add them here...
}
