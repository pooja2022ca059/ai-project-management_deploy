package com.aipm.ai_project_management.modules.ai.repository;

import com.aipm.ai_project_management.modules.ai.dto.AiDashboardResponse;
import com.aipm.ai_project_management.modules.ai.entity.AiInsight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AiInsightRepository extends JpaRepository<AiInsight, Long> {

    @Query("SELECT new com.aipm.ai_project_management.modules.ai.dto.AiDashboardResponse(" +
           "SUM(i.confidenceScore) as totalConfidenceScore, " +
           "COUNT(i) as totalInsights, " +
           "MAX(i.createdAt) as lastCreatedAt) " +
           "FROM AiInsight i")
    AiDashboardResponse fetchDashboardData();
}