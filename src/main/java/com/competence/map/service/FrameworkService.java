package com.competence.map.service;

import com.competence.map.entity.Framework;
import com.competence.map.repository.FrameworkRepository;
import java.util.List;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class FrameworkService {

  private final FrameworkRepository repository;

  public List<Framework> findAll() {
    return repository.findAll();
  }

  public Framework findBy(long id) {
    return repository.findOne(id);
  }

  public Framework save(Framework framework) {
    return repository.save(framework);
  }

  public Framework update(Framework framework) {
    return repository.save(framework);
  }

  public void delete(long id) {
    repository.deleteById(id);
  }

  private Framework initCompetences(Framework framework) {
    Hibernate.initialize(framework.getCompetences());
    return framework;
  }

}
