package com.competence.map.view;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ECompetenceView {
  @NotBlank
  private String guid;
  @NotBlank
  private String title;
  @NotBlank
  private String description;
  @Size(max = 1)
  @NotBlank
  private String area;
  @Valid
  private List<SkillsAndKnowledgeView> skillsAndKnowledge;
}
