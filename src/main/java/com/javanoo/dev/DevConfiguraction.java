package com.javanoo.dev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.javanoo.dev.model", "com.javanoo.dev.service", "com.javanoo.dev.repository"})
public class DevConfiguraction {
}