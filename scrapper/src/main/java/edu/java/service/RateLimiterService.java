package edu.java.service;

import java.util.Set;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RateLimiterService {

    private final Set<String> whitelist;

    public RateLimiterService(@Value("${rate-limiter.whitelist}") Set<String> whitelist) {
        this.whitelist = whitelist;
    }

    public boolean isSkipped(String ip) {
        return whitelist.contains(ip);
    }

}
