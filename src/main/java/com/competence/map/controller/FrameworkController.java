package com.competence.map.controller;

import com.competence.map.facade.FrameworkFacade;
import com.competence.map.view.FrameworkView;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/frameworks")
@RequiredArgsConstructor
public class FrameworkController {

  private final FrameworkFacade facade;

  @GetMapping
  public List<FrameworkView> findAll() {
    return facade.findAll();
  }

  @GetMapping("/{id}")
  public FrameworkView findById(@PathVariable long id) {
    return facade.findById(id);
  }

  @PostMapping
  public FrameworkView save(@RequestBody FrameworkView framework) {
    return facade.save(framework);
  }

  @PutMapping
  public FrameworkView update(@RequestBody FrameworkView framework) {
    return facade.update(framework);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> delete(@PathVariable long id) {
    facade.delete(id);
    return ResponseEntity.ok().build();
  }
}
