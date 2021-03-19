package com.competence.map.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.Data;

@Data
@Entity
public class Level {
  @Id
  private String guid;

  @Column(columnDefinition = "text")
  private String description;

  @Max(5)
  @Min(1)
  private Integer level;
}
