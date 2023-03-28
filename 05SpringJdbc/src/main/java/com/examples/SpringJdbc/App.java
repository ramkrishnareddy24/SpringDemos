package com.examples.SpringJdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.SpringJdbc.dao.EmployeeDAO;
import com.examples.SpringJdbc.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Jdbc Template");
    	
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/SpringJdbc/springconfig.xml");
    	
    	EmployeeDAO employeeDao = (EmployeeDAO) ctx.getBean("employeedao");
    	
    	
    	Employee emp = new Employee();
    	emp.setId(2);
    	emp.setFirstName("Jhon");
    	emp.setLastName("Smith");
    	
//    	employeeDao.create(emp);
    	
    	emp.setId(2);
    	emp.setFirstName("Will");
//    	employeeDao.update(emp);
    	
    	employeeDao.delete(2);
    	
    	
    }
}
