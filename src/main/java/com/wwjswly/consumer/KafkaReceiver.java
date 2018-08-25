package com.wwjswly.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by Javaer on 2018/8/25.
 */
@Component
@Slf4j
public class KafkaReceiver {
    @KafkaListener(topics = {"zhisheng"})
    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            log.info("接收方 =" + record);
            log.info("接收方 =" + message);
        }
    }
}
