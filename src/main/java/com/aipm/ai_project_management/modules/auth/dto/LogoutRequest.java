package com.aipm.ai_project_management.modules.auth.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

public class LogoutRequest {

    @NotBlank(message = "Refresh token is required")
    @JsonProperty("refresh_token")
    private String refreshToken;

    @NotBlank(message = "Access token is required")
    @JsonProperty("access_token")
    private String accessToken;

    public LogoutRequest() {
    }

    public LogoutRequest(String refreshToken, String accessToken) {
        this.refreshToken = refreshToken;
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogoutRequest that = (LogoutRequest) o;

        if (refreshToken != null ? !refreshToken.equals(that.refreshToken) : that.refreshToken != null) return false;
        return accessToken != null ? accessToken.equals(that.accessToken) : that.accessToken == null;
    }

    @Override
    public int hashCode() {
        int result = refreshToken != null ? refreshToken.hashCode() : 0;
        result = 31 * result + (accessToken != null ? accessToken.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LogoutRequest{" +
                "refreshToken='" + (refreshToken != null ? "[PRESENT]" : "[NOT PRESENT]") + '\'' +
                ", accessToken='" + (accessToken != null ? "[PRESENT]" : "[NOT PRESENT]") + '\'' +
                '}';
    }

    // Builder implementation
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String refreshToken;
        private String accessToken;

        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public LogoutRequest build() {
            return new LogoutRequest(refreshToken, accessToken);
        }
    }
}