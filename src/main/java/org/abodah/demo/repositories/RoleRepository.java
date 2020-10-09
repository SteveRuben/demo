package org.abodah.demo.repositories;

import java.util.Optional;

import org.abodah.demo.model.Role;
import org.abodah.demo.model.Role.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(RoleName name);
}
