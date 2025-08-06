package com.aipm.ai_project_management.modules.ai.service;

import com.aipm.ai_project_management.modules.ai.dto.ChatRequest;
import com.aipm.ai_project_management.modules.ai.dto.ChatResponse;
import com.aipm.ai_project_management.modules.ai.service.ChatService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class ChatServiceImpl implements ChatService {

    // Simulated data for different projects (this can later be replaced with a database or API call)
    private static final Map<Integer, ChatResponse.ResponseData> PROJECT_RESPONSES = new HashMap<>();

    static {
        // Project ID 10
        ChatResponse.ResponseData project10Response = new ChatResponse.ResponseData();
        project10Response.setResponse("The E-commerce Platform project is currently 65% complete and running slightly behind schedule. Based on current team velocity, I predict completion by September 5th instead of the original August 30th deadline. The main bottleneck is the payment integration module. I recommend adding Sarah Wilson to help with frontend components to get back on track.");
        project10Response.setSuggestedActions(Arrays.asList(
            new ChatResponse.SuggestedAction("assign_resource", "Assign Sarah Wilson to frontend tasks", "Could save 1 week"),
            new ChatResponse.SuggestedAction("rescope", "Move advanced analytics to Phase 2", "Could save 3 days")
        ));
        project10Response.setConfidence(0.82);
        project10Response.setSources(Arrays.asList("project_timeline", "team_velocity", "task_dependencies"));

        // Project ID 20
        ChatResponse.ResponseData project20Response = new ChatResponse.ResponseData();
        project20Response.setResponse("The Healthcare Management System project is currently 80% complete and on track to meet the September 1st deadline. The main area of focus is final testing of the appointment scheduling module.");
        project20Response.setSuggestedActions(Arrays.asList(
            new ChatResponse.SuggestedAction("focus_testing", "Allocate more testers to the appointment module", "Could ensure timely delivery"),
            new ChatResponse.SuggestedAction("add_review", "Conduct a final review of APIs", "Could improve reliability")
        ));
        project20Response.setConfidence(0.90);
        project20Response.setSources(Arrays.asList("project_timeline", "qa_reports", "team_meetings"));

        // Add responses to the map
        PROJECT_RESPONSES.put(10, project10Response);
        PROJECT_RESPONSES.put(20, project20Response);
    }

    @Override
    public ChatResponse getChatResponse(ChatRequest request) {
        int projectId = request.getContext().getProjectId();

        // Fetch response dynamically based on project_id
        ChatResponse.ResponseData responseData = PROJECT_RESPONSES.getOrDefault(
            projectId,
            createDefaultResponse(projectId) // Default response if project_id not found
        );

        ChatResponse response = new ChatResponse();
        response.setSuccess(true);
        response.setData(responseData);

        return response;
    }

    // Default response for unknown project_id
    private ChatResponse.ResponseData createDefaultResponse(int projectId) {
        ChatResponse.ResponseData defaultResponse = new ChatResponse.ResponseData();
        defaultResponse.setResponse("No specific data available for project ID " + projectId + ". Please check the project details or contact the administrator.");
        defaultResponse.setSuggestedActions(Arrays.asList(
            new ChatResponse.SuggestedAction("check_project", "Verify project details in the system", "Could resolve the issue"),
            new ChatResponse.SuggestedAction("contact_admin", "Contact the project administrator for updates", "Could provide clarity")
        ));
        defaultResponse.setConfidence(0.0);
        defaultResponse.setSources(Arrays.asList("project_database"));

        return defaultResponse;
    }
}
