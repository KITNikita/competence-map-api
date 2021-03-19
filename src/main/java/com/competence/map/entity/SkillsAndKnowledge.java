package com.competence.map.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "skills_n_knowledge")
public class SkillsAndKnowledge {
  @Id
  private String guid;

  private String title;

  @Column(length = 1)
  private String type;
}
