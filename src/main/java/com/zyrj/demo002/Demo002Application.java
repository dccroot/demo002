package com.zyrj.demo002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Demo002Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo002Application.class, args);
	}

}
