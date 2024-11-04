package com.stackroute.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EServiceApplication.class, args);
	}

}
