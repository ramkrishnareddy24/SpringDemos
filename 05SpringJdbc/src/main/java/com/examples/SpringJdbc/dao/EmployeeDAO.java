package com.examples.SpringJdbc.dao;

import com.examples.SpringJdbc.entity.Employee;

public interface EmployeeDAO {
	int create(Employee employee);
	int update(Employee employee);
	int delete(int id);
}
