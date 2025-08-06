package com.aipm.ai_project_management.modules.ai.service;

import com.aipm.ai_project_management.modules.ai.dto.AiPredictionResponse;

import java.util.List;

public interface AiPredictionService {
    List<AiPredictionResponse> getPredictions(String type, Long projectId, String startDate, String endDate);
}