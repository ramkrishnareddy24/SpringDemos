package com.examples.SpringJdbc;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.SpringJdbc.dao.EmployeeDAO;
import com.examples.SpringJdbc.entity.Employee;

public class App {
	public static void main(String[] args) {
//		insertRow();
//		readOneEmployee();
		readAllEmployees();

	}
	
	private static void readAllEmployees() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/SpringJdbc/springconfig.xml");

		EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
		
		List<Employee> employee = employeeDao.read();
		System.out.println(employee);
	}
	
	private static void readOneEmployee() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/SpringJdbc/springconfig.xml");

		EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
		
		Employee employee = employeeDao.read(1);
		System.out.println(employee);
	}

	private static void insertRow() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/SpringJdbc/springconfig.xml");

		EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");

		Employee emp = new Employee();
		emp.setId(2);
		emp.setFirstName("Jhon");
		emp.setLastName("Smith");

		employeeDao.create(emp);
	}
	
	private static void updateRow() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/SpringJdbc/springconfig.xml");

		EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");

		Employee emp = new Employee();
		
		emp.setId(2);
		emp.setFirstName("Will");
		
		employeeDao.update(emp);
	}
	
	private static void deleteRow() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/SpringJdbc/springconfig.xml");

		EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");

		Employee emp = new Employee();
		
		employeeDao.delete(2);
		
	}
}
