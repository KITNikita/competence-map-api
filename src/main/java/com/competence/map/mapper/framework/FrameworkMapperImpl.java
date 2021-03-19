package com.competence.map.mapper.framework;

import static com.competence.map.util.ListUtils.map;

import com.competence.map.entity.Framework;
import com.competence.map.mapper.competence.CompetenceMapper;
import com.competence.map.view.FrameworkView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FrameworkMapperImpl implements FrameworkMapper {

  private final CompetenceMapper mapper;

  @Override
  public FrameworkView toView(Framework entity) {
    return FrameworkView.builder()
        .id(entity.getId())
        .title(entity.getTitle())
        .competences(map(entity.getCompetences(), mapper::toView))
        .build();
  }

  @Override
  public Framework toEntity(FrameworkView view) {
    return Framework.builder()
        .id(view.getId())
        .title(view.getTitle())
        .competences(map(view.getCompetences(), mapper::toEntity))
        .build();
  }
}
