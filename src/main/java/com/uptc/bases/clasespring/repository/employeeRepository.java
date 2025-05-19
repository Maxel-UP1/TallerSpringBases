package com.uptc.bases.clasespring.repository;

import com.uptc.bases.clasespring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Long> {

}
