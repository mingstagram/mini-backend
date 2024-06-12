package com.mini.miniEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MiniEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniEurekaServerApplication.class, args);
	}

}
