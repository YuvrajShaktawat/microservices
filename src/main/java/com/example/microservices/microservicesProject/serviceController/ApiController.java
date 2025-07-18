package com.example.microservices.microservicesProject.serviceController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.microservicesProject.exampleService.Limit;
import com.example.microservices.microservicesProject.propertyConfigurationForService.configrationProperty;

@RestController
public class ApiController {

    @Autowired
    private configrationProperty config;
    
    @GetMapping("/api/limits")
    public Limit getLimits() {
        return new Limit(config.getMaximum(), config.getMinimum());
    }
}
