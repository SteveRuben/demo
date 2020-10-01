package org.abodah.demo.repositories;

import org.abodah.demo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(collectionResourceRel = "departments", itemResourceRel = "department")
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
