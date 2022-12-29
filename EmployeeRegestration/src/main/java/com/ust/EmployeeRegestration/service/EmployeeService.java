package com.ust.EmployeeRegestration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.EmployeeRegestration.Repositer.EmployeeRepositer;
import com.ust.EmployeeRegestration.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepositer employeeRepositer;

	public Employee createEmplyee(Employee emp) {
		
		return employeeRepositer.save(emp);
	}

	public List<Employee> getEmployyes() {
		
		return employeeRepositer.findAll();
	}

	public Employee getEmployeeById(Integer id) {
		
		return employeeRepositer.findById(id).orElse(null);
	}

	public Employee updateEmployees(Employee emp) {
		Employee employee = null;
		Optional<Employee> employeeEntity = employeeRepositer.findById(emp.getEmpId());
		if (employeeEntity.isPresent()) {
			employeeEntity.get().setDomine(emp.getDomine());
			employeeEntity.get().setEmpEmailId(emp.getEmpEmailId());
			employeeEntity.get().setEmpId(emp.getEmpId());
			employeeEntity.get().setEmpName(emp.getEmpName());
			employee = employeeRepositer.save(employeeEntity.get());
		}

		return employee;
	}

	public String deteleEmployeeById(Integer id) {
		
		employeeRepositer.deleteById(id);;
		
		return "Deleted Successfully.";
	}

}
