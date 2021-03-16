package com.competence.map.entity;

import java.util.List;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Competence {
  @Id
  @GeneratedValue
  private UUID id;

  @Size(max = 255)
  @NotBlank
  private String title;

  @ManyToMany
  @JoinTable(name = "competence_e_competence",
      joinColumns = @JoinColumn(name = "competence_id", foreignKey = @ForeignKey(name = "competence_fk")),
      inverseJoinColumns = @JoinColumn(name = "e_competence_id", foreignKey = @ForeignKey(name = "e_competence_fk"))
  )
  private List<ECompetence> eCompetences;
}
