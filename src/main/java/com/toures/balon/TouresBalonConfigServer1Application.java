package com.toures.balon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication//
public class TouresBalonConfigServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(TouresBalonConfigServer1Application.class, args);
	}

}
