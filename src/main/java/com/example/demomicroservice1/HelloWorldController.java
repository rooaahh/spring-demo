package com.example.demomicroservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired Environment env; 
	
	@GetMapping("/")
	public HelloWorldResponse getHelloWorldResponse() {
		//return new HelloWorldResponse(Integer.parseInt(env.getProperty("local.server.port")),"Hello World From Microservice1");
		return new HelloWorldResponse(1,"Hello World From Microservice1");
	}
}
