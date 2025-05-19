package com.uptc.bases.clasespring.repository;


import com.uptc.bases.clasespring.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface projectRepository extends JpaRepository<Project, Long> {
}
