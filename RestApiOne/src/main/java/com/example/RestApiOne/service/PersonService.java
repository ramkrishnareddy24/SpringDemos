package com.example.RestApiOne.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.RestApiOne.entity.PersonEntity;
import com.example.RestApiOne.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;
	
	RestTemplate restTemplate = new RestTemplate();
	
	public PersonResponse getPerson(int personId) {
		final String uri = "http://localhost:8082/webapitwo/hobby/{personId}";
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("personId",personId);
		
		String result = restTemplate.getForObject(uri, String.class, params);
		
		PersonEntity pe = personRepository.findById(personId).get();
		PersonResponse pr = new PersonResponse();
		pr.setPersonId(pe.getPersonId());
		pr.setName(pe.getName());
        pr.setAge(pe.getAge());
        pr.setHobby(result);
       
       return pr;
		
	}
	
	public void addPerson(PersonEntity pe) {
		personRepository.save(pe);
	}
}
