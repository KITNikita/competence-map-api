package com.competence.map.mapper.skillsNknowledge;

import com.competence.map.entity.SkillsAndKnowledge;
import com.competence.map.view.SkillsAndKnowledgeView;

public interface SkillsAndKnowledgeMapper {

  SkillsAndKnowledgeView toView(SkillsAndKnowledge entity);

  SkillsAndKnowledge toEntity(SkillsAndKnowledgeView view);
}
