package com.example.SpringbootDataJPA;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.SpringbootDataJPA.entity.Product;
import com.example.SpringbootDataJPA.repository.ProductRepository;


@SpringBootTest
class ApplicationTests {
	
	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
	}
	
//	@Test
	void createProduct() {
		Product product = new Product();
		product.setName("Headset");
		product.setDesc("Bluetooth headset");
		product.setPrice(2000);
		
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		productRepository.save(product);
	}
	
//	@Test
	void readProduct() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct = productRepository.findById(1);
		if(optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			System.out.println(product);
		}
		else
		{
			System.out.println("Product Not Present in DB");
		}
	}
	
//	@Test
	void updateProduct() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct = productRepository.findById(1);
		if(optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			System.out.println(product);
			product.setPrice(2500);
			productRepository.save(product);
			
		}
		else
		{
			System.out.println("Product Not Present in DB");
		}
	}
	
//	@Test
	void readAllProduct() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		List<Product> products = (List<Product>) productRepository.findAll();
		System.out.println(products);
	}
	
//	@Test
	void readAllProductsByName() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		List<Product> products = (List<Product>) productRepository.findByName("Bluetooth");
		System.out.println(products);
	}
	
	
//	@Test
	void readAllProductsByPrice() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		List<Product> products = (List<Product>) productRepository.findByPrice((double) 2000);
		System.out.println(products);
	}
	
//	@Test
	void readAllProductsByNameAndPrice() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		List<Product> products = (List<Product>) productRepository.findByNameAndPrice("Bluetooth",(double) 2000);
		System.out.println(products);
	}
	
}
