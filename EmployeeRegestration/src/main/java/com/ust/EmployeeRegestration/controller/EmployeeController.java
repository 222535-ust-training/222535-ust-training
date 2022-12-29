package com.ust.EmployeeRegestration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.EmployeeRegestration.model.Employee;
import com.ust.EmployeeRegestration.service.EmployeeService;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeservice;

	@PostMapping("/register")
	public Employee addEmployee(@RequestBody Employee emp) {

		return employeeservice.createEmplyee(emp);

	}

	@GetMapping("/ust/employee")
	public List<Employee> getAllEmployees() {

		return employeeservice.getEmployyes();
	}

	@GetMapping("/ust/employee/{Id}")
	public Employee getEmployeeById(@PathVariable Integer id) {

		return employeeservice.getEmployeeById(id);

	}

	@PutMapping("/update/employee")
	public Employee updateEmployee(@RequestBody Employee emp) {

		return employeeservice.updateEmployees(emp);

	}

	@DeleteMapping("/delete/employee/{Id}")
	public String deteleEmployeeById(@PathVariable Integer id) {

		return employeeservice.deteleEmployeeById(id);

	}

}
