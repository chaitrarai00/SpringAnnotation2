package com.java.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.model.Person;

@RestController
public class PersonRestController {
	
	//whats the request to return rest response
	@RequestMapping("/rest")
	public String healthcheck() {
		return "OK";
	}
	
	@RequestMapping("/rest/person/get")
	public Person getPerson(@RequestParam(name="name", required = false,defaultValue = "unknown")
	String name) {
		Person person=new Person();
		person.setName(name);
		return person;
	}
}
