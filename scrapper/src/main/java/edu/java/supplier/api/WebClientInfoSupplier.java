package edu.java.supplier.api;

import edu.java.configuration.RetryQueryConfiguration;
import edu.java.util.retry.RetryFactory;
import java.time.OffsetDateTime;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

public abstract class WebClientInfoSupplier implements InfoSupplier {
    private final WebClient webClient;

    public WebClientInfoSupplier(String baseUrl) {
        this.webClient = WebClient.create(baseUrl);
    }

    public WebClientInfoSupplier(WebClient webClient) {
        this.webClient = webClient;
    }

    public WebClientInfoSupplier(String baseUrl, RetryQueryConfiguration retryQueryConfiguration, String target) {
        this(WebClient.builder()
            .baseUrl(baseUrl)
            .filter(RetryFactory.createFilter(retryQueryConfiguration, target))
            .build()
        );
    }

    public <T> T executeRequestGet(String uri, Class<T> type, T defaultValue) {
        try {
            return webClient
                .get()
                .uri(uri)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(type)
                .block();
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public abstract LinkInfo filterByDateTime(LinkInfo linkInfo, OffsetDateTime afterDateTime, String context);
}
