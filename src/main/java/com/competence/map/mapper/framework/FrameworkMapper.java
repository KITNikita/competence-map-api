package com.competence.map.mapper.framework;

import com.competence.map.entity.Framework;
import com.competence.map.view.FrameworkView;

public interface FrameworkMapper {
  
  FrameworkView toView(Framework entity);
  
  Framework toEntity(FrameworkView view);
}
