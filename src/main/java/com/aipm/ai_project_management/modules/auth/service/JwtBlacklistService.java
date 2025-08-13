package com.aipm.ai_project_management.modules.auth.service;

import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class JwtBlacklistService {

    private final Set<String> blacklist = ConcurrentHashMap.newKeySet();

    public void blacklistToken(String token) {
    	
    	System.out.println("blacklist me add to kr rha ..");
        blacklist.add(token);
    }

    public boolean isTokenBlacklisted(String token) {
    	System.out.println("blacklist check kr rha....");
        return blacklist.contains(token);
    }
}
