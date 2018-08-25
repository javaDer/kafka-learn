package com.wwjswly;

import com.wwjswly.provider.KafkaSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KafkaLearnApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(KafkaLearnApplication.class, args);
        KafkaSender sender = context.getBean(KafkaSender.class);
        for (int i = 0; i < 100; i++) {
            sender.send();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
