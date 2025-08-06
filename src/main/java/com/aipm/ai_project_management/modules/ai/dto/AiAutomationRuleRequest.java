package com.aipm.ai_project_management.modules.ai.dto;

import java.util.List;

public class AiAutomationRuleRequest {

    private String name;
    private String description;
    private Trigger trigger;
    private List<Action> actions;
    private boolean enabled;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Trigger getTrigger() {
        return trigger;
    }

    public void setTrigger(Trigger trigger) {
        this.trigger = trigger;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public static class Trigger {
        private String type;
        private Object conditions;

        // Getters and Setters
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Object getConditions() {
            return conditions;
        }

        public void setConditions(Object conditions) {
            this.conditions = conditions;
        }
    }

    public static class Action {
        private String type;
        private Object criteria;

        // Getters and Setters
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Object getCriteria() {
            return criteria;
        }

        public void setCriteria(Object criteria) {
            this.criteria = criteria;
        }
    }
}
