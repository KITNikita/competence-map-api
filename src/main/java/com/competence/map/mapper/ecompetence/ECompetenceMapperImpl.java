package com.competence.map.mapper.ecompetence;

import static com.competence.map.util.ListUtils.map;

import com.competence.map.entity.ECompetence;
import com.competence.map.mapper.skillsNknowledge.SkillsAndKnowledgeMapper;
import com.competence.map.view.ECompetenceArea;
import com.competence.map.view.ECompetenceView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ECompetenceMapperImpl implements ECompetenceMapper {

  final SkillsAndKnowledgeMapper mapper;

  @Override
  public ECompetenceView toView(ECompetence entity) {
    return ECompetenceView.builder()
        .guid(entity.getGuid())
        .title(entity.getTitle())
        .description(entity.getDescription())
        .area(ECompetenceArea.format(entity.getArea()))
        .skillsAndKnowledge(map(entity.getSkillsAndKnowledge(), mapper::toView))
        .build();
  }

  @Override
  public ECompetence toEntity(ECompetenceView view) {
    return ECompetence.builder()
        .guid(view.getGuid())
        .title(view.getTitle())
        .description(view.getDescription())
        .area(view.getArea())
        .skillsAndKnowledge(map(view.getSkillsAndKnowledge(), mapper::toEntity))
        .build();
  }
}
