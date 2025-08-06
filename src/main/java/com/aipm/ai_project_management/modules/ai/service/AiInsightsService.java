package com.aipm.ai_project_management.modules.ai.service;

import com.aipm.ai_project_management.modules.ai.dto.AiChatRequest;
import com.aipm.ai_project_management.modules.ai.dto.AiChatResponse;
import com.aipm.ai_project_management.modules.ai.dto.AiDashboardResponse;

public interface AiInsightsService {
    AiDashboardResponse getDashboardData();

	AiChatResponse chatWithAi(AiChatRequest request);
}