package com.competence.map.facade;

import static com.competence.map.util.ListUtils.map;

import com.competence.map.mapper.framework.FrameworkMapper;
import com.competence.map.service.FrameworkService;
import com.competence.map.view.FrameworkView;
import java.util.List;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class FrameworkFacade {

  private final FrameworkService service;
  private final FrameworkMapper mapper;

  public List<FrameworkView> findAll() {
    return map(service.findAll(), mapper::toView);
  }

  public FrameworkView findById(long id) {
    return mapper.toView(service.findBy(id));
  }

  public FrameworkView save(FrameworkView view) {
    return mapper.toView(service.save(mapper.toEntity(view)));
  }

  public FrameworkView update(FrameworkView view) {
    return mapper.toView(service.update(mapper.toEntity(view)));
  }

  public void delete(long id) {
    service.delete(id);
  }
}
