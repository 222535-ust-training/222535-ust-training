package com.ust.EmployeeRegestration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USTEmployee")
public class Employee {
	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private String location;
	private String domine;
	private String empEmailId;
	private int experiance;
	public Employee() {
		
	}
	
	public Employee(int empId, String empName, String location, String domine, String empEmailId, int experiance) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.location = location;
		this.domine = domine;
		this.empEmailId = empEmailId;
		this.experiance = experiance;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDomine() {
		return domine;
	}
	public void setDomine(String domine) {
		this.domine = domine;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", location=" + location + ", domine=" + domine
				+ ", empEmailId=" + empEmailId + ", experiance=" + experiance + "]";
	}
	
	
	

	
	
}
