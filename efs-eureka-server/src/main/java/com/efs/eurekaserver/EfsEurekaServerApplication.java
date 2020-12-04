package com.efs.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfsEurekaServerApplication.class, args);
	}

}
