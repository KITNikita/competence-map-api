package com.competence.map.entity;

import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "e_competence")
public class ECompetence {
  @Id
  @GeneratedValue
  private UUID id;

  @Size(max = 255)
  @NotBlank
  private String title;

  @NotBlank
  @Column(columnDefinition = "text")
  private String description;

  @NotBlank
  @Size(max = 1)
  private String area;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(
      name = "e_competence_id",
      referencedColumnName = "id",
      foreignKey = @ForeignKey(name = "e_competence_fk_level"))
  private List<Level> levels;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(
      name = "e_competence_id",
      referencedColumnName = "id",
      foreignKey = @ForeignKey(name = "e_competence_fk_skills_n_knowledge"))
  private List<SkillsAndKnowledge> skillsAndKnowledge;
}
