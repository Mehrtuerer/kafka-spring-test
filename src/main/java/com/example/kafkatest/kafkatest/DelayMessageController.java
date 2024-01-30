package com.example.kafkatest.kafkatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("delay_message")
public class DelayMessageController {

    @Autowired
    KafkaProducerBean kafkaProducer;

    @PutMapping("/{delay}")
    public void sendMessage(@PathVariable long delay) {
        kafkaProducer.sendMessage(delay);
    }
}