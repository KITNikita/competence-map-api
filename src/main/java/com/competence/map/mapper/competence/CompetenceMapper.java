package com.competence.map.mapper.competence;

import com.competence.map.entity.Competence;
import com.competence.map.view.CompetenceView;

public interface CompetenceMapper {
  
  CompetenceView toView(Competence entity);
  
  Competence toEntity(CompetenceView view);
}
