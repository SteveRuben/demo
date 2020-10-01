package org.abodah.demo.repositories;

import org.abodah.demo.model.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OccupationRepository extends JpaRepository<Occupation, Long> {

}
