package com.competence.map.entity;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "skills_n_knowledge")
public class SkillsAndKnowledge {
  @Id
  @GeneratedValue
  private UUID id;

  @Size(max = 255)
  @NotBlank
  private String title;

  @NotBlank
  @Size(max = 1)
  private String type;
}
