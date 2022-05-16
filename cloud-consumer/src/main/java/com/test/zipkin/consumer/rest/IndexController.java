package com.test.zipkin.consumer.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/index")
    public String index() {
        final String responseMessage = "Received message in index...";
        System.out.println(responseMessage);
        return responseMessage;
    }
}