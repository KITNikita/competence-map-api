package com.competence.map.repository;

import com.competence.map.entity.Framework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrameworkRepository extends JpaRepository<Framework, Long> {

  default Framework findOne(long id) {
    return findById(id).orElse(null);
  }
}
