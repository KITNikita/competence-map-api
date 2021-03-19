package com.competence.map.service;

import com.competence.map.entity.ECompetence;
import com.competence.map.repository.ECompetenceRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ECompetenceService {

  private final ECompetenceRepository repository;

  public List<ECompetence> findAll() {
    return repository.findAll();
  }
}
