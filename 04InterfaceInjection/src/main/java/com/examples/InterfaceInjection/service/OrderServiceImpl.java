package com.examples.InterfaceInjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.examples.InterfaceInjection.dao.OrderDAO;

@Component("orderservice")
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	@Qualifier("orderdaomysql")
	private OrderDAO orderdao; 
	
	@Override
	public void placeOrder() {
		System.out.println("Perform Business Logic");
		System.out.println("Ready to create order");
		orderdao.createOrder();
	}

}
