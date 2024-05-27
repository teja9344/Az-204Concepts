package com.azure.az_204.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventsController {

    @GetMapping("/Items")
    public String products()
    {
        return "Request Received .. !";
    }

}
