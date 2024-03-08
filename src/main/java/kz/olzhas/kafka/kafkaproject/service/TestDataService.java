package kz.olzhas.kafka.kafkaproject.service;

import kz.olzhas.kafka.kafkaproject.model.test.DataTestOptions;

public interface TestDataService {
    void sendMessages(DataTestOptions dataTestOptions);
}
