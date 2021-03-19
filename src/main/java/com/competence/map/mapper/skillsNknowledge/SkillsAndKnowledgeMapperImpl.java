package com.competence.map.mapper.skillsNknowledge;

import com.competence.map.entity.SkillsAndKnowledge;
import com.competence.map.view.SkillsAndKnowledgeView;
import org.springframework.stereotype.Service;

@Service
public class SkillsAndKnowledgeMapperImpl implements SkillsAndKnowledgeMapper {

  @Override
  public SkillsAndKnowledgeView toView(SkillsAndKnowledge entity) {
    return SkillsAndKnowledgeView.builder()
        .guid(entity.getGuid())
        .title(entity.getTitle())
        .type(entity.getType())
        .build();
  }

  @Override
  public SkillsAndKnowledge toEntity(SkillsAndKnowledgeView view) {
    return SkillsAndKnowledge.builder()
        .guid(view.getGuid())
        .title(view.getTitle())
        .type(view.getType())
        .build();
  }
}
