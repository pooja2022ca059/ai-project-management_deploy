package com.aipm.ai_project_management.modules.ai.service;

import com.aipm.ai_project_management.modules.ai.dto.ChatRequest;
import com.aipm.ai_project_management.modules.ai.dto.ChatResponse;

public interface ChatService {
    /**
     * Generates a chat response based on the given request.
     *
     * @param request The chat request containing the message and context.
     * @return The generated chat response.
     */
    ChatResponse getChatResponse(ChatRequest request);
}