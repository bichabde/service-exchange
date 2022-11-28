package com.bank.exchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableEurekaClient

public class ServiceExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceExchangeApplication.class, args);
	}

}
