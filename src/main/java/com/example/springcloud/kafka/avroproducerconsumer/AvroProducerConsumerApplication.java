package com.example.springcloud.kafka.avroproducerconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableBinding(Processor.class)
public class AvroProducerConsumerApplication {

  public static void main(String[] args) {
    SpringApplication.run(AvroProducerConsumerApplication.class, args);
  }

}
