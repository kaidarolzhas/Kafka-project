package kz.olzhas.kafka.kafkaproject.web.mapper;

import kz.olzhas.kafka.kafkaproject.model.Data;
import kz.olzhas.kafka.kafkaproject.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
