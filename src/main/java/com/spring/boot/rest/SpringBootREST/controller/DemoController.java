package com.spring.boot.rest.SpringBootREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.rest.SpringBootREST.component.RequestVO;
import com.spring.boot.rest.SpringBootREST.component.ResponseVO;

@RestController
public class DemoController {
	
	@Autowired
	ResponseVO response;
	
	@RequestMapping("/")
	public String healthCheck() {
		return "OK";
	}
	
	@RequestMapping("/person/get")
	public ResponseVO getPersonByName(@RequestParam(name="name", required=false, defaultValue="Unknown") String name) {
		response.setName(name);
		response.setId(23);
		return response;
	}
	
	@RequestMapping(value="/person/getById", method=RequestMethod.POST)
	public ResponseVO getPersonById(@RequestParam(name="id", required=true) int id) {
		response.setId(id);
		response.setName("Rahat");
		return response;
	}
	
	//this end point can be called by PostMan tool by passing request in json format
	@RequestMapping(value="/person", method=RequestMethod.POST ,produces="application/json")
	public ResponseVO getResponse(@RequestBody RequestVO request)
	{
		response.setId(request.getId());
		response.setName(request.getName());
		return response;
		
	}

}
