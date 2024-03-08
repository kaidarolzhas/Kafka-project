package kz.olzhas.kafka.kafkaproject.service;

import kz.olzhas.kafka.kafkaproject.model.Data;

public interface KafkaDataService {
    void send(Data data);
}
