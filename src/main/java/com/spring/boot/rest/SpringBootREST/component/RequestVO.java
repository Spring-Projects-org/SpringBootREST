package com.spring.boot.rest.SpringBootREST.component;

import org.springframework.stereotype.Component;

@Component
public class RequestVO {
	
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
