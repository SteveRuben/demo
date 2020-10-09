package org.abodah.demo.repositories;

import java.util.Optional;

import org.abodah.demo.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {

	Optional<Region> findByName(String region);
}
