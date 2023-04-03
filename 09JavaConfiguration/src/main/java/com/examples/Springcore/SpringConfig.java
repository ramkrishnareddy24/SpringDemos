package com.examples.Springcore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Employee emp1() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Jhon");
		return emp;
	}
	
	@Bean
	public Employee emp2() {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Kevin");
		return emp;
	}
	
	@Bean
	public Employee emp4() {
		Employee emp = new Employee();
		emp.setId(4);
		emp.setName("Smith");
		List<String> departments = new ArrayList<>();
		departments.add("HR");
		departments.add("Admin");
		departments.add("Sales");
		emp.setDepartments(departments);
		return emp;
	}
}
