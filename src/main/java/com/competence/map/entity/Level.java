package com.competence.map.entity;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Level {
  @Id
  @GeneratedValue
  private UUID id;

  @NotBlank
  @Column(columnDefinition = "text")
  private String description;

  @Max(5)
  @Min(1)
  private Integer level;
}
