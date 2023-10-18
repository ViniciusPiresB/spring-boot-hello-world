package com.vinicius.catsapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.vinicius.catsapi.service.CatsService;

import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CatsController {
    private final CatsService catsService;

    public CatsController(CatsService catsService) {
        this.catsService = catsService;
    }

    @GetMapping(value = "/cats")
    public Mono<String> handle() {
        return catsService.getCats();
    }

}
