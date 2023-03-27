package com.examples.InterfaceInjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaomysql")
public class OrderDAOSqlImpl implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("Open MySQL Connection");
		System.out.println("Insert Statement MySQL");
		System.out.println("Order Created MySQL");
	}

}
