package edu.java.configuration;

import jakarta.validation.constraints.NotNull;
import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
@EnableConfigurationProperties
public record ApplicationConfig(
    @NotNull Scheduler scheduler
) {
    public record Scheduler(@NotNull boolean enable, @NotNull Duration interval, @NotNull Duration forceCheckDelay) {
    }
}
