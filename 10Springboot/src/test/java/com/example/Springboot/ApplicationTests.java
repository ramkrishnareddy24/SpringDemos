package com.example.Springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.Springboot.service.SomeService;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
		SomeService someService = context.getBean(SomeService.class);
		someService.create();
	}

}
