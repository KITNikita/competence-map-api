package com.competence.map.view;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FrameworkView {

  private Long id;
  @NotBlank
  private String title;
  @Valid
  private List<CompetenceView> competences;
}
