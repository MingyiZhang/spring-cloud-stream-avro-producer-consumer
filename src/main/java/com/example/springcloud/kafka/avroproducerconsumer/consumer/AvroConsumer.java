package com.example.springcloud.kafka.avroproducerconsumer.consumer;

import com.example.springcloud.kafka.avroproducerconsumer.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AvroConsumer {

  @StreamListener(Processor.INPUT)
  public void consumeEmployeeDetails(Employee employeeDetails) {
    log.info(employeeDetails.toString());
    log.info("Let's process employee details: {}", employeeDetails);
  }
}
