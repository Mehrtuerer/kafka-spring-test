package com.example.kafkatest.kafkatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackageClasses = KafkatestApplication.class)
@EnableAutoConfiguration
public class KafkatestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(KafkatestApplication.class, args);
	}

}
