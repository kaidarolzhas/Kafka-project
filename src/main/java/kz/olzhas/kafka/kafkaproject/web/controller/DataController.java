package kz.olzhas.kafka.kafkaproject.web.controller;


import kz.olzhas.kafka.kafkaproject.model.Data;
import kz.olzhas.kafka.kafkaproject.model.test.DataTestOptions;
import kz.olzhas.kafka.kafkaproject.service.KafkaDataService;
import kz.olzhas.kafka.kafkaproject.service.TestDataService;
import kz.olzhas.kafka.kafkaproject.web.dto.DataDto;
import kz.olzhas.kafka.kafkaproject.web.dto.DataTestOptionsDto;
import kz.olzhas.kafka.kafkaproject.web.mapper.DataMapper;
import kz.olzhas.kafka.kafkaproject.web.mapper.DataTestOptionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final DataMapper dataMapper;
    private final KafkaDataService kafkaDataService;
    private final DataTestOptionsMapper dataTestOptionsMapper;
    private final TestDataService testDataService;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dataDto) {
        Data data = dataMapper.toEntity(dataDto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto dataTestOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(dataTestOptionsDto);
        testDataService.sendMessages(testOptions);
    }
}
