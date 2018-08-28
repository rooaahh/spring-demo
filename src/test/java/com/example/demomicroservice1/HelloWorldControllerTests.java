package com.example.demomicroservice1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTests {

	@Autowired 
	HelloWorldController helloWorldController;
	
	@Test
	public void contextLoads() throws Exception{
		assertThat(helloWorldController).isNotNull();
		
		HelloWorldResponse helloWorldResponse = helloWorldController.getHelloWorldResponse();
		
		assertThat(helloWorldResponse.getText()).isEqualTo("Hello World From Microservice1");
	}
}
