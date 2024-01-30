package com.example.kafkatest.kafkatest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.support.converter.BytesJsonMessageConverter;

import lombok.RequiredArgsConstructor;

@EnableKafka
@Configuration
@RequiredArgsConstructor
public class KafkaConfig {
	
//	@Bean
//	public BytesJsonMessageConverter converter() {
//		return new BytesJsonMessageConverter();
//	}
}
