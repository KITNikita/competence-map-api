package com.competence.map.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "e_competence")
public class ECompetence {
  @Id
  @Column(updatable = false, insertable = false)
  private String guid;

  @Column(updatable = false, insertable = false)
  private String title;

  @Column(columnDefinition = "text", updatable = false, insertable = false)
  private String description;

  @Column(length = 1, updatable = false, insertable = false)
  private String area;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(
      name = "e_competence_guid",
      updatable = false,
      insertable = false,
      referencedColumnName = "guid",
      foreignKey = @ForeignKey(name = "e_competence_fk_level"))
  private List<Level> levels;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(
      updatable = false,
      insertable = false,
      name = "e_competence_guid",
      referencedColumnName = "guid",
      foreignKey = @ForeignKey(name = "e_competence_fk_skills_n_knowledge"))
  private List<SkillsAndKnowledge> skillsAndKnowledge;
}
