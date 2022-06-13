package com.GH.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages="com.GH.repo")
@EntityScan(basePackages="com.GH.entity")
public class ApplicationConfig {

}
