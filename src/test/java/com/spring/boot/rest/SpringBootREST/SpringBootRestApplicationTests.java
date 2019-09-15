package com.spring.boot.rest.SpringBootREST;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.boot.rest.SpringBootREST.controller.DemoController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRestApplicationTests {

	@Autowired 
	DemoController demoController;
	@Test
	public void contextLoads() {
		assertThat(demoController).isNotNull();
	
	}

}
