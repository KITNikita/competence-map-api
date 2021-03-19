package com.competence.map.view;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SkillsAndKnowledgeView {
  @NotBlank
  private String guid;
  @NotBlank
  private String title;
  @NotBlank
  @Size(max = 1)
  private String type;
}
