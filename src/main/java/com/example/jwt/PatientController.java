package com.example.jwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @GetMapping
    public List<Map<String, Object>> getPatients() {
        return List.of(
            Map.of("id", 1, "name", "Rahul"),
            Map.of("id", 2, "name", "Priya")
        );
    }

    @GetMapping("/hello")
    public String hello() {
        return "Patient Service is running successfully!";
    }
}