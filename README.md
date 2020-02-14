# Spring Cloud Stream with Kafka Producer, Consumer and Avro Schema

A demo that shows how to implement Kafka producer and consumer with Avro schema registry using Spring Cloud Stream framework.
A minimum configurations for connecting to Confluent Cloud Kafka Cluster.

## Tech Stack
- Spring Cloud Stream
- Apache Kafka
- Confluent Cloud or Confluent Platform

## How to run

1. Start Kafka. You can choose between:
    - Confluent Platform
      ```shell script
      confluent local start schema-registry
      ```
    - Confluent Cloud  
        - Rename `application-cloud-example.yml` to `application-cloud.yml`.
        - Fill relevant fields with your addresses, keys and secrets of Confluent Cloud Cluster and Confluent Schema Registry.
2. Test
    ```shell script
    curl -X POST localhost:8080/employees/1001/Harry/Potter
    ```
   You will see the key and value printed in the log.