package com.uptc.bases.clasespring.model;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

    @Id
    @Column(name = "department_id")
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_seq")
    //@SequenceGenerator(name = "department_seq", sequenceName = "DEPARTMENT_SEQ", allocationSize = 1)
    private Long departmentId;


    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "location", length = 100)
    private String location;

    // Optional: mappedBy if you want bidirectional mapping
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employees;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Project> projects;

    public Department(Long departmentId, String name, String location) {
        this.departmentId = departmentId;
        this.name = name;
        this.location = location;
        this.employees = new ArrayList<Employee>();
        this.projects = new ArrayList<Project>();
    }

    public Department() {

    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}

