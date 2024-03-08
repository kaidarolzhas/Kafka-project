package kz.olzhas.kafka.kafkaproject.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kz.olzhas.kafka.kafkaproject.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class DataDto {
    private long sensorId;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime timeStamp;
    private double measurement;
    private Data.MeasurementType measurementType;


}
