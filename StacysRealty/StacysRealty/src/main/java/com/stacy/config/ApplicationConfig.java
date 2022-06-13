package com.stacy.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages="com.stacy.repository")
@EntityScan(basePackages="com.stacy.entity")
public class ApplicationConfig {

}
