package com.project.finalassessmentproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.finalassessmentproject.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    
}
