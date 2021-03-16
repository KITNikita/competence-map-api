package com.competence.map.entity;

import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Framework {
  @Id
  @GeneratedValue
  private UUID id;

  @Size(max = 255)
  @NotBlank
  private String title;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(
      name = "framework_id",
      foreignKey = @ForeignKey(name = "framework_fk")
  )
  private List<Competence> competences;

}
