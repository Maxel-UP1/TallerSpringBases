package com.uptc.bases.clasespring.controller;


import com.uptc.bases.clasespring.model.Project;
import com.uptc.bases.clasespring.services.projectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class projectController {

    @Autowired
    private projectService projectService;

    @GetMapping("/getAll")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @PostMapping("/save")
    public Project saveProject(@RequestBody Project project) {
        return projectService.save(project);
    }

    @GetMapping("/getById/{id}")
    public Project getById(@PathVariable Long id) {
        return projectService.getById(id);
    }

    @PutMapping("/update")
    public Project update(@RequestBody Project project) {
        return projectService.update(project);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        projectService.delete(id);
    }
}
