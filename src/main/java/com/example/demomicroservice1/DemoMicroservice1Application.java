package com.example.demomicroservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoMicroservice1Application.class, args);
	}
}
