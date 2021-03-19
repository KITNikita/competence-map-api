package com.competence.map.facade;

import static com.competence.map.util.ListUtils.map;

import com.competence.map.mapper.ecompetence.ECompetenceMapper;
import com.competence.map.service.ECompetenceService;
import com.competence.map.view.ECompetenceView;
import java.util.List;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class ECompetenceFacade {

  private final ECompetenceService service;
  private final ECompetenceMapper mapper;

  public List<ECompetenceView> findAll() {
    return map(service.findAll(), mapper::toView);
  }
}
