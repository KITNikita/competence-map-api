package com.competence.map.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompetenceView {

  private Long id;
  @NotBlank
  private String title;
  @JsonProperty("eCompetences")
  @Valid
  private List<ECompetenceView> eCompetences;
}
