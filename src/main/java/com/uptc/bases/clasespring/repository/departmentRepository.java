package com.uptc.bases.clasespring.repository;


import com.uptc.bases.clasespring.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface departmentRepository extends JpaRepository<Department, Long> {

}
