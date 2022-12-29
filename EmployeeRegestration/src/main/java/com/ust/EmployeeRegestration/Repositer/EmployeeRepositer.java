package com.ust.EmployeeRegestration.Repositer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.EmployeeRegestration.model.Employee;

@Repository
public interface EmployeeRepositer extends JpaRepository<Employee, Integer> {

}
