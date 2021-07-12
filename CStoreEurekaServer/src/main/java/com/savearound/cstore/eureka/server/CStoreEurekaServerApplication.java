package com.savearound.cstore.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CStoreEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CStoreEurekaServerApplication.class, args);
	}

}
