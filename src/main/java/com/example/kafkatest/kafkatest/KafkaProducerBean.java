package com.example.kafkatest.kafkatest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerBean {

    private final AtomicLong messageIndex = new AtomicLong();
    private final KafkaTemplate<String, DelayMessage> kafkaTemplate;

    public KafkaProducerBean(KafkaTemplate<String, DelayMessage> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;

        sendMessage(1000);
        sendMessage(1000);
    }

    public void sendMessage(long delay) {
        this.kafkaTemplate.send("someTopic", new DelayMessage(messageIndex.getAndIncrement(), delay));
    }

}
