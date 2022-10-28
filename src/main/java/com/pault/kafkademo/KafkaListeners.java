package com.pault.kafkademo;

import lombok.extern.java.Log;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log
@Component
public class KafkaListeners {

    @KafkaListener(topics = "amigoscode", groupId = "foo")
    void listener(String data) {
        log.info("Listener received " + data);
    }
}
