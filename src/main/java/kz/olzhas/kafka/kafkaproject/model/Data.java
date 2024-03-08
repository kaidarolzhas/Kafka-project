package kz.olzhas.kafka.kafkaproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class Data {
    private long sensorId;
    private LocalDateTime timeStamp;
    private double measurement;
    private MeasurementType measurementType;

    public enum MeasurementType {
        TEMPERATURE,
        VOLTAGE,
        POWER
    }


}
