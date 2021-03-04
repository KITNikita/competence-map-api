package com.competence.map.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/test-vps")
public class TestController {

  @GetMapping
  public List<String> test() {
    return List.of("Hello", "World", "!");
  }
}
