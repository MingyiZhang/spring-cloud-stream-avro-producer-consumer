## How to run

1. Start Kafka. You can choose between:
    - local confluent platform
      ```shell script
      confluent local start schema-registry
      ```
    - confluent cloud
2. Test
    ```shell script
    curl -X POST localhost:8080/employees/1001/Harry/Potter
    ```