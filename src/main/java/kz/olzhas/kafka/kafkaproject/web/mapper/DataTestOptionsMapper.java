package kz.olzhas.kafka.kafkaproject.web.mapper;

import kz.olzhas.kafka.kafkaproject.model.test.DataTestOptions;
import kz.olzhas.kafka.kafkaproject.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
