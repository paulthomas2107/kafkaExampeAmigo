package com.pault.kafkademo.config;

import lombok.extern.java.Log;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Log
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic amigosCodeTopic() {
        return TopicBuilder.name("amigoscode")
                .build();
    }
}
