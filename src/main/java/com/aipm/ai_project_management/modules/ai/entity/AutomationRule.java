package com.aipm.ai_project_management.modules.ai.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "automation_rules")
public class AutomationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "trigger")
    private String trigger;

    @Column(name = "action")
    private String action;

    @Column(name = "executions")
    private int executions;

    @Column(name = "success_rate")
    private int successRate;

    // Getters and Setters
    // Add them here...
}
