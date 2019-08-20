package com.trilogyed.summative8configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Summative8ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Summative8ConfigServerApplication.class, args);
	}

}
