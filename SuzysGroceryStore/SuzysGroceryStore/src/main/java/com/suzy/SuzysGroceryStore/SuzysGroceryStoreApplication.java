package com.suzy.SuzysGroceryStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="com.suzy")
public class SuzysGroceryStoreApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SuzysGroceryStoreApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SuzysGroceryStoreApplication.class, args);
	}

}
