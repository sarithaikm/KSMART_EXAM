package com.employeeproject.employeeproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeproject.employeeproject.model.employee;

import jakarta.validation.Valid;

@Repository
public interface employeerepository extends JpaRepository<employee,Integer> {

    com.employeeproject.employeeproject.controller.employee save(
            com.employeeproject.employeeproject.controller.@Valid employee employee);
    
}
