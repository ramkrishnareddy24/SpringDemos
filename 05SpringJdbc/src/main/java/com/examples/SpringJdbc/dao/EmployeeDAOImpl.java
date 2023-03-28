package com.examples.SpringJdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.SpringJdbc.entity.Employee;


@Component("employeedao")
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql,employee.getId(),employee.getFirstName(),employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname = ? where id = ?";
		int result = jdbcTemplate.update(sql,employee.getFirstName(),employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id = ?";
		int result = jdbcTemplate.update(sql,id);
		return result;
	}

}
