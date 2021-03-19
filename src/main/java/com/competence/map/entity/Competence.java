package com.competence.map.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Competence {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String title;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "competence_e_competence",
      joinColumns = @JoinColumn(name = "competence_id", foreignKey = @ForeignKey(name = "competence_fk")),
      inverseJoinColumns = @JoinColumn(name = "e_competence_guid", foreignKey = @ForeignKey(name = "e_competence_fk"))
  )
  @JsonProperty
  private List<ECompetence> eCompetences;
}
