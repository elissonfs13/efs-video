package com.efs.onlinevideo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfsVideoOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfsVideoOnlineApplication.class, args);
	}

}
