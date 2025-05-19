package com.uptc.bases.clasespring.services;


import com.uptc.bases.clasespring.model.Department;
import com.uptc.bases.clasespring.repository.departmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class departmentService {

    @Autowired
    private departmentRepository departmentRepository;

    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public Department update(Department department) {
        return departmentRepository.save(department);
    }

    public void delete(Long id) {
        departmentRepository.deleteById(id);
    }
}
