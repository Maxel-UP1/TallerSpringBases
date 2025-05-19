package com.uptc.bases.clasespring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PROJECT")
public class Project {

    @Id
    @Column(name = "project_id")
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_seq")
    //@SequenceGenerator(name = "project_seq", sequenceName = "PROJECT_SEQ", allocationSize = 1)
    private Long projectId;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "budget")
    private int budget;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    private Department department;

    public Project(Long projectId, String name, int budget) {
        this.projectId = projectId;
        this.name = name;
        this.budget = budget;
    }

    public Project() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
