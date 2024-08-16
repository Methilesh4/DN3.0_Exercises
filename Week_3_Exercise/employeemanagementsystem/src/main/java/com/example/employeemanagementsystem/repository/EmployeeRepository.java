package com.example.employeemanagementsystem.repository;


import com.example.employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.employeemanagementsystem.projection.EmployeeSummary;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);

    

    List<Employee> findByDepartmentId(Long departmentId);
    List<Employee> findByDepartmentName(String name);
 // Pagination and Sorting by name
    Page<Employee> findByNameContaining(String name, Pageable pageable);

    // Pagination and Sorting by department
    Page<Employee> findByDepartmentId(Long departmentId, Pageable pageable);

    Employee findByEmail(String email);

    @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
    List<Employee> findEmployeesByDepartmentName(@Param("departmentName") String departmentName);
    @Query("SELECT new com.example.EmployeeManagementSystem.projection.EmployeeSummary(e.name, e.email) FROM Employee e WHERE e.name LIKE %:name%")
    List<EmployeeSummary> findEmployeeSummariesByNameContaining(@Param("name") String name);
    
}

