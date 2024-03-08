package kz.olzhas.kafka.kafkaproject.web.dto;

import kz.olzhas.kafka.kafkaproject.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptionsDto {

    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;
}
