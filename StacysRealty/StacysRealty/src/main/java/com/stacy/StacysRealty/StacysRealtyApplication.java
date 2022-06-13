package com.stacy.StacysRealty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="com.stacy")
public class StacysRealtyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StacysRealtyApplication.class, args);
	}

}
