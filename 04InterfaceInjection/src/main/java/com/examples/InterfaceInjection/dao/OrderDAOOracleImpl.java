package com.examples.InterfaceInjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaooracle")
public class OrderDAOOracleImpl implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("Open Oracle Connection");
		System.out.println("Insert Statement Oracle");
		System.out.println("Order Created Oracle");
	}

}
