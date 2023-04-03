package com.example.Springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Springboot.dao.SomeDao;

@Component
public class SomeService {
	
	@Autowired
	SomeDao somedao;
	
	public void create() {
		somedao.hello();
	}
}
