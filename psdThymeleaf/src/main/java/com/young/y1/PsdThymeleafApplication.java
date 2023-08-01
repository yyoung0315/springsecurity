package com.young.y1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.young.y1"})
public class PsdThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsdThymeleafApplication.class, args);
	}

}
