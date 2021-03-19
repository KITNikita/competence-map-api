package com.competence.map.mapper.ecompetence;

import com.competence.map.entity.ECompetence;
import com.competence.map.view.ECompetenceView;

public interface ECompetenceMapper {

  ECompetenceView toView(ECompetence entity);

  ECompetence toEntity(ECompetenceView view);
}
