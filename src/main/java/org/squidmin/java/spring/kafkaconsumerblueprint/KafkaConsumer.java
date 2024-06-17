package org.squidmin.java.spring.kafkaconsumerblueprint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "group_id")
    public void consume(String message) {
        log.info("Consumed message: {}", message);
    }

}
