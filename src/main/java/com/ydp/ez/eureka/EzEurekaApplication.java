package com.ydp.ez.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EzEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EzEurekaApplication.class, args);
	}

}
