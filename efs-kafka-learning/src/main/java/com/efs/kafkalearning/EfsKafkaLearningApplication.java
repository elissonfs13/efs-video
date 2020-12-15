package com.efs.kafkalearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfsKafkaLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfsKafkaLearningApplication.class, args);
	}

}
