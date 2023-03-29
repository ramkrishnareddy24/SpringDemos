package com.examples.SpringORM;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.SpringORM.dao.ProductDao;
import com.examples.SpringORM.entity.Product;

import java.util.List;

public class App {
	public static void main(String[] args) {
//    	insertMethod();
//		updateMethod();
//		deleteMethod();
//		findMethod();
		findAllMethod();
	}
	
	private static void findAllMethod() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/SpringORM/springconfig.xml");
		ProductDao productDao = (ProductDao) ctx.getBean("productdao");
		
		List<Product> products = productDao.findAll();
		System.out.println("Product found - "+products);
	}

	private static void findMethod() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/SpringORM/springconfig.xml");
		ProductDao productDao = (ProductDao) ctx.getBean("productdao");

		Product product = productDao.find(3);
		System.out.println("Product Found");
	}

	private static void deleteMethod() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/SpringORM/springconfig.xml");
		ProductDao productDao = (ProductDao) ctx.getBean("productdao");

		Product product = new Product();
		product.setId(1);
		product.setName("Computer");
		product.setDescription("MacBook");
		product.setPrice(89000.23);
		
		
		productDao.delete(product);
	}

	private static void updateMethod() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/SpringORM/springconfig.xml");
		ProductDao productDao = (ProductDao) ctx.getBean("productdao");

		Product product = new Product();
		product.setId(1);
		product.setName("Computer");
		product.setDescription("MacBook");
		product.setPrice(89000.23);

		productDao.update(product);
		System.out.println("Product updated. ");

		
	}

	private static void insertMethod() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/SpringORM/springconfig.xml");
		ProductDao productDao = (ProductDao) ctx.getBean("productdao");

		Product product = new Product();
		product.setId(3);
		product.setName("Headphoes");
		product.setDescription("Listen Music");
		product.setPrice(79999.23);

		int result = productDao.create(product);
		
		System.out.println("Product created : " + result);
	}
}
