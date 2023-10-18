package com.vinicius.catsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class CatsService {
    private final WebClient webClient;

    public Mono<String> getCats() {
        return this.getCatsFromAPI();
    }

    private Mono<String> getCatsFromAPI() {
        return webClient.get()
                .uri("/images/search?limit=20&api_key=live_SBO2Fk87Ebw0ydSW2qkXgSvJXGhL8jw4bepdGWCRFhmtw3QqbtwfGGL3tMHfWYhg")
                .retrieve()
                .bodyToMono(String.class);
    }

    @Autowired
    public CatsService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.thecatapi.com/v1/").build();
    }
}
