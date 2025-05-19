package com.uptc.bases.clasespring.controller;

import com.uptc.bases.clasespring.model.Department;
import com.uptc.bases.clasespring.services.departmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class departmentController {

    @Autowired
    private departmentService departmentService;

    @GetMapping("/getAll")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.save(department);
    }

    @GetMapping("/getById/{id}")
    public Department getById(@PathVariable Long id) {
        return departmentService.getById(id);
    }

    @PutMapping("/update")
    public Department updateDepartment(@RequestBody Department department) {
        return departmentService.update(department);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        departmentService.delete(id);
    }
}
