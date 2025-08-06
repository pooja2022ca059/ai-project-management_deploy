package com.aipm.ai_project_management.modules.ai.service;

import com.aipm.ai_project_management.modules.ai.dto.AiPredictionResponse;
import com.aipm.ai_project_management.modules.ai.repository.AiPredictionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class AiPredictionServiceImpl implements AiPredictionService {

    private final AiPredictionRepository aiPredictionRepository;

    public AiPredictionServiceImpl(AiPredictionRepository aiPredictionRepository) {
        this.aiPredictionRepository = aiPredictionRepository;
    }

    public List<AiPredictionResponse> getPredictions(String type, Long projectId, String startDate, String endDate) {
        // Convert String to LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime start = LocalDate.parse(startDate, formatter).atStartOfDay();
        LocalDateTime end = LocalDate.parse(endDate, formatter).atTime(23, 59, 59);

        // Call repository with LocalDateTime parameters
        return aiPredictionRepository.findPredictions(type, projectId, start, end);
    }
}
