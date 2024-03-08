package kz.olzhas.kafka.kafkaproject.model.test;

import kz.olzhas.kafka.kafkaproject.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {

    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;
}
