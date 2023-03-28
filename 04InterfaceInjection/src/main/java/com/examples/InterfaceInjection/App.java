package com.examples.InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.InterfaceInjection.service.OrderService;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/examples/InterfaceInjection/springconfig.xml");
    	OrderService orderService  = (OrderService) ctx.getBean("orderservice");
    	orderService.placeOrder();
    }
}
