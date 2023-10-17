package com.vinicius.catsapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.vinicius.catsapi.service.HelloService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public String handle() {
        HelloService helloService = new HelloService();

        return helloService.handle();
    }

}
