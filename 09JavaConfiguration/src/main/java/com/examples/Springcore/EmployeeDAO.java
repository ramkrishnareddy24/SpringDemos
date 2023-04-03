package com.examples.Springcore;

public class EmployeeDAO {
	public String dbserver;
	public String dbport;
	public String dbuser;
	public String dbpassword;
	
	
	public EmployeeDAO(String dbserver, String dbport, String dbuser, String dbpassword) {
		super();
		this.dbserver = dbserver;
		this.dbport = dbport;
		this.dbuser = dbuser;
		this.dbpassword = dbpassword;
	}
	
	public Employee getEmployee(int id) {
		return null;
	}

	@Override
	public String toString() {
		return "EmployeeDAO [dbserver=" + dbserver + ", dbport=" + dbport + ", dbuser=" + dbuser + ", dbpassword="
				+ dbpassword + "]";
	}
	
	
	
}
