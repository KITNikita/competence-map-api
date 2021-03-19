package com.competence.map.mapper.competence;

import static com.competence.map.util.ListUtils.map;

import com.competence.map.entity.Competence;
import com.competence.map.mapper.ecompetence.ECompetenceMapper;
import com.competence.map.view.CompetenceView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompetenceMapperImpl implements CompetenceMapper {

  private final ECompetenceMapper mapper;

  @Override
  public CompetenceView toView(Competence entity) {
    return CompetenceView.builder()
        .id(entity.getId())
        .title(entity.getTitle())
        .eCompetences(map(entity.getECompetences(), mapper::toView))
        .build();
  }

  @Override
  public Competence toEntity(CompetenceView view) {
    return Competence.builder()
        .id(view.getId())
        .title(view.getTitle())
        .eCompetences(map(view.getECompetences(), mapper::toEntity))
        .build();
  }
}
