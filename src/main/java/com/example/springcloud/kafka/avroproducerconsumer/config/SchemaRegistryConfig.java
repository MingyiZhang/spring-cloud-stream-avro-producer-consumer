package com.example.springcloud.kafka.avroproducerconsumer.config;

import io.confluent.kafka.serializers.KafkaAvroSerializerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.schema.client.ConfluentSchemaRegistryClient;
import org.springframework.cloud.stream.schema.client.SchemaRegistryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchemaRegistryConfig {

  @Value("${spring.cloud.stream.kafka.binder.producer-properties.schema.registry.url}")
  private String endPoint;

  @Bean
  public SchemaRegistryClient schemaRegistryClient() {
    ConfluentSchemaRegistryClient client = new ConfluentSchemaRegistryClient();
    client.setEndpoint(endPoint);
    return client;
  }

}
