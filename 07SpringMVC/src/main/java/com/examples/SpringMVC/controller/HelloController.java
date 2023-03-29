package com.examples.SpringMVC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.SpringMVC.model.Employee;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelView = new ModelAndView();
		
		modelView.addObject("id", 123);
		modelView.addObject("name", "Kane");
		modelView.addObject("salary", 10000);
		
		modelView.setViewName("hello");
		return modelView;
	}
	
	@RequestMapping("/readobject")
	public ModelAndView read2() {
		ModelAndView modelView = new ModelAndView();
		
		Employee emp = new Employee();
		emp.setId(1234);
		emp.setName("Mary");
		emp.setSalary(50000);
		modelView.addObject("employee",emp);
		
		modelView.setViewName("hello");
		
		return modelView;
	}
	
	@RequestMapping("/employees")
	public ModelAndView read3() {
		ModelAndView modelView = new ModelAndView();
		
		List<Employee> employees = new ArrayList<>();
		
		Employee emp = new Employee();
		emp.setId(1235);
		emp.setName("Amy");
		emp.setSalary(20000);
		employees.add(emp);
		
		emp = new Employee();
		emp.setId(1236);
		emp.setName("Kane");
		emp.setSalary(50000);
		employees.add(emp);
		
		emp = new Employee();
		emp.setId(1237);
		emp.setName("Jack");
		emp.setSalary(50000);
		employees.add(emp);
		
		modelView.addObject("employees", employees);
		modelView.setViewName("employees");
		return modelView;
	}
	
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name) {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",id);
		mv.addObject("name",name);
		mv.setViewName("showdata");
		return mv ;
		
	}
}
