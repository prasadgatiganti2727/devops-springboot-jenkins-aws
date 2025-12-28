package com.prasad.devops.api;

import java.time.Instant;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/healthz")
  public Map<String, Object> healthz() {
    return Map.of("status", "OK", "timestamp", Instant.now().toString());
  }

  @GetMapping("/api/hello")
  public Map<String, Object> hello(@RequestParam(defaultValue = "World") String name) {
    return Map.of(
        "message", "Hello " + name + " 👋",
        "service", "springboot-devops-demo",
        "timestamp", Instant.now().toString()
    );
  }
}
