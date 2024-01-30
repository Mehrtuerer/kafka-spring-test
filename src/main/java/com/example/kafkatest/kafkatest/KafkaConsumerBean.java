package com.example.kafkatest.kafkatest;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class KafkaConsumerBean {

	private final HashSet seen_indices = new HashSet();

	@KafkaListener(topics = "someTopic")
	public void processMessage(DelayMessage delayMessage) {
		System.out.println(String.format("Received message %04d with delay %05d", delayMessage.getMessageIndex(), delayMessage.getDelay()));
		if (false && seen_indices.contains(delayMessage.getMessageIndex()))
		{
			System.out.println(String.format("Message %04d with delay %05d already seen. Reducing delay to 0...", delayMessage.getMessageIndex(), delayMessage.getDelay()));
		}
		else {
			try {
				Thread.sleep(delayMessage.getDelay());
			} catch (Exception e) {
				System.err.println(e);
			}
			seen_indices.add(delayMessage.getMessageIndex());
		}
		System.out.println(String.format("Executed message %04d with delay %05d", delayMessage.getMessageIndex(), delayMessage.getDelay()));
	}
}
