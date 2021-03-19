package com.competence.map.controller;

import com.competence.map.facade.ECompetenceFacade;
import com.competence.map.view.ECompetenceView;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/eCompetences")
@RequiredArgsConstructor
public class ECompetenceController {

  private final ECompetenceFacade facade;

  @GetMapping
  List<ECompetenceView> findAll() {
    return facade.findAll();
  }
}
