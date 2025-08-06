package com.aipm.ai_project_management.modules.ai.repository;

import com.aipm.ai_project_management.modules.ai.entity.AiPrediction;
import com.aipm.ai_project_management.modules.ai.dto.AiPredictionResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AiPredictionRepository extends JpaRepository<AiPrediction, Long> {

    @Query("SELECT new com.aipm.ai_project_management.modules.ai.dto.AiPredictionResponse(" +
           "p.id, p.predictionType, p.predictedValue, p.actualValue, p.confidenceScore, p.createdAt) " +
           "FROM AiPrediction p " +
           "WHERE p.predictionType = :type " +
           "AND p.entityId = :projectId " +
           "AND p.createdAt BETWEEN :startDate AND :endDate")
    List<AiPredictionResponse> findPredictions(@Param("type") String type,
                                               @Param("projectId") Long projectId,
                                               @Param("startDate") LocalDateTime startDate,
                                               @Param("endDate") LocalDateTime endDate);
}