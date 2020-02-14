package com.example.springcloud.kafka.avroproducerconsumer.consumer;

import com.example.springcloud.kafka.avroproducerconsumer.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AvroConsumer {

  @StreamListener(Processor.INPUT)
  public void consumeEmployeeDetails(
      @Payload Employee employeeDetails,
      @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Employee employeeKey
  ) {
    log.info("Let's process employee details: {}", employeeDetails);
    log.info("employee key: {}", employeeKey);
  }
}
