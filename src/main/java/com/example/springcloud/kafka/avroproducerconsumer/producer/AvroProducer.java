package com.example.springcloud.kafka.avroproducerconsumer.producer;

import com.example.springcloud.kafka.avroproducerconsumer.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class AvroProducer {

  @Autowired
  private Processor processor;

  public void produceEmployeeDetails(int empId, String firstName, String lastName) {
    Employee employee = Employee.newBuilder()
        .setId(empId)
        .setFirstName(firstName)
        .setLastName(lastName)
        .build();
    Message<Employee> message = MessageBuilder.withPayload(employee).setHeader(KafkaHeaders.MESSAGE_KEY, firstName).build();
    processor.output().send(message);
  }
}
